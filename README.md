[![Build Status](https://travis-ci.org/thaynarasilvapinto/padroes-de-projeto-gof.svg?branch=master)](https://travis-ci.org/thaynarasilvapinto/padroes-de-projeto-gof)
[![codecov](https://codecov.io/gh/thaynarasilvapinto/padroes-de-projeto-gof/branch/master/graph/badge.svg)](https://codecov.io/gh/thaynarasilvapinto/padroes-de-projeto-gof)
# Padrões de Projeto GoF (Design Patterns)

### GoF - CRIAÇÃO (5)

- Aplicam-se em situações que envolvem a criação de objetos.
- Ajudam a fazer um sistema independente de como seus objetos são criados, compostos e representados (Erich Gamma, et al.).

#### 1 - SINGLETON 

- **Intenção**: garantir que uma determinada classe tenha uma, e somente uma instância, mantendo um ponto global de acesso para a mesma.

#### 2 - FACTORY METHOD

- **Intenção**: definir uma inerface para criar um objeto, mas deixar as subclasses decidirem que classes instaciar.
- Criar uma instância de várias classes derivadasg

#### 3 - ABSTRACT FACTORY

- **Intenção**: fornecer uma interface para criação de famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.
- Cria uma instância de várias famílias de classes.

#### 4 - BUILDER

- **Intenção**: separar a construção de um objeto complexo da sua representação de modo que o mesmo processo de construção possa criar diferentes representações.
- Separa a construção do objeto de sua representação.

#### 5 - PROTOTYPE

- **Intenção**: especificar os tipos de objetos a serem criados usando uma instância protótipo e criar novos objetos pela cópia deste protótipo.
- Uma instância inicializada a ser copiada ou clonada.

### GoF - PADRÕES ESTRUTURAIS (7)

- Eles se preocupam com a composição das classes e seus objetos. O conceito de herança é largamente utilizado para compor interfaces e definir maneiras para compor objetos e obter novas funcionalidades.

#### 6 BRIDGE

- **Intenção**: desacoplar uma abstração da sua implementação, de modo que as duas possam variar independentemente.
- Separa a interface do objeto de sua implementação.

#### 7 ADAPTER

- **Intenção**: converter a interface de uma classe em outra interface, esperada pelos clientes. O **Adapter** permite que classes com interfaces incompatíveis trabalhem em conjunto o que, de outra forma, seria impossível.
- Equiparar interfaces de diferentes classes.

#### 8 PROXY

- **Intenção**: fornece um substituto (surrogate) ou marcador da localização de outro objeto para controlar o acesso ao
mesmo.
- Um objeto representando um outro objeto.

#### 9 DECORATOR

- **Intenção**: agregar dinamicamente responsabilidades adicionais a um objeto.

#### 10 COMPOSITE

- **Intenção**: compor objetos em estruturas de árvore para representarem hierarquias todo-parte.
#### 11 FAÇADE (FACADE)

- **Intenção**: fornecer uma interface unificada para um conjunto de interfaces em um subsistema. Façade define uma interface de nível mais alto que torna o subsistema mais fácil de ser usado.
- Uma única classe representa um subsistema inteiro.

#### 12 FLYWEIGHT

- **Intenção**: usar compartilhamento para suportar eficientemente grandes quantidades de objetos de granularidade fina.

### GoF - PADRÕES COMPORTAMENTAL (11)

- Eles são especificamente relacionados com a
comunicação entre objetos.

#### 13 COMMAND

- **Intenção**: encapsular uma solicitação como um objeto, desta forma permitindo parametrizar clientes com diferente solicitações, enfileirar ou fazer o registro (log) de solicitações e suportar operações que podem ser desfeitas.
- Encapsular comandos como um objeto.

#### 14 STRATEGY

- **Intenção**: definir uma família de algoritmos, encapsular cada uma delas e torná-las intercambiáveis. Strategy permite que o algoritmo varie independentemente dos clientes que o utilizam.
- Encapsular algoritmos (“estratégias”) como um objeto.

#### 15 STATE

- **Intenção**: permite a um objeto alterar seu comportamento quando o seu estado interno muda. O objeto parecerá ter mudado sua classe.
- Alterar o comportamento de um objeto quando seu estado muda.

#### 16 OBSERVER

- **Intenção**: definir uma dependência um-para-muitos entre objetos, de maneira que quando um objeto muda de estado todos os seus dependentes são notificados e atualizados automaticamente.

#### 17 MEDIATOR

- **Intenção**: definir um objeto que encapsula a forma como um conjunto de objetos interage O Mediator promove o acoplamento fraco ao evitar que os objetos se refiram uns aos outros explicitamente e permite variar suas interações independentemente.
- Definir uma comunicação simplificada entre as classes.

#### 18 CHAIN OF RESPONSIBILITY

- **Intenção**: evitar o acoplamento do remetente de uma solicitação ao seu receptor, ao dar a mais de um objeto a oportunidade de tratar a solicitação. Encadear os objetos receptores, passando a solicitação ao longo da cadeia até que um objeto a trate.
- Uma maneira de passar uma requisição entre uma cadeia de objetos.

#### 19 TEMPLATE METHOD

- **Intenção**: definir o esqueleto de um algoritmo em uma operação, postergando (deferring) alguns passos para subclasses. Template Method (Gabarito de Método) permite que subclasses redefinam certos passos de um algoritmo sem mudar a estrutura do mesmo.

#### 20 INTERPRETER

- **Intenção**: dada uma linguagem, definir uma representação para a sua gramática juntamente com um interpretador que usa representação para interpretar sentenças da linguagem.
- Uma forma de incluir elementos da linguagem em um programa.
- Usa classes para representar cada regra de uma gramática (expressão regular).

#### 21 MEMENTO

- **Intenção**: sem violar o encapsulamento, capturar e externalizar um estado interno de um objeto, de maneira que o objeto possa ser restaurado para este estado mais tarde.

#### 22 ITERATOR

- **Intenção**: fornecer um meio de acessar, sequencialmente, os elementos de um objeto agregado sem expor a sua representação.

#### 23 VISITOR

- **Intenção**: representar uma operação a ser executada nos elementos de uma estrutura de objetos. Visitor permite definir uma nova operação sem mudar as classes dos elementos entre os quais opera.
- Define uma nova operação a uma classe sem alterá-la


*“A word of warning and encouragement: Don't worry if you
don’t understand this book completely on the first reading. We
didn’t understand it all on the first writing! Remember that this
isn't a book to read once and put on a shelf.”*