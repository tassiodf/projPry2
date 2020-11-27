package br.com.udf;

public class Teste {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Cliente 1");
		cliente.setIdade(22);
		cliente.setSexo("Feminino");
		cliente.setValorDivida(1200.00);
		cliente.setAnoNascim(1990);
		
		System.out.println("Dados do Cliente: ");
		System.out.printf("Nome: %s,\nIdade: %d anos,\nSexo: %s,\nValor da dívida: R$%.2f,\nAno de nascimento: %d\n", 
				cliente.getNome(), cliente.getIdade(), cliente.getSexo(), cliente.getValorDivida(), cliente.getAnoNascim());
		System.out.println("=================================");
		
		Diretor diretor = new Diretor();
		diretor.setNome("Diretor 1");
		diretor.setIdade(52);
		diretor.setMatricula("102334");
		diretor.setNomeDiretoria("DRS");
		diretor.setSalario(1000);
		
		System.out.println("Dados do Diretor: ");
		System.out.printf("Nome: %s,\nIdade: %d anos,\nMatrícula: %s,\nNome da diretoria: %s,\nValor do INSS: R$%.2f\n", 
				diretor.getNome(), diretor.getIdade(), diretor.getMatricula(), diretor.getNomeDiretoria(), diretor.valorInss());
		System.out.println("=================================");
		
		Gerente gerente = new Gerente();
		gerente.setNome("Gerente 1");
		gerente.setSalario(4500.00);;
		gerente.setValorVendas(9800);
		gerente.setQntVendas(120);
		
		System.out.println("Dados do Gerente: ");
		System.out.printf("Nome: %s,\nSalário: R$%.2f,\nValor das vendas: R$%.2f,\nQuantidade de vendas: %d venda(s)\n", 
				gerente.getNome(), gerente.getSalario(), gerente.getValorVendas(), gerente.getQntVendas());
	}

}
