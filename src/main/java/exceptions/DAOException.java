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
public class DAOException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DAOException() {
    }

    public DAOException(String x) {
        super(x);
    }

    public DAOException(Exception e) {
        super(e);
    }
    
    public DAOException(String message, Throwable cause) {
    	super(message, cause);
    }

}
