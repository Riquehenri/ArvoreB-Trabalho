# 🌳 Implementação de Árvore B

## 📌 Sobre o Projeto

Este repositório contém a pesquisa, implementação e documentação do trabalho acadêmico sobre **Árvores Multiway**, com foco na **Árvore B**.  
A atividade foi desenvolvida em grupo para a disciplina de Resolução de Problemas Estruturados em Computação.

---

## 👥 Integrantes

- [Felipe Carneiro](https://github.com/FelipeCarneiroRibeiro)
- [Henrique Ricardo](https://github.com/Riquehenri)

---

## 📚 Estrutura do Repositório

```yaml
/ArvoreB-Trabalho
│
├── /src
│ ├── NoB.java # Estrutura do nó da Árvore B
│ ├── ArvoreB.java # Implementação da Árvore B
│ └── Main.java # Exemplo de uso da Árvore B
│
├── /docs
│ ├── Relatorio.md # Pesquisa sobre Árvores Multiway
│ └── ExemplosArvoreB.md # Passo a passo de operações na Árvore B
│
├── README.md # Este arquivo
```

---

## ⚙️ Implementação

A **Árvore B** foi implementada do zero em Java, sem estruturas de dados prontas.  
As principais operações implementadas foram:

- 🔍 **Busca** - ➕ **Inserção** (com split de nós)
- ➖ **Remoção** (com merge e rebalanceamento simplificado)

---

## 📊 Exemplos de Execução

### Inserindo as chaves:

15, 3, 22, 8, 16, 5, 28, 12, 30
A árvore cresce de forma balanceada.

> Quando um nó fica cheio, ocorre **split**.

### Busca:

```scss
Busca(16) -> Encontrado
Busca(99) -> Não encontrado
```

### Remoção:

```scss
Removendo 5
Removendo 28
```

## 🎥 Vídeo Explicativo

O vídeo com a explicação da pesquisa, código e exemplos práticos está disponível em:
👉 [Link para o YouTube](Link para o YouTube)

---

## 📑 Documentação Extra

- 📄 [Relatório – Pesquisa sobre Árvores Multiway](Documentação/Relatório.md)
- 📝 [Exemplos práticos da Árvore B](Documentação/ExemploArvoreB.md)
