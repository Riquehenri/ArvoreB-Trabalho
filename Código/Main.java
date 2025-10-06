public class Main {
    public static void main(String[] args) {
        ArvoreB arvore = new ArvoreB(2);
        System.out.println("=== Inserções ===");
        int[] valores = {15, 3, 22, 8, 16, 5, 28, 12, 30};
        int i;
        for (i = 0; i < valores.length; i++) {
            int v = valores[i];
            arvore.inserir(v);
            System.out.println("Inserido: " + v);
            arvore.imprimir();
            System.out.println("-------");
        }
        System.out.println("=== Buscas ===");
        int[] buscas = {16, 99};
        for (i = 0; i < buscas.length; i++) {
            int b = buscas[i];
            NoB res = arvore.buscar(b);
            System.out.println("Busca(" + b + ") -> " + (res != null ? "Encontrado" : "Não encontrado"));
        }
        System.out.println("=== Remoções ===");
        int[] remocoes = {5, 28};
        for (i = 0; i < remocoes.length; i++) {
            int r = remocoes[i];
            System.out.println("Removendo: " + r);
            arvore.remover(r);
            arvore.imprimir();
            System.out.println("------");
        }
    }
}
