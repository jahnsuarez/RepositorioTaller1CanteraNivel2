package clases;
import java.util.ArrayList;

/**
 * Representa una clase llamada Fruta con sus respectivos atributos y m�todos.
 * 
 *@author Jahn Su�rez
 *@version 1.0.0 2022-06-17
 */

public class Fruta {
	
	/**
	 * Declaraci�n de variable que representa el precio.
	 */
	public Double price;
	/**
	 * Declaraci�n de variable que representa el nombre.
	 */
	public String name;
	/**
	 * Declaraci�n de variable que representa el peso promedio.
	 */
	private float averageWeight;
	/**
	 * Declaraci�n de variable que representa el color.
	 */
	public ArrayList<String> colors;
	
	/**
	 * Constructor: crea una instancia de la clase Fruta.
	 */	
	public Fruta(Double price, String name, float averageWeight, ArrayList<String> colors) {
		
		this.price = price;
		this.name = name;
		this.averageWeight = averageWeight;
		this.colors = colors;
	}
	
	/**
	 * M�todo para obtener el peso promedio del objeto fruta.
	 * @return averageWeight
	 */
	public float getAverageWeight() {
		return averageWeight;
	}
	
	/**
	 * M�todo para establecer el peso promedio del objeto fruta.
	 * @param averageWeight
	 */
	public void setAverageWeight(float averageWeight) {
		this.averageWeight = averageWeight;
	}
	
	/**
	 * M�todo para obtener el precio del objeto fruta.
	 * @return price
	 */
	public Double getPrice() {
		return price;
	}
	
	/**
	 * M�todo para establecer el precio del objeto fruta.
	 * @param price
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	
	/**
	 * M�todo para obtener el nombre del objeto fruta.
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * M�todo para establecer el nombre del objeto fruta.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * M�todo para obtener el color del objeto fruta.
	 * @return colors
	 */
	public ArrayList<String> getColors() {
		return colors;
	}
	
	/**
	 * M�todo para establecer el color del objeto fruta.
	 * @param colors
	 */
	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
	}
	
	
}
