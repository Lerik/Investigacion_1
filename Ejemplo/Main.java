import java.util.Scanner;

public class Main {

    public static void main(String arg[]) {
	
		Scanner leer = new Scanner(System.in);
		int Codigo, Edad;
		String Artista, Tour;
		float Precio;
		char Tipo;
		Metal Boletos[] = new Metal[2];
		Pop Taquilla[] = new Pop[2];

		System.out.println("\n°°°°°°°°°°°°°°° Mastodon en Concierto °°°°°°°°°°°°°°°\n\n");
		
		Artista = "Mastodon";
		Tour = "Blackdiamondskye World Tour";
		Codigo = 0;
		Precio = 745;
		
		for(int S=0; S<Boletos.length; S++){
			System.out.print("Edad del Comprador(a) = ");
			Edad = leer.nextInt();
			Boletos[S] = new Metal(++Codigo, Artista, Precio, Tour, Edad);
			System.out.print("Almacenamiento Exitoso\n\n");
		}

		System.out.println("\n°°°°°°°°°°°°°°° Rihanna en Concierto °°°°°°°°°°°°°°°\n\n");
		
		Artista = "Rihanna";
		Codigo = 0;
		Precio = 560;
		
		for(int S=0; S<	Taquilla.length; S++){
			System.out.print("Edad del Comprador(a) = ");
			Edad = leer.nextInt();
			System.out.print("\nTipo de Asiento = \n\tX - Campo\n\tY - Sol y Asiento\n\tZ - Sombra y Asiento\n\t");
			Tipo = leer.next().charAt(0);
			Taquilla[S] = new Pop(++Codigo, Artista, Precio, Edad, Tipo);
			Taquilla[S].Validar_Precio();
			System.out.print("\nAlmacenamiento Exitoso\n\n");
		}
		
		for(Metal Dato: Boletos)
			Dato.Imprimir_Ticket();
		
		for(Pop Dato: Taquilla)
			Dato.Imprimir_Ticket();
		
    }
}
