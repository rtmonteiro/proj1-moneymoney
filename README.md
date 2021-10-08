# Money Money


## Descrição

O Money Money é uma aplicação Web desenvolvida como parte da avaliação da disciplina de Projeto Integrado I na Universidade Federal do Espírito Santo

## Tecnologias

### Backend e Banco de Dados

Para o Backend utilizamos o [Maven](https://maven.apache.org/) para auxiliar no gerenciamento de pacotes e para a execução e compilação do projeto Java, utilizamos também o [Spring Boot](https://spring.io/projects/spring-boot) como frameork Java, pois ele já possui pacotes auxiliares para lidar com Banco de Dados, Autenticação e Servidor HTTP. E para o Banco de Dados resolvemos utilizar o [MongoDB](https://www.mongodb.com/pt-br), pela sua estrutura simples através do NoSQL, e hospedamos uma instância simples do banco no próprio serviço em nuvem do [MongoDB Atlas](https://www.mongodb.com/cloud/atlas).

### Frontend

Para o Frontend resolvermos utilizar o [Angular](https://angular.io/) como framework JavaScript, pois possui módulos muito completos para lidar com chamadas HTTP, animações, e por sua forma parecida com Java com tipagem através do TypeScript e a utilização do padrão estrutural com Decorators, e utilizamos também o pacote de componentes [Angular Material](https://material.angular.io/) e para apresentar os dados através de gráficos, o pacote [Chart.js](https://www.chartjs.org/).

## Como rodar

**Backend**

1.  

**Frontend**

1. Para rodar o frontend será preciso instalar o [Node.js](https://nodejs.org/en/) a partir da versão 12
1. Uma instrução muito importante é alterar para a pasta do frontend
    ```
    cd frontend
    ```
1. Agora basta instalar os pacotes encontrados no packadge.json da pasta
    ```
    npm i
    ```
1. Com todos os pacotes instalados, podemos inicializar a nossa aplicação Angular
    ```
    npm start
    ```
1. E Voilà, sua aplicação estará sendo servida pelo Node na porta 4200, e basta acessá-las através do endereço `https://localhost:4200`
