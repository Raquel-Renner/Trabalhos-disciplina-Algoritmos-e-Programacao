package pck_trabalho_2;

public class Imagem {
		
	public class Matriz {
	    
	    private int width;
	    private int height;
	    private int [][] image;//matriz

	    public Matriz(int width, int height){//para criar a imagem
	        this.width = width;
	        this.height = height;
	        this.image = new int[width][height];
	    }
	    
	    public void setPixel(int gray, int x, int y) throws Exception{//x e y paramentros das coordenadas...
	        if(gray < 0)
	            gray = 0;
	            if(gray > 255)
	                gray = 255;
	            if(x < 0 || x >= width)//p descobrir se os valores de x e y são válidos (caminho feliz  shaushu)
	                throw new Exception("X out of range");
	            if(y < 0 || y >= height)
	                throw new Exception("y out of range");
	            image[x][y] = gray;   
	    }
	    
	    public void printImage(PrintStream out){//metodo q vai ser usado p arquivo
	        
	        out.println(String.format("P2\n%d %d\n255\n", width, height));//separação de linhas
	        
	        for (int x = 0; x < width; x++) {
	            for (int y = 0; y < height; y++) {
	                out.print(getPixel(x, y));
	                out.print(" ");
	            }
	        }
	    }
	   private int getPixel(int x, int y) {
	       return image[x][y]; 
	   }
	    
	    
	    public static void main(String[] args) throws Exception{
	        //int [][]mat = new int[2][3];
	        Matriz m = new Matriz(16,16);
	       
	      
	        for (int x = 0; x < 16; x++) {
	            for (int y = 0; y < 16; y++) {
	                m.setPixel(x, y, x + y * 16);
	            }
	            
	        }
	        
	        m.printImage(System.out);
	    }

	   
	}

}
