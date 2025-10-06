public class NoB {
    int[] chaves;
    NoB[] filhos;
    int n;
    boolean folha;
    int grau;
    public NoB(int grau, boolean folha) {
        this.grau = grau;
        this.folha = folha;
        this.n = 0;
        chaves = new int[2 * grau - 1];
        filhos = new NoB[2 * grau];
    }
    public NoB buscar(int chave) {
        int i = 0;
        while (i < n && chaves[i] < chave) {
            i++;
        }
        if (i < n && chaves[i] == chave) {
            return this;
        }
        if (folha) {
            return null;
        }
        return filhos[i].buscar(chave);
    }
    public void inserirNaoCheio(int chave) {
        int i = n - 1;
        if (folha) {
            while (i >= 0 && chaves[i] > chave) {
                chaves[i + 1] = chaves[i];
                i--;
            }
            chaves[i + 1] = chave;
            n = n + 1;
        } else {
            while (i >= 0 && chaves[i] > chave) {
                i--;
            }
            int j = i + 1;
            if (filhos[j].n == 2 * grau - 1) {
                dividirFilho(j, filhos[j]);
                if (chaves[j] < chave) {
                    j = j + 1;
                }
            }
            filhos[j].inserirNaoCheio(chave);
        }
    }
    public void dividirFilho(int i, NoB y) {
        NoB z = new NoB(y.grau, y.folha);
        z.n = grau - 1;
        int k;
        for (k = 0; k < grau - 1; k++) {
            z.chaves[k] = y.chaves[k + grau];
        }
        if (!y.folha) {
            for (k = 0; k < grau; k++) {
                z.filhos[k] = y.filhos[k + grau];
            }
        }
        y.n = grau - 1;
        int m;
        for (m = n; m >= i + 1; m--) {
            filhos[m + 1] = filhos[m];
        }
        filhos[i + 1] = z;
        for (m = n - 1; m >= i; m--) {
            chaves[m + 1] = chaves[m];
        }
        chaves[i] = y.chaves[grau - 1];
        n = n + 1;
    }
    public void imprimir() {
        int i;
        for (i = 0; i < n; i++) {
            if (!folha) {
                filhos[i].imprimir();
            }
            System.out.print(chaves[i] + " ");
        }
        if (!folha) {
            filhos[i].imprimir();
        }
    }
    public void remover(int chave) {
        int i = 0;
        while (i < n && chaves[i] < chave) {
            i++;
        }
        if (i < n && chaves[i] == chave) {
            if (folha) {
                int j;
                for (j = i + 1; j < n; j++) {
                    chaves[j - 1] = chaves[j];
                }
                n = n - 1;
            } else {
                int pred = filhos[i].obterMaximo();
                chaves[i] = pred;
                filhos[i].remover(pred);
            }
        } else {
            if (folha) {
                return;
            }
            filhos[i].remover(chave);
        }
    }
    public int obterMaximo() {
        if (folha) {
            return chaves[n - 1];
        }
        return filhos[n].obterMaximo();
    }
}
