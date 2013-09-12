import java.io.ObjectInputStream.GetField;
import java.util.Scanner;


public class Sistema {
	
	
	private static Scanner sc = new Scanner(System.in);//lê oq vai ser digitado.... 
    
	
    
	public static void main(String[] args) {
		
		
		int i = sc.nextInt();
		String cmd = "";
		
		Triangulo triangulo = new Triangulo();
		
		while (!cmd.equals("fim")) {
			cmd = sc.next();
			if(cmd.equals("triangulo")){
				entTriangulo();		
			}
		}
		
	}
	
	public static void entTriangulo(){
		Ponto p0 = new Ponto();
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto();	
		
		p0.x = sc.next();
	}

	
		
	
		
		
		
				
		
	}

}
