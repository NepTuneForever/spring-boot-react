# Catálogo de Filmes

Projeto full stack em desenvolvimento para praticar Java, Spring Boot, APIs REST e React com JavaScript. A ideia inicial é criar um catálogo simples de filmes, mas o escopo pode evoluir durante o aprendizado.

> Este é um projeto **full hand coded**: a proposta é escrever e entender cada parte do código, em vez de depender de templates prontos ou ferramentas que montam a aplicação automaticamente.

## Objetivo

Construir uma aplicação simples em que seja possível visualizar filmes e, futuramente, cadastrar, editar e remover itens do catálogo.

## Tecnologias

### Back-end

- Java 17
- Spring Boot
- Maven
- API REST
- Banco de dados (a definir)

### Front-end

- React
- JavaScript
- HTML e CSS

## Estrutura planejada

```text
React (front-end)
        ↓ requisições HTTP
Spring Boot API REST (back-end)
        ↓
Banco de dados
```

O front-end fará requisições para as rotas da API. O Spring Boot será responsável por receber as requisições, aplicar as regras da aplicação e buscar ou salvar dados no banco.

## Funcionalidades planejadas

- Listar filmes
- Buscar um filme por identificador
- Cadastrar filmes
- Editar filmes
- Remover filmes
- Exibir título, ano, gênero e outras informações básicas

Essas funcionalidades são um plano inicial e podem mudar conforme o projeto evoluir.

## Como executar o back-end

Pré-requisito: Java 17 instalado.

No terminal, dentro da pasta do projeto:

```bash
./mvnw spring-boot:run
```

Ou execute a classe `PrimeiroProjetoApplication` pelo IntelliJ IDEA.

Com a aplicação em execução, ela ficará disponível, por padrão, em:

```text
http://localhost:8080
```

## Status

Em desenvolvimento — foco atual: aprender os fundamentos de rotas, respostas JSON e comunicação entre front-end e back-end.
