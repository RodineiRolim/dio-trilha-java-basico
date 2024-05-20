import java.util.ArrayList;

public class TadVetor {
    private final int tamanho;
    private final int maximo;
    private final int minimo;
    private final int vaga;
    private final boolean repete;
    private int[] dados;

    public TadVetor (int tamanho, int maximo, int minimo, int vaga, boolean repete) {
        this.tamanho = tamanho;
        this.maximo = maximo;
        this.minimo = minimo;
        this.vaga = vaga;
        this.repete = repete;
        this.dados = new int[this.tamanho];
        if (this.vaga != 0) {
            for (int i = 0; i < dados.length; i++) {
                this.dados[i] = this.vaga;
            }
        }
    }

    public int atribuir(int valor, int posicao) {
        if(!verificarValor(valor)) {
            return 1;
        }

        if (!verificarPosicao(posicao)) {
            return 2;
        }

        if (this.dados[posicao] != this.vaga) {
            return 3;
        }

        if (!this.repete) {
            for (int i = 0; i < this.dados.length; i++) {
                if (valor == this.dados[i]) {
                    return 4;
                }
            }
        }

        this.dados[posicao] = valor;
        return 0;
    }

    public int alterar(int valor, int posicao) {
        if(!verificarValor(valor)) {
            return 1;
        }

        if (!verificarPosicao(posicao)) {
            return 2;
        }

        if (!this.repete) {
            for (int i = 0; i < this.dados.length; i++) {
                if (valor == this.dados[i]) {
                    return 4;
                }
            }
        }

        this.dados[posicao] = valor;
        return 0;
    }

    public int remover(int posicao) {
        if (!verificarPosicao(posicao)) {
            return 2;
        }

        if (this.dados[posicao] == this.vaga) {
            return 5;
        }

        this.dados[posicao] = this.vaga;
        return 0;
    }

    public int lerValor(int posicao) {
        if (!verificarPosicao(posicao)) {
            return 2;
        }

        if (this.dados[posicao] == this.vaga) {
            return 5;
        }

        return this.dados[posicao];
    }

    public int localizarValor(int valor) {
        ArrayList<Integer> posicoesLocalizados = new ArrayList<>();

        if(!verificarValor(valor)) {
            return 1;
        }

        for (int i = 0; i < this.dados.length; i++) {
            if (this.dados[i] == valor) {
                posicoesLocalizados.add(i);
            }
        }

        if (posicoesLocalizados.isEmpty()) {
            return 6;
        }

        for (Integer integer : posicoesLocalizados) {
            System.out.println(integer);
        }

        return 0;
    }

    public int inserirNaPrimeria(int valor) {
        if(!verificarValor(valor)) {
            return 1;
        }

        for (int i = 0; i < this.dados.length; i++) {
            if(valor == this.vaga) {
                this.atribuir(valor, i);
                return 0;
            }
        }

        return 3;
    }

    public int removerDaUltima() {
        for (int i = this.dados.length; i >= this.dados.length; i--) {
            if(this.dados[i] != this.vaga) {
                this.remover(i);
                return 0;
            }
        }

        return 5;
    }

    public int limparVetor() {
        for (int i = 0; i < this.dados.length; i++) {
            this.atribuir(this.vaga, i);
        }

        return 7;
    }

    private boolean verificarValor(int valor) {
        return valor <= this.maximo && valor >= this.minimo;
    }

    private boolean verificarPosicao(int posicao) {
        return posicao > 0 && posicao <= this.dados.length;
    }

}