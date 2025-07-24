package br.com.morilla.factory;

import br.com.morilla.produto.Carro;
import br.com.morilla.produto.CarroPopular;
import br.com.morilla.produto.Motor;
import br.com.morilla.produto.MotorPopular;

public class FabricaPopular implements FabricaDeCarro {
    @Override
    public Carro criarCarro() {
        return new CarroPopular();
    }

    @Override
    public Motor criarMotor() {
        return new MotorPopular();
    }
}
