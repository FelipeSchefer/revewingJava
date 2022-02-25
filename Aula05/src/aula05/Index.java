package aula05;
public class Index {
	public static void main(String[] args) {
		Banco b1 = new Banco(1111, "Felipe");	
		b1.abrirConta("cc");
		b1.depositar(10.0f);
		b1.sacar(15.0f);
		b1.pagarMensal();
//		b1.sacar(33.0f);
		b1.fecharConta();
		
		b1.information();
		
		Banco b2 = new Banco(2222, "Schefer");
		b2.abrirConta("cp");
		b2.depositar(150);
		b2.sacar(25);
		b2.pagarMensal();
		
		b2.information();
	}

}
