import java.util.Scanner;
public class reto4{
	public static void main(String[] args){
	Scanner lectura=new Scanner(System.in);
	String productos[][]=new String[16][4];
	int contador=0;


		for(int i=0;i<16;i++){
            System.out.println("Ingrese el nombre del producto  " + (i + 1) + ":");
            productos[i][0] = lectura.nextLine();
			for(int j=0;j<1;j++){	
                System.out.println("Ingrese el precio del producto " + (i + 1) + ":");
                productos[j][0]=lectura.nextLine();
				    }
					    }
						System.out.println("Estos son los productos:");
        System.out.println("Código | Nombre | Precio");		
			for(int i=0;i<16;i++){
				for(int j=0;j<1;j++){
                    System.out.println(contador+"|"+productos[i][j]+"|" + productos[i][j]);
					contador++;
		}
		lectura.close();
	}
		
}
}