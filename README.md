// Livro Engenharia de Software Moderna
// Aula 31/07/2025

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

// Aula 04/08/2025

- Coesão

Coesão é quando um código faz apenas uma coisa bem feita e isso o torna eficiente para desenvolver , corrigir e testar sem que seja necessário uma longa análise de sua funções e lógicas.

- Acoplamento

A ideia principal do acoplamento é fazer com que as classes não conversem diretamente para que a aplicação continue rodando sem haver problemas
Sempre que houver uma associação entre classes terá uma variável

// Aula 07/08/2025

- Princípio da Responsabilidade única

Esse princípio visa manter cada classe tem apenas uma responsabilidade como diz o próprio nome do tópico. Isso ajuda a identificar o que cada classe está fazendo com mais facilidade, sem misturar responsabilidade, por exemplo classes de entidades tem apenas entidades e assim por diante. 

Seta Herança: Linha cheia com a seta vazada
Seta Implementação (Interface): Linha tracejada com a seta vazada
Seta Associação: Linha cheia com a seta cheia

- Princípio da Segregação de Interfaces

O princío tem como ideia principal separar as interfaces de forma que cada uma tenha apenas uma responsabilidade trazendo coesão para o código.


// Aula dia 12/08/2025

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