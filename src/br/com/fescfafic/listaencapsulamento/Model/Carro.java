package br.com.fescfafic.listaencapsulamento.Model;

import br.com.fescfafic.listaencapsulamento.Contratos.ICarroComportamento;

public class Carro extends Veiculo implements ICarroComportamento {

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

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public boolean isPossuiABS() {
        return possuiABS;
    }

    public void setPossuiABS(boolean possuiABS) {
        this.possuiABS = possuiABS;
    }

    public boolean isPossuiVidrosEletricos() {
        return possuiVidrosEletricos;
    }

    public void setPossuiVidrosEletricos(boolean possuiVidrosEletricos) {
        this.possuiVidrosEletricos = possuiVidrosEletricos;
    }

    @Override
    public void acelerar(int valor) {
        this.velocidadeAtual += valor;
        System.out.printf("O carro acelerou esta andando a %.0f km/h\n", this.velocidadeAtual);
    }

    @Override
    public void frear() {
        this.velocidadeAtual -= 2;
        System.out.printf("O carro freiou esta andando a %.0f km/h\n", this.velocidadeAtual);
    }

    @Override
    public void passarMarcha(int valor) {
        System.out.printf("O carro engatou a %dª marcha\n", valor);
    }

    @Override
    public void abrirPorta(int posicaoPorta) {
        if (this.qtdPortas == 0) {
            System.out.println("Esse carro nao tem portas");
        } else if (posicaoPorta <= this.qtdPortas) {
            switch (posicaoPorta) {
                case 1:
                    System.out.println("A porta do motorista foi aberta");
                case 2:
                    System.out.println("A porta do passageiro foi aberta");
                case 3:
                    System.out.println("A porta traseira atras do motorista foi aberta");
                case 4:
                    System.out.println("A porta traseira atras do passageiro foi aberta");
                default:
                    System.out.printf("A %dª porta foi aberta !?");
            }
        } else {
            System.out.printf("Esse carro so tem %d portas", this.qtdPortas);
        }
    }

    @Override
    public void abrirPortaMata() {
        System.out.println("O carro abriu o porta malas");
    }
}
