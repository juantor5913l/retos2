import java.util.Scanner;
public class reto3 {
	public static void main(String[] args){
	Scanner lectura=new Scanner(System.in);
	String calculadora[][]=new String[4][4];


		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){	
				System.out.println("Introduce los datos de la calculadora ");		
				calculadora[i][j]=lectura.next();
				    }
					    }
						System.out.println("_______");		
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
				System.out.print(calculadora[i][j]+"|");
		}
		System.out.println(" ");
		lectura.close();
	}
		System.out.println("_______");	
}
}

