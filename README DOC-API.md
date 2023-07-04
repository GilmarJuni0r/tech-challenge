##  APIs desenvolvidas:

### API Endereço

A API Endereço foi desenvolvida para simplificar a administração das informações de endereços fornecidas pelos usuários. Para garantir a precisão dos registros, é imprescindível que sejam informados os seguintes dados obrigatórios: nome da rua, número, bairro, cidade e estado. Com a utilização da API Endereço, torna-se mais simples e eficiente gerenciar e manter atualizadas as informações essenciais para uma identificação e localização precisa dos endereços.

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



---------
### API Eletrodoméstico

A API Eletrodoméstico foi desenvolvida para permitir o registro das informações dos eletrodomésticos utilizados pelos usuários cadastrados. É necessário fornecer obrigatoriamente os seguintes dados: nome, tipo, modelo, potência e voltagem. O campo cor é opcional e pode ser preenchido caso seja relevante. Com o uso desta API, é possível simplificar o gerenciamento e manutenção dos dados dos eletrodomésticos, assegurando uma identificação correta e apropriada utilização desses aparelhos.

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
### API Pessoa

A API Pessoa foi desenvolvida para possibilitar o registro e gerenciamento das informações dos usuários cadastrados. Além do cadastro principal, os usuários têm a opção de incluir outras pessoas relacionadas a eles, informando o grau de parentesco. É relevante destacar que o cadastro de pessoas relacionadas, ou seja, parentes do usuário, não é obrigatório.
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

