## Livro Engenharia de Software Moderna
## Aula 31/07/2025

- Abstração

Uma das principais funcões dos projetos de software é resolver problemas através da abstraçãodas entidades para dentro do sistema. A abstração nada mais é do que uma representação do mundo real em forma de código buscando solucionar problemas.

- Complexidade

A complexidade é um grande problema para o desenvolvimento, a cada etapa o sistema se torna mais complexo, mais fácil de dar erro e apresentar inconsistêcias. Isso se torna obvio quando entendemos que ele é uma representação do mundo que em sua essência é complexo e sempre tem problemas muito dificeis de serem solucionados. Ou seja, a complexidade é espelhada nos sistemas da mesma forma que se apresenta no mundo real.

- Orientação a objetos

É um conjunto de boas práticas para desenvolver de forma correta, organizada e limpa.

- Padrão de código

O intuito de utilizar padrões é facilitar o seu entendimento e o de quem for alterar e corrigir ele futuramente. 

- Frameworks

Aprender um Framework se faz muito importante, uma vez que aprendeu a lógica de um consegue entender os outros pois todos eles tem lógicas extremamente similares. Ademais essa escolha de Framework é o fator vital para o sistema ser um sucesso ou não.

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
Sempre que houver uma associação entre classes terá uma variável.

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

Significa dizer que na maioria dos casos vamos usar a associação no lugar da herança, pois a associação constroi o encapsulamento de classes e também é mais abrangente um exemplo disso: um funcionário se torna cliente e vice versa. Enquanto isso a herança viola o encapsulamento da classe pai e é excludente gerando problemas. A grande maioria dos casos vamos usar associação ao invés de herança, existem raros casos que ela realmente se faz útil.

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

Esse princípio diz que tendo uma superclasse (classe pai) e tenho subclasses (classes filhas) que herdam desse pai, é preciso que todas as classes filhas tenham os mesmos métodos para que seja possível fazer trocas entre elas sem quebrar o código.


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


## Aula 04/09/2025

- Diferença entre Arquitetura e Design

A arquitetura de um software é toda a parte estrutural do projeto cuidando das características da arquitetura (Requisitos não funcionais), do estilo (micro-serviços ou crud) e da estrutura de componentes podendo organizar o sistema em pequenas partes reutilizaveis e independentes. Já o design cuida da parte de diagrama de classes, interface do usuário e do código fonte do projeto. Isso é uma divisão teórica, pois no mundo real o arquiteto não assume apenas a parte de arquitetura deixando a parte de design para a equipe de desenvolvimento e criando barreiras. O arquiteto e a equipe de desenvolvimento precisam ter uma relação próxima para que as decisões sobre a arquitetura sejam seguidas sem alterações e o design se encaixe no planejamento do projeto. Assim o arquiteto se torna um líder bem visto e respeitado, trazendo mentoria para equipe de desenvolvimento.

- Como é a formação do conhecimento de um arquiteto modelo T

Um arquiteto com formação de conhecimento modelo T conhece muitas tecnologias, de forma superficial para auxilia-lo na tomada de decisão sabendo qual ou quais tipos de tecnologias podem funcionar melhor para o projeto que está trabalhando, pois para ele é mais importante saber que existem 5 soluções do que ser especialista em apenas uma sem ter o conhecimento da existência das demais. Apesar disso ele carrega com sigo um conhecimento mais aprofundado em suas áreas de especialização o que se mostra muito útil em alguns projetos.


## Aula 08/09/2025 e 11/09/2025

- Trade offs ou Compensações

Os trade offs são algumas trocas que fazemos no sistema para ele entregar as características que precisa ter e solucionar um possível problema no futuro, mas essas trocas geram prejuízos em outras partes do sistema um exemplo muito utilizado é a escolha de ter mais segurança no software o que afeta diretamente a agilidade desse software.

- Opções para um sistema de comunicação (mensagens)

    - Tópico 
    utiliza o sistema de observer no qual tem um publiser que se comunica através do tópico (que se chama Broker) com os subscribers enviando cópias da mesma mensagem desejada para cada um de forma automática, pois o publiser empurra a mensagem para o subscriber, utilizando algum sistema na núvem, se utilizar banco de dados o publisher da um insert e o subscriber faz um select. Alguns exemplos Apache Kafka, Rabbitmq, AWS SNS, Azure ServiceBus, Redis.

    - Fila 
    Na Fila continua com um observer mas nesse caso o publisher se comunica através de filas que armazenam as mensagens na ordem que foram enviadas e o subscriber precisa pedir essa informação para recebe-la. O publisher precisa enviar as mensagens de forma separada para cada um dos subscribers.

- Vantagens e Desvantagens de cada opção

    - Tópico
        - Vantagens 
        No Tópico tem uma menor complexidade para adicionar um novo subscriber e além disso só é preciso mandar um mensagem e todos receberam cópias identicas da mensagem desejada. O tópico também tem uma grande robustez, escalabilidade e segurança em núvem.
        
        - Desvantagens
        Nesse modelo tem um acoplamento maior, a mensagem precisa ser maior e mais bem escrita e não é possível mandar mensagens diferentes para cada um dos subscribers. Tópico tem uma desvantagem em servidores locais, pois não tem a escalabilidade disponível na núvem. 

    - Fila
        - Vantagens 
        Na Fila tem vantagens como por exemplo o armazenamento das mensagens nas filas, um baixo acoplamento e a possibilidade do publisher mandar mensagens diferentes para cada um dos subscribers. Além disso, tem robustez, segurança, escalabilidade e controle individualizado de cada uma das filas sabendo quantas mensagens tem e se há a necessidade aumentar o poder de processamento da fila.
        
        - Desvantagens
        tem uma maior complexidade para adicionar um novo subscriber e o publisher precisa mandar uma mensagem para cada uma das filas e deixar a mensagem disponível para o subscriber. Mas a vantagens como por exemplo o armazenamento das mensagens nas filas, um baixo acoplamento e a possibilidade do publisher mandar mensagens diferentes para cada um dos subscribers.

Uma forma para resolver alguns problemas exclusivos do uso da Fila e do Tópico, é utilizar os dois juntos, isso ira reduzir o acoplamento, terá capacidade de guardar o conteúdo das mensagens na ordem que foram enviadas, mas por outro lado deixará o projeto mais caro. Esse modelo se chama Fan-out buffer 


## Aula 06/10/2025

- Definições da Arquitetura

    Os requisitos não funcionais tem vários nomes utilizados nas organizações, mas o que melhor se encaixa é características da arquitetura. Uma característica da arquitetura atende a três critérios:

    - Especifica uma consideração de design fora do domínio
    - Influencia um aspecto estrutural do design 
    - É Essencial ou importante para o sucesso da aplicação

    Esses critérios se subdividem em outras características sendo elas operacionais, estruturais e transversáis.

    - As características operacionais são todas aquelas que envolvem desempenho, escalabilidade, elasticidade, disponibilidedade e confiabilidade. Essas características tem uma parte significativa com as preocupações de operações de DevOps, sendo interligada com muitas outras partes do projeto.

    - As características estruturais são referente a estrutura do código, na qual o arquiteto tem uma responsabilidade única ou compartilhada com as questões de qualidade do código tendo em foco a boa modularidade, acoplamento controlado, código levível entre outros tópicos de avaliações internas da qualidade.

    - As características transversáis são aquelas que não foram categorizadas mas formam partes importantes das restrições de design. Alguns exemplos dessas características são usabilidade, compatibilidade, autenticação, privacidade, suporte e segurança que representam bem essa categoria.

## Aula 09/10/2025

- Trade-offs e Arquitetura menos pior

Nesse tópico o autor comenta que não existe a melhor arquitetura, mas sim a que resolve o problema desejado. Quando montamos uma arquitetura genérica para tentar solucionar todos os problemas geralmente falhamos, pois cada escolha que fazemos gera algum tipo de compensação ou também conhecido com trade-off. Por exemplo cada vez que quisermos obter mais segurança, conseguentemente perderemos desempenho em algum nível. 

- Circuit breaker Pattern ( Padrão do Disjuntor )

    Esse padrão ajuda o sistema a se recuperar com mais eficáfia, pois ele bloqueia temporariamente o acesso a um serviço com defeito evitando tentativas repetidas sem sucesso. O disjuntor atua como um proxy e você pode implementar ele como uma máquina dividida em três estados: 
        
    - Fechado: No estado fechado a solicitação é roteada para a aplicação. O proxy mantém uma contagem de falhas recentes, caso ocorra uma falha ele inicía a contagem. Se o proxy passar do limite de falhas em determinado período ele altera o estado para aberto e inicía a contagem do tempo para a correção da falha, quando o tempo acaba ele altera o estado para meio aberto.

    - Aberto: No estado aberto a solicitação falha imediatamente e retorna falha ao aplicativo.

    - Meio Aberto: No estado meio aberto tem um limite de solicitações que podem ser feitas a aplicação, se forem bem sucedidas o proxy vai para o estado fechado. Caso o número de solicitações passar do limite ele retorna para o estado aberto e reinicía o temporizador para o sistema recuperar as falhas
    
## Aula 13/10/2025

- Padrão CQRS (Command Query Responsability Segregation)

    Esse padrão busca reduzir um problema de deadlock muito comum nos bancos de dados relacionais, escalando horizontalmente os bancos. Assim, dividem a carga e as responsabilidades de cada um deles, utilizando um para escrever os dados e o outro para ler. 
    Os benefícios de utilizar esse padrão é:
    
    - Escalar de forma independente: Cada um dos bancos de gravação e leitura de acordo com a carga que estão recebendo;
    - Otimizar os dados: Utilizando um esquema otimizado para consulta na operação de leitura e outra esquema para otimizar a atualização na operação de gravação;
    - Segurança: Separando gravação e leitura temos uma segurança maior, pois garante que as entidades ou operações necessárias tenham permissões de gravação;
    - Separação de preocupações: Ao separar as responsabilidades de leitura e gravação os modelos ficam mais limpos e fáceis de manter. Pois o modelo de leitura se preocupa apenas com a eficiência das consultas e o de gravação lida com a parte complexa da lógica do negócio;
    - Consultas mais simples: Por conta de se usar um banco de dados apenas para leitura a aplicação pode evitar junções complexas no momento que realiza consultas.

    As considerações a serem feitas são: 

    - O conceito do CQRS em si é simples, mas a utilização desse padrão pode trazer maior complexidade no design da aplicação. Além disso, o envio de mensagens não é requisito, porém é frequêntemente usado para processar comandos e publicar eventos, nesse momento em que o envio da mensagem for incluido a aplicação deve levar em conta possíveis erros como falha de mensagens, duplicatas e novas tentativas. Por último é preciso estar ciente de que pode ocorrer um atraso nas cópias mais recentes do banco de leitura principalmente se a internet estiver lenta.

- Padrões de Arquitetura

    - Grande Bola de Lama: Nesse padrão temos um sistema que cresceu de forma rápida e desordenada gerando um código mal estruturado e confuso. Geralmente nesse tipo de padrão o código tem módulos totalmente dependente uns dos outros, em forma de espaguete, dificultando o entendimento, correção e implementação de melhorias. Um forte indício de que está lidando com um código desse tipo é o grande medo de mexer nele ou se tem apenas um especialista que faz as alterações necessárias.

    - Arquitetura Unitária: Os primeiros sistemas eram baseados na arquitetura desktop + servidor de banco de dados, deixando a parte de apresentação e também uma cópia inteira do sistema no desktop, a lógica mais complexa e volumétrica ficava no servidor de banco de dados, sendo necessário ter um servidor para o banco robusto para suportar a carga (Store Procidure). Essa arquitetura dominou o mundo da programação nos anos 90 e tá hoje ainda temos sistemas que rodam com essa arquitetura. Posteriormente, com a invenção da internet houve uma mudança nessa arquitetura transferindo a parte de apresentação para o navegador e a lógica complexa e volumétrica, trafego de dados e telas para o servidor web, na primeira versão. Hoje em dia essa arquitetura mudou, deixando a abertura e fechamente de tela, validação de campos no desktop. O servidor web e o servidor de banco de dados continuam com a maior parte da lógica, mas agora trafega apenas dados na rede.

## Aula 16/10/2025

- Padrão de Três Camadas
     
    O padrão de três camadas ficou muito popular na década de 1990 devido ao crescente número de linguagens que começaram a ser amplamente utilizadas. Para duas linguagens diferentes conversarem é preciso um intermediador, por isso foi criado o CORBA que é um Broker para que o Java e o C++ pudessem se comunicar e dessa forma facilitou a criação dos sistemas distribuidos. Mas com essa arquitetura foi implementada a serialização, pelos arquitetos da época, no Java. Todo Object no Java implementa uma interface que suporta essa serialização, só que hoje em dia não é mais usado e não se sabe ao certo as implicações a longo prazo que essa arquitetura pode causar. Atualmente a Netflix utiliza a arquitetura RMI que é baseado no CORBA, para fazer a comunicação dos micro serviços. já o modelo DCOM que foi criado pela Microsoft ficou apenas no ambiente de programação da Microsoft, não se tornando popular e amplamente usado como o CORBA.

- Arquitetura Monolítica vs Distribuida

    Um monolito é um sistema que foi criado e escrito em um mesmo repositório. Por característica os monolitos tem um alto acomplamento e quando é compilado vira um único arquivo JAR que contem todo o programa. Esse é o jeito mais fácil de aprender a programar e continua sendo muito utilizados em ERPs no mundo todo.

    Já a arquitetura distribuida é composta por vários micro serviços conectados por protocolos de acesso remoto. Esse tipo de arquitetura é mais poderosa do que os monolitos no quesito desempenho, escalabilidade e disponibilidade, mas tem seus trade-offs como por exemplo a complexidade de fazer manutenções e alterações, variação de latência e enfraquecimento da segurança. A arquitetura distribuida tem um grupo de problemas descrito nas falácias, são afirmações julgadas verdadeiras porém são falsas, a seguir:

        - Rede ser confiável
        - Latência ser zero
        - Largura de banda ser infinita
        - Rede ser segura
        - Topologia da internet nunca mudar
        - Existência de apenas um administrador
        - Custo do transporte ser zero
        - Rede ser homogênea



- Padrão Retry (Tentar novamente)

    Esse é um padrão de arquitetura que permite a aplicação lidar com falhas transitórias ao tentar se conectar em um serviço ou recurso de rede, repetindo de forma transparente a operação com falha. A estratégia de repetição é estruturada da seguinte forma: Cancelada - Se a falha não for transitória ou provavelmente não será bem sucedida se repetida, a operação é cancelada. Tentar novamente - Caso seja uma falha específica ou incomum como o corrompimento de um pacote de rede durante, a aplicação faz uma nova tentativa imediatamente. Tentar novamente com atraso - E por último, caso tenha uma falha mais comum como problema de conectividade ou ocupação, a aplicação tenta novamente com um atraso para verificar se o erro persiste.

## Aulas 20/10/2025 e 23/10/2025

- Estilos de arquitetura em camadas

    A arquitetura em camadas, também conhecida por n-tier(multicamadas) é dos estilos mais comuns e utilizados pela maioria das aplicações por conta de sua simplicidade, familiaridade e baixo custo. Esse tipo de arquitetura também é um modo muito natural de se desenvolver aplicações devido a Lei de Conway, que determina que as organizações que projetam sistemas estão limitadas produzir cópias das estruturas de comunicação de suas próprias organizações. 

    - Topologia

    Existe alguns tipos de topologia de arquitetura em camadas e eles são organizadas em camadas horizontais lógicas, não há restrições especificas em termos de quantidade e tipos de camadas, porém a maioria das arquiteturas consiste em quatro camadas sendo ela: apresentação, comercial, persistência e banco de dados. Em alguns casos de aplicações menores a camada comercial e de persistência são combinadas formando a camada de negócio, já as maiores e mais complexas aplicações podem conter 5 ou mais camadas.

    A arquitetura em camadas pode ser dividida em três variações físicas a primeira combina as camadas de apresentação, comercial e de persistência e separa o banco de dados físico externo. Na segunda separa a camada de apresentação e de banco de dados, combina a camada comercial e de persistência. A terceira combina todas as camadas em um único bloco de implementação.

    Esse estilo de arquitetura reparte a aplicação em camadas e estabelece uma função e responsabilidade única para uma delas. Assim deixando a aplicação mais eficiênte e com o modelo de responsabilidade muito bem definido.
    
     