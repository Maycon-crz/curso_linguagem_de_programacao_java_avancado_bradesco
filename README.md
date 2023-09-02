Linguagem de Programação Java - Avançado
----------------------------------------
Módulo 1 - Fundamentos da programação orientada a objetos (POO)
---
* Integrated Development Environment (IDE)
- Em tradução livre, temos algo como “ambiente de desenvolvimento integrado”. Trata-se de uma ferramenta que possui todos os recursos necessários em um só lugar.
- Resumidamente, entre as principais vantagens de se utilizar uma IDE, podemos mencionar: aumento da produtividade, edição de códigos, compilação, JVM, autocomplete, debug, controlar versões, documentação e correção de erros.
- Instalando a IDE Eclipse
---
* Objetos, classes e atributos
- Java é uma linguagem de programação orientada a objetos, criada com a ideia fundamental de aproximar o mundo real do virtual (computador). Para tanto, há a necessidade do uso de objetos, pois o mundo é composto por eles.
- Todo objeto dentro do Java apresenta determinado tipo e pode conter atributos e ações.
- Os objetos que criamos a partir da classe são chamados de instâncias de objeto.
> Quando preenchemos com as informações solicitadas deixa de ser Modelo e se torna um Objeto;
> Todos os objetos teriam condições de consultar, porém cada um conhece objeto conhece os próprios atributos;
> objetos (seres e coisas presentes no mundo real)
> Classes (nome dado ao grupo de objetos com características comuns);
> Atributos (as características comuns e específicas de cada objeto pertencente à classe).
---
* Construindo objetos
----------------------------------------------
----------------------------------------------
Módulo 2 - Complementos da linguagem de programação Java
---
* Pacotes (package)
- No pacote Java, há o “java.lang”, que é o pacote da linguagem de programação Java. Nele, você encontra todas as classes, sem precisar importar de outros pacotes. Por exemplo, você pode ter no pacote “java.lang” a classe String.class, ao passo que, no pacote “java.util”, terá a classe ArrayList.class.
- Tanto o pacote “java.lang” quanto o “java.util” têm o objetivo de agrupar elementos que possuem características em comum
- Um pacote considera a estrutura de diretórios em que podemos colocar todas as classes, separando-as por determinado assunto. Portanto, trata-se de um agrupamento de classes organizadas por categoria, ou seja, uma forma de modularizar o programa.
---
* Método com parâmetros
---
* Método com retorno
---
* Métodos get() e set() (encapsulamento)
- É importante proteger as variáveis, e para isso utilizamos o encapsulamento. Desse modo ninguém poderá configurá-las com um valor inapropriado.
- A maioria dos valores utilizados nas classes são codificados com definições de limites. Podemos citar, como exemplo, algo que não funcionaria com valores negativos, como a quantidade de quartos em uma casa. Afinal, não há quarto com quantidade negativa, certo?
- Assim que outros códigos forem forçados a passar por métodos de configuração, temos como validar se o parâmetro chamado será viável. Dessa maneira, garantimos o uso somente de valores válidos!
---
* Herança
- A herança consiste no relacionamento “É-Um”.
- Características em comum
- Particularidades
- A herança, então, nos permite reaproveitar os códigos.
- Quando uma classe herda de outra, dizemos que ela pode utilizar ou passa a ter todos os seus métodos e atributos.
----------------------------------------------
----------------------------------------------
Módulo 3 - Tratamento de exceções, interface gráfica, eventos e integração
---
* Tratamento de exceções
- Exceção
> Uma exeção consiste na indicação de um problema que surge durante a execução de um programa.
- Nome "exceção"
> O nome "exceção" significa que o problema não é frequente, ou seja, trata-se de uma exceção à regra;
- Com o tratamento de exceções, um programa pode continuar executando em vez de simplesmente encerrar, contribuindo para a sua qualidade.
- Exception
> Quando se usa a linguagem Java (sobretudo em desenvolvimentos de softwares), podem ocorrer erros de lógica nas linhas de programação ou ainda alguma inconsistência no momento de acessar dispositivos externos. São fatos raros de acontecer, ou seja, exceções (daí o termo exception).
- Try...Catch
- Finally
> O finally é um bloco que será executado independentemente, apresentando ou não erros no método. Desse modo, na estrutura try…Catch, havendo ou não erro em qualquer ponto do bloco, o finally sempre será executado.
- XPTO (se pronúncia como xis-pê-tê-ó), é uma sigla bastante utilizada em cursos técnicos e faculdades para expressar alguma coisa genérica
---
* Interface gráfica
- O Graphical User Interface ou, simplesmente, GUI, diz respeito à interface gráfica com botões e menus, dentro de aplicações reais, em que o usuário pode interagir com as alternativas por meio de mouse e teclado.
- Existem algumas classes próprias para a construção das interfaces gráficas, as quais são inseridas no pacote “javax.swing”, no pacote “java.awt” e em outras bibliotecas de mercado.
- Quando construímos aplicações para Android, por exemplo, é disponibilizado uma API em Java com as bibliotecas de interface gráfica.
- A interface gráfica começa de uma janela (JFrame)
- OBS: Para funcionar a interface é necessário instalar o Swing GUI
> Caminho para instalar no Eclipse:
# Help => Instal New Software... => Selecione o link de download eclipse
# Espere carregar => Expanda o General Purpose Tools
# Marque o (Swing Designer) e o (Swing Designer Documentation)
# Marcar todos os items com SWT
# Clique em Next e espere concluir a instalação
- Um frame pode conter dimensões, títulos, menus e botões, bem como executar ações de abrir ou fechar. De modo geral, podemos dar todos esses atributos ao frame.
> frame.setSize (300,300)
# Define o tamanho do frame (300 pixels de largura e 300 pixels de altura).
> frame.setVisible (true)
# Define o frame como visível (pode estar oculto).
> frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE)
# Permite ao usuário fechar o frame, assim que clicar no botão “X”.
---
* GUI layout, border e flow layout
---
* Eventos
---
* Integração com banco de dados Oracle Express Edition
- O Java Database Connectivity (JDBC) diz respeito à tecnologia utilizada pelos programas Java para se comunicarem com os bancos de dados.
- Os sistemas criados para gerenciar os dados ou as informações são chamados de Sistemas de Gerenciamento de Bancos de Dados (SGBD). Os bancos de dados populares consistem naqueles de dados relacionais, sendo que a linguagem utilizada é o Structure Query Language, conhecida como SQL.
- Um banco de dados relacional armazena dados em tabelas, as quais são compostas de linhas. Estas são distribuídas em colunas, armazenando os dados.
- Instalando o Oracle Express Edition
> Para instalar o Oracle Express Edition, acesse o site para download da versão Windows x64
# Pesquise no google: download oracle database
# Selecione: (Download Oracle Database XE for Windows (ZIP))
# Crie uma pasta, coloque o zip dentro dela e extraia lá
# Depois de extrair execute o setup.exe e siga os passos
######
- SQL PLUS
> Usuário1: system -> possui acesso irrestrito ao banco de dados
# Senha1: root
> Usuário2: root -> Usuário que criei na instalação
# Senha2: root
> Comando para o usuário acessar o banco de dados e poder executar comandos:
# alter session set "_ORACLE_SCRIPT"= true;
> Comando para criar um usuário para utilizar na atividade:
# create user curso identified by curso1234;
> Comando para incliur privilégios ao usuário criado para que ele possa incluir e excluir dados:
# grant connect, resource to curso;
> Comando para conectar ao banco de dados utilizando o usuário criado:
# connect curso/curso1234;
> Comando para conseder o privilégio de DBA ao usuário
# GRANT DBA TO CURSO; (OBS: Este comando não foi aceito vou tentar proceguir sem esse)
# COMMIT;
######
CREATE TABLE PESSOA(
 CODIGO NUMBER(2,0) NOT NULL,
 NOME VARCHAR2 (15),
 SEXO CHAR (1),
 EMAIL VARCHAR2 (30),
 CONSTRAINT PK1 PRIMARY KEY (CODIGO)
);

> DESC PESSOA;
> SELECT COUNT(*) FROM PESSOA;
> INSERT INTO PESSOA VALUES (1, 'PESSOA1', 'M', 'e1@gmail.com');
######
- Utilizando o driver JDBC para conectar o banco de dados
> Para que seja possível conectar o banco de dados por meio das classes Java, utilizamos um driver JDBC. Ele se encontra na instalação do Oracle XE no seguinte diretório: 
# “C:\app\product\18.0.0\dbhomeXE\jdbc\lib”.
# OBS: no meu PC está nesse diretório: C:\app\nmayc\product\21c\dbhomeXE\jdbc\lib
# Para importar o driver JDBC para o seu projeto Java, selecione com o botão direito do mouse no projeto “projetojava’. Navegue até “propriedades” para chegar na opção “Java BuildPath”. Na guia “Libraries”, selecione o botão “Add External JARs” e procure pelo driver JDBC. Será necessário selecionar o driver “ojdbc8.jar”, clicar no botão “Abrir” e, em seguida, em “Apply and Close”.

Referência:
Curso Linguagem de Programação Java - Avançado. Plataforma Bradesco. Disponível em: https://www.ev.org.br
