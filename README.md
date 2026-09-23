# Finno

API REST para Sistema de Gestão Financeira Pessoal. Projeto de portfólio construído com Java 21 e Spring Boot.

> Esse Projeto é uma implementação em java do [finno](https://github.com/AlexandreOliver/finno)

> Projeto single-user (sem autenticação na versão atual), pensado como base para uma futura evolução multi-plataforma, incluindo aplicativo mobile.

---

## Stack

- **Linguagem:** Java 21
- **Framework:** Spring Boot 4.1.0
- **Persistência:** Spring Data JPA + PostgreSQL
- **Build:** Maven
- **Ambiente local:** Docker Compose (PostgreSQL)

---

## Como rodar localmente

```bash
# 1. Subir o banco de dados
docker compose up -d

# 2. Configurar variáveis de ambiente (ver application.yml)
#    - DB_URL, DB_USERNAME, DB_PASSWORD

# 3. Rodar a aplicação
./mvnw spring-boot:run
```

A aplicação sobe em `http://localhost:8080` (porta configurável em `application.yml`).

---

## Estrutura de branches e commits

- Uma branch por módulo funcional (`feature/01-arquitetura-inicial`, `feature/02-design-banco`, ...)
- Commits seguindo [Conventional Commits](https://www.conventionalcommits.org/), escopo = módulo:
  ```
  feat(banco): cria entidade Transacao com enum TipoTransacao
  fix(servico): corrige cálculo de saldo ao excluir transação
  ```

---

## Licença

Projeto de portfólio pessoal — uso livre para fins de estudo e referência.
