/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Accel
 */
public class ConexaoException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConexaoException() {
	}

	public ConexaoException(String x) {
		super(x);                           
	}

	public ConexaoException(Exception e) {
		super(e);                          
	}

	public ConexaoException(String message, Throwable cause) {
		super(message, cause);
	}

}
