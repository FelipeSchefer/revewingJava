package livraria;

public interface Publicação {

	public abstract void abrir();
	public abstract void fechar();
	public abstract void folhar(int p);
	public abstract void avançarPag();
	public abstract void voltarPag();
	String detalhes();
}
