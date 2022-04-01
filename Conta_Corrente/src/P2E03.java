
public class P2E03 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CRIANDO AS NOVAS CONTAS CORRENTES
		
		ContaCorrente C1 = new ContaCorrente();  // OBJETO DE CLASSE CONTA CORRENTE SEM ATRIBUTOS PARA TESTE ABAIXO, UMA VEZ QUE TEMOS UM CONSTRUTOR VAZIO
		
		
		ContaCorrente C2 = new ContaCorrente(002, 2500.00);// OBJETO COM ATRIBUTOS
		
		
		//SETANDO OS VALORES DO OBJETO C1 CRAIDO SEM ATRIBUTOS
		C1.setNumCC(001);
		C1.setSaldoCC(5000.00);
		
		
		//EXINDOS OS ATRIBUTOS DOS OJETOS DA CLASSE CONTA CORRENTE
		
		System.out.println("Conta Corrente 1 - NumCC: " + C1.getNumCC() + " Saldo C/C: " + C1.getSaldoCC());
		
		System.out.println("Conta Corrente 2 - NumCC: " + C2.getNumCC() + " Saldo C/C: " + C2.getSaldoCC());
		
		
		
		//MOVIMENTAÇÕES EM CONTAS UTILIZANDO METODOS
		C1.setDepositar(500.00);
		C1.setSacar(400.00);
		
		C2.setDepositar(100.00);
		C2.setSacar(200.00);
		
		
		
		//EXIBINDO ATRIBUTOS APÓS MOVIMENTAÇÕES
		System.out.println("                                  ");
		System.out.println("        MODIFICAÇÕES REALIZADA    ");
		System.out.println("                                  ");
		
		System.out.println("Conta Corrente 1 - NumCC: " + C1.getNumCC() + " Saldo C/C: " + C1.getSaldoCC());
		
		System.out.println("Conta Corrente 2 - NumCC: " + C2.getNumCC() + " Saldo C/C: " + C2.getSaldoCC());
		
		
	}

	
			
	
	
}
