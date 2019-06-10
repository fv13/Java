
public class Principal {

	public static void main(String[] args) {
		int[] lista;
		lista = new int[10];

		System.out.println("Intro 10 numeros!\n");

		for (int i = 1; i <= 10; i++) {
			int num = Teclado.leerEntero("Intro el num " + i+":" );

			lista[i-1] = num;
		}
		int num_buscar = Teclado.leerEntero("Numero a buscar?");
		
		
		int j = 10;
		for (int i = 0; i < 10; i++) {
				
			if (lista[ i] == num_buscar) {
				System.out.println("numero "+num_buscar+" esta en pos=" + i+"\n");
		
		}else {
		
			j--;
			if (j==0){
				System.out.println(num_buscar+"no esta en la lista\n");
			}
		}
		
		}
		
		System.out.println("Lista de numeros: \n ");
		int n = 0;
		for (int item : lista) {
			
			System.out.println("pos "+(n++)+":"+item+";");
		}
				
	}
}
