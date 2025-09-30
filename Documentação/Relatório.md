# 📘 Relatório – Árvores Multiway

## 1. Introdução

As **árvores multiway** são estruturas de dados em que cada nó pode ter mais de dois filhos, permitindo armazenar múltiplas chaves em cada nó. Elas são especialmente úteis quando lidamos com grandes volumes de dados ou armazenamento em disco, pois minimizam o número de acessos de disco.

## 2. Descrição das Estruturas Multiway Pesquisadas

### Árvore B

- Estrutura de busca balanceada.
- Cada nó pode conter múltiplas chaves e múltiplos filhos.
- Todas as folhas ficam no mesmo nível (equilíbrio).
- Usada em bancos de dados e sistemas de arquivos.

### Árvore B+

- Variante da Árvore B.
- Apenas as folhas contêm os registros (dados).
- As folhas são ligadas entre si (ponteiros), facilitando varredura sequencial.

### Árvore B\*

- Variante da B+ com uso mais eficiente de espaço.
- Tentativa de manter nós mais cheios antes de fazer splits.

### Árvore 2-3

- Cada nó tem 2 ou 3 filhos.
- Estrutura balanceada simples.
- Serve como base conceitual para árvores mais complexas.

### Árvore 2-3-4

- Cada nó pode ter 2, 3 ou 4 filhos.
- Frequentemente usada como equivalência da Red-Black Tree.

### Trie

- Árvore digital para strings.
- Cada nível representa um caractere da string.
- Busca por prefixo eficiente.

### Patrícia (Trie compactada)

- Compacta caminhos únicos da Trie, reduzindo nós.
- Mais eficiente em memória para dicionários grandes.

### Árvore R

- Estrutura para dados espaciais (multidimensionais).
- Cada nó tem retângulos que delimitam regiões espaciais.

### Árvore R+

- Variante da R.
- Os objetos não ficam em nós internos, apenas nas folhas.
- Reduz sobreposições de regiões.

### Quad Tree

- Divide um espaço bidimensional em 4 quadrantes recursivamente.
- Usada para imagens, jogos, compressão espacial.

### Justificativa da escolha

Escolhemos implementar a **Árvore B** porque:

- Tem aplicação prática em **bancos de dados e sistemas de arquivos**.
- Permite mostrar bem os conceitos de inserção, remoção, split e merge.
- É suficientemente complexa para cobrir os requisitos da atividade.

---
