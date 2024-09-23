package model;

public class Cliente {
    public String nome;
    public Integer QuantidadePecas;
    public Float ValorPecas;

    public Cliente(String nome, Integer qnt, Float valorp) {
        this.nome = nome;
        this.QuantidadePecas = qnt;
        this.ValorPecas = valorp;
    }
}
