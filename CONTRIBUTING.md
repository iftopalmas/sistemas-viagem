# Como contribuir para o projeto

Contribuições são sempre bem vindas. Você pode contribuir de diferentes formas, como apresentado a seguir.

## 1. Formas de contribuir

1. Relatando problemas ou solicitando recursos (features), por meio de uma nova issue (veja instruções a seguir). 
1. Melhorando a documentação do projeto.
1. Corrigindo bugs e implementando novos recursos.

## 2. Iniciando sua Contribuição

Existem algumas diretrizes que precisamos que os colaboradores sigam para alguns tipos de contribuição mostrados abaixo.

### 2.1 Solicitando recurso ou reportando um bug

Se você quer solicitar um recurso ou relatar um problema, verifique primeiro se o problema/recurso que você quer reportar/requisitar já foi reportado/requisitado na página de [issues](https://github.com/iftopalmas/sistemas-viagem/issues). Tente pesquisar as issues existentes usando algumas palavras-chave antes de criar uma nova. Se não existe uma issue relacionada, sinta-se livre para criar uma. Por fim, tenha certeza de que cada issue criada esteja relacionada a um único recurso a ser solicitado ou bug a ser reportado.

### 2.2 Corrigindo um bug ou implementando novo recurso

Antes de começar a programar, se você não é um membro do projeto, precisa fazer um fork do repositório do projeto no GitHub.
Caso você seja um estudante do IFTO, caso ainda não seja membro, deve solicitar ao administrador do projeto que seja incluído.
Sendo membro, não precisa criar um fork pois terá permissão de gravação no repositório.

Você pode corrigir um bug ou implementar um recurso de uma issue já aberta por outra pessoa ou por você mesmo, seguindo mandatoriamente os passos abaixo:

- Se quiser resolver uma issue existente, inicie uma conversa na página da issue para os mantenedores do projeto saberem que você pretende trabalhar nela. Isso evita trabalho duplicado e ainda permite discutir questões de modelagem e implementação.
- Para começar a programar, crie um novo branch a partir do branch `master` para conter suas alterações. O nome de tal branch deve ter o formato `issue-ID` (onde ID é o código da issue). Para criar um novo branch a partir de `master`, execute: `git checkout master -b issue-ID`. Por favor, evite fazer alterações diretamente no branch `master`.


#### 2.2.3 Faça seus commits

Crie commits pequenos, específicos. Seus commits devem ser focados em resolver um único problema. A resolução de uma issue normalmente pode requerer vários commits. Gaste algum tempo escrevendo mensagens de commit estruturadas, informativas e que descrevem claramente o que você fez em cada commit.

Para enviar as alterações:

- Seu último commit deve incluir na primeira linha a mensagem `Close #ID` para indicar o número da issue que está finalizando.
- Execute `git push` para enviar seu branch para o GitHub.
- A partir do seu fork no GitHub, abra uma Pull Request. Caso não tenha um fork, acesse seu branch na página oficial do repositório no GitHub e lá terá a opção de enviar um Pull Request.
- Aguarde suas contribuições serem avaliadas e obrigado antecipadamente.
