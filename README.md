# Sudoku Game - Java

Este é um projeto de jogo de Sudoku completo, desenvolvido em Java,
que oferece suporte tanto para interface de linha de comando (CLI) quanto para interface gráfica (UI).
O projeto foi estruturado seguindo boas práticas de Engenharia de Software, como Separação de Responsabilidades e Clean Code.

## Tecnologias utilizadas
- `Java 21`: Uso de recursos modernos como Stream, Lambdas e Record-like structures
- `Java Swing`: Implementação de interface gráfica customizada.
- `Maven`: Gerenciamento de dependências e build do projeto.

## Estrutura do Projeto
O projeto está dividido em pacotes organizados por responsabilidade:

- `model`: Contém as entidades principais como Board (tabuleiro) e Space (célula).
- `service`: Camada de lógica de negócio, incluindo o BoardService para validação de regras.
- `ui.custom`: Componentes visuais personalizados (botões, painéis, inputs e frames).
- `util`: Classes utilitárias, como o BoardTemplate para renderização no console.

## Como eu enfrentei o desafio?
### 1. Precisão de Design (CLI)
Um dos maiores desafios foi garantir a simetria do tabuleiro no terminal. O problema de desalinhamento foi resolvido garantindo que cada célula tivesse um tamanho fixo, tratando valores vazios como espaços " " para manter a integridade visual da grade.

### 2. Interface Gráfica Avançada
A interface visual evoluiu de botões simples para um grid complexo organizado em sub-painéis de blocos $3 \times 3$.
- `Diferenciação Visual`: Os números fixos (iniciais) possuem uma cor distinta dos números inseridos pelo usuário, melhorando a jogabilidade.
- `Eventos e Diálogos`: Implementação de diálogos de confirmação para reiniciar ou finalizar o jogo, garantindo uma melhor experiência do usuário (UX).

## Como Executar
O jogo pode ser rodado de duas formas:
- `Console`: Rodando a classe Main.
- `Interface Gráfica`: Rodando a classe UIMain.

## O que aprendi no processo
- `Manipulação Precisa de Strings e Formatação`: Aprendi que o design em interfaces de texto (CLI) exige um controle rigoroso de caracteres. Resolvi o desafio do alinhamento garantindo que cada célula mantivesse um tamanho fixo, tratando espaços vazios como " " para evitar que a grade entortasse.
- `Arquitetura e Separação de Responsabilidades`: Estruturei o projeto dividindo a lógica de negócio (BoardService), o modelo de dados (Board, Space) e a visualização (UI), o que facilitou a transição do console para a interface gráfica.
- `Interface Gráfica com Java Swing`: Evoluí no uso de layouts complexos, utilizando o GridLayout de forma aninhada para criar a clássica divisão de blocos $3 \times 3$ do Sudoku, além de gerenciar eventos de botões e diálogos de feedback ao usuário.
- `Tratamento de Exceções e Ciclo de Vida`: Aprendi a diagnosticar erros como o NullPointerException em componentes de interface, compreendendo a importância da ordem de instanciação e renderização no Swing.
- `Lógica de Validação Reativa`: Implementei métodos para validar o progresso do jogador em tempo real, diferenciando valores fixos de valores inseridos e detectando erros de lógica em relação ao resultado esperado.

## Referência
Bootcamp CI&T: Back-end com Java & AWS