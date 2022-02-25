package aula;
public class aula04{
	public static void main (String[] args) {
		Caneta c1 = new Caneta();
		c1.status();	

		Caneta c2 = new Caneta();
		c2.setCor("Preta");
		c2.status();
		
		Caneta c3 = new Caneta("NIC", 0.7f, "Vermelha");
		c3.status();
	
	
	}
}