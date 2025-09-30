# 📝 Exemplos Práticos – Árvore B

## Sequência de Inserções

Inserir na ordem: **10, 20, 5, 6, 12, 30, 7, 17**

### Passo a Passo

1. Inserir 10, 20, 5 → nó com [5, 10, 20]
2. Inserir 6 → nó excede capacidade → ocorre **split**
   - Elemento mediano sobe para a raiz.
   - Forma dois nós filhos.
3. Continuar inserindo 12, 30, 7, 17
   - Novos splits conforme nós fiquem cheios
   - Mantém todas as folhas no mesmo nível

---

## Busca

- `buscar(12)` → retorna nó que contém 12 (existe)
- `buscar(99)` → retorna `null` (não existe)

---

## Remoções

- `remover(6)` → remoção simples em folha
- `remover(17)` → remoção simples em folha
- Em casos mais complexos, poderia ocorrer **merge** ou redistribuição de chaves entre nós irmãos

---

## Observações de Balanceamento

- Depois de cada inserção e remoção, a Árvore B mantém seu equilíbrio.
- Os splits e merges são mecanismos essenciais para manter a propriedade de que todas as folhas estejam no mesmo nível.
- Mesmo com remoções, a estrutura se reorganiza para preservar as propriedades de busca balanceada.
