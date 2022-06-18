package clases;

/**
 * Representa una clase llamada CuentaBancaria con sus respectivos atributos y m�todos.
 * 
 * @author Jahn Su�rez
 * @version 1.0.0 2022-06-17
 */

public class CuentaBancaria {
	
	/**
	 * Declaraci�n de variable que representa el numero de cuenta.
	 */
	private int accountNumber;
	/**
	 * Declaraci�n de variable que representa el nombre del titular de la cuenta.
	 */
	public String accountHolder;
	/**
	 * Declaraci�n de variable que representa el estado de la cuenta.
	 */
	protected boolean activated;
	/**
	 * Declaraci�n de variable que representa saldo actual.
	 */
	private double currentBalance;
	
	/**
	 * Constructor: crea una instancia de la clase CuentaBancaria.
	 */
	public CuentaBancaria(int accountNumber, String accountHolder, boolean activated, double currentBalance) {
		
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.activated = activated;
		this.currentBalance = currentBalance;
	}
	
	/**
	 * M�todo para establecer n�mero de cuenta del objeto cuenta bancaria.
	 * @return accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	
	/**
	 * M�todo para obtener estado de la cuenta del objeto cuenta bancaria.
	 * @return activated
	 */
	public boolean isActivated() {
		return activated;
	}
	
	/**
	 * M�todo para establecer estado de la cuenta del objeto cuenta bancaria.
	 * @param activated
	 */
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	
	/**
	 * M�todo para obtener nombre del titular de la cuenta del objeto cuenta bancaria.
	 * @return accountHolder
	 */
	public String getAccountHolder() {
		return accountHolder;
	}
	
	/**
	 * M�todo para obtener saldo actual del objeto cuenta bancaria.
	 * @return currentBalance
	 */
	public double getCurrentBalance() {
		return currentBalance;
	}
	
	/**
	 * M�todo para ingresar una cantidad en la cuenta bancaria.
	 * @param cantidad
	 */
	public void depositMoney(double cantidad) {
		
		currentBalance = currentBalance + cantidad;
	}
	
	/**
	 * M�todo para sacar una cantidad de la cuenta bancaria.
	 * @param cantidad
	 */
	public void withdrawMoney(double cantidad) {
		
		currentBalance = currentBalance - cantidad;
	}

}
