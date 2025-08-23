# exerc-mfa
Instruções para desenvolvimento de um projeto simples para MFA

## Proposta
Esse projeto visa criar uma API que forneça endpoints para login utilizando o processo de Múltiplo Fator de Autenticação, que visa minimizar acessos não autorizados. A idéia é a princípio permitir o uso somente de email para envio do código MFA.\
A proposta visa criar estruturas para armazenar dados de login, o código de MFA que foi enviado ao usuário e que deve posteriormente gerar um token JWT para que o usuário possa acessar o sistema.\
O sistema deve permitir cadastro e alteração de senha. O cadastro somente deve ser feito após o usuário confirmar o email realizando um fluxo de MFA e a alteração da senha deve ser feito mediante a confirmação por MFA. O usuário não pode alterar uma senha caso ela seja uma de suas 3 senhas anteriores.

### Estrutura sugerida
- Cliente
    - ID
    - Login
    - Senha Atual (Deve fazer referência a estrutura de senha)
    - Dispositivos MFA (Deve fazer referência a estrutura de Dispositivos MFA)
    - Ativo
    - Ultima data de tentativa de login
    - Ultima data de login
- Senha
    - ID
    - Cliente (Deve fazer referencia a estrutura de cliente)
    - Índice
    - Senha
    - Data Criação
    - Ativa
- Dispositivo MFA
    - ID
    - Cliente (Deve fazer referência a estrutura de cliente)
    - Endereço
    - Tipo
    - Ativo
    - Data Inserção
    - Data Inativação
- Auditoria
    - ID
    - Cliente (Deve fazer referência a estrutura de cliente)
    - Operação realizada
    - Data operação

