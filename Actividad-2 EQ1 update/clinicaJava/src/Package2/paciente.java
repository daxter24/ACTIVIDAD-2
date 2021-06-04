/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Package2;

import java.time.LocalDate;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of paciente.
 * 
 * @author BORBONIO
 */
public class paciente {
	public paciente(String nombre, String rfc, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.rfc = rfc;
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Description of the property nombre.
	 */
	private String nombre = "";

	/**
	 * Description of the property rfc.
	 */
	private String rfc = "";

	/**
	 * Description of the property fechaNacimiento.
	 */
	private java.time.LocalDate fechaNacimiento = null;

	// Start of user code (user defined attributes for paciente)

	// End of user code

	/**
	 * The constructor.
	 */
	public paciente() {
		// Start of user code constructor for paciente)
		super();
		// End of user code
	}

	/**
	 * Description of the method calcularEdad.
	 * @param edad 
	 * @return 
	 */
	public int calcularEdad(int edad) {
		// Start of user code for method calcularEdad
		int calcularEdad = 0;
		return calcularEdad;
		// End of user code
	}

	// Start of user code (user defined methods for paciente)

	// End of user code
	/**
	 * Returns nombre.
	 * @return nombre 
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Sets a value to attribute nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	/**
	 * Returns rfc.
	 * @return rfc 
	 */
	public String getRfc() {
		return this.rfc;
	}

	/**
	 * Sets a value to attribute rfc. 
	 * @param newRfc 
	 */
	public void setRfc(String newRfc) {
		this.rfc = newRfc;
	}

	/**
	 * Returns fechaNacimiento.
	 * @return fechaNacimiento 
	 */
	public java.time.LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	/**
	 * Sets a value to attribute fechaNacimiento. 
	 * @param newFechaNacimiento 
	 */
	public void setFechaNacimiento(java.time.LocalDate newFechaNacimiento) {
		this.fechaNacimiento = newFechaNacimiento;
	}

	@Override
	public String toString() {
		return "paciente [nombre=" + nombre + ", rfc=" + rfc + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

}
