package com.luizalabs.luizalabs.controller;

import com.luizalabs.luizalabs.model.CepModel;
import com.luizalabs.luizalabs.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViaCepController {
    @Autowired
    private ViaCepService viaCepService;

    @GetMapping("/{cep}")
    public ResponseEntity<CepModel> getCep(@PathVariable String cep) {

        CepModel cepModel = viaCepService.buscaEndereco(cep);

        return cepModel != null ? ResponseEntity.ok().body(cepModel) : ResponseEntity.notFound().build();
    }
}
