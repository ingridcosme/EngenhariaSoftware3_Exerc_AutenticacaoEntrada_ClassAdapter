# Exercício pertencente a disciplina de Engenharia de Software III

## Design Patterns

### Class Adapter

Considere uma aplicação que permita fazer a autenticação de entrada em um outro sistema.

Essa autenticação pode ser de duas formas distintas: por login e senha, com autenticação em 2 fases, ou pelo envio de um token gerado por um app.

- Se fizer por 2 fases, deve-se fazer primeiro o login e senha e depois mandar o código de confirmação;

- Se fizer por token, basta enviar a chave gerada.

Considere que uma autenticação pelo serviço do Google pode ser implementada e, para o google, é necessário fazer o login com usuário e senha, na sequência mandar um número recebido no smartphonee e, caso o smartphone não esteja disponível, mandar um número gerado no e-mail.