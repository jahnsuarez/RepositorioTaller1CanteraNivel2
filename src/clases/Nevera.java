package clases;

/**
 * Representa una clase llamada Nevera con sus respectivos atributos y m�todos.
 * 
 * @author Jahn Su�rez
 * @version 1.0.0 2022-06-17
 */

public class Nevera {

	/**
	 * Declaraci�n de variable que representa el serial.
	 */
	private String serialNumber;
	/**
	 * Declaraci�n de variable que representa el modelo.
	 */
	private String model;
	/**
	 * Declaraci�n de variable que representa la marca.
	 */
	private String brand;
	/**
	 * Declaraci�n de variable que representa la altura.
	 */
	public float height;
	/**
	 * Declaraci�n de variable que representa el ancho.
	 */
	public float width;
	/**
	 * Declaraci�n de variable que representa el peso.
	 */
	protected float weight;
	/**
	 * Declaraci�n de variable que representa el precio.
	 */
	protected double price;
	
	/**
	 * Constructor: crea una instancia de la clase Nevera.
	 */
	public Nevera(String serialNumber, String model, String brand, float high, float width, float weight,
			double price) {
		
		this.serialNumber = serialNumber;
		this.model = model;
		this.brand = brand;
		this.height = high;
		this.width = width;
		this.weight = weight;
		this.price = price;
	}
	
	/**
	 * M�todo para obtener la marca del objeto nevera.
	 * @return brand
	 */
	public String getBrand() {
		return brand;
	}
	
	/**
	 * M�todo para establecer la marca del objeto nevera.
	 * @param brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	/**
	 * M�todo para obtener la altura del objeto nevera.
	 * @return high
	 */
	public float getHeight() {
		return height;
	}
	
	/**
	 * M�todo para establecer la altura del objeto nevera.
	 * @param high
	 */
	public void setHigh(float high) {
		this.height = high;
	}
	
	/**
	 * M�todo para obtener el ancho del objeto nevera.
	 * @return width
	 */
	public float getWidth() {
		return width;
	}
	
	/**
	 * M�todo para establecer el ancho del objeto nevera.
	 * @param width
	 */
	public void setWidth(float width) {
		this.width = width;
	}
	
	/**
	 * M�todo para obtener el peso del objeto nevera.
	 * @return weigth
	 */
	public float getWeight() {
		return weight;
	}
	
	/**
	 * M�todo para establecer el peso del objeto nevera.
	 * @param weight
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	/**
	 * M�todo para obtener el precio del objeto nevera.
	 * @return price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * M�todo para establecer el peso del objeto nevera.
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * M�todo para obtener el serial del objeto nevera.
	 * @return serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}
	
	/**
	 * M�todo para obtener el modelo del objeto nevera.
	 * @return model
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * M�todo encender luz del objeto nevera.
	 * @return void
	 */
	public void turnOnLight() {
		System.out.println("the light is on");
	}
	
	/**
	 * M�todo congelar del objeto nevera.
	 * @return void
	 */
	private void toFreeze() {
		System.out.println("Began to freeze");
	}
	
	/**
	 * M�todo bajar temperatura del objeto nevera.
	 * @return void
	 */
	public void lowerTemperature() {
		System.out.println("Temperature began to rise");
	}
}
