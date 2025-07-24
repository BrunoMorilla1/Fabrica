package br.com.morilla.factory;

import br.com.morilla.produto.Carro;
import br.com.morilla.produto.Motor;

public interface FabricaDeCarro {
    Carro criarCarro();
    Motor criarMotor();
}
