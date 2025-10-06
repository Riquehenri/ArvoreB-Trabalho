# 📘 Relatório – Árvores Multiway

## 1. Introdução

As **árvores multiway** são estruturas de dados em que cada nó pode possuir múltiplos filhos, permitindo armazenar diversas chaves em cada nó. Essa característica permite reduzir a altura da árvore e otimizar o número de acessos, o que é especialmente importante quando trabalhamos com grandes volumes de dados ou com armazenamento em disco. Por concentrar mais informações por nó, essas árvores minimizam o número de operações de I/O (entrada/saída), o que as torna frequentemente usadas em sistemas de banco de dados e sistemas de arquivos.

## 2. Descrição das Estruturas Multiway Pesquisadas

### Árvore B

- É uma árvore de busca balanceada, onde cada nó pode armazenar várias chaves.  
- Se um nó interno tem \(n\) chaves, ele terá \(n + 1\) filhos.  
- Todas as folhas estão no mesmo nível, garantindo o equilíbrio da estrutura.  
- Durante a inserção, se um nó exceder o número máximo de chaves permitidas, ocorre o **split**: a chave mediana “sobe” para o pai e o nó é dividido em dois filhos — um com as chaves menores e outro com as chaves maiores.  
- Na remoção, se um nó ficar abaixo do mínimo de chaves permitido (underflow), é necessário reestruturar a árvore por meio de empréstimos de chaves entre nós irmãos ou fusão (merge), ajustando também o nó pai quando necessário.  
- Amplamente usada em bancos de dados, sistemas de arquivos e contextos onde se precisa lidar com grandes volumes de dados e operações de disco eficientes.

### Árvore B+

- Variante da Árvore B projetada para otimizar pesquisas sequenciais.  
- Nos nós internos, armazena apenas chaves (sem dados completos); os dados ficam apenas nas folhas.  
- As folhas são ligadas entre si por ponteiros, formando uma lista encadeada, o que facilita operações de varredura (range queries).  
- Como os nós internos têm menos carga (sem dados completos), cabe mais chaves por nó, aumentando o fator de fan-out e diminuindo a altura da árvore.

### Árvore B\*

- Variante otimizada da B+, que procura manter os nós mais cheios antes de realizar splits.  
- Antes de dividir um nó que ficou cheio, tenta redistribuir chaves com os nós irmãos (spill). Se isso não for possível, então faz o split.  
- Essa estratégia reduz o número de divisões e melhora a utilização de espaço.

### Árvore 2-3

- Cada nó pode ter 2 ou 3 filhos (e 1 ou 2 chaves).  
- É uma árvore balanceada em que todos os caminhos raiz-folha têm igual comprimento.  
- Serve como conceito base para entender árvores mais complexas como a B.

### Árvore 2-3-4

- Cada nó pode ter 2, 3 ou 4 filhos (e até 3 chaves).  
- Frequentemente usada como modelo ou analogia para árvores Red-Black, pois há uma correspondência entre uma 2-3-4 tree e uma Red-Black Tree.  
- Permite reequilíbrios menos complexos em algumas implementações de árvores balanceadas.

### Trie (ou Árvore Digital)

- Estrutura usada para armazenar strings ou sequências de caracteres.  
- Cada nível da árvore corresponde a um caractere da string.  
- Permite buscas por prefixos de forma eficiente.  
- Muito usada em aplicações de autocomplete, dicionários de palavras, compressão de strings etc.

### Árvore Patrícia (Trie compactada)

- Variante da Trie onde caminhos únicos são “compactados” (automatizados) para reduzir nós intermediários.  
- Se um nó tem apenas um filho em um caminho, os nós intermediários são fundidos.  
- Torna a estrutura mais eficiente em termos de memória, mantendo desempenho de busca.

### Árvores R / R+

- Voltadas para dados espaciais (multidimensionais).  
- Cada nó armazena retângulos delimitadores (MBR – minimum bounding rectangles) que definem regiões espaciais contendo seus filhos ou objetos.  
- Permitem consultas espaciais, como “quais objetos estão dentro desta área?”.  
- A variante **R+** garante que os objetos só fiquem nas folhas, evitando sobreposição em nós internos, o que melhora o desempenho de consultas espaciais.

### Quad Tree (Quadtree)

- Estrutura espacial para representar subdivisões em um espaço bidimensional.  
- Cada nó divide recursivamente uma região em quatro quadrantes, até atingir um critério de subdivisão ou quantidade mínima de objetos.  
- Usada em jogos, compressão de imagens, mapeamento geográfico e outras aplicações onde dividir áreas domina o problema.

## 3. Justificativa da Escolha

Decidimos implementar a **Árvore B** porque ela reúne vários pontos fortes:

- Possui aplicação prática real em bancos de dados e sistemas de arquivos, mostrando relevância para problemas reais.  
- Permite ilustrar conceitos fundamentais como splits, merges, empréstimos e balanceamento.  
- É suficientemente desafiadora para cobrir os requisitos da atividade (exploração conceitual + implementação), mas ainda compreensível para explicar e demonstrar em vídeo.

---
