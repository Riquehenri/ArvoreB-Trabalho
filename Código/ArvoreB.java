public class ArvoreB {
    private NoB raiz;
    private int grau;
    public ArvoreB(int grau) {
        this.grau = grau;
        this.raiz = new NoB(grau, true);
    }
    public NoB buscar(int chave) {
        if (raiz == null) {
            return null;
        }
        return raiz.buscar(chave);
    }
    public void inserir(int chave) {
        if (raiz.n == 2 * grau - 1) {
            NoB novaRaiz = new NoB(grau, false);
            novaRaiz.filhos[0] = raiz;
            novaRaiz.dividirFilho(0, raiz);
            int j = 0;
            if (novaRaiz.chaves[0] < chave) {
                j = 1;
            }
            novaRaiz.filhos[j].inserirNaoCheio(chave);
            raiz = novaRaiz;
        } else {
            raiz.inserirNaoCheio(chave);
        }
    }
    public void remover(int chave) {
        if (raiz == null) {
            return;
        }
        raiz.remover(chave);
        if (raiz.n == 0) {
            if (raiz.folha) {
                raiz = null;
            } else {
                raiz = raiz.filhos[0];
            }
        }
    }
    public void imprimir() {
        if (raiz != null) {
            raiz.imprimir();
        }
        System.out.println();
    }
}
