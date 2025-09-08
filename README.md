## Livro Engenharia de Software Moderna
## Aula 31/07/2025

- Abstração

Uma das principais funcões dos projetos de software é resolver problemas através da abstraçãodas entidades para dentro do sistema. A abstração nada mais é do que uma representação do mundo real em forma de código buscando solucionar problemas.

- Complexidade

A complexidade é um grande problema para o desenvolvimento, a cada etapa o sistema se torna mais complexo, mais fácil de dar erro e apresentar inconsistêcias. Isso se torna obvio quando entendemos que ele é uma representação do mundo que em sua essência é complexo e sempre tem problemas muito dificeis de serem solucionados. Ou seja, a complexidade é espelhada nos sistemas da mesma forma que se apresenta no mundo real

- Orientação a objetos

É um conjunto de boas práticas para desenvolver de forma correta, organizada e limpa.

- Padrão de código

O intuito de utilizar padrões é facilitar o seu entendimento e o de quem for alterar e corrigir ele futuramente. 

- Frameworks

Aprender um Framework se faz muito importante, uma vez que aprendeu a lógica de um consegue entender os outros pois todos eles tem lógicas extremamente similares. Ademais essa escolha de Framework é o fator vital para o sistema ser um sucesso ou não

- Ocultação de informação

Se trata de um ocultamento de complexidade. Para isso ser possível utilizamos as classes, para ocultar as regras de negócio e lógicas, criando uma interface de fácil interação com o ser humano. Desenvolver utilizando essa ocutação de forma correta traz vantagens como por exemplo:
- Desenvolvimento em paralelo
- Flexibilidade a mudanças
- Facilidade no entendimento

## Aula 04/08/2025

- Coesão

Coesão é quando um código faz apenas uma coisa bem feita e isso o torna eficiente para desenvolver , corrigir e testar sem que seja necessário uma longa análise de sua funções e lógicas.

- Acoplamento

A ideia principal do acoplamento é fazer com que as classes não conversem diretamente para que a aplicação continue rodando sem haver problemas
Sempre que houver uma associação entre classes terá uma variável

## Aula 07/08/2025

- Princípio da Responsabilidade única

Esse princípio visa manter cada classe tem apenas uma responsabilidade como diz o próprio nome do tópico. Isso ajuda a identificar o que cada classe está fazendo com mais facilidade, sem misturar responsabilidade, por exemplo classes de entidades tem apenas entidades e assim por diante. 

Seta Herança: Linha cheia com a seta vazada
Seta Implementação (Interface): Linha tracejada com a seta vazada
Seta Associação: Linha cheia com a seta cheia

- Princípio da Segregação de Interfaces

O princío tem como ideia principal separar as interfaces de forma que cada uma tenha apenas uma responsabilidade trazendo coesão para o código.


## Aula dia 12/08/2025

- Princípio de Inversão de Dependências

A lógica por trás desse princípio é tornar possível o fácil desacoplamento do código, tendo como base a ideia de que as classes não dependem umas das outras diretamente mas sim de uma interface.

- Preferir Associação à Herança

Significa dizer que na maioria dos casos vamos usar a associação no lugar da herança, pois a associação constroi o encapsulamento de classes e também é mais abrangente um exemplo disso: um funcionário se torna cliente e vice versa. Enquanto isso a herança viola o encapsulamento da classe pai e é excludente gerando problemas. A grande maioria dos casos vamos usar associação ao invés de herança, existem raros casos que ela realmente se faz útil

- Princípio de Demeter

Também conhecido como princípio do menor conhecimento tem como ideia central que a implementação dentro de um método pode invocar
- apenas métodos da própria classe
- objetos passados por parâmetros do método
- objetos criados pelo próprio método
- atributo da classe do método

- Princípio Aberto/Fechado

Significa dizer que nosso código precisa ficar protegido e fechado para modificações, porém aberto para extenções possibilitando criações utilizando o código que fizemos como base.

## Aula dia 14/08/2025

- Princípio de Liskov 

Esse princípio diz que tendo uma superclasse (classe pai) e tenho subclasses (classes filhas) que herdam desse pai, preciso que todas as classes filhas tenham os mesmos métodos para que seja possível fazer trocas entre elas sem quebrar o código.


- Tudo que é estático é carregado primeiro na memória

## Aula 28/08/2025

Estruturas da Arquitetura

- Caracteristicas da Arquitetura

De maneira resumida são os requisitos não funcionais que o sistema precisa ter, se não tiver esses requisitos talvez não tenha funcionalidade real. Hoje em dia abrimos mão de algumas funcionalidades em troca de conseguir ter mais segurança, pois é humanamente impossível um sistema ter todas as caracteristicas da arquitetura.

- Decisões da Arquitetura

Este é o momento que tomamos a decisão de qual modelo de arquitetura e tecnologia iremos usar no projeto.

- Princípios do Design

Os princíios são boas práticas para que o sistema tenha as caracteristicas desejadas e precisam ser mantidas para dar continuidade a estrutura sólida da arquitetura.

Temos duas formas de comunicação dos microserviços

- Forma Sincrona: Essa forma pode ser utilizada em pequenos sistemas sem gerar grandes problemas.

- Forma Assincrona: É a melhor forma dos micro serviços conversarem sem acoplamento, utilizando o design do observer para se comunicarem

## Aula 01/09/2025

- Expectativas de um arquiteto

As empresas geralmente tem certas expectativas nos arquitetos de fora ou de dentro da empresa para organizar a arquitetura e tomar boas decisões acreditando que ela não irá precisar de revisão futuramente, o que é um erro, pois todo bom projeto necessita de revisão e mudanças após um certo período. Também há uma expectativa do arquiteto sempre se manter atualizado sobre as tendências de mercado enchergar oportunidades de agregar valor. Além de assegurar o andamento certo do projeto de acordo com as decisões, ter uma experiência diversificada (conhecer várias tecnologias e quando aplica-las), dominar o conhecimento sobre o negócio e ter habilidades interpessoais sabendo lidar com questões politicas dentro e fora da empresa

- Decisões de arquitetura

O arquiteto precisa orientar a equipe e ajudar a tomar as decisões de quais tecnologias seram utilizadas no projeto ou na empresa como um todo baseado em sua experiência, escutando ativamente as sugestões da equipe de desenvolvimento e se forem pertinentes acatar a sugestão, tornando a decisão mais acertiva.

- Analisar continuamente a arquitetura 

Se trata de um dos trabalhos do arquiteto fazer análises e pequenas atualizações no sistema para não precisar mudar muitas coisas ao mesmo tempo, tornando o trabalho mais organizado sem sobrecarregar as equipes.

- Manter-se atualizado

Precisa conhecer as tendências tendo uma noção geral de mercado trazendo melhorias e novas tecnologias para mudanças imediatas ou futuras.

- Assegurar a conformidade com as decisões

É a parte do trabalho que o arquiteto verifica se o projeto está sendo desenvolvido conforme as decisões de arquitetura e princípios design que optou.

- Domínio do negócio 

Além de ser um profissional técnico o arquiteto precisa ser conhecer muito bem o negócio e fazer uma ponte entre o que o cliente quer e precisa, a equipe que trabalha e seus superiores. Assim podendo trazer soluções mais acertivas.

- DevOps

Existem dois tipos de DevOps, a cultura e o cargo

O propósito DevOps é entregar valor ao cliente por meio de um ciclo infinito no qual o projeto é planejado, codificado, integrado de forma continua, testado, implantado, operado que nada mais é do que o suporte e por fim receber o feedback utilizando essas informações para nortear os próximos passos.

Cultura DevOps 

Ter uma cultura DevOps na empresa significa dizer que todos da equipe sabem todas as partes do processo e o que acontece em cada uma delas dando a todos na empresa um sentimento de responsabilidade maior sobre os projetos em que estão atuando.

Cargo DevOps

O cargo DevOps se trata de uma equipe especialista nesse processo e ajuda todo o resto da equipe de desenvolvimento a agregar valor e satisfazer os clientes entregando exatemente o que ele quer e se possível até um pouco a mais.
