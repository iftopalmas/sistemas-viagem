![CI](https://github.com/iftopalmas/sistemas-viagens/workflows/build/badge.svg)
# Sistemas REST para gerenciamento de companhias aéreas, hotéis, locadoras de veículos e agências de viagens

## Introdução


O objetivo deste projeto é desenvolver um sistema distribuído formado por 4 outros sistemas, que interoperam por meio de web services REST (web API). Os projetos são apenas aplicações backend e devem ser desenvolvidas em Java 17 utilizando as melhores práticas como:

- Respository/DAO sem duplicação de código de operações CRUD básicas
- Injeção de dependência
- Controle automático de transações
- Pool de conexões
- Princípios da Arquitetura REST
- [Convention over Configuration (CoC)](https://en.wikipedia.org/wiki/Convention_over_configuration)
- [Melhores práticas de uso de git e GitHub](https://luizcarvalho.medium.com/modelo-de-gerência-de-branchs-de-sucesso-para-git-54955f876c7)

O repositório é composto de 3 sistemas independentes:

1. [sistema-companhia-aerea](sistema-companhia-aerea)
2. [sistema-hotelaria](sistema-hotelaria)
3. [sistema-locadora-veiculo](sistema-locadora-veiculo)

E um sistema de agência de viagens que se integra com os dois sistemas anteriores para permitir a venda de pacotes de viagem com passagem aérea, reserva de veículo e de hotel:

4. [sistema-agencia-viagem](sistema-agencia-viagem)

## Banco de Dados

Como os sistemas são independentes, cada um terá seu próprio banco de dados. Mas para facilitar, sugiro a utilização de PostgreSQL em todos.

Todos os sistemas que possuem tabelas de cidades e estados devem utilizar os códigos do IBGE para permitir que eles funcionem em conjunto. Se em um sistema uma cidade tiver um código e em outro sistema tiver outro código, obteremos dados errados ao integrar estes sistemas.

Uma lista de cidades e estados com os códigos do IBGE pode ser obtida no script [cidades-brasil-ibge.sql](cidades-brasil-ibge.sql) para PostgreSQL.
