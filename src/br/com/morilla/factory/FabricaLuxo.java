package br.com.morilla.factory;

import br.com.morilla.produto.Carro;
import br.com.morilla.produto.CarroLuxo;
import br.com.morilla.produto.Motor;
import br.com.morilla.produto.MotorLuxo;

public class FabricaLuxo implements FabricaDeCarro {
    @Override
    public Carro criarCarro() {
        return new CarroLuxo();
    }

    @Override
    public Motor criarMotor() {
        return new MotorLuxo();
    }
}
