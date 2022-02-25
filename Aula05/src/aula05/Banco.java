package aula05;

public class Banco{
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public Banco(int nc, String dn) {
		this.setNumConta(nc);
		this.setDono(dn);
	}
	
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if (tipo == "cc") {
			this.setSaldo(50);
			System.out.println("Conta corrente comeca com: " + this.getSaldo() + " R$");
		}
		else if(tipo == "cp") {
			this.setSaldo(150);
			System.out.println("Conta poupanca comeca com: " + this.getSaldo() + " R$");
		}
	}
	
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro para encerra-la precisa sacar: " + this.getSaldo());
		}
		else if(this.getSaldo() < 0) {
			System.out.println("Conta em debito para encerra-la precisa pagar: " + this.getSaldo());
		}
		else {
			System.out.println("Conta fechada com sucesso");
			this.setStatus(false);
		}
		
	}
	
	public void depositar(float deposito) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + deposito);
			System.out.println("deposito de: " + deposito + " para " + this.getDono());
		}
		else {
			System.out.println("Impossivel depositar");
		}
	}
	
	public void sacar(float sacar) {
		if(this.getStatus()) {
			if(this.getSaldo() >= sacar) {
				this.setSaldo(this.getSaldo() - sacar);
				System.out.println("saque de: " + sacar);				
			}
			else {
				System.out.println("Saldo insuficiente " + this.getDono());
			}
		}
		else {
			System.out.println("Imposivel sacar");
		}
	}
	
	public void pagarMensal() {
		int v;
		if(this.getStatus()) {
			if(this.getTipo() == "cc") {
				v = 12;
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Mensalidade de: " + v);
			}
			else if(this.getTipo() == "cp") {
				v = 20;
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Mensalidade de:" + v);
			}
			else {
				System.out.println("Saldo insuficiente");
			}
		}
		else {
			System.out.println("Impossivel pagar");
		}
		
	}
	
	public void information() {
		System.out.println("---------------------------------------------------------");
		System.out.println("Conta: " + this.getNumConta() + " tipo: " + this.getTipo());
		System.out.println("Dono: "  + this.getDono() + " Saldo: " + this.getSaldo()  );
		if(this.getStatus()) {
			System.out.println("Estado da conta: ativa");			
		}
		else {
			System.out.println("Estado da conta: desativada");
		}
		System.out.println("---------------------------------------------------------");
		System.out.println("# -FIM- #");
		System.out.println("");
	}

	// GETS & SETS
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}