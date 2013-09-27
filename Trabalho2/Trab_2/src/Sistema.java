import java.io.ObjectInputStream.GetField;
import java.util.Scanner;


public class Sistema {
	
	
	private static Scanner sc = new Scanner(System.in);//l� oq vai ser digitado....
	static Triangulo triangulo = new Triangulo();
	static Circulo circulo = new Circulo();
	static Retangulo retangulo = new Retangulo();
	static Reta reta = new Reta();
    
	int i = sc.nextInt();
	public static String cmd = "";
	Imagem img = new Imagem(0, 0, "");
	Cor cor = new Cor(0);
		   
	public static void main(String[] args) {
		
		String cmd = "";		
		
		while (!cmd.equals("fim")) {
			cmd = sc.next();
			if(cmd.equals("triangulo")){
				entTriangulo();			
			}
			if(cmd.equals("circulo")){
				entCirculo();			
			}
			if(cmd.equals("retangulo")){
				entRetangulo();			
			}
			if(cmd.equals("reta")){
				entReta();				
			}
		}		
	}
	
	public static void entTriangulo(){//pq tem o metodo com Static void man todos os outros ser�o...
		Ponto p0 = new Ponto();
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto();	
		
		if (cmd.equals("triangulo")) {
			p0.x = sc.nextInt();
			p0.y = sc.nextInt();		
			p1.x = sc.nextInt();
			p1.y = sc.nextInt();		
			p2.x = sc.nextInt();
			p2.y = sc.nextInt();		
			triangulo.setVertices(p0, p1, p2);
		}
}
	
	public static void entCirculo(){
		int x = sc.nextInt();
		int y = sc.nextInt();
		int raio = sc.nextInt();
		Imagem img = new Imagem(0, 0, "");
		Cor cor = new Cor(0);
		
		Circulo circulo = new Circulo( );
		circulo.setCentro(x, y);
		circulo.setRaio(raio);
		circulo.desenhaCirculo(cor, img);	
	}
	
	public static void entRetangulo(){
		Ponto p0 = new Ponto();
		Ponto p1 = new Ponto();
		
		p0.x = sc.nextInt();
		p0.y = sc.nextInt();
		p1.x = sc.nextInt();
		p1.y = sc.nextInt();
		retangulo.setVertices(p0, p1);		
	}

	public static void entReta(){
		Ponto p0 = new Ponto();
		Ponto p1 = new Ponto();
		
		p0.x = sc.nextInt();
		p0.y = sc.nextInt();
		p1.x = sc.nextInt();
		p1.y = sc.nextInt();
		
		reta.setVertices(p0, p1);		
	}
}

