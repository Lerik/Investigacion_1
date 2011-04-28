public class Metal extends Tickets{
	
	private String Tour;
	
	public Metal(int A,String B,float C,String D, int E){
		super(A,B,C);
		Precio = Valorar_Precio(E,C,1.00);
		Tour = D;
	}
	
	public void Imprimir_Ticket(){
		super.Imprimir_Ticket();
		System.out.print("\n\tTour            = "+Tour);
	}

}
