/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.ito.poo;

import java.time.LocalDate;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of vehiculo.
 * 
 * @author BORBONIO
 */
public class vehiculo {
	public vehiculo(String marca, String modelo, int cargaMaxima, LocalDate fechaAdquirir) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cargaMaxima = cargaMaxima;
		this.fechaAdquirir = fechaAdquirir;
	}

	/**
	 * Description of the property marca.
	 */
	private String marca = "";

	/**
	 * Description of the property modelo.
	 */
	private String modelo = "";

	/**
	 * Description of the property cargaMaxima.
	 */
	private int cargaMaxima = 0;

	/**
	 * Description of the property fechaAdquirir.
	 */
	private java.time.LocalDate fechaAdquirir = null;

	// Start of user code (user defined attributes for vehiculo)

	// End of user code

	/**
	 * The constructor.
	 */
	public vehiculo() {
		// Start of user code constructor for vehiculo)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for vehiculo)

	// End of user code
	/**
	 * Returns marca.
	 * @return marca 
	 */
	public String getMarca() {
		return this.marca;
	}

	/**
	 * Sets a value to attribute marca. 
	 * @param newMarca 
	 */
	public void setMarca(String newMarca) {
		this.marca = newMarca;
	}

	/**
	 * Returns modelo.
	 * @return modelo 
	 */
	public String getModelo() {
		return this.modelo;
	}

	/**
	 * Sets a value to attribute modelo. 
	 * @param newModelo 
	 */
	public void setModelo(String newModelo) {
		this.modelo = newModelo;
	}

	/**
	 * Returns cargaMaxima.
	 * @return cargaMaxima 
	 */
	public int getCargaMaxima() {
		return this.cargaMaxima;
	}

	/**
	 * Sets a value to attribute cargaMaxima. 
	 * @param newCargaMaxima 
	 */
	public void setCargaMaxima(int newCargaMaxima) {
		this.cargaMaxima = newCargaMaxima;
	}

	/**
	 * Returns fechaAdquirir.
	 * @return fechaAdquirir 
	 */
	public java.time.LocalDate getFechaAdquirir() {
		return this.fechaAdquirir;
	}

	/**
	 * Sets a value to attribute fechaAdquirir. 
	 * @param newFechaAdquirir 
	 */
	public void setFechaAdquirir(java.time.LocalDate newFechaAdquirir) {
		this.fechaAdquirir = newFechaAdquirir;
	}

	@Override
	public String toString() {
		return "vehiculo [marca=" + marca + ", modelo=" + modelo + ", cargaMaxima=" + cargaMaxima + ", fechaAdquirir="
				+ fechaAdquirir + "]";
	}

}
