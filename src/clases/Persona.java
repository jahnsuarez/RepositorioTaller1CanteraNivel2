package clases;
import java.util.Date;

/**
 * Representa una clase llamada Persona con sus respectivos atributos y métodos.
 * 
 *@author Jahn Suárez	
 *@version 1.0.0 2022-06-17
 */

public class Persona {
	
	/**
	 * Declaración de variable que representa la identificación.
	 */
	private String IdCard;
	/**
	 * Declaración de variable que representa el nombre.
	 */
	public String name;
	/**
	 * Declaración de variable que representa el primer apellido.
	 */
	public String lastName1;
	/**
	 * Declaración de variable que representa el segundo apellido.
	 */
	public String lastName2;
	/**
	 * Declaración de variable que representa la fecha de nacimiento.
	 */
	public Date dateBirth;
	/**
	 * Declaración de variable que representa la altura.
	 */
	public float height;
	/**
	 * Declaración de variable que representa el peso
	 */
	public float weight;
	
	/**
	 * Constructor: crea una instancia de la clase Persona.
	 */		
	public Persona(String idCard, String name, String lastName1, String lastName2, Date dateBirth, float height,
			float weight) {
		
		IdCard = idCard;
		this.name = name;
		this.lastName1 = lastName1;
		this.lastName2 = lastName2;
		this.dateBirth = dateBirth;
		this.height = height;
		this.weight = weight;
	}
	
	/**
	 * Método para obtener la identificación del objeto persona.
	 * @return IdCard
	 */
	public String getIdCard() {
		return IdCard;
	}
	
	/**
	 * Método para obtener el nombre del objeto persona.
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Método para establecer el nombre del objeto persona.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Método para obtener el primer apellido del objeto persona.	
	 * @return lastName1
	 */
	public String getLastName1() {
		return lastName1;
	}

	/**
	 * Método para establecer el primer apellido del objeto persona.
	 * @param lastName1
	 */
	public void setLastName1(String lastName1) {
		this.lastName1 = lastName1;
	}

	/**
	 * Método para obtener el segundo apellido del objeto persona.
	 * @return lastName2
	 */
	public String getLastName2() {
		return lastName2;
	}

	/**
	 * Método para establecer el segundo apellido del objeto persona.
	 * @param lastName2
	 */
	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}
	
	/**
	 * Método para obtener la fecha de nacimiento del objeto persona.
	 * @return dateBirth
	 */
	public Date getDateBirth() {
		return dateBirth;
	}

	/**
	 * Método para establecer la fecha de nacimiento del objeto persona.
	 * @param dateBirth
	 */
	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	/**
	 * Método para obtener la altura del objeto persona.
	 * @return height
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * Método para establecer la altura del objeto persona.
	 * @param height
	 */
	public void setHeight(float height) {
		this.height = height;
	}

	/**
	 * Método para obtener el peso del objeto persona.
	 * @return weight
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * Método para establecer el peso del objeto persona.
	 * @param weight
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	/**
	 * Método caminar del objeto persona
	 * @return void
	 */
	public void toWalk() {
		
		System.out.println("Began to walk");
	}
	
	/**
	 * Método comer del objeto persona
	 * @return void
	 */
	protected void toEat() {
		
		System.out.println("Began to eat");
	}
	
	/**
	 * Método descarnsar del objeto persona
	 * @return void
	 */
	private void toRest() {
		
		System.out.println("Began to rest");
	}

}
