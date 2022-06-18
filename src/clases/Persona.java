package clases;
import java.util.Date;

/**
 * Representa una clase llamada Persona con sus respectivos atributos y m�todos.
 * 
 *@author Jahn Su�rez	
 *@version 1.0.0 2022-06-17
 */

public class Persona {
	
	/**
	 * Declaraci�n de variable que representa la identificaci�n.
	 */
	private String IdCard;
	/**
	 * Declaraci�n de variable que representa el nombre.
	 */
	public String name;
	/**
	 * Declaraci�n de variable que representa el primer apellido.
	 */
	public String lastName1;
	/**
	 * Declaraci�n de variable que representa el segundo apellido.
	 */
	public String lastName2;
	/**
	 * Declaraci�n de variable que representa la fecha de nacimiento.
	 */
	public Date dateBirth;
	/**
	 * Declaraci�n de variable que representa la altura.
	 */
	public float height;
	/**
	 * Declaraci�n de variable que representa el peso
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
	 * M�todo para obtener la identificaci�n del objeto persona.
	 * @return IdCard
	 */
	public String getIdCard() {
		return IdCard;
	}
	
	/**
	 * M�todo para obtener el nombre del objeto persona.
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * M�todo para establecer el nombre del objeto persona.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * M�todo para obtener el primer apellido del objeto persona.	
	 * @return lastName1
	 */
	public String getLastName1() {
		return lastName1;
	}

	/**
	 * M�todo para establecer el primer apellido del objeto persona.
	 * @param lastName1
	 */
	public void setLastName1(String lastName1) {
		this.lastName1 = lastName1;
	}

	/**
	 * M�todo para obtener el segundo apellido del objeto persona.
	 * @return lastName2
	 */
	public String getLastName2() {
		return lastName2;
	}

	/**
	 * M�todo para establecer el segundo apellido del objeto persona.
	 * @param lastName2
	 */
	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}
	
	/**
	 * M�todo para obtener la fecha de nacimiento del objeto persona.
	 * @return dateBirth
	 */
	public Date getDateBirth() {
		return dateBirth;
	}

	/**
	 * M�todo para establecer la fecha de nacimiento del objeto persona.
	 * @param dateBirth
	 */
	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	/**
	 * M�todo para obtener la altura del objeto persona.
	 * @return height
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * M�todo para establecer la altura del objeto persona.
	 * @param height
	 */
	public void setHeight(float height) {
		this.height = height;
	}

	/**
	 * M�todo para obtener el peso del objeto persona.
	 * @return weight
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * M�todo para establecer el peso del objeto persona.
	 * @param weight
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	/**
	 * M�todo caminar del objeto persona
	 * @return void
	 */
	public void toWalk() {
		
		System.out.println("Began to walk");
	}
	
	/**
	 * M�todo comer del objeto persona
	 * @return void
	 */
	protected void toEat() {
		
		System.out.println("Began to eat");
	}
	
	/**
	 * M�todo descarnsar del objeto persona
	 * @return void
	 */
	private void toRest() {
		
		System.out.println("Began to rest");
	}

}
