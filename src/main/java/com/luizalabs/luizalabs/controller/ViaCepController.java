package com.luizalabs.luizalabs.controller;

import com.luizalabs.luizalabs.exception.ErrorDetails;
import com.luizalabs.luizalabs.exception.ResourceNotFound;
import com.luizalabs.luizalabs.model.CepModel;
import com.luizalabs.luizalabs.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViaCepController {
    @Autowired
    private ViaCepService viaCepService;
    private String cepCorrigido;

    @GetMapping("/{cep}")
    public ResponseEntity<CepModel> getCep(@PathVariable String cep) throws ResourceNotFound {

        if (cep.length() == 8) {
            CepModel cepModel = viaCepService.buscaEndereco(cep);

            if (cepModel.getLocalidade() == null || cepModel.getUf() == null) {
                cepCorrigido = cep.substring(0, 7) + "0";
                cepModel = viaCepService.buscaEndereco(cepCorrigido);
            }
            if (cepModel.getLocalidade() == null || cepModel.getUf() == null) {
                cepCorrigido = cep.substring(0, 6) + "00";
                cepModel = viaCepService.buscaEndereco(cepCorrigido);
            }
            if (cepModel.getLocalidade() == null || cepModel.getUf() == null){
                cepCorrigido = cep.substring(0,5)+"000";
                cepModel = viaCepService.buscaEndereco(cepCorrigido);
            }
            if (cepModel.getLocalidade() == null || cepModel.getUf() == null){
                throw new ResourceNotFound("CEP inexistente", HttpStatus.NOT_FOUND);
            }

            return ResponseEntity.ok(cepModel);
        } else {
            throw new ResourceNotFound("CEP inválido", HttpStatus.NOT_FOUND);
        }
    }
}
