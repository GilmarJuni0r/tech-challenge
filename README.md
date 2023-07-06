<a name="readme-top"></a>
<br />
<div align="center">
  <a href="https://img.icons8.com/?size=512&id=GgroWyMhJvY1&format=png">
    <img src="https://img.icons8.com/?size=512&id=GgroWyMhJvY1&format=png" alt="Logo" width="150" height="80">
  </a>

# API DE CADASTRO GERAL - PESSOAS, ENDEREÇOS E ELETRODOMÉSTICOS

  <p align="center">
    <br />
    <a href="https://github.com/GilmarJuni0r/tech-challenge"><strong>Explore o projeto »</strong></a>
    <br />
    <br />
    <a href="https://github.com/orgs/community/discussions/60162">Para reportar um bug ou problemas do projeto clique nessa mensagem!</a>
    ·
  </p>
</div>

## Sumário

* [Sobre o Projeto](#sobre-o-projeto)
* [Desafios do Projeto](#desafios-do-projeto)  
* [Requisitos](#-pré-requisitos-para-utilização)
* [Instalação e execução do projeto](#-instalação-e-execução-do-projeto)
* [Funcionalidades do projeto](#-funcionalidades-do-projeto)
* [Ferramentas utilizadas](#-Ferramentas-utilizadas)
* [Report um bug](#-report-um-bug)
* [Versão do projeto](#-Versão-do-projeto)
* [Autores](#-autores)
* [Licença](#-licença)
* 
## Sobre o Projeto

Olá a todos !!! Bem vindos! 

Nesta documentação iremos falar sobre o projeto API CADASTRO GERAL, explicando a sua finalidade, as tecnologias envolvidas na sua criação e a como utiliza-lo.

Está é uma API monolitica com 3 verbos POST utilizando (SPRING BOOT, JAVA, MAVEN, TOMCAT) que realizam o cadastro de pessoas, endereços e eletrodomésticos em memória.

Desenvolvemos essa API com base no desafio proposto no modulo 1 da POS TECH Arquitetura e Desenvolvimento JAVA da FIAP - Ano de 2023, que teve como requisitos principais desenvolver (3) APIS, podendo ser também somente (1) com as (3) funcionalidades que foi a nossa escolha, sendo que essas (3) funcionalidades possam realizar o cadastro de pessoas, endereços e eletrodomésticos e seguir as orientações de:

- Gestão de endereços que tem como objetivo permitir o gerenciamento de informações sobre os endereços cadastrados em nosso sistema.
- Gestão de pessoas tem como objetivo permitir o cadastro e gerenciamento de informações sobre as pessoas relacionadas aos usuários cadastrados em nosso sistema.
- Gestão de eletrodomésticos tem como objetivo permitir o cadastro e gerenciamento de informações sobre os aparelhos eletrônicos dos usuários cadastrados em nosso sistema.

## Desafios do Projeto

Durante a execução deste projeto, adotamos o padrão Rest para expor os recursos da aplicação, utilizando os verbos HTTP apropriados. Garantimos a estrutura adequada das URLs e o retorno das respostas no formato JSON, visando uma maior compatibilidade e integração com outros sistemas e facilitando a manipulação dos recursos por parte dos clientes.

Seguindo o princípio de separação de responsabilidades, implementamos uma divisão em camadas, como Controller, UserCase e Gateway, com o intuito de facilitar a manutenção e escalabilidade do sistema. Adotamos Clean Architecture como base para o projeto, buscando refletir as melhores práticas utilizadas atualmente no mercado de desenvolvimento de software, indo além do foco acadêmico abordado nas aulas.

Incluímos logs nas classes utilizando a biblioteca de logging SLF4J. A utilização de logs nos permite registrar informações relevantes em diferentes níveis, proporcionando uma melhor visibilidade do comportamento do fluxo do sistema durante a execução e facilitando a identificação e resolução de problemas.

Implementamos um interceptador de exceções visando aumentar a confiabilidade do sistema. Essa funcionalidade permite a captura e o tratamento adequado de exceções que ocorrem durante a execução, fornecendo respostas apropriadas aos clientes e registrando informações relevantes para análises posteriores.

Nosso principal desafio foi criar uma arquitetura que refletisse as melhores práticas utilizadas atualmente no mercado de desenvolvimento de software, indo além do foco acadêmico abordado nas aulas. O objetivo era desenvolver uma estrutura sólida que garantisse a integridade dos dados e facilitasse a manipulação eficiente das informações.

Nesse contexto, desenvolvemos as primeiras APIs do nosso sistema, as quais são responsáveis pela gestão de dados relacionados a Pessoa, Endereço e Eletrodoméstico. Cada uma dessas APIs recebe um conjunto específico de dados e tem o objetivo de gerenciar as informações de forma eficiente.

Em suma, adotamos uma abordagem técnica rigorosa no desenvolvimento deste projeto, implementando as melhores práticas de arquitetura, tratamento de exceções e registro de logs. Acreditamos que essas medidas contribuirão para a robustez e confiabilidade do sistema, proporcionando uma experiência satisfatória aos usuários.

## 📋 Pré-requisitos para utilização

OBRIGATÓRIO ter todos os itens na listagem abaixo instalados e configurados na sua máquina e IDE de sua escolha para que o projeto funcione corretamente

- [Maven Apache](https://maven.apache.org/download.cgi) Ferramenta de automação de compilação
- [Java versão 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) Linguagem de programação
- [Spring web using Spring MVC](https://spring.io/projects/spring-framework),[Bean validation](https://beanvalidation.org/), [Lombok](https://projectlombok.org/) Dependências



```
Necessário ter todos os itens abaixo instalados e configurados na máquina e IDE para que o projeto funcione
```

## 🔧 Instalação e execução do projeto


```
1 - Faça dowloand do arquivo projeto como zip clicando em "<> Code" acima no github
 1-1 Você também pode realizar um commit do projeto utilizando o link https://github.com/GilmarJuni0r/tech-challenge.git

2 - Importe o projeto na IDE de sua escolha e efetue o BUILD com o Maven clicando com o botão direito no projeto e depois em "Build Project"
 2-1 Você també pode utilizar o comando mvn clean install

3- Clique em Run Application "TechChallengeApplication", após, ao finalizar a execução do pacote Java o resultado esperado é a mensagem no console da sua IDE: Started TechChallengeApplication
 3-1 Caso não receba a mensagem acima é importante revisar os Pré-requisitos. 
```


## 📦 Funcionalidades do projeto


### Cadastro de pessoas

A funcionalidade do cadastro de Pessoas foi desenvolvido para possibilitar o registro e gerenciamento das informações dos usuários cadastrados. 

Além do cadastro principal, os usuários têm a opção de incluir outras pessoas relacionadas a eles, informando o grau de parentesco. É relevante destacar que o cadastro de pessoas relacionadas, ou seja, parentes do usuário, não é obrigatório.

>[ Base URL: http://localhost:8080/people ]


<details>
    <summary>Body Raw (json)</summary>

```
{
    "name": "string",
    "cpf": "string",
    "birthDate": "string",
    "gender": "string"",
    "relatives":[
        {
            "name": "string",
            "parentage": "string",
            "gender": "string"
        }
    ]
}
```

</details>

<details>
  <summary>Exemplo Request Body:</summary>

```
{
    "name": "Michael De Santa",
    "cpf": "527.880.090-97",
    "birthDate": "1965-09-06",
    "gender": "Masculino",
    "relatives": [
        {
            "name": "Amanda De Santa",
            "parentage": "Esposa",
            "gender": "Feminino"
        },
        {
            "name": "Tracey De Santa",
            "parentage": "Filha",
            "gender": "Feminino"
        }
    ]
}
```

</details>

<details>
  <summary>Responses:</summary>


201 - _Created_

- Será retornado o id do registro criado

```
1
```



422 - _Unprocessable Entity_

- Caso o CPF já esteja cadastrado

```
{
	"code": "tc.person.CpfAlreadyRegistered",
	"message": "CPF já cadastrado"
}
```



500 - _Internal Server Error_

```
{
	"code": "tc.person.errorToAccessDatabase",
	"message": "Erro ao tentar acessar o banco de dados"
}
```

</details>

----

### Cadastro de endereços

A Funcionalidade de cadastro de endereços foi desenvolvido para salvar e a administrar as informações de endereços fornecidas pelos usuários. 

É necessário os seguintes dados obrigatórios: nome da rua, número, bairro, cidade e estado. 

Essa funcionalidade torna o cadastro mais simples e eficiente gerenciar e manter atualizadas as informações essenciais para uma identificação e localização precisa dos endereços das pessoas.

>[ Base URL: http://localhost:8080/adresses ]

<details>
    <summary>Body Raw (json)</summary>

```
{
    "street": "string",
    "number": "string",
    "neighborhood": "string",
    "city": "string",
    "state": "string"
}
```
</details>

<details>
  <summary>Exemplo Request Body:</summary>


```
{
    "street": "Rua dos Patriotas",
    "number": "20",
    "neighborhood": "Ipiranga",
    "city": "São Paulo",
    "state": "SP"
}
```
</details>

<details>
  <summary>Responses:</summary>

201 - _Created_
- Será retornado o id do registro criado

```
1
```

400 - _Bad Request_

```
{
  "code": "tc.argumentNotValid",
  "message": "state:Insira apenas a sigla do estado, ex: RJ;"
}
```

500 - _Internal Server Error_

```
{
	"code": "tc.address.errorToAccessDatabase",
	"message": "Erro ao tentar acessar o banco de dados"
}
```
</details>

----------

### Cadastro de eletrodomésticos

A Funcionalidade de cadastro de eletrodomésticos foi desenvolvido para permitir o registro das informações dos eletrodomésticos utilizados pelos usuários cadastrados. 

É necessário fornecer obrigatoriamente os seguintes dados: nome, tipo, modelo, potência e voltagem. O campo cor é opcional e pode ser preenchido caso seja relevante.

Essa funcionalidade torna o cadastro mais simples e eficiente gerenciar e manter atualizadas os dados dos eletrodomésticos, assegurando uma identificação correta e apropriada utilização desses aparelhos.

>[ Base URL: http://localhost:8080/homeAppliances ]

<details>
    <summary>Body Raw (json)</summary>

```
{
    "name": String,
    "brand": String,
    "model": String,
    "color": String,
    "power": Long,
    "voltage": Long
}
```
</details>

<details>
  <summary>Exemplo Request Body:</summary>


```
{
    "name": "Airfryer  ",
    "brand": "Philips Walita",
    "model": "High Connect",
    "color": "Preta",
    "power": 2000,
    "voltage": 110
}
```
</details>

<details>
  <summary>Responses:</summary>
201 - _Created_

- Será retornado o id do registro criado

```
1
```

422 - _Unprocessable Entity_

```
{
    "code": "tc.homeAppliance.IllegalArgumentVoltage",
    "message": "Voltagem inválida, insira 110 ou 220"
}
```

500 - _Internal Server Error_

```
{
	"code": "tc.homeAppliance.errorToAccessDatabase",
	"message": "Erro ao tentar acessar o banco de dados"
}
```
</details>

---------

## 🛠️ Ferramentas utilizadas

[![Spring boot](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white
)](https://spring.io/projects/spring-boot) 

[![JAVA 17](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) 

[![Apache Maven](https://img.shields.io/badge/-Apache_Maven-C71A36?style=flat-square&logo=Apache%20Maven&logoColor=white&link=https://maven.apache.org/)](https://maven.apache.org/)

[![Tom cat](https://tomcat.apache.org/res/images/tomcat.png)](https://tomcat.apache.org/)

- [Spring boot](https://spring.io/projects/spring-boot) Framework Java - Versão 3.1.0
- [Apache Maven](https://maven.apache.org/download.cgi) Ferramenta de automação de compilação - Gerência dependências - Versão 4.0
- [Java versão 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) Linguagem de programação - Versão 17
- [Spring web using Spring MVC](https://spring.io/projects/spring-framework),[Bean validation](https://beanvalidation.org/), [Lombok](https://projectlombok.org/) - Plugins - Dependências
- [Tom cat](https://tomcat.apache.org/) Servidor Standalone


## 🖇️ Report um bug

Por favor, caso tenha algum report de vulnerabilidades ou problemas durante a utilização da a plicação nos enviem uma mensagem através do nosso Fórum no Github ( [Clique aqui](https://github.com/orgs/community/discussions/60162) ).

## 📌 Versão do projeto

Versão do projeto 1.0.0 

( Futuramente pensamos em utilizar o jenkins para controle versões e o Nexus Repository Manager para guardar e consultar versões e dependências )

## ✒️ Autores

* **Michel Kelvin Oliveira Pereira** -  [Arquiteto e Desenvolvedor](https://github.com/MichelKelvin)
* **Gilmar Junior**  - [Arquiteto e Desenvolvedor](https://github.com/GilmarJuni0r)

## 📄 Licença

Este projeto é Open Source disponibilizado pelo grupo de alunos da FIAP e pode ser usado livremente, respeitando todas as leis do seu país. Quaisquer dúvidas entre em contato com os autores do projeto.

