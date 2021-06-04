/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.ito.poo;

import java.time.LocalDate;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of viaje.
 * 
 * @author BORBONIO
 */
public class viaje {
	public viaje(String destino, String direccion, LocalDate fechaViaje, LocalDate fechaRegreso,
			String cargaDescripcion, int costoViaje) {
		super();
		this.destino = destino;
		this.direccion = direccion;
		this.fechaViaje = fechaViaje;
		this.fechaRegreso = fechaRegreso;
		this.cargaDescripcion = cargaDescripcion;
		this.costoViaje = costoViaje;
	}

	/**
	 * Description of the property destino.
	 */
	private String destino = "";

	/**
	 * Description of the property direccion.
	 */
	private String direccion = "";

	/**
	 * Description of the property fechaViaje.
	 */
	private java.time.LocalDate fechaViaje = null;

	/**
	 * Description of the property fechaRegreso.
	 */
	private java.time.LocalDate fechaRegreso = null;

	/**
	 * Description of the property cargaDescripcion.
	 */
	private String cargaDescripcion = "";

	/**
	 * Description of the property costoViaje.
	 */
	private int costoViaje = 0;

	// Start of user code (user defined attributes for viaje)

	// End of user code

	/**
	 * The constructor.
	 */
	public viaje() {
		// Start of user code constructor for viaje)
		super();
		// End of user code
	}

	/**
	 * Description of the method actuVehic.
	 * @param vehiculo 
	 * @return 
	 */
	public String actuVehic(String vehiculo) {
		// Start of user code for method actuVehic
		String actuVehic = "";
		return actuVehic;
		// End of user code
	}

	// Start of user code (user defined methods for viaje)

	// End of user code
	/**
	 * Returns destino.
	 * @return destino 
	 */
	public String getDestino() {
		return this.destino;
	}

	/**
	 * Sets a value to attribute destino. 
	 * @param newDestino 
	 */
	public void setDestino(String newDestino) {
		this.destino = newDestino;
	}

	/**
	 * Returns direccion.
	 * @return direccion 
	 */
	public String getDireccion() {
		return this.direccion;
	}

	/**
	 * Sets a value to attribute direccion. 
	 * @param newDireccion 
	 */
	public void setDireccion(String newDireccion) {
		this.direccion = newDireccion;
	}

	/**
	 * Returns fechaViaje.
	 * @return fechaViaje 
	 */
	public java.time.LocalDate getFechaViaje() {
		return this.fechaViaje;
	}

	/**
	 * Sets a value to attribute fechaViaje. 
	 * @param newFechaViaje 
	 */
	public void setFechaViaje(java.time.LocalDate newFechaViaje) {
		this.fechaViaje = newFechaViaje;
	}

	/**
	 * Returns fechaRegreso.
	 * @return fechaRegreso 
	 */
	public java.time.LocalDate getFechaRegreso() {
		return this.fechaRegreso;
	}

	/**
	 * Sets a value to attribute fechaRegreso. 
	 * @param newFechaRegreso 
	 */
	public void setFechaRegreso(java.time.LocalDate newFechaRegreso) {
		this.fechaRegreso = newFechaRegreso;
	}

	/**
	 * Returns cargaDescripcion.
	 * @return cargaDescripcion 
	 */
	public String getCargaDescripcion() {
		return this.cargaDescripcion;
	}

	/**
	 * Sets a value to attribute cargaDescripcion. 
	 * @param newCargaDescripcion 
	 */
	public void setCargaDescripcion(String newCargaDescripcion) {
		this.cargaDescripcion = newCargaDescripcion;
	}

	/**
	 * Returns costoViaje.
	 * @return costoViaje 
	 */
	public int getCostoViaje() {
		return this.costoViaje;
	}

	/**
	 * Sets a value to attribute costoViaje. 
	 * @param newCostoViaje 
	 */
	public void setCostoViaje(int newCostoViaje) {
		this.costoViaje = newCostoViaje;
	}

	@Override
	public String toString() {
		return "viaje [destino=" + destino + ", direccion=" + direccion + ", fechaViaje=" + fechaViaje
				+ ", fechaRegreso=" + fechaRegreso + ", cargaDescripcion=" + cargaDescripcion + ", costoViaje="
				+ costoViaje + "]";
	}

}
