package clases;
import java.util.ArrayList;

/**
 * Representa una clase llamada Fruta con sus respectivos atributos y métodos.
 * 
 *@author Jahn Suárez
 *@version 1.0.0 2022-06-17
 */

public class Fruta {
	
	/**
	 * Declaración de variable que representa el precio.
	 */
	public Double price;
	/**
	 * Declaración de variable que representa el nombre.
	 */
	public String name;
	/**
	 * Declaración de variable que representa el peso promedio.
	 */
	private float averageWeight;
	/**
	 * Declaración de variable que representa el color.
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
	 * Método para obtener el peso promedio del objeto fruta.
	 * @return averageWeight
	 */
	public float getAverageWeight() {
		return averageWeight;
	}
	
	/**
	 * Método para establecer el peso promedio del objeto fruta.
	 * @param averageWeight
	 */
	public void setAverageWeight(float averageWeight) {
		this.averageWeight = averageWeight;
	}
	
	/**
	 * Método para obtener el precio del objeto fruta.
	 * @return price
	 */
	public Double getPrice() {
		return price;
	}
	
	/**
	 * Método para establecer el precio del objeto fruta.
	 * @param price
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	
	/**
	 * Método para obtener el nombre del objeto fruta.
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Método para establecer el nombre del objeto fruta.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Método para obtener el color del objeto fruta.
	 * @return colors
	 */
	public ArrayList<String> getColors() {
		return colors;
	}
	
	/**
	 * Método para establecer el color del objeto fruta.
	 * @param colors
	 */
	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
	}
	
	
}
