
public abstract class Conta implements IConta{
	protected static int SEQUENCIAL = 1;
	protected static final int AGENCIA = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cli;
	
	public Conta( Cliente cli)
	{
		this.agencia = Conta.AGENCIA;
		this.numero = SEQUENCIAL++;
		this.cli = cli;
	}
	
	public void sacar( double valor ) {
		if (valor <= this.saldo)
			saldo -= valor;
	}
	
	public void depositar( double valor ) {
		saldo += valor;
	}
	
	public void transferir( double valor, Conta conta) {
		if( valor <= saldo ) {
			this.sacar( valor );
			conta.depositar(valor);
		}			
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void imprimirExtrato(String Tipo) {
		// TODO Auto-generated method stub
		System.out.println("=== Extrato "+Tipo+" ===");
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	public abstract void imprimirExtrato();
}
