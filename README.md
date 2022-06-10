# RPE-2022
#### Este repositório contém todos os conteúdos e trabalhos passados na disciplina de Resolução de Problemas Estruturados, desenvolvidos durante o primeiro semestre de 2022:

- Trabalho Prático 1 - Labirinto (usando pilha)
- Trabalho Prático 2 - Labirinto (usando fila)
- Trabalho Prático 3 - Implementação Lista Duplamente Encadeada

Todos os trabalhos foram desenvolvidos na linguagem de programação Java.

## Trabalho Prático 1 - Labirinto (usando pilha)
Utilizando pilha, você deve implementar um código que, dado um labirinto qualquer com entrada e saída, seja capaz de encontrar a saída para o labirinto.

* A pilha funcionará como a “memória” de onde passamos;
* A cada casa, navegaremos entre 4 direções, em ordem;
* Iniciamos pela casa da entrada, marcando-a como visitada. O computador testa as posições direita, esquerda, cima e baixo. Verificando disponibilidade para andar, o computador deve empilhar caso o movimento seja valido.
* Caso chegue em um caminho sem saída, o computador desempilha, até achar um caminho não visitado, e continua até achar a saída.




## Trabalho Prático 2 - Labirinto (usando fila)
Este trabalho tem como objetivo construir um labirinto usando os conceitos passados de fila.

Nesse trabalho você deve utilizar fila para o armazenamento das posições.
* Imprima o labirinto no console juntamente à um menu com as opções: direita, esquerda, cima, baixo, começar, reiniciar.
* O usuário deve informar qual das opções será executada.Caso o usuário informe uma das posições, você deve armazenar a nova posição na fila (enfileirar).
* Caso o usuário escolha a opção reiniciar, esvazie a fila, fazendo com que todos os movimentos escolhidos sejam apagados.
* Continue imprimindo o labirinto e o menu para que ele possa recomeçar.
* Quando o usuário escolher a opção começar, você deve desenfileirar cada uma das posições fornecidas e atualizar essas posições na impressão do labirinto no terminal.
* Faça esse processo até que a fila esteja vazia, ou seja, todos os comandos fornecidos tenham sido atualizados na impressão do labirinto.
* Caso o usuário tenha fornecido um caminho que possua um dos movimentos inválido, imprima um feedback do tipo “Movimento inválido” no comando em questão. Finalize o programa ou reimprima o labirinto e o menu para que ele recomece.




## Trabalho Prático 3 - Implementação Lista Duplamente Encadeada
Esse trabalho consiste em fazer a implementação de uma lista duplamente encadeada com Generics.

A implementação deve conter os seguintes métodos:

![image](https://user-images.githubusercontent.com/80781838/173162216-82e9cb7a-9538-4fa4-8b3b-44cb8e3e7003.png)
