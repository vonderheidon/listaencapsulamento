package br.com.fescfafic.listaencapsulamento.Model;

public class Moto extends Veiculo {
    protected int cilindradas;
    protected String tipoDeRoda;
    protected int qtdDeMarchas;
    protected String categoria;

    public Moto() {}

    public Moto(int anoDeFabricacao, String modelo, String marca, int cilindradas, String tipoDeRoda, int qtdDeMarchas, String categoria) {
        super(anoDeFabricacao, modelo, marca);
        this.cilindradas = cilindradas;
        this.tipoDeRoda = tipoDeRoda;
        this.qtdDeMarchas = qtdDeMarchas;
        this.categoria = categoria;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getTipoDeRoda() {
        return tipoDeRoda;
    }

    public void setTipoDeRoda(String tipoDeRoda) {
        this.tipoDeRoda = tipoDeRoda;
    }

    public int getQtdDeMarchas() {
        return qtdDeMarchas;
    }

    public void setQtdDeMarchas(int qtdDeMarchas) {
        this.qtdDeMarchas = qtdDeMarchas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void acelerar(int valor) {
        this.velocidadeAtual = valor * 1.2;
        System.out.printf("A moto acelerou esta andando a %.0f km/h\n", this.velocidadeAtual);
    }

    @Override
    public void frear() {
        this.velocidadeAtual = 0;
        System.out.printf("A moto freiou ate parar\n");
    }

    @Override
    public void passarMarcha(int valor) {
        if (valor <= this.qtdDeMarchas || this.qtdDeMarchas == 0) {
            System.out.printf("A moto engatou a %dª marcha\n", valor);
        } else {
            System.out.printf("Essa moto so tem %d marchas\n", this.qtdDeMarchas);
        }
    }
}
