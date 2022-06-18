package clases;

/**
 * Representa una clase llamada SmartPhone con sus respectivos atributos y métodos.
 * 
 * @author Jahn Suárez
 * @version 1.0.0 2022-06-17
 */

public class SmartPhone {
	
	/**
	 * Declaración de variable que representa serial.
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
	 * Declaración de variable que representa el sistema operativo.
	 */
	public String operatingSystem;
	/**
	 * Declaración de variable que representa el procesador.
	 */
	public String processor;
	/**
	 * Declaración de variable que representa la capacidad de RAM.
	 */
	public int RAM;
	/**
	 * Declaración de variable que representa el precio.
	 */
	protected double price;
	
	/**
	 * Constructor: crea una instancia de la clase SmartPhone.
	 */
	public SmartPhone(String serialNumber, String model, String brand, String operatingSystem, String processor,
			int RAM, double price) {
		
		this.serialNumber = serialNumber;
		this.model = model;
		this.brand = brand;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
		this.RAM = RAM;
		this.price = price;
	}
	
	/**
	 * Método para obtener sistema operativo del objeto smartphone.
	 * @return operatingSystem
	 */
	public String getOperatingSystem() {
		return operatingSystem;
	}
	
	/**
	 * Método para establcer sistema operativo del objeto smartphone.
	 * @param operatingSystem
	 */
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	/**
	 * Método para obtener procesador del objeto smartphone.
	 * @return processor
	 */
	public String getProcessor() {
		return processor;
	}
	
	/**
	 * Método para establecer procesador del objeto smartphone.
	 * @param processor
	 */
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	/**
	 * Método para obtener RAM del objeto smartphone.
	 * @return RAM
	 */
	public int getRAM() {
		return RAM;
	}
	
	/**
	 * Método para establecer RAM del objeto smartphone.
	 * @param RAM
	 */
	public void setRAM(int RAM) {
		this.RAM = RAM;
	}
	
	/**
	 * Método para obtener serial del objeto smartphone.
	 * @return serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}
	
	/**
	 * Método para obtener modelo del objeto smartphone.
	 * @return model
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * Método para obtener marca del objeto smartphone.
	 * @return brand
	 */
	public String getBrand() {
		return brand;
	}
	
	/**
	 * Método para obtener precio del objeto smartphone.
	 * @return price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Método llamar del objeto smartphone.
	 * @return void
	 */
	private void toCall() {
		System.out.println("initiated the call");
	}
	
	/**
	 * Método encender linterna del objeto smartphone.
	 * @return void
	 */
	public void turnOnLantern() {
		System.out.println("Lantern on");
	}
	
	/**
	 * Método encender cámara del objeto smartphone.
	 * @return void
	 */
	private void turnOnCamera() {
		System.out.println("The camera is on");
	}
	
	
	

}
