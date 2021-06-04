package app.ito.poo;
import java.time.LocalDate;
import clases.ito.poo.vehiculo;
import clases.ito.poo.viaje;

public class myApp {
 static void run() { 
	
	 System.out.println(new vehiculo("Ford","explorer",500,LocalDate.of(2021, 03, 15)));
	 System.out.println(new viaje("Mazatlan","Federal",LocalDate.of(2021, 03, 30),LocalDate.of(2021, 04, 25),"Pasajeros",5000));
	
 }
	public static void main(String[] args) {
		run();

	}

}
