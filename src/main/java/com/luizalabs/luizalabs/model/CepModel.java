package com.luizalabs.luizalabs.model;

import lombok.*;

import javax.persistence.Entity;

// classe model, onde é definida as informações que serão retornadas ao consultar o serviço de buscaCEP
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class CepModel {
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
}
