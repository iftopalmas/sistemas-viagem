![CI](https://github.com/iftopalmas/sistemas-viagens/workflows/build/badge.svg)
# Sistemas REST para gerenciamento de companhias aéreas, hotéis, locadoras de veículos e agências de viagens

## 1. Introdução

O objetivo deste projeto é desenvolver um sistema distribuído formado por 4 outros sistemas, que interoperam por meio de web services REST (web API). Os projetos são apenas aplicações backend e devem ser desenvolvidas em Java 17 utilizando as melhores práticas como:

- Respository/DAO sem duplicação de código de operações CRUD básicas
- Injeção de dependência
- Controle automático de transações
- Pool de conexões
- Princípios da Arquitetura REST
- [Convention over Configuration (CoC)](https://en.wikipedia.org/wiki/Convention_over_configuration)
- [Melhores práticas de uso de git e GitHub](https://luizcarvalho.medium.com/modelo-de-gerência-de-branchs-de-sucesso-para-git-54955f876c7)

### 1.1 Projetos

O repositório é composto de 4 sistemas:

1. [sistema-companhia-aerea](sistema-companhia-aerea)
2. [sistema-hotelaria](sistema-hotelaria)
3. [sistema-locadora-veiculo](sistema-locadora-veiculo)
4. [sistema-agencia-viagem](sistema-agencia-viagem): sistema de agência de viagens que se integra com os dois sistemas anteriores para permitir a venda de pacotes de viagem com passagem aérea, reserva de veículo e de hotel.

## 2. Banco de Dados

Como os sistemas são independentes, cada um terá seu próprio banco de dados.

Todos os sistemas que possuem tabelas de cidades e estados devem utilizar os códigos do IBGE para permitir que eles funcionem em conjunto. Se em um sistema uma cidade tiver um código e em outro sistema tiver outro código, obteremos dados errados ao integrar estes sistemas.

## 3. Baixando os fontes do projeto

Para baixar os fontes você deve executar uma operação de clone do projeto usando git. Pra isso, clique no botão "Code" no canto superior direito, depois em HTTPS e copie a URL lá, executando no terminal:

```shell
git clone URL-copiada
```

## 4. Configurações do Ambiente de Desenvolvimento

O projeto requer o JDK 7. Após clonar o repositório git na sua máquina, você deve copiar o arquivo `.env.example` na pasta de cada um dos 4 projetos mostrados acima e colar como `.env`. Você não pode renomear o arquivo, deve criar uma cópia. O arquivo .env é ignorado e não é incluído no repositório, pois pode conter informações sensíveis como senhas.

Para alterar e rodar um projeto específico, você não deve abrir a pasta raiz onde estão todos os projetos. Deve abrir no seu IDE apenas a pasta do projeto específico que deseja ver/alterar (pastas indicadas na seção 1.1).
Se abrir a pasta raiz dos 4 projetos e tentar rodar um projeto específico, a aplicação não irá encontrar o arquivo .env, pois na pasta principal não tem nenhum arquivo deste tipo (e não deve ter).

## 5. Como contribuir com o projeto

Veja o [guia de contribuição aqui](CONTRIBUTING.md).