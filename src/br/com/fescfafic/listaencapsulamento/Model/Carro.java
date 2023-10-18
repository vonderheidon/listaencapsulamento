package br.com.fescfafic.listaencapsulamento.Model;

public class Carro extends Veiculo {

    protected String tipoDeCombustivel;
    protected int qtdPortas;
    protected boolean possuiABS;
    protected boolean possuiVidrosEletricos;

    public Carro() {}
    public Carro(int anoDeFabricacao, String modelo, String marca, String tipoDeCombustivel, int qtdPortas,
                 boolean possuiABS, boolean possuiVidrosEletricos) {
        super(anoDeFabricacao, modelo, marca);
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.qtdPortas = qtdPortas;
        this.possuiABS = possuiABS;
        this.possuiVidrosEletricos = possuiVidrosEletricos;
    }
}
