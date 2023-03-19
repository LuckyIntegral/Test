# About spring web application #

### About properties file ###

| Syntax                                     | Description                  |
|--------------------------------------------|------------------------------|
| spring.datasource.url                      | Конект до бази               |
| spring.datasource.username                 | Імя юзера                    |
| spring.datasource.password                 | Пароль юзера                 |
| spring.datasource.driver-class-name        | Драйвер субд                 |
| spring.jpa.hibernate.ddl-auto              | Як працювати з субд          |
| spring.jpa.show-sql                        | Показувати генерацію запитів | 
| spring.jpa.properties.hibernate.dialect    | Залежність версії субд       |
| spring.jpa.defer-datasource-initialization | Ініціалізація                |
| spring.sql.init.platform                   | Прискорення ініціалізації    |
| spring.sql.init.mode                       | Так чи ні ініціалізації      |
| spring.sql.init.data-locations             | classpath:sql/data.sql       |
| spring.sql.init.schema-location            | classpath:sql/schema.sql     |


### About REST ###

| HTTP Header | SQL query | Status | 
|-------------|-----------|--------|
| GET         | SELECT    | 200    |
| POST        | INSERT    | 201    |
| PUT         | UPDATE    | 200    |
| DELETE      | DELETE    | 200    |

### About E-commerce ###

1. PLP (Product listing page)
2. PDP (Product details page)
3. Cart
4. Checkout (order process)
5. My account (My payments, my orders, my addresses)

