package aula;
public class Caneta {
	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	public Caneta() {
		this.setModelo("BIC");
		this.setPonta(0.5f);
		this.setCor("Azul");
		this.tampar();
	}
	public Caneta(String m, float p, String c ) {
		this.setModelo(m);
		this.setPonta(p);
		this.setCor(c);
		this.tampar();
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String c) {
		this.cor = c;
	}
	
	public void status() {
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: "+ this.getCor());
		System.out.println("--------------------");
	}
	
}
