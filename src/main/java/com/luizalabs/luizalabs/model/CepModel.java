package com.luizalabs.luizalabs.model;

import lombok.*;

import javax.persistence.Entity;

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
