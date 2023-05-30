#!/bin/bash

echo "Compilando todos os projetos"
mvn -B clean package --file sistema-agencia-viagem/pom.xml
mvn -B clean package --file sistema-companhia-aerea/pom.xml
mvn -B clean package --file sistema-hotelaria/pom.xml
mvn -B clean package --file sistema-locadora-veiculo/pom.xml
