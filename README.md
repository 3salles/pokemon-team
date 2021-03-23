<p align="center">
  <h3 align="center">Pokemon Team Manager</h3>

<p align="center">
  <img src="https://img.shields.io/static/v1?label=Version&message=1.0&color=7159c1" alt="Version-1.0" />
  <img src="https://img.shields.io/badge/status-unfinished-orange" alt="Status-Unfinished "/>
  <img src="https://img.shields.io/static/v1?label=Lincense&message=MIT&color=0000ff " alt="Lincense" />
</p>

<p align="center">
    A CRUD  Pokemon Manager Team porjet to aplly concepts learned in Programming Paradigms at UFMA using Java languange.
    <br />
    <br />
    <a href="README.md">🇺🇸English</a>
    ·
    <a href="README-pt.md">🇧🇷Portuguese</a>
  </p>
</p>

<!-- TABLE OF CONTENTS -->

## 🗂 Table of Contents

- [About the Project](#book-about-the-project)
  - [Technologies](#computer-technologies)
- [Author](#woman_technologist-author)

## :book: About The Project

This project was created during Programming Paradigms classes at [UFMA](https://portalpadrao.ufma.br/site). The ideia of Pokemon Team Manager is to create your own pokemon team and sees its atack and defense power.

### :computer: Technologies

- [Java](https://www.java.com/pt-BR/)
- [PostgreSQL](https://www.postgresql.org)

## :bricks: Installation

### :construction: Prerequisites

Clone this project repository:

```bash

$ git clone git@github.com:3salles/pokemon-team.git

#Enter in `Pokemon Team Manager` folder:

$ cd pokemon-team
```

🚨 If you don't have git in your machine, you can install it [here](https://git-scm.com/downloads).

## :file_cabinet: Back-end

In `db/JdbcConnection.java` archive, change the follwing lines to its own user and password database:

```java

	// Connect to localhost db
	private static final String url = "jdbc:postgresql://localhost/pokemon";
	private  static final String user = "postgres";
	private static final String password = "root";

```

Run `db/JdbcConnection.java` archive to connect to PostgreSQL database.

```java

javac JdbcConnection.java
java JdbcConnection
```

To create Pokemon table, run `db/CreateTable.java` archive:

```shell

javac CreateTable.java
java CreateTable

```

To insert, list and delete pokemon, just romove comments in insert area and run the `view\Main.java`archive:

```shell

javac Main.java
java Main

```

## :woman_technologist: Author

<p align="center">
  <a href="https://github.com/3salles"><img src="https://img.shields.io/badge/-Github-000?style=flat-square&logo=Github&logoColor=white&link=https://github.com/3salles" alt="Github" /></a>
  <a href="https://www.linkedin.com/in/beatriz-salles-b701a31a6/"><img src="https://img.shields.io/badge/-LinkedIn-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/beatriz-salles-b701a31a6" alt="LinkendIn" /></a>
  <a href="mailto:beatrizsallesss@gmail.com"><img src="https://img.shields.io/badge/-Gmail-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:beatrizsallesss@gmail.com" alt="Gmail" /></a>
</p>

<p align="center">Developed with 💜 by Beatriz Salles</p>
