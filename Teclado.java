import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Teclado {
	public static Integer leerEntero(String pregunta) {
	BufferedReader teclado= new BufferedReader(new InputStreamReader(System.in));
	
	Integer cadena=null;
	try {
	System.out.println(pregunta);	
	cadena= Integer.parseInt(teclado.readLine());
	}catch(Exception e) {
	 System.out.println("No se ha podido leer la entrada");
}
return cadena;
}
}