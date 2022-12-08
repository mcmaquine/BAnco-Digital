package com.banco;

public class ContaCorrente extends Conta {
	public static final String TIPO = "Conta Corrente";
	
	public ContaCorrente( Cliente cli) {
		super(cli);
	}
	
	@Override
	public void imprimirExtrato() {
		super.imprimirExtrato(TIPO);
	}

}
