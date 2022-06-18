package clases;

/**
 * Representa una clase llamada Cuaderno con sus respectivos atributos y métodos.
 * 
 * @author Jahn Suárez
 * @version 1.0.0 2022-06-17
 */

public class Cuaderno {

	/**
	 * Declaración de variable que representa la marca.
	 */
	private String brand;
	/**
	 * Declaración de variable que representa el tipo de material.
	 */
	private String material;
	/**
	 * Declaración de variable que representa el color.
	 */
	private String color;
	/**
	 * Declaración de variable que representa el tamaño.
	 */
	public String size;
	/**
	 * Declaración de variable que representa el número de hojas.
	 */
	protected int numberSheets;
	/**
	 * Declaración de variable que representa el tipo (rayado - cuadriculado).
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
	 * Método para obtener el tamaño del objeto Cuaderno.
	 * @return size
	 */
	public String getSize() {
		return size;
	}
	
	/**
	 * Método para establecer el tamaño del objeto Cuaderno.
	 * @param size
	 */
	public void setSize(String size) {
		this.size = size;
	}
	
	/**
	 * Método para obtener el tipo del objeto Cuaderno.
	 * @return type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Método para establecer el tipo del objeto Cuaderno.
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * Método para obtener la marca del objeto Cuaderno.
	 * @return brand
	 */
	public String getBrand() {
		return brand;
	}
	
	/**
	 * Método para obtener el material del objeto Cuaderno.
	 * @return material
	 */
	public String getMaterial() {
		return material;
	}
	
	/**
	 * Método para obtener el color del objeto Cuaderno.
	 * @return color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Método para establecer el número de hojas del objeto Cuaderno.
	 * @param numberSheets
	 */
	public void setNumberSheets(int numberSheets) {
		this.numberSheets = numberSheets;
	}
	
	/**
	 * Método para obtener el número de hojas del objeto Cuaderno.
	 * @return numberSheets
	 */
	public int getNumberSheets() {
		return numberSheets;
	}
	
	/**
	 * Método abrir cuaderno del objeto Cuaderno.
	 * @return void
	 */
	private void toOpenNotebook() {
		System.out.println("Open notebook");
	}
	
	/**
	 * Método escribir hoja del objeto Cuaderno.
	 * @return void
	 */
	private void writeSheet() {
		System.out.println("Writing on the sheet");
	}
	
	/**
	 * Método quitar hoja del objeto Cuaderno.
	 * @return void
	 */
	public void removeSheet() {
		System.out.println("The sheet has been removed");
	}
	
	/**
	 * Método cerrar cuaderno del objeto Cuaderno.
	 * @return void
	 */
	public void toCloseNotebook() {
		System.out.println("Close notebook");
	}
}
