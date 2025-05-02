# 📦 Projeto Java Spring Boot - Sistema de Vendas

Este projeto foi desenvolvido como parte de um curso de Java com Spring Boot. Ele simula um sistema de vendas online com cadastro de usuários, produtos, categorias, pedidos e pagamentos.

---

## 🔧 Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA / Hibernate
- H2 Database (ambiente de testes)
- Maven

---

## 📂 Estrutura do Projeto

```
src/
├── config/            # Configuração de perfil e seed de dados
├── entities/          # Entidades do domínio (User, Product, Order, etc.)
├── enums/             # Enumerações (OrderStatus)
├── repositories/      # Interfaces JPA
└── CursoJavaApplication.java  # Classe principal da aplicação
```

---

## ▶️ Como executar o projeto

### Pré-requisitos

- Java 17 ou superior
- Maven 3.8+

### Passos para rodar localmente

1. Clone o repositório:
   ```bash
   git clone https://github.com/GabrielPraata/sistema_de_vendas.git
   ```

2. Acesse o diretório do projeto:
   ```bash
   cd seu-repositorio
   ```

3. Execute a aplicação:
   ```bash
   ./mvnw spring-boot:run
   ```

> O projeto usa o perfil `test` que carrega dados de exemplo automaticamente usando H2.

---

## 🛠 Acesso ao H2 Console

Você pode acessar o banco de dados H2 via navegador:

- **URL:** `http://localhost:8080/h2-console`
- **JDBC URL:** `jdbc:h2:mem:testdb`
- **Usuário:** `sa`
- **Senha:** *(em branco)*

> Certifique-se de que o console H2 está habilitado no `application.properties`:
> ```
> spring.h2.console.enabled=true
> spring.datasource.url=jdbc:h2:mem:testdb
> ```

---

## ⚙️ Funcionalidades

- ✅ Cadastro de usuários
- ✅ Cadastro de produtos e categorias
- ✅ Associação de produtos a múltiplas categorias
- ✅ Criação de pedidos com múltiplos itens
- ✅ Pagamento de pedidos
- ✅ Relacionamentos entre entidades com JPA

---

## 🗃️ Exemplo de Dados

Durante a execução com o perfil `test`, são inseridos automaticamente:

- 2 usuários
- 5 produtos
- 3 categorias
- 3 pedidos
- 4 itens de pedido
- 1 pagamento

---

## 📌 Status do projeto

🚧 Em desenvolvimento

---

## 🧑‍💻 Autor

Desenvolvido por Gabriel Prata  
[![LinkedIn](https://img.shields.io/badge/-Gabriel%20Prata-0e76a8?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/gabrielprata/)  
[![GitHub](https://img.shields.io/badge/-GabrielPraata-181717?style=flat&logo=github&logoColor=white)](https://github.com/GabrielPraata)
