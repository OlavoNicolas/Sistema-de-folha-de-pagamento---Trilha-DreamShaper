# Sistema de folha de pagamento
Olavo Nicolas Queiroz de Paiva

## Descrição
Este projeto é um sistema simples de folha de pagamento desenvolvido em Java utilizando programação orientada a objetos.

O sistema permite:

* cadastrar colaboradores
* listar colaboradores cadastrados
* buscar colaboradores por número de registro
* calcular salários de diferentes tipos de funcionários

O projeto foi desenvolvido para praticar conceitos fundamentais de Java, como:

* classes e objetos
* construtores
* encapsulamento
* listas com `ArrayList`
* métodos estáticos
* estruturas de repetição
* estruturas condicionais
* entrada de dados com `Scanner`

---

# Funcionalidades

## Cadastro de colaboradores
O sistema permite cadastrar:

* número de registro
* nome completo
* tipo de funcionário

Tipos disponíveis:

1. Funcionário padrão
2. Funcionário comissionado
3. Funcionário produção

---

## Cálculo de salário

### Funcionário padrão
Recebe apenas o salário base:

```java id="lkxmxh"
2000.0
```

---

### Funcionário comissionado

Salário calculado com:

```text id="0r9g6h"
salário base + comissão sobre vendas
```

---

### Funcionário produção

Salário calculado com:

```text id="f2cnlr"
salário base + bônus por produção
```

---

## Listagem de colaboradores

Exibe todos os colaboradores cadastrados no sistema.

---

## Busca por registro

Permite localizar um colaborador pelo número de registro.

---

# Estrutura do Projeto

## Classe `Colaborador`
Responsável por:

* armazenar os dados dos colaboradores
* realizar cadastros
* listar colaboradores
* buscar registros
* calcular salários

Atributos principais:

```java id="0z8exg"
private int numeroRegistro;
private String nome;
private String tipoFuncionario;
private double salario;
```

---

## Classe `SistemaPagamento`
Responsável por:

* executar o sistema
* exibir o menu principal
* controlar o fluxo da aplicação

---

# Tecnologias Utilizadas
* Java

---

# Como Executar

## Pré-requisitos
* Java JDK 8 ou superior

---

## Passos

1. Clone o repositório:
```bash id="z9i3rj"
git clone <url-do-repositorio>
```

2. Abra o projeto em uma IDE Java.

3. Execute a classe:
```text id="oplfk2"
SistemaPagamento.java
```

---

# Exemplo de Uso
```text id="vb5gvd"
===== SISTEMA DE FOLHA DE PAGAMENTO =====

1 - Cadastrar colaborador
2 - Listar colaboradores
3 - Buscar por registro
0 - Sair
```

---

# Dados Mock
O sistema possui dados pré-cadastrados para testes através do método:

```java id="6lyx9l"
dadosMock()
```

---
