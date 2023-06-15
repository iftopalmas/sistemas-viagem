INSERT INTO Marca_Aviao (id, descricao) VALUES (1, 'Boeing');

INSERT INTO Aviao (id, marca_id, modelo, prefixo, ano_fabricacao, total_assentos) VALUES (1, 1, '737-600', 'TAL061', '2005', 132);
INSERT INTO Aviao (id, marca_id, modelo, prefixo, ano_fabricacao, total_assentos) VALUES (5, 1, '737-600', 'TAL062', '2005', 110);
INSERT INTO Aviao (id, marca_id, modelo, prefixo, ano_fabricacao, total_assentos) VALUES (2, 1, '737-700', 'TAL071', '2010', 149);
INSERT INTO Aviao (id, marca_id, modelo, prefixo, ano_fabricacao, total_assentos) VALUES (6, 1, '737-700', 'TAL072', '2010', 126);
INSERT INTO Aviao (id, marca_id, modelo, prefixo, ano_fabricacao, total_assentos) VALUES (3, 1, '737-800', 'TAL081', '2015', 189);
INSERT INTO Aviao (id, marca_id, modelo, prefixo, ano_fabricacao, total_assentos) VALUES (7, 1, '737-800', 'TAL082', '2015', 162);
INSERT INTO Aviao (id, marca_id, modelo, prefixo, ano_fabricacao, total_assentos) VALUES (4, 1, '737-900', 'TAL091', '2020', 220);
INSERT INTO Aviao (id, marca_id, modelo, prefixo, ano_fabricacao, total_assentos) VALUES (8, 1, '737-900', 'TAL092', '2020', 178);

INSERT INTO Estado (id, nome, uf) VALUES (1, 'Acre', 'AC');
INSERT INTO Estado (id, nome, uf) VALUES (2, 'Alagoas', 'AL');
INSERT INTO Estado (id, nome, uf) VALUES (3, 'Amapá', 'AP');
INSERT INTO Estado (id, nome, uf) VALUES (4, 'Amazonas', 'AM');
INSERT INTO Estado (id, nome, uf) VALUES (5, 'Bahia', 'BA');
INSERT INTO Estado (id, nome, uf) VALUES (6, 'Ceará', 'CE');
INSERT INTO Estado (id, nome, uf) VALUES (7, 'Distrito Federal', 'DF');
INSERT INTO Estado (id, nome, uf) VALUES (8, 'Espírito Santo', 'ES');
INSERT INTO Estado (id, nome, uf) VALUES (9, 'Goiás', 'GO');
INSERT INTO Estado (id, nome, uf) VALUES (10, 'Maranhão', 'MA');
INSERT INTO Estado (id, nome, uf) VALUES (11, 'Mato Grosso', 'MT');
INSERT INTO Estado (id, nome, uf) VALUES (12, 'Mato Grosso do Sul', 'MS');
INSERT INTO Estado (id, nome, uf) VALUES (13, 'Minas Gerais', 'MG');
INSERT INTO Estado (id, nome, uf) VALUES (14, 'Pará', 'PA');
INSERT INTO Estado (id, nome, uf) VALUES (15, 'Paraíba', 'PB');
INSERT INTO Estado (id, nome, uf) VALUES (16, 'Paraná', 'PR');
INSERT INTO Estado (id, nome, uf) VALUES (17, 'Pernambuco', 'PE');
INSERT INTO Estado (id, nome, uf) VALUES (18, 'Piauí', 'PI');
INSERT INTO Estado (id, nome, uf) VALUES (19, 'Rio de Janeiro', 'RJ');
INSERT INTO Estado (id, nome, uf) VALUES (20, 'Rio Grande do Norte', 'RN');
INSERT INTO Estado (id, nome, uf) VALUES (21, 'Rio Grande do Sul', 'RS');
INSERT INTO Estado (id, nome, uf) VALUES (22, 'Rondônia', 'RO');
INSERT INTO Estado (id, nome, uf) VALUES (23, 'Roraima', 'RR');
INSERT INTO Estado (id, nome, uf) VALUES (24, 'Santa Catarina', 'SC');
INSERT INTO Estado (id, nome, uf) VALUES (25, 'São Paulo', 'SP');
INSERT INTO Estado (id, nome, uf) VALUES (26, 'Sergipe', 'SE');
INSERT INTO Estado (id, nome, uf) VALUES (27, 'Tocantins', 'TO');

INSERT INTO Cidade (id, nome, estado_id) VALUES (1, 'Rio Branco', 1);
INSERT INTO Cidade (id, nome, estado_id) VALUES (2, 'Maceió', 2);
INSERT INTO Cidade (id, nome, estado_id) VALUES (3, 'Macapá', 3);
INSERT INTO Cidade (id, nome, estado_id) VALUES (4, 'Manaus', 4);
INSERT INTO Cidade (id, nome, estado_id) VALUES (5, 'Salvador', 5);
INSERT INTO Cidade (id, nome, estado_id) VALUES (6, 'Fortaleza', 6);
INSERT INTO Cidade (id, nome, estado_id) VALUES (7, 'Brasília', 7);
INSERT INTO Cidade (id, nome, estado_id) VALUES (8, 'Vitória', 8);
INSERT INTO Cidade (id, nome, estado_id) VALUES (9, 'Goiânia', 9);
INSERT INTO Cidade (id, nome, estado_id) VALUES (10, 'São Luís', 10);
INSERT INTO Cidade (id, nome, estado_id) VALUES (11, 'Cuiabá', 11);
INSERT INTO Cidade (id, nome, estado_id) VALUES (12, 'Campo Grande', 12);
INSERT INTO Cidade (id, nome, estado_id) VALUES (13, 'Belo Horizonte', 13);
INSERT INTO Cidade (id, nome, estado_id) VALUES (14, 'Belém', 14);
INSERT INTO Cidade (id, nome, estado_id) VALUES (15, 'João Pessoa', 15);
INSERT INTO Cidade (id, nome, estado_id) VALUES (16, 'Curitiba', 16);
INSERT INTO Cidade (id, nome, estado_id) VALUES (17, 'Recife', 17);
INSERT INTO Cidade (id, nome, estado_id) VALUES (18, 'Teresina', 18);
INSERT INTO Cidade (id, nome, estado_id) VALUES (19, 'Rio de Janeiro', 19);
INSERT INTO Cidade (id, nome, estado_id) VALUES (20, 'Natal', 20);
INSERT INTO Cidade (id, nome, estado_id) VALUES (21, 'Porto Alegre', 21);
INSERT INTO Cidade (id, nome, estado_id) VALUES (22, 'Porto Velho', 22);
INSERT INTO Cidade (id, nome, estado_id) VALUES (23, 'Boa Vista', 23);
INSERT INTO Cidade (id, nome, estado_id) VALUES (24, 'Florianópolis', 24);
INSERT INTO Cidade (id, nome, estado_id) VALUES (25, 'São Paulo', 25);
INSERT INTO Cidade (id, nome, estado_id) VALUES (26, 'Aracaju', 26);
INSERT INTO Cidade (id, nome, estado_id) VALUES (27, 'Palmas', 27);

INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (1, 'Aeroporto Internacional de Rio Branco - Plácido de Castro', 1, 'RBR');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (2, 'Aeroporto Internacional de Maceió - Zumbi dos Palmares', 2, 'MCZ');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (3, 'Aeroporto Internacional de Macapá - Alberto Alcolumbre', 3, 'MCP');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (4, 'Aeroporto Internacional de Manaus - Eduardo Gomes', 4, 'MAO');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (5, 'Aeroporto Internacional de Salvador - Luís Eduardo Magalhães', 5, 'SSA');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (6, 'Aeroporto Internacional de Fortaleza - Pinto Martins', 6, 'FOR');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (7, 'Aeroporto Internacional de Brasília - Juscelino Kubitschek', 7, 'BSB');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (8, 'Aeroporto Internacional de Vitória - Eurico de Aguiar Salles', 8, 'VIX');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (9, 'Aeroporto Internacional de Goiânia - Santa Genoveva', 9, 'GYN');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (10, 'Aeroporto Internacional de São Luís - Marechal Cunha Machado', 10, 'SLZ');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (11, 'Aeroporto Internacional de Cuiabá - Marechal Rondon', 11, 'CGB');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (12, 'Aeroporto Internacional de Campo Grande - Ueze Elias Zahran', 12, 'CGR');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (13, 'Aeroporto de Belo Horizonte - Carlos Drummond de Andrade', 13, 'BHZ');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (14, 'Aeroporto Internacional de Belém - Júlio Cezar Ribeiro', 14, 'BEL');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (15, 'Aeroporto Internacional de João Pessoa - Presidente Castro Pinto', 15, 'JPA');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (16, 'Aeroporto Internacional de Curitiba -Afonso Pena', 16, 'CWB');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (17, 'Aeroporto Internacional do Recife - Gilberto Freyre', 17, 'REC');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (18, 'Aeroporto de Teresina - Senador Petrônio Portela', 18, 'THE');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (19, 'Aeroporto Internacional de Rio de Janeiro - Tom Jobim', 19, 'GIG');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (20, 'Aeroporto Internacional de Natal - Governador Aluízio Alves', 20, 'NAT');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (21, 'Aeroporto Internacional de Porto Alegre - Salgado Filho', 21, 'POA');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (22, 'Aeroporto Internacional de Porto Velho - Jorge Teixeira de Oliveira', 22, 'PVH');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (23, 'Aeroporto Internacional de Boa Vista - Atlas Brasil Cantanhede', 23, 'BVB');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (24, 'Aeroporto Internacional de Florianópolis - Hercílio Luz', 24, 'FLN');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (25, 'Aeroporto de São Paulo - Freitas Nobre', 25, 'CGH');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (26, 'Aeroporto Internacional de Aracaju - Santa María', 26, 'AJU');
INSERT INTO Aeroporto (id, nome, cidade_id, codigo_Iata) VALUES (27, 'Aeroporto Internacional de Palmas - Brigadeiro Lysias Rodrigues', 27, 'PM');

INSERT INTO Companhia_Aerea (id, nome, programa_milhas) VALUES (1, 'LATAM', 'LATAM Pass');
INSERT INTO Companhia_Aerea (id, nome, programa_milhas) VALUES (2, 'Azul', 'TudoAzul');

INSERT INTO Grau_Parentesco (id, descricao) VALUES (1, '1° Grau');
INSERT INTO Grau_Parentesco (id, descricao) VALUES (2, '2° Grau');

INSERT INTO Contato_Seguranca (id, grau_parentesco_id, telefone, nome) VALUES (1, 1, '99 99999-9999', 'Segurança Pessoal LTDA');
INSERT INTO Contato_Seguranca (id, grau_parentesco_id, telefone, nome) VALUES (2, 2, '99 99999-9999', 'Segurança Empresarial LTDA');

INSERT INTO Cliente (id, telefone, email, contato_seguranca_id) VALUES (1, '11 11111-1111', 'emailPessoal1@gmail.com', 1);
INSERT INTO Cliente (id, telefone, email, contato_seguranca_id) VALUES (2, '22 22222-2222', 'emailPessoal2@gmail.com', 1);
INSERT INTO Cliente (id, telefone, email, contato_seguranca_id) VALUES (3, '33 33333-3333', 'emailPessoal3@gmail.com', 2);
INSERT INTO Cliente (id, telefone, email, contato_seguranca_id) VALUES (4, '44 44444-4444', 'emailPessoal4@gmail.com', 2);

INSERT INTO Endereco (id, logradouro, cep, cidade_id, bairro, numero) VALUES (1, 'Logradouro 1', 'CEP 1', 27, 'Bairro 1', 'Numero 1');
INSERT INTO Endereco (id, logradouro, cep, cidade_id, bairro, numero) VALUES (2, 'Logradouro 2', 'CEP 2', 27, 'Bairro 2', 'Numero 2');
INSERT INTO Endereco (id, logradouro, cep, cidade_id, bairro, numero) VALUES (3, 'Logradouro 3', 'CEP 3', 27, 'Bairro 3', 'Numero 3');
INSERT INTO Endereco (id, logradouro, cep, cidade_id, bairro, numero) VALUES (4, 'Logradouro 4', 'CEP 4', 27, 'Bairro 4', 'Numero 4');

INSERT INTO Pessoa (id, nome, endereco_id, cpf, data_nascimento, dtype) VALUES (1, 'Ismar Vinicius', 1, '111.111.111-11', '2001-1-1', ' ');
INSERT INTO Pessoa (id, nome, endereco_id, cpf, data_nascimento, dtype) VALUES (2, 'Arthur Souza', 2, '222.222.222-22', '2002-2-2', ' ');
INSERT INTO Pessoa (id, nome, endereco_id, cpf, data_nascimento, dtype) VALUES (3, 'Pablo Hígor', 3, '333.333.333-33', '2003-3-3', ' ');
INSERT INTO Pessoa (id, nome, endereco_id, cpf, data_nascimento, dtype) VALUES (4, 'Wellington Neto', 4, '444.444.444-44', '2004-4-4', ' ');

INSERT INTO Piloto (id, pessoa_fisica_id, numero_breve, validade_breve, ativo, companhia_aerea_id) VALUES (1, 1, '1111', '2041-01-01', true, 1);
INSERT INTO Piloto (id, pessoa_fisica_id, numero_breve, validade_breve, ativo, companhia_aerea_id) VALUES (2, 2, '2222', '2042-02-02', true, 1);
INSERT INTO Piloto (id, pessoa_fisica_id, numero_breve, validade_breve, ativo, companhia_aerea_id) VALUES (3, 3, '3333', '2043-03-03', true, 2);
INSERT INTO Piloto (id, pessoa_fisica_id, numero_breve, validade_breve, ativo, companhia_aerea_id) VALUES (4, 4, '4444', '2044-04-04', true, 2);

INSERT INTO Voo (id, numero, data_hora_partida_esperada, data_hora_partida, data_hora_chegada_esperada, data_hora_chegada, aviao_id, piloto_id, companhia_aerea_id, aeroporto_origem_id, aeroporto_destino_id) VALUES (1, '101', '2023-7-10 6:40:32', '2023-7-10 6:40:32', '2023-7-10 12:11:56', '2023-7-10 12:11:56', 2, 1, 1, 4, 17);
INSERT INTO Voo (id, numero, data_hora_partida_esperada, data_hora_partida, data_hora_chegada_esperada, data_hora_chegada, aviao_id, piloto_id, companhia_aerea_id, aeroporto_origem_id, aeroporto_destino_id) VALUES (2, '102', '2023-7-10 9:46:15', '2023-7-10 9:46:15', '2023-7-10 16:20:23', '2023-7-10 16:20:23', 4, 1, 1, 6, 10);
INSERT INTO Voo (id, numero, data_hora_partida_esperada, data_hora_partida, data_hora_chegada_esperada, data_hora_chegada, aviao_id, piloto_id, companhia_aerea_id, aeroporto_origem_id, aeroporto_destino_id) VALUES (3, '103', '2023-7-10 7:15:16', '2023-7-10 7:15:16', '2023-7-10 17:32:40', '2023-7-10 17:32:40', 6, 3, 2, 22, 3);
INSERT INTO Voo (id, numero, data_hora_partida_esperada, data_hora_partida, data_hora_chegada_esperada, data_hora_chegada, aviao_id, piloto_id, companhia_aerea_id, aeroporto_origem_id, aeroporto_destino_id) VALUES (4, '104', '2023-7-10 8:17:53', '2023-7-10 8:17:53', '2023-7-10 14:50:23', '2023-7-10 14:50:23', 8, 4, 2, 27, 12);
