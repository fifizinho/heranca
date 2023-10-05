package Heranca;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa ("joao","(11) 9999-9999");
		System.out.println("Pessoa:");
		System.out.println("Nome: "+pessoa.getNome());
		System.out.println("Telefone: "+pessoa.getTelefone());
		
		PessoasFisica pessoaFisica = new PessoasFisica ("joao", "(11) 9999-9999", "584758758","458234758");
		System.out.println("Pessoa Fisica:");
		System.out.println("Nome:"+pessoaFisica.getNome());
		System.out.println("Telefone:"+pessoaFisica.getTelefone());
		System.out.println("CPF:"+pessoaFisica.getCpf());
		System.out.println("RG:"+pessoaFisica.getRg());
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica ("joao", "(11) 9999-9999", "52345464567");
		System.out.println("Pessoa Juridica:");
		System.out.println("Nome:"+pessoaJuridica.getNome());
		System.out.println("Telefone:"+pessoaJuridica.getTelefone());
		System.out.println("CNPJ:"+pessoaJuridica.getCnpj());
	}

}
