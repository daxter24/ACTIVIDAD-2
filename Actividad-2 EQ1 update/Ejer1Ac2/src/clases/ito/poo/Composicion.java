/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.ito.poo;

import java.time.LocalDate;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Composicion.
 * 
 * @author BORBONIO
 */
public class Composicion {
	public Composicion(String nombre, int duracion, String interpretes) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.interpretes = interpretes;
	}

	/**
	 * Description of the property nombre.
	 */
	private String nombre = "";

	/**
	 * Description of the property duracion.
	 */
	private int duracion = 0;

	/**
	 * Description of the property interpretes.
	 */
	private String interpretes = "";

	/**
	 * Description of the property fechaRegistro.
	 */
	private java.time.LocalDate fechaRegistro = null;

	/**
	 * Description of the property fechaEstreno.
	 */
	private java.time.LocalDate fechaEstreno = null;

	// Start of user code (user defined attributes for Composicion)

	// End of user code

	/**
	 * The constructor.
	 */
	public Composicion() {
		// Start of user code constructor for Composicion)
		super();
		// End of user code
	}

	/**
	 * Description of the method ActInterpretes.
	 * @param newInterprete 
	 * @return 
	 */
	public String ActInterpretes(String newInterprete) {
		// Start of user code for method ActInterpretes
		String ActInterpretes = "";
		return ActInterpretes;
		// End of user code
	}

	// Start of user code (user defined methods for Composicion)

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
	 * Returns duracion.
	 * @return duracion 
	 */
	public int getDuracion() {
		return this.duracion;
	}

	/**
	 * Sets a value to attribute duracion. 
	 * @param newDuracion 
	 */
	public void setDuracion(int newDuracion) {
		this.duracion = newDuracion;
	}

	/**
	 * Returns interpretes.
	 * @return interpretes 
	 */
	public String getInterpretes() {
		return this.interpretes;
	}

	/**
	 * Sets a value to attribute interpretes. 
	 * @param newInterpretes 
	 */
	public void setInterpretes(String newInterpretes) {
		this.interpretes = newInterpretes;
	}

	/**
	 * Returns fechaRegistro.
	 * @return fechaRegistro 
	 */
	public java.time.LocalDate getFechaRegistro() {
		return this.fechaRegistro;
	}

	/**
	 * Sets a value to attribute fechaRegistro. 
	 * @param newFechaRegistro 
	 */
	public void setFechaRegistro(java.time.LocalDate newFechaRegistro) {
		this.fechaRegistro = newFechaRegistro;
	}

	/**
	 * Returns fechaEstreno.
	 * @return fechaEstreno 
	 */
	public java.time.LocalDate getFechaEstreno() {
		return this.fechaEstreno;
	}

	/**
	 * Sets a value to attribute fechaEstreno. 
	 * @param newFechaEstreno 
	 */
	public void setFechaEstreno(java.time.LocalDate newFechaEstreno) {
		this.fechaEstreno = newFechaEstreno;
	}

	@Override
	public String toString() {
		return "Composicion [nombre=" + nombre + ", duracion=" + duracion + ", interpretes=" + interpretes
				+ ", fechaRegistro=" + fechaRegistro + ", fechaEstreno=" + fechaEstreno + "]";
	}

}
