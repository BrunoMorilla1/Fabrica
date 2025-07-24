package br.com.morilla;

import br.com.morilla.factory.FabricaDeCarro;
import br.com.morilla.factory.FabricaLuxo;
import br.com.morilla.factory.FabricaPopular;
import br.com.morilla.produto.Carro;
import br.com.morilla.produto.Motor;

public class Fabrica {
    public static void main(String[] args) {

        FabricaDeCarro fabricaPopular = new FabricaPopular();
        Carro carroPopular = fabricaPopular.criarCarro();
        Motor motorPopular = fabricaPopular.criarMotor();
        carroPopular.exibirInfo();
        motorPopular.exibirInfo();

        System.out.println("-----------------------------");


        FabricaDeCarro fabricaLuxo = new FabricaLuxo();
        Carro carroLuxo = fabricaLuxo.criarCarro();
        Motor motorLuxo = fabricaLuxo.criarMotor();
        carroLuxo.exibirInfo();
        motorLuxo.exibirInfo();
    }
}
