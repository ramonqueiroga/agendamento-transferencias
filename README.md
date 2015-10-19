# Agendamento de Transferências

Importar projeto no Eclipse como "Existing Maven Projects"


Configurar tomcat versão 7 ou 8

- Ao configurar o Tomcat, caso apareça um erro como: "The superclass 'javax.servlet.HttpServlet' was...", clique com o botão direito no projeto e siga: Properties > Project Facets > Aba Runtimes na parte da direita do pop-up > Selecione o Tomcat na versão que configurou e clique em "Apply" depois em "OK"


Contexto do projeto: /agendamento-transferencias


### Decisões arquiteturais
- Utilizei uma estratégia onde o objetivo foi separar ao máximo as responsabilidades entre as classes, diminuindo o acoplamento e aumentando a coesão. Outra preocupação foi deixar o código flexível para uma futura criação de novas regras de cálculos e manutenção do código. Caso apareça uma situação dessas, o impacto no projeto é pequeno. Dentro dessa estratégia foram utilizados alguns padrões de projetos como Factory e Strategy.

### Linguagem utilizada para desenvolvimento do projeto: Java 7
- A ideia inicial era utilizar o Java 8 para uma melhor manipulação das datas, mas aconteceram alguns problemas com o VRaptor na hora de receber o valor da data para um atributo do tipo LocalDate. Com isso resolvi utilizar a versão 7 do Java para evitar possíveis novos problemas.

### Framework: VRaptor 4
- Utilização do framework para criar uma tela funcional básica onde o usuário faz o input dos dados e verifica na hora todas as transferências cadastradas. Não me preocupei muito com a validação das informações e formatação porque entendi que esse não era o objetivo central do teste.

### Ferramenta de Build e Gestão de dependências: Maven 3.1
- Foi utilizado o Maven na versão 3.1 pois essa é a versão padrão utilizada nessa versão do VRaptor 4.

### Biblioteca Joda-Time 2.8.2
- Utilizada a última versão da biblioteca Joda-Time para maior facilidade em manipular as datas.

### Testes unitários com JUnit 4.11
- Foi utilizado uma das versões mais novas do JUnit para realização dos testes unitários. 

### Servidor de aplicação: Tomcat 8.0
- Foi utilizado a versão 8 do Tomcat, pois o VRaptor 4 só aceita versões da 7 em diante. 
OBS: Não usar Tomcat 6

### Eclipse Luna como IDE
- Foi utilizado o Eclipse Luna para o desenvolvimento do código por se tratar de uma ferramenta que estou familiarizado.