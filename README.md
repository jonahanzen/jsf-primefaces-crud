## JSF PrimeFaces- Crud

Este projeto tem como objetivo demonstrar um crud extremamente simples, e o menos poluído possível (que estava ao meu alcance) para servir como uma referencia do mínimo necessário para utilizar o JSF com o PrimeFaces e suas funcionalidades.
Do mais, é um contato inicial com ambos os frameworks interagindo, e entendo que há muito o que melhorar :P .

###  Ferramentas utilizadas

Java SE 11, JakartaEE 8, PostgreSQL, Maven, WildFly, Hibernate, JSF 2.1.7, PrimeFaces 11.0.0

O projeto está dividido em camadas de forma que:

- **model** contém os modelos do que é utilizado no projeto
    - **entity** corresponde a entidade mapeada com o banco de dados
    - **repository** corresponde ao CRUD sem lógica, apenas fazendo as operações no banco de dados
    - **service** serve como a lógica antes de própriamente chamar repository
- **controller**  são  os métodos que podem ser chamados de forma remota/dinâmica e direcionar para páginas e etc.

O fluxo acontece de forma que o controller apenas delegue as chamadas/métodos, chamando o repository que  executa os métodos no banco de dados, neste caso.

***CONSIDERAÇÕES ADICIONAIS***

- O JSF deve ser referenciado em web.xml
- Através do uso de anotações, não se faz necessário a configuração pelo faces-config.xml (notar ausência do arquivo)
- A conexão foi configurada no próprio Wildfly, então persistence.xml conta apenas com uma configuração mínima 




Links adicionais:

https://www.tutorialspoint.com/jsf/

https://rieckpil.de/howto-simple-crud-table-with-jsf-2-3-and-primefaces/

https://www.primefaces.org/

https://www.primefaces.org/showcase/