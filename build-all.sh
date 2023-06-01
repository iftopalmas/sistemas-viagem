#!/bin/bash

echo "Compilando todos os projetos"
mvn -B -quiet clean package --file sistema-agencia-viagem/pom.xml
mvn -B -quiet clean package --file sistema-companhia-aerea/pom.xml
mvn -B -quiet clean package --file sistema-hotelaria/pom.xml
mvn -B -quiet clean package --file sistema-locadora-veiculo/pom.xml

if [[ "$1" == "shutdown" || "$1" == "stop" || "$1" == "close" || "$1" == "kill" ]]; then
  echo "Executando servidores para verificar possíveis erros de inicialização"
  cd sistema-agencia-viagem   && java -jar target/*.jar shutdown; cd ..
  cd sistema-companhia-aerea  && java -jar target/*.jar shutdown; cd ..
  cd sistema-hotelaria        && java -jar target/*.jar shutdown; cd ..
  cd sistema-locadora-veiculo && java -jar target/*.jar shutdown
fi