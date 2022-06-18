package clases;

/**
 * Representa una clase llamada Nevera con sus respectivos atributos y métodos.
 * 
 * @author Jahn Suárez
 * @version 1.0.0 2022-06-17
 */

public class Nevera {

	/**
	 * Declaración de variable que representa el serial.
	 */
	private String serialNumber;
	/**
	 * Declaración de variable que representa el modelo.
	 */
	private String model;
	/**
	 * Declaración de variable que representa la marca.
	 */
	private String brand;
	/**
	 * Declaración de variable que representa la altura.
	 */
	public float height;
	/**
	 * Declaración de variable que representa el ancho.
	 */
	public float width;
	/**
	 * Declaración de variable que representa el peso.
	 */
	protected float weight;
	/**
	 * Declaración de variable que representa el precio.
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
	 * Método para obtener la marca del objeto nevera.
	 * @return brand
	 */
	public String getBrand() {
		return brand;
	}
	
	/**
	 * Método para establecer la marca del objeto nevera.
	 * @param brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	/**
	 * Método para obtener la altura del objeto nevera.
	 * @return high
	 */
	public float getHeight() {
		return height;
	}
	
	/**
	 * Método para establecer la altura del objeto nevera.
	 * @param high
	 */
	public void setHigh(float high) {
		this.height = high;
	}
	
	/**
	 * Método para obtener el ancho del objeto nevera.
	 * @return width
	 */
	public float getWidth() {
		return width;
	}
	
	/**
	 * Método para establecer el ancho del objeto nevera.
	 * @param width
	 */
	public void setWidth(float width) {
		this.width = width;
	}
	
	/**
	 * Método para obtener el peso del objeto nevera.
	 * @return weigth
	 */
	public float getWeight() {
		return weight;
	}
	
	/**
	 * Método para establecer el peso del objeto nevera.
	 * @param weight
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	/**
	 * Método para obtener el precio del objeto nevera.
	 * @return price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Método para establecer el peso del objeto nevera.
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Método para obtener el serial del objeto nevera.
	 * @return serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}
	
	/**
	 * Método para obtener el modelo del objeto nevera.
	 * @return model
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * Método encender luz del objeto nevera.
	 * @return void
	 */
	public void turnOnLight() {
		System.out.println("the light is on");
	}
	
	/**
	 * Método congelar del objeto nevera.
	 * @return void
	 */
	private void toFreeze() {
		System.out.println("Began to freeze");
	}
	
	/**
	 * Método bajar temperatura del objeto nevera.
	 * @return void
	 */
	public void lowerTemperature() {
		System.out.println("Temperature began to rise");
	}
}
