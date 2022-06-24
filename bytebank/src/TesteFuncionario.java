
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setNome("Geyzon Assis");
		f1.setCpf("123456");
		f1.setSalario(2000);
		
		
		System.out.println(f1.getNome());
		System.out.printf("Bonificação de %s é %.2f %n",f1.getNome(),f1.getBonificacao());
		Gerente g1 = new Gerente();
		
		g1.setNome("Débora");
		g1.setSalario(5000.0);
		g1.setSenha(121212);
		
		
		System.out.printf("Bonificação de %s é %.2f %n",g1.getNome(),g1.getBonificacao());
		System.out.println(g1.autentica(121212));
	}

}
