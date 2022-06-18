package clases;

/**
 * Representa una clase llamada Cuaderno con sus respectivos atributos y m�todos.
 * 
 * @author Jahn Su�rez
 * @version 1.0.0 2022-06-17
 */

public class Cuaderno {

	/**
	 * Declaraci�n de variable que representa la marca.
	 */
	private String brand;
	/**
	 * Declaraci�n de variable que representa el tipo de material.
	 */
	private String material;
	/**
	 * Declaraci�n de variable que representa el color.
	 */
	private String color;
	/**
	 * Declaraci�n de variable que representa el tama�o.
	 */
	public String size;
	/**
	 * Declaraci�n de variable que representa el n�mero de hojas.
	 */
	protected int numberSheets;
	/**
	 * Declaraci�n de variable que representa el tipo (rayado - cuadriculado).
	 */
	protected String type;
	
	/**
	 * Constructor: crea una instancia de la clase Cuaderno.
	 */
	public Cuaderno(String brand, String material, String color, String size, int numberSheets, String type) {
		
		this.brand = brand;
		this.material = material;
		this.color = color;
		this.size = size;
		this.numberSheets = numberSheets;
		this.type = type;
	}
	
	/**
	 * M�todo para obtener el tama�o del objeto Cuaderno.
	 * @return size
	 */
	public String getSize() {
		return size;
	}
	
	/**
	 * M�todo para establecer el tama�o del objeto Cuaderno.
	 * @param size
	 */
	public void setSize(String size) {
		this.size = size;
	}
	
	/**
	 * M�todo para obtener el tipo del objeto Cuaderno.
	 * @return type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * M�todo para establecer el tipo del objeto Cuaderno.
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * M�todo para obtener la marca del objeto Cuaderno.
	 * @return brand
	 */
	public String getBrand() {
		return brand;
	}
	
	/**
	 * M�todo para obtener el material del objeto Cuaderno.
	 * @return material
	 */
	public String getMaterial() {
		return material;
	}
	
	/**
	 * M�todo para obtener el color del objeto Cuaderno.
	 * @return color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * M�todo para establecer el n�mero de hojas del objeto Cuaderno.
	 * @param numberSheets
	 */
	public void setNumberSheets(int numberSheets) {
		this.numberSheets = numberSheets;
	}
	
	/**
	 * M�todo para obtener el n�mero de hojas del objeto Cuaderno.
	 * @return numberSheets
	 */
	public int getNumberSheets() {
		return numberSheets;
	}
	
	/**
	 * M�todo abrir cuaderno del objeto Cuaderno.
	 * @return void
	 */
	private void toOpenNotebook() {
		System.out.println("Open notebook");
	}
	
	/**
	 * M�todo escribir hoja del objeto Cuaderno.
	 * @return void
	 */
	private void writeSheet() {
		System.out.println("Writing on the sheet");
	}
	
	/**
	 * M�todo quitar hoja del objeto Cuaderno.
	 * @return void
	 */
	public void removeSheet() {
		System.out.println("The sheet has been removed");
	}
	
	/**
	 * M�todo cerrar cuaderno del objeto Cuaderno.
	 * @return void
	 */
	public void toCloseNotebook() {
		System.out.println("Close notebook");
	}
}
