
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroInicio = 4;
		int numeroFin = 14;
		boolean var = false;
		
		while(numeroInicio<=numeroFin) {
			if(numeroInicio%2==0 && var==true) {
				System.out.print(numeroInicio+" ");
			}
			if (numeroInicio%2 != 0 && var==false) {
				System.out.print(numeroInicio+" ");
			}
			if(numeroInicio%2==0)
			System.out.print(numeroInicio+" ");
			numeroInicio++;
		}

	}

}
