package com.letscode;

public class No {

    private String valor;
    private No ramoDireito;
    private No ramoEsquerdo;

    public No(String valor) {
        this.valor = valor;
        ramoDireito = null;
        ramoEsquerdo = null;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public No getRamoDireito() {
        return ramoDireito;
    }

    public void setRamoDireito(No ramoDireito) {
        this.ramoDireito = ramoDireito;
    }

    public No getRamoEsquerdo() {
        return ramoEsquerdo;
    }

    public void setRamoEsquerdo(No ramoEsquerdo) {
        this.ramoEsquerdo = ramoEsquerdo;
    }
}
