package app.poo.ito;
import java.time.LocalDate;
import Package2.paciente;
import java.util.HashSet;
public class Myapp {
   static void run() {
	   System.out.println(new paciente("EL PEPE","ASKF2429N",LocalDate.of(2021,03,12)));
	   HashSet<String> consulta=new HashSet<String>();
		consulta.add("2021/03/14");
		consulta.add("DOLOR DE ESPALDA");
		consulta.add("30° 80KG");
		System.out.println("DETALLES CONSULTA"+consulta);
		
		HashSet<String> diagMedic=new HashSet<String>();
		diagMedic.add("ASMA Y DIABETES");
		diagMedic.add("TOMAR PARACETAMOL CADA 8 HRS");
		diagMedic.add("DESCANSAR");
		System.out.println("DETALLES DIAGNOSTICO MEDICO"+diagMedic);
   }
	public static void main(String[] args) {
		run();

	}

}
