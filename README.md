# Sistemas REST para gerenciamento de companhias aéreas, hotéis, locadoras de veículos e agências de viagens

## Introdução

O objetivo deste projeto é desenvolver um sistema distribuído formado por 4 outros sistemas, que interoperam por meio de web services REST (web API). Os projetos são apenas aplicações backend e devem ser desenvolvidas em Java utilizando as melhores práticas como:

- Respository/DAO sem duplicação de código de operações CRUD básicas
- Injeção de dependência
- Controle automático de transações
- Princípios da Arquitetura REST
- [Convention over Configuration (CoC)](https://en.wikipedia.org/wiki/Convention_over_configuration)
- [Melhores práticas de uso de git e GitHub](https://luizcarvalho.medium.com/modelo-de-gerência-de-branchs-de-sucesso-para-git-54955f876c7)

O repositório é composto de 3 sistemas independentes:
1.[sistema-companhia-aerea](sistema-companhia-aerea)
2. [sistema-hotelaria](sistema-hotelaria)
3. [sistema-locadora-veiculo](sistema-locadora-veiculo)

E um sistema de agência de viagens que se integra com os dois sistemas anteriores para permitir a venda de pacotes de viagem com passagem aérea, reserva de veículo e de hotel:

4. [sistema-agencia-viagem](sistema-agencia-viagem)