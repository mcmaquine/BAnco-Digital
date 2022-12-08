import com.banco.Banco;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Banco");
		
		Banco bc = Banco.getInstancia();
		
		System.out.println(bc);
	}	

}
