package com.letscode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Arvore arvore = new Arvore();
        arvore.inserir("0010");
        arvore.inserir("0013");
        arvore.inserir("0007");
        arvore.inserir("0016");
        arvore.inserir("0012");


        System.out.println("\n\nValor existe " + arvore.contemValor("0007"));
        System.out.println("Valor existe " + arvore.contemValor("10"));

        System.out.print("Árvore vazia " + arvore.estaVazia());

        System.out.printf("\nQtd nós %d", arvore.getQtdNos());
        System.out.printf("\nAltura %d", arvore.altura());

        System.out.println("\n\nPré Ordem");
        arvore.imprimirPreOrdem();

        System.out.println("\n\nEm Ordem");
        arvore.imprimirEmOrdem();

        System.out.println("\n\nPós Ordem");
        arvore.imprimirPosOrdem();

    }
}
