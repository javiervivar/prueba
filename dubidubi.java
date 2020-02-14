import java.util.*; 
public class dubidubi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Creo la matriz
		
		String traductor[][] = {
				{"bear", "oso"},
				{"cat", "gato"},
				{"cheetah", "guepardo"},
				{"dog", "perro"},
				{"eagle", "aguila"},
				{"fish", "pez"},
				{"frog", "rana"},
				{"horse", "caballo"},
				{"lion", "leon"},
				{"lizard", "lagarto"},
				{"mare", "yegua"},
				{"meerkat", "suricata"},
				{"monkey", "mono"},
				{"orangutan", "orangutan"},
				{"panther", "pantera"},
				{"parrot", "loro"},
				{"pig", "cerdo"},
				{"tiger", "tigre"},
				{"toad", "sapo"},
				{"tortoise", "tortuga"}
				{"mouse", "raton"}
		};
		
		//Declaro las variables para que cuente acertadas y falladas
		int acertadas = 0; 
		int falladas = 0; 
		
		Scanner lector =  new Scanner(System.in); 
		
		System.out.println("-------------------------------------------------------"); 
		System.out.println("Comienza el test"); 
		
				
		
		//Recorro matriz
			for(int i=0; i<traductor.length; i++) {
				System.out.println("traduce " + traductor[i][0]);
				String respuesta = lector.nextLine(); 
			
			if(respuesta.equalsIgnoreCase(traductor[i][1])) {
				System.out.println("Correcto"); 
				acertadas++; 
			}else {
				System.out.println("La respuesta correcta es " + traductor[i][1]); 
				falladas++; 
				}
			
			}	
			
			System.out.println("Total preguntas " + (acertadas+falladas)); 
			System.out.println("Respuestas acertadas: " + acertadas);
			System.out.println("Respuestas falladas: " + falladas); 
	}

}
