package aula;

public class Lutador {
	//---------------------------------------------------------------------------------------- ATRIBUTOS
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	//---------------------------------------------------------------------------------------- METODOS PUBLICO
	
	public void apresentacao() {
		System.out.println("-------------------------------------------------");
		System.out.println("Chegou a hora! apresentamos o lutardor " + this.getNome());
		System.out.println("diretamente de" + this.getNacionalidade());
		System.out.println("com " + this.getIdade() + " anos e");
		System.out.println("pesando " + this.getPeso() + " kg e com ");
		System.out.println(this.getVitorias() + " vitorias");
		System.out.println(this.getDerrotas() + " derrotas");
		System.out.println(this.getEmpates()  + " empates");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
	}
	
	public void status() {
		System.out.println("-------------------------------------------------");
		System.out.println("Lutador "   + this.getNome());
		System.out.println("Categoria " + this.getCategoria());
		System.out.println("Ganhou "    + this.getVitorias());
		System.out.println("Perdeu "    + this.getDerrotas());
		System.out.println("Empatou "   + this.getEmpates());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
	}
		
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}

	//---------------------------------------------------------------------------------------- METODOS ESPECIAIS

	public Lutador(String nome, String nacionalidade, int idade, float altura,
			        float peso, int vitorias, int derrotas,	int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if(this.getPeso() < 52.2) {
			this.categoria = "Invalido";
		}
		else if (this.getPeso() <= 70.3) {
			this.categoria = "Leve";
		}
		else if (this.getPeso() <= 83.9) {
			this.categoria = "Medio";
		}
		else if (this.getPeso() <= 120.2) {
			this.categoria = "Pesado";
		}
		else {
			this.categoria = "Invalida";
		}
		
	}// a categoria muda automaticamente

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}	
}
