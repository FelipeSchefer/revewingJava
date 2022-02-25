package aula;

public class UtraEmojiCombat{
	public static void main(String[] args) {
		Lutador l[] = new Lutador[8]; 
		
		l[0] = new Lutador("Pretty boy", "Franca", 31, 1.75f, 68.9f, 11, 2, 1);
		l[4] = new Lutador("John", "Franca", 31, 1.70f, 68.0f, 10, 2, 1);
//		L.apresentacao();
//		l[0].status();
		
		l[1] = new Lutador("Javanildom", "Brasil", 31, 1.70f, 70.5f, 10, 5, 2);
		l[5] = new Lutador("Pytholino", "Brasil", 31, 1.71f, 70.5f, 6, 5, 1);

		
		l[2] = new Lutador("Cemaximo", "USA", 31, 1.69f, 103.9f, 9, 9, 0);
		l[6] = new Lutador("MySQLado", "USA", 31, 1.69f, 103.9f, 3, 10, 1);

		
		l[3] = new Lutador("Nodemar", "Portugal", 31, 1.75f, 51.9f, 0, 0, 0);
		l[7] = new Lutador("Ce Shapado", "Portugal", 31, 1.75f, 51.9f, 0, 0, 0);
		
		
		Luta UFC = new Luta();
		UFC.marcarLuta(l[0], l[4]);
		UFC.lutar();
		l[0].status();
		l[4].status();
	} 
}