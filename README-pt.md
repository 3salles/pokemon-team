<p align="center">
  <h3 align="center">Pokemon Team Manager</h3>

<p align="center">
  <img src="https://img.shields.io/static/v1?label=Version&message=1.0&color=7159c1" alt="Version-1.0" />
  <img src="https://img.shields.io/badge/status-unfinished-orange" alt="Status-Unfinished "/>
  <img src="https://img.shields.io/static/v1?label=Lincense&message=MIT&color=0000ff " alt="Lincense" />
</p>

<p align="center">
    Um projeto CRUD de gerenciamento de times Pokemon para aplicar os conceitos aprendidos na cadeira de Paradigmas da Programação da UFMA usando a linguagem de Java.
    <br />
    <br />
    <a href="README.md">🇺🇸English</a>
    ·
    <a href="README-pt.md">🇧🇷Portuguese</a>
  </p>
</p>

<!-- TABLE OF CONTENTS -->

## 🗂 Table of Contents

* [Sobre o Projeto](#book-sobre-o-projeto)
  * [Layout](#art-layout)
  * [Tecnologias](#computer-tecnologias)
  * [Features](#sparkles-features)
*[Instalação](#bricks-instalação)
  * [Front-end](#lipstick-front-end)
  * [Back-end](#file_cabinet-back-end)
*[Licença](#page_facing_up-licença)
* [Autoura](#woman_technologist-autora)

## :book: Sobre o Projeto

Este projeto foi criado durante as aulas de Paradigmas da Programação da [UFMA](https://portalpadrao.ufma.br/site).A ideia do Gerenciamento de Times Pokemon é de criar seu time pokemon e ver o poder de ataque e defesa dele. 

### :art: Layout

### Versão 2.0
Esta é a página de cadastro de Pokemon

![01](https://user-images.githubusercontent.com/62452619/113948991-969ad800-97e4-11eb-8fb2-ac3704db159d.png)

Cadastre novo Pokemon

![02](https://user-images.githubusercontent.com/62452619/113948994-97cc0500-97e4-11eb-96b9-4ec5e192b45d.png)

Quando o usuário não preenche um campo, aparece uma mensagem de popup alertando:

![04](https://user-images.githubusercontent.com/62452619/113949004-9a2e5f00-97e4-11eb-9918-7f1950dcfa19.png)

Quando o usuário cadastra um novo pokemon, aparece uma mensagem de popup de sucesso:

![03](https://user-images.githubusercontent.com/62452619/113949001-98fd3200-97e4-11eb-97fd-80d21720efa2.png)


Confirmação de saída:

![05](https://user-images.githubusercontent.com/62452619/113953360-0366a000-97ee-11eb-953f-1cfca0910499.png)

### Versão 2.5

Tela principal:

![06](https://user-images.githubusercontent.com/62452619/114790364-05cf7980-9d5b-11eb-909f-ebd65916b4b7.png)

Tela de visualizar pokemons cadastrados:

![08](https://user-images.githubusercontent.com/62452619/115163804-9373d780-a081-11eb-8fc3-2b69af91451b.png)


Deletar pokemon por ID:

![09](https://user-images.githubusercontent.com/62452619/115165176-00d43800-a083-11eb-8842-a48650fada20.png)

### :computer: Tecnologias

- [Java](https://www.java.com/pt-BR/)
- [PostgreSQL](https://www.postgresql.org)
- [Swing]()

### :sparkles: Features

- [x] Register Screen
- [x] List Screen
- [x] Edit/Update/Delete Screen
- [ ] Create team Screen

## :bricks: Instalação

### :construction: Pré-requisitos

Clone o repositório deste projeto:

```bash

$ git clone git@github.com:3salles/pokemon-team.git

# Entre na pasta `Pokemon Team Manager` :

$ cd pokemon-team
```

🚨 Se você não possui git em sua máquina, você pode instalar [aqui](https://git-scm.com/downloads).

## :lipstick: Front-end

Abara a pasta `gui` e rode os comandos:
```shell
javac Home.java
java Home

```

E divirta-se com o app!! :laughing:
## :file_cabinet: Back-end

No arquivo `db/JdbcConnection.java`, mude as seguintes linhas com o seu usuário e senha do banco de dados:

```java

	// Connect to localhost db
	private static final String url = "jdbc:postgresql://localhost/pokemon";
	private  static final String user = "postgres";
	private static final String password = "root";

```

Rode o arquivo `db/JdbcConnection.java` para conectar-se ao banco de dados do PostgreSQL.

```java

javac JdbcConnection.java
java JdbcConnection
```

Para criar a tabela de Pokemons, rode o arquivo `db/CreateTable.java`:

```shell

javac CreateTable.java
java CreateTable

```

🚨 OPCIONAL: Para inserir, listar e deletar pokemon, apenas remova os comentários  na area de inserir e rode o arquivo `view\Main.java`:

```shell

javac Main.java
java Main

```

## :page_facing_up: Licença

Este projeto usa a licença [MIT](https://github.com/3salles/pokemon-team/blob/main/LICENSE).

## :woman_technologist: Autora

<p align="center">
  <a href="https://github.com/3salles"><img src="https://img.shields.io/badge/-Github-000?style=flat-square&logo=Github&logoColor=white&link=https://github.com/3salles" alt="Github" /></a>
  <a href="https://www.linkedin.com/in/beatriz-salles-b701a31a6/"><img src="https://img.shields.io/badge/-LinkedIn-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/beatriz-salles-b701a31a6" alt="LinkendIn" /></a>
  <a href="mailto:beatrizsallesss@gmail.com"><img src="https://img.shields.io/badge/-Gmail-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:beatrizsallesss@gmail.com" alt="Gmail" /></a>
</p>

<p align="center">Desenvolvido com 💜 por Beatriz Salles</p>
