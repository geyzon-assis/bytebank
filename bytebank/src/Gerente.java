
public class Gerente extends Funcionario implements Bonus {
	private int senha;
	
	@Override
	public double getBonificacao() {
		// se a variavel salario da superclasse for definida com o modificador
		// protected, poderiamos acessar a variavel diretamente
		return super.getSalario() + super.getBonificacao();
	}

	public boolean autentica(int senha) {
		if(this.senha == senha)
			return true;
		else 
			return false;
	}
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
}
