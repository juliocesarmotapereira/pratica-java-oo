
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta1 = new Conta(1337, 2626);
		
		// conta está inconsistente:
		// conta.setAgencia(-50);
		/// conta.setNumero(-330);
		
		System.out.println(conta1.getAgencia());
		
		conta1.setAgencia(1338);	
		
		Conta conta2 = new Conta(1337, 6363);
		Conta conta3 = new Conta(1337, 7979);
		
		System.out.println(Conta.getTotal());
	}
}
