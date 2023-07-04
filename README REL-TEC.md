# Tech Challenge

Na fase inicial do Tech Challenge, dedicamos nosso esforço ao desenvolvimento das primeiras APIs (Application Programming Interfaces) para o nosso sistema. Durante esse processo, nosso principal foco foi garantir a integridade dos dados. Criamos três APIs distintas: Pessoa, Endereço e Eletrodomésticos. Cada uma dessas APIs foi projetada para receber um conjunto específico de dados e tem como objetivo gerenciar e manipular as informações recebidas de forma eficiente. Nosso objetivo era garantir que os dados fornecidos às APIs fossem tratados corretamente, permitindo uma interação confiável e segura com o nosso sistema.



## Tecnologias utilizadas

As API's foram construídas utilizando as seguintes tecnologias / ferramentas:

- Java 17 utilizando Spring Framework 3.1.0
- Padrão REST para a construção de rotas e retornos
- SLF4J para registrar logs
- Utilização de código limpo e princípios SOLID
- Clean architecture
- Postman para testar as APIs



## Desafios

Durante a execução deste projeto, adotamos o padrão Rest para expor os recursos da aplicação, utilizando os verbos HTTP apropriados. Garantimos a estrutura adequada das URLs e o retorno das respostas no formato JSON, visando uma maior compatibilidade e integração com outros sistemas e facilitando a manipulação dos recursos por parte dos clientes.

Seguindo o princípio de separação de responsabilidades, implementamos uma divisão em camadas, como Controller, UserCase e Gateway, com o intuito de facilitar a manutenção e escalabilidade do sistema. Adotamos Clean Architecture como base para o projeto, buscando refletir as melhores práticas utilizadas atualmente no mercado de desenvolvimento de software, indo além do foco acadêmico abordado nas aulas.

Incluímos logs nas classes utilizando a biblioteca de logging SLF4J. A utilização de logs nos permite registrar informações relevantes em diferentes níveis, proporcionando uma melhor visibilidade do comportamento do fluxo do sistema durante a execução e facilitando a identificação e resolução de problemas.

Implementamos um interceptador de exceções visando aumentar a confiabilidade do sistema. Essa funcionalidade permite a captura e o tratamento adequado de exceções que ocorrem durante a execução, fornecendo respostas apropriadas aos clientes e registrando informações relevantes para análises posteriores.

Nosso principal desafio foi criar uma arquitetura que refletisse as melhores práticas utilizadas atualmente no mercado de desenvolvimento de software, indo além do foco acadêmico abordado nas aulas. O objetivo era desenvolver uma estrutura sólida que garantisse a integridade dos dados e facilitasse a manipulação eficiente das informações.

Nesse contexto, desenvolvemos as primeiras APIs do nosso sistema, as quais são responsáveis pela gestão de dados relacionados a Pessoa, Endereço e Eletrodoméstico. Cada uma dessas APIs recebe um conjunto específico de dados e tem o objetivo de gerenciar as informações de forma eficiente.

Em suma, adotamos uma abordagem técnica rigorosa no desenvolvimento deste projeto, implementando as melhores práticas de arquitetura, tratamento de exceções e registro de logs. Acreditamos que essas medidas contribuirão para a robustez e confiabilidade do sistema, proporcionando uma experiência satisfatória aos usuários.
