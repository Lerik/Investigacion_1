public class Pop extends Tickets{
	
	private int Edad;
	private char Tipo;
	
	public Pop(int A,String B,float C,int E, char F){
		super(A,B,C);
		Edad = E;
		Tipo = F;
	}
	
	public void Validar_Precio(){	
		if(Edad<=14){
			Precio = super.Valorar_Precio(Edad,Precio,1.00);
		}else{
			if(Tipo=='X' || Tipo=='x' || Tipo=='Y' || Tipo=='y' || Tipo=='Z' || Tipo=='z'){
				if(Tipo=='X' || Tipo=='x'){
					Precio = super.Valorar_Precio(Edad,Precio,0.50);
				}else if(Tipo=='Y' || Tipo=='y'){
					Precio = super.Valorar_Precio(Edad,Precio,0.80);
				}else if(Tipo=='Z' || Tipo=='z'){
					Precio = super.Valorar_Precio(Edad,Precio,1.00);
				}
			}else{
				super.Precio = 0;
			}
		}
	}
	
	public void Imprimir_Ticket(){
		super.Imprimir_Ticket();
		System.out.print("\n\tTipo de Asiento = "+Tipo);
	}
	
}