package br.com.fescfafic.listaencapsulamento.Main;

import br.com.fescfafic.listaencapsulamento.Model.Carro;
import br.com.fescfafic.listaencapsulamento.Model.Moto;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.acelerar(20);
        carro.frear();
        carro.passarMarcha(3);
        carro.abrirPorta(3);
        carro.abrirPortaMata();
        System.out.println();


        Moto moto = new Moto();
        moto.acelerar(20);
        moto.frear();
        moto.passarMarcha(3);
        moto.empinarMoto();
        moto.cortarGiroDoMotor(4);
    }
}