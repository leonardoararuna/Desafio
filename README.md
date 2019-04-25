# API REST STAR-WARS (Desafio Desenvolvedor Java Backend) 
O desafio consiste no desenvolvimento de uma API REST capaz de consumir dados JSON da API pública do Star Wars (https://swapi.co/) e manter informações sobre seus planetas. 

A API tem como funcionalidade as operações básicas CRUD considerando as regras de negócio impostas, tais como:
* Buscar por ID e Nome do planeta.
* Inserir planetas manualmente que nao estejam na API do Star Wars.

#### Dependências:
* Java
* JSP
* MySql
* Glassfish Server

## Antes da execução da aplicação, primeiro é necessario configurar o banco de Dados

### Configurações do MySQL

#### 1 - Realize login no MySQL.
shell
sudo mysql;

#### 2 - Crie e acesse o banco de dados desafio
sql
create database desafio;
use desafio;

####3 - Crie a tabela planetas
sql
create table planetas(
id integer not null PRIMARY KEY auto_increment,
name varchar(50) not null,
climate varchar(50) not null,
Terrain varchar(50) not null,
qtd_filmes integer,
status integer not null
);


### Execução da API

Importe o projeto para a IDE de desenvolvimento e o execute.
