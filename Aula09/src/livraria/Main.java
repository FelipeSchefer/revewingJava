package livraria;

public class Main {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Pedro", 22, "M");
		p[1] = new Pessoa("Maria", 18, "F");
		
		l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
		l[1] = new Livro("Aprendendo PHP", "Antonio Nunes", 290, p[1]);
		l[2] = new Livro("React Avançado", "Priscila Alencarde", 250, p[1]);
		
		l[0].abrir();
		l[0].folhar(300);
		l[0].avançarPag();
		
		System.out.println(l[0].detalhes());
	}

}
