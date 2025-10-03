# 📝 Exemplos Práticos – Árvore B

## Sequência de Inserções

A sequência de chaves a ser inserida é: **15, 3, 22, 8, 16, 5, 28, 12, 30**.

---

## Passo a Passo das Operações

### Inserções Iniciais

- Inserir **15, 3, 22** → O nó raiz se torna `[3, 15, 22]`.

### Ocorrência do Split

- Inserir **8**. Assumindo uma ordem que leva a um nó cheio (e.g., $2t-1=4$ chaves), o nó excede a capacidade máxima.
- Ocorre o **split**:
  - O elemento mediano (**15**) sobe para a **nova raiz**.
  - Formam-se dois nós filhos:
    - Filho Esquerdo: `[3, 8]`
    - Filho Direito: `[22]`

### Inserções Contínuas

- Continuar inserindo **16, 5, 28, 12, 30**.
  - **16** é inserido no nó filho à direita de 15.
  - **5** é inserido no nó esquerdo.
  - **28** e **30** são inseridos no nó direito.
  - **12** é inserido no nó apropriado.
- **Novos splits** ocorrerão à medida que os nós fiquem cheios.
- A árvore se reorganiza mantendo **todas as folhas no mesmo nível**.

---

## Busca

- `buscar(16)` → Retorna o nó que contém **16** (chave encontrada).
- `buscar(99)` → Retorna **null** (chave não existe).

---

## Remoções (Conceitual)

- `remover(5)` → **Remoção simples** em um nó folha.
- `remover(28)` → **Remoção simples** em um nó folha.
- Em cenários onde o nó atingiria o mínimo de chaves, operações de **merge** (fusão) ou **redistribuição** (empréstimo) de chaves entre nós irmãos seriam executadas.

---

## Observações de Balanceamento

- **Balanceamento Constante:** Depois de cada inserção e remoção, a Árvore B **mantém seu equilíbrio**.
- **Mecanismos Essenciais:** Os **splits** e **merges** são cruciais para garantir que **todas as folhas estejam no mesmo nível**, o que é vital para a eficiência de acesso em estruturas de disco.
- Mesmo com remoções, a estrutura se reorganiza para preservar as propriedades de **busca balanceada**.
