package com.letscode;

public class Arvore {
    private No raiz;

    public Arvore() {
        raiz = null;
    }

    public void inserir(String valor) {
        if (estaVazia()) {
           raiz = new No(valor);
        } else {
            inserir(raiz, valor);
        }
    }

    private void inserir(No noAtual, String valor) {
        if (noAtual != null) {
            if (valor.compareTo(noAtual.getValor()) <= 0) {
                if (noAtual.getRamoEsquerdo() != null) {
                    inserir(noAtual.getRamoEsquerdo(), valor);
                } else {
                    noAtual.setRamoEsquerdo(new No(valor));
                }
            } else {
                if (noAtual.getRamoDireito() != null) {
                    inserir(noAtual.getRamoDireito(), valor);
                } else {
                    noAtual.setRamoDireito(new No(valor));
                }
            }
        }
    }

    public int altura() {
        if (estaVazia()) {
            return 0;
        }

        return altura(raiz);
    }

    private int altura(No noAtual) {
        if (noAtual == null) {
            return -1;
        }

        int alturaEsquerda = altura(noAtual.getRamoEsquerdo());
        int alturaDireita = altura(noAtual.getRamoDireito());

        return Math.max(alturaEsquerda, alturaDireita) + 1;
    }

    public int getQtdNos() {
        return getQtdNos(raiz);
    }

    private int getQtdNos(No noAtual) {
        if (noAtual == null) {
            return 0;
        }

        int qtdNosEsquerda = getQtdNos(noAtual.getRamoEsquerdo());
        int qtdNosDireita = getQtdNos(noAtual.getRamoDireito());

        return qtdNosEsquerda + qtdNosDireita + 1;
    }

    public boolean estaVazia() {
        return raiz == null;
    }


    public void imprimirPreOrdem() {
        imprimirPreOrdem(raiz);
    }

    private void imprimirPreOrdem(No noAtual) {
        if (noAtual == null) {
            return;
        }
        System.out.println(noAtual.getValor());

        imprimirPreOrdem(noAtual.getRamoEsquerdo());
        imprimirPreOrdem(noAtual.getRamoDireito());
    }

    public void imprimirEmOrdem() {
        imprimirEmOrdem(raiz);
    }

    private void imprimirEmOrdem(No noAtual) {
        if (noAtual == null) {
            return;
        }

        imprimirEmOrdem(noAtual.getRamoEsquerdo());
        System.out.println(noAtual.getValor());
        imprimirEmOrdem(noAtual.getRamoDireito());
    }

    public void imprimirPosOrdem() {
        imprimirPosOrdem(raiz);
    }

    private void imprimirPosOrdem(No noAtual) {
        if (noAtual == null) {
            return;
        }

        imprimirPosOrdem(noAtual.getRamoEsquerdo());
        imprimirPosOrdem(noAtual.getRamoDireito());
        System.out.println(noAtual.getValor());
    }

    public boolean contemValor(String valor) {
        return contemValor(raiz, valor);
    }

    private boolean contemValor(No noAtual, String valor) {
        if (noAtual == null) {
            return false;
        }

        if (valor.compareTo(noAtual.getValor()) == 0) {
            return true;
        }

        return contemValor(noAtual.getRamoEsquerdo(), valor) || contemValor(noAtual.getRamoDireito(), valor);
    }

}
