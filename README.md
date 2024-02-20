# Certification-app
Este projeto consiste em uma API desenvolvida em Java utilizando a stack Spring Boot, Maven, Docker e PostgreSQL. A finalidade da API é fornecer um sistema de certificação para alunos em diferentes tecnologias, permitindo que eles realizem provas e recebam certificados de acordo com seu desempenho.

## Tecnologias 🌟
- Java ☕
- Spring Boot 🍃
- Postgres SQL 🐘
- Docker 🐋

## API REST: Métodos Comuns

A API segue o padrão REST e utiliza os seguintes métodos HTTP para manipulação de recursos:

- **GET:** Utilizado para buscar informações de recursos existentes.
- **POST:** Inserção de novas informações ou recursos.
- **PUT:** Atualização ou substituição completa de informações de um recurso.
- **DELETE:** Remoção de um recurso existente.
- **PATCH:** Alteração pontual de uma informação específica de um recurso.

## Funcionalidades Principais

- Verificação de permissão para realizar a prova.
- Busca de questões e alternativas de resposta.
- Resposta à prova.
- Consulta ao ranking com as melhores notas.

## Executando a API

1. Clone o repositório para sua máquina local:

    ```bash
    $ git clone https://github.com/seu-usuario/nome-do-repositorio.git
    ```

2. Navegue até o diretório do projeto:

    ```bash
    $ cd nome-do-repositorio
    ```

3. Execute a API Spring Boot:

    ```bash
    # Utilize o Maven para compilar e iniciar a API
    $ mvn spring-boot:run
    ```

   A API será iniciada e estará disponível em `http://localhost:8080` por padrão.

