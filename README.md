# Mailer

Esta é uma aplicação simples para enviar emails através de uma API RESTful. Ela foi desenvolvida utilizando o framework Spring Boot.

## Endpoints
### Envio de Email
### POST /api/mail/send

Endpoint para enviar um email.

**Corpo da Requisição (JSON)**:

```json
{
  "subject": "Assunto do Email",
  "text": "Corpo do Email"
}

```

**Resposta**:

- 200 OK: Email enviado com sucesso
- 500 Internal Server Error: Erro ao enviar o email