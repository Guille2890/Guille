import java.io.*;
public class areas {
	static BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
	public static double rectangulo(double b,double h)
	{
		double a;
		a=b*h;
		return(a);
	}
	public static double triangulo(double b,double h)
	{
		double a;
		a=b*h/2;
		return(a);
	}


	public static void main(String[] args) throws IOException{
		double b,h,a;
		a=0;
		String tipo;
		do{
		System.out.println("Introduzca tipo de poligono: ");
		tipo=leer.readLine();
		
		System.out.println("Introduzca base y altura");
		b=Double.parseDouble(leer.readLine());
		h=Double.parseDouble(leer.readLine());
		
		if(tipo.equals("triangulo"))
		{
			a=triangulo(b,h);
		}
		else if(tipo.equals("rectangulo"))
		{
			a=rectangulo(b,h);
		}
		else
		{
			System.out.println("No te entendido");
			
			
		}
		
		System.out.println("El area del "+tipo+" es "+a);
		
		}while(!tipo.equals("triangulo")&&!tipo.equals("rectangulo"));	
		
		

	}

}
