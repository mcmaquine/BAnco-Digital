/**
 * 
 * @author maquine
 *	Deixar o projeto mais robusto
 */

package com.banco;

public class Banco {
	//unique instance Singleton pattern
	private static Banco instancia;
	
	private Banco()
	{
		super();
	}
	
	public static Banco getInstancia()
	{
		if( instancia == null ){
			instancia = new Banco();
		}
		else {
			System.out.println("Instance already exists!");
		}
		
		return instancia;
	}
}
