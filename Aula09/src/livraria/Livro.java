package livraria;

public class Livro implements Publicação {
	private String titulo;
	private String autor;
	private int totPaginas;
	private int paginaAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	@Override
	public String detalhes() {
		return "Livro [titulo = " + titulo 
				+ ",\n autor = " + autor 
				+ ",\n totPaginas = " + totPaginas 
				+ ", paginaAtual = " + paginaAtual 
				+ ", aberto = " + aberto 
				+ ",\n leitor = " + leitor.getNome() 
				+ ", idade = " + leitor.getIdade()  
				+ ", leitor = " + leitor.getSexo() +"]";
	}

	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.paginaAtual = 0;
		this.leitor = leitor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPaginaAtual() {
		return paginaAtual;
	}

	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		this.aberto = true;
	}

	@Override
	public void fechar() {
		this.aberto = false;
	}

	@Override
	public void folhar(int p) {
		if(p > this.totPaginas) {
			this.paginaAtual = 0;
		}
		else {
			this.paginaAtual = p;	
		}		
	
	}

	@Override
	public void avançarPag() {
		if(this.aberto == true && this.totPaginas > this.paginaAtual) {
			this.paginaAtual++;			
		}else {
			this.paginaAtual = 0;
		}
	}

	@Override
	public void voltarPag() {
		this.paginaAtual--;
	}
	
}
