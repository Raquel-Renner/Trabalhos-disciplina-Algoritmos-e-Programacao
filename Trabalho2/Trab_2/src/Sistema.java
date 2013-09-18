import java.io.ObjectInputStream.GetField;
import java.util.Scanner;


public class Sistema {
	
	
	private static Scanner sc = new Scanner(System.in);//lê oq vai ser digitado....
	static Triangulo triangulo = new Triangulo();
	static Circulo circulo = new Circulo();
	static Retangulo retangulo = new Retangulo();
    
	int i = sc.nextInt();
	public static String cmd = "";
	
	   
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
		}
		
	}
	
	public static void entTriangulo(){//pq tem o metodo com Static void man todos os outros serão...
		Ponto p0 = new Ponto();
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto();	
		
		if (cmd.equals("triangulo")) {
			p0.x0 = sc.nextInt();
			p0.y0 = sc.nextInt();
			triangulo.setP0(p0);
			p1.x1 = sc.nextInt();
			p1.y1 = sc.nextInt();
			triangulo.setP1(p1);
			p2.x2 = sc.nextInt();
			p2.y2 = sc.nextInt();
			triangulo.setP2(p2);	
		}
}
	public static void entCirculo(){
		Ponto p0 = new Ponto();
		p0.x0 = sc.nextInt();
		p0.y0 = sc.nextInt();
		circulo.setP0(p0);
		circulo.setRaio(sc.nextInt());		
	}
	
	public static void entRetangulo(){
		Ponto p0 = new Ponto();
		Ponto p1 = new Ponto();
		
		p0.x0 = sc.nextInt();
		p0.y0 = sc.nextInt();
		p1.x1 = sc.nextInt();
		p1.y1 = sc.nextInt();
		retangulo.setp0(p0);
		retangulo.setp1(p1);
	}
}
