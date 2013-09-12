import java.io.ObjectInputStream.GetField;
import java.util.Scanner;


public class Sistema {
	
	
	private static Scanner sc = new Scanner(System.in);//lê oq vai ser digitado....
	static Triangulo triangulo = new Triangulo(); 
    
	int i = sc.nextInt();
	String cmd = "";
	
	   
	public static void main(String[] args) {
		
		
		//int i = sc.nextInt();
		String cmd = "";
		
		Triangulo triangulo = new Triangulo();
		
		while (!cmd.equals("fim")) {
			cmd = sc.next();
			if(cmd.equals("triangulo")){
				entTriangulo();			
			}
		}
		
	}
	
	public static void entTriangulo(){//pq tem o metodo com Static void man todos os outros serão...
		Ponto p0 = new Ponto();
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto();	
		
		p0.x0 = sc.nextInt();
		p0.y0 = sc.nextInt();
		System.out.println(p0);
		p1.x1 = sc.nextInt();
		p1.y1 = sc.nextInt();
		//System.out.println(p1);
		p2.x2 = sc.nextInt();
		p2.y2 = sc.nextInt();
		//System.out.println(p2);
		
		
	}				
		
	

}
