📘 To-Do List API – Spring Boot

Uma API REST para gerenciamento de usuários e tarefas, construída com Spring Boot seguindo boas práticas de organização, DTOs, validação com Bean Validation e arquitetura em camadas (Controller → Service → Repository).

---
📑 Índice

- Sobre o Projeto

- Tecnologias Utilizadas

- Arquitetura

- Modelos e Relacionamento

- Status das Tarefas

- Rotas da API

- Como Rodar o Projeto

- Estrutura de Pastas

- Autor

---
📌 Sobre o Projeto

Este projeto é uma API estilo To-Do List, permitindo:

-  Cadastro de usuários
- Criação e gerenciamento de tarefas
- Associação de tarefas a usuários
- Registro de datas de criação e finalização
- Validações com DTO e Bean Validation
- Padrão RESTful organizado

O objetivo é aplicar os conceitos de uma API com persistência, boas práticas e arquitetura limpa utilizando Spring Boot + JPA.

---
🛠 Tecnologias Utilizadas

- Java 21

- Spring Boot

- Spring Web

- Spring Data JPA

- Hibernate

- MySQL

- Bean Validation

- Maven

---
🏛 Arquitetura

O projeto segue a arquitetura em camadas:

Controller → Service → Repository → Database


Controller: recebe requisições HTTP

Service: regras de negócio

Repository: comunicação com o banco

Entities: mapeamento JPA

DTOs: dados de entrada/saída

---
📌 Modelos e Relacionamento
Usuario

- id (Long)

- nome (String)

- email (String)

- senha (String)

- descricao (String)

- dtInicio (LocalDate)

- dtFim (LocalDate)

- Tarefa

- id (Long)

- nome (String)

- descricao (String)

- status (ENUM)

- dtInicio (LocalDate)

- dtFim (LocalDate)

---
🔗 Relacionamento

Cada usuário pode ter várias tarefas (1:N).
Cada tarefa pertence a um usuário.

---
🎯 Status das Tarefas

O projeto utiliza um ENUM:

public enum Status {
    PENDENTE,
    EM_PROCESSO,
    CONCLUIDO
}

---
🌐 Rotas da API
📍 Usuário
Criar usuário

POST /usuario

Body:

{
  "nome": "Gabriel",
  "email": "gabriel@gmail.com",
  "senha": "123456"
}

---
📍 Tarefa
Criar tarefa

- POST /tarefa

Body:

{
  "nome": "Estudar Spring Boot",
  "descricao": "Fazer atividade do SENAI",
  "status": "PENDENTE"
}


Retorno:

"Tarefa criada com sucesso!"

---
▶ Como Rodar o Projeto

Instale:

Java 17+

Maven

MySQL

Clone o repositório:

git clone [https://github.com/SEU-USUARIO/seu-repo.git](https://github.com/BielVereda/ToDo_Application.git)

---
Configure o application.properties:

spring.application.name=ToDo

spring.datasource.url=jdbc:mysql://localhost:3306/gabriel
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
server.port = 8084

---
Rode o projeto:

mvn spring-boot:run


---
API rodando em:

http://localhost:8084

📁 Estrutura de Pastas
src/main/java
 └── com.List.ToDo
     ├── controller
     ├── service
     ├── repository
     ├── dto
     ├── entities
     │    └── Status.java

---
👤 Autor

Gabriel Vereda
Desenvolvedor • Estudante SENAI – Desenvolvimento de Sistemas



