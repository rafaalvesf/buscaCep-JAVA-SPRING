package com.luizalabs.luizalabs.service;

import com.luizalabs.luizalabs.model.CepModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//define o endereço que irá consumir a API, e disponibiliza a função buscaEndereco para ser chamada pela controller
@FeignClient(url= "https://viacep.com.br/ws/" , name = "viacep")
public interface ViaCepService {
    @GetMapping("{cep}/json")
    CepModel buscaEndereco(@PathVariable("cep") String cep);
}
