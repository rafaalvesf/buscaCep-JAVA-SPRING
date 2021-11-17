# API de busca de CEP

Esse serviço de consulta de CEP foi desenvolvido em JAVA, usando o framework Spring Boot.

JAVA foi escolhido por ser uma linguagem robusta e simples, além de contar um o Spring framework para auxiliar na construção do serviço.

O seviço recebe um CEP e retorna a RUA, BAIRRO, CIDADE e ESTADO para o solicitante para CEP's válidos e retorna a mensagem "CEP inválido" para os CEP's inválidos.
Para CEP's válidos que não retornam nenhum endereço, o serviço substitui da direita para a esquerda, os 3 últimos digitos, até que se encontre um endereço.

# Por que usar

O serviço tem como objetivo retornar ao usuário, o endereço associado ao CEP informado, a fim de preencher automaticamente os campos de endereço.

# Como usar

o serviço está configurado para funcionar na porta 8080; 
o CEP deverá ser informado na chamada do serviço.

```
https://meusite.com.br:8080/30180010

```
e será obtido o seguinte retorno em JSON:

```
{
    "logradouro": "Avenida Amazonas",
    "bairro": "Barro Preto",
    "localidade": "Belo Horizonte",
    "uf": "MG"
}

```
