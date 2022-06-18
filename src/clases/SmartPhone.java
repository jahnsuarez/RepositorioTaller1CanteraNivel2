package clases;

/**
 * Representa una clase llamada SmartPhone con sus respectivos atributos y m�todos.
 * 
 * @author Jahn Su�rez
 * @version 1.0.0 2022-06-17
 */

public class SmartPhone {
	
	/**
	 * Declaraci�n de variable que representa serial.
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
	 * Declaraci�n de variable que representa el sistema operativo.
	 */
	public String operatingSystem;
	/**
	 * Declaraci�n de variable que representa el procesador.
	 */
	public String processor;
	/**
	 * Declaraci�n de variable que representa la capacidad de RAM.
	 */
	public int RAM;
	/**
	 * Declaraci�n de variable que representa el precio.
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
	 * M�todo para obtener sistema operativo del objeto smartphone.
	 * @return operatingSystem
	 */
	public String getOperatingSystem() {
		return operatingSystem;
	}
	
	/**
	 * M�todo para establcer sistema operativo del objeto smartphone.
	 * @param operatingSystem
	 */
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	/**
	 * M�todo para obtener procesador del objeto smartphone.
	 * @return processor
	 */
	public String getProcessor() {
		return processor;
	}
	
	/**
	 * M�todo para establecer procesador del objeto smartphone.
	 * @param processor
	 */
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	/**
	 * M�todo para obtener RAM del objeto smartphone.
	 * @return RAM
	 */
	public int getRAM() {
		return RAM;
	}
	
	/**
	 * M�todo para establecer RAM del objeto smartphone.
	 * @param RAM
	 */
	public void setRAM(int RAM) {
		this.RAM = RAM;
	}
	
	/**
	 * M�todo para obtener serial del objeto smartphone.
	 * @return serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}
	
	/**
	 * M�todo para obtener modelo del objeto smartphone.
	 * @return model
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * M�todo para obtener marca del objeto smartphone.
	 * @return brand
	 */
	public String getBrand() {
		return brand;
	}
	
	/**
	 * M�todo para obtener precio del objeto smartphone.
	 * @return price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * M�todo llamar del objeto smartphone.
	 * @return void
	 */
	private void toCall() {
		System.out.println("initiated the call");
	}
	
	/**
	 * M�todo encender linterna del objeto smartphone.
	 * @return void
	 */
	public void turnOnLantern() {
		System.out.println("Lantern on");
	}
	
	/**
	 * M�todo encender c�mara del objeto smartphone.
	 * @return void
	 */
	private void turnOnCamera() {
		System.out.println("The camera is on");
	}
	
	
	

}
