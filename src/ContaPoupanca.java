
public class ContaPoupanca extends Conta {
public static final String TIPO = "Conta Poupanca";
	
	public ContaPoupanca ( Cliente cli) {
		super( cli );
	}
	
	@Override
	public void imprimirExtrato() {
		super.imprimirExtrato(TIPO);
	}
}
