
**# Consulta CEP API**

**## Visão Geral**

Esta API REST Spring Boot simples busca informações de CEP (Código de Endereço Postal Brasileiro) da API ViaCEP.

**## Uso**
Consolidar a prática em consumo de API's externas

**## Uso**

1. Inicie a aplicação:
   - Execute a aplicação Spring Boot usando seu IDE ou método de linha de comando preferido.

2. Envie uma solicitação GET para o endpoint:
   - **URL:** `http://localhost:8080/consulta/cep/{cep}` (substitua `{cep}` pelo CEP desejado)
   - **Exemplo:** `http://localhost:8080/consulta/cep/01001000`

**## Resposta**

- Se bem-sucedido, retorna a resposta JSON bruta da API ViaCEP, contendo informações de endereço associadas ao CEP.
- Se ocorrer um erro, retorna uma mensagem de erro apropriada.

**## Dependências**

- Spring Boot
- Spring Web

**## Estrutura do Código**

- Classe `ConsultaCepAPI`:
    - Lida com solicitações GET para o endpoint `/cep/{cep}`.
    - Usa `RestTemplate` para fazer uma chamada para a API ViaCEP.
    - Retorna o corpo da resposta como uma string.


