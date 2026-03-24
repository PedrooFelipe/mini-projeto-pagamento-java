import java.util.Scanner;
public class SistemaDePagamento {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double saldo, valorCompra;
		saldo = 120.32;
		valorCompra = 24.90;
		
		System.out.printf("Escolha uma forma de pagamento para sua compra de R$24,90. \nPIX (P) \nDINHEIRO(D) \nCARTÃO(C) \nSeu saldo atual é de R$" + saldo + ".\n");
		String resposta = entrada.next();
		
		switch (resposta) {
			case "P":{
				System.out.println("Obrigado por fazer o pagamento pelo pix, seu saldo agora é de R$" + (saldo - valorCompra));
				break;
			}
			case "D":{
				System.out.println("Obrigado por fazer o pagamento por dinheiro, seu saldo agora é de R$" + (saldo - valorCompra));
				break;
			}
			case "C":{
				System.out.println("Pagamentos pelo cartao tem taxa de 4%, deseja efetuar o pagamento?");
				break;
			}
		}
		String simNao = entrada.next();
		if (simNao.equals("Sim")) {
			double taxa = valorCompra + (valorCompra * 4/100);
			double saldoTaxado = saldo - (saldo * 4/100);
			System.out.printf("Perfeito, com o auento de 4%% o valor agora passa a ser R$%.2f, e seu saldo atual agora é de %.2f.\n", taxa, saldoTaxado);
		}else{
			System.out.println("Obrigado pela preferência!");
		}
		System.out.println("Volte sempre e muito brigado!");
		
	}

}
