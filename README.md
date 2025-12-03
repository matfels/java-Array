# Java Arrays e Coleções

Este repositório contém exemplos práticos sobre o uso da **Java Collections Framework**. O projeto foca na manipulação de diferentes estruturas de dados, ordenação de objetos personalizados e métodos específicos de listas e filas.

## 📋 Funcionalidades Demonstradas

O projeto explora as seguintes estruturas e conceitos:

* **ArrayList e Vector:** Criação de listas dinâmicas, iteração e manipulação de elementos.
* **LinkedList:** Utilização de listas encadeadas, incluindo operações de pilha (Stack) e fila (Queue) como `push`, `pop`, `addFirst` e `removeFirst`.
* **PriorityQueue:** Implementação de filas de prioridade onde os elementos são processados de acordo com a sua ordem natural ou um comparador.
* **Ordenação (Sorting):** Uso de `Collections.sort` e `Comparator` para ordenar listas de objetos personalizados.
* **Métodos Fundamentais:** Sobrescrita correta de `equals`, `hashCode` e `toString` em classes de modelo.

## 📂 Estrutura do Projeto

O código fonte está localizado na pasta `src/br/com/arraysListas`:

### 1. Classes de Modelo
* **`pessoa.java`**: Representa a entidade utilizada nos testes. Contém atributos `nome` e `email`, além da implementação de `hashCode` e `equals` para garantir comparações corretas entre objetos.

### 2. Classes de Teste e Lógica
* **`principal.java`**: Classe executável (Main) que orquestra a execução dos exemplos.
* **`listas.java`**: Demonstra a diferença entre `ArrayList` (não sincronizado) e `Vector` (sincronizado), e como ordenar uma lista de pessoas pelo nome.
* **`listasEncadeadas.java`**: Foca em performance para inserção/remoção nas pontas da lista, demonstrando métodos como `addFirst`, `removeFirst` e `peek`.
* **`filaPrioridade.java`**: Exemplo simples de uma fila onde a ordem de saída é determinada pela prioridade dos elementos.

## 🚀 Como Executar

### Pré-requisitos
* [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado.
* IDE recomendada: Eclipse (o projeto já contém os ficheiros de configuração `.project` e `.classpath`).

### Passo a Passo

1.  Importe o projeto na sua IDE.
2.  Localize a classe `principal.java` no pacote `br.com.arraysListas`.
3.  Execute como **Java Application**.

A saída no console demonstrará as operações de cada estrutura de dados (listagem de nomes, inserção em pilha, ordenação, etc.).

## 🤝 Contribuição

Este é um projeto educacional para fixação de conceitos de Collections em Java. Sinta-se à vontade para adicionar exemplos de `HashMap` ou `HashSet`.
