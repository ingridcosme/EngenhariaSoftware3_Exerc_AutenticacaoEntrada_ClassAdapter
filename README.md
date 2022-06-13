# Exerc�cio pertencente a disciplina de Engenharia de Software III

## Design Patterns

### Class Adapter

Considere uma aplica��o que permita fazer a autentica��o de entrada em um outro sistema.

Essa autentica��o pode ser de duas formas distintas: por login e senha, com autentica��o em 2 fases, ou pelo envio de um token gerado por um app.

- Se fizer por 2 fases, deve-se fazer primeiro o login e senha e depois mandar o c�digo de confirma��o;

- Se fizer por token, basta enviar a chave gerada.

Considere que uma autentica��o pelo servi�o do Google pode ser implementada e, para o google, � necess�rio fazer o login com usu�rio e senha, na sequ�ncia mandar um n�mero recebido no smartphonee e, caso o smartphone n�o esteja dispon�vel, mandar um n�mero gerado no e-mail.