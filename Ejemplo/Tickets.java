public class Tickets {

    public int Codigo;
    public String Artista;
    public float Precio;

    public Tickets(int A,String B,float C){
        Codigo = A;
        Artista = B;
        Precio = C;
    }
	
	public float Valorar_Precio(int A,float B,double D){
        if(A<=14)
            return (float)(B*0.3);
        return (float)(B*((float)(D)));
    }
	
	public void Imprimir_Ticket(){
		System.out.print("\n\n\tCodigo          = "+Codigo);
		System.out.print("\n\tArtista         = "+Artista);
		System.out.print("\n\tPrecio          = "+Precio);
	}

}

