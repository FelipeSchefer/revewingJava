package livraria;

public interface Publica��o {

	public abstract void abrir();
	public abstract void fechar();
	public abstract void folhar(int p);
	public abstract void avan�arPag();
	public abstract void voltarPag();
	String detalhes();
}
