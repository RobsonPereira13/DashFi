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
public class BusinessException extends Exception {

    private static final long serialVersionUID = 1L;

	public BusinessException(){

	}

	public BusinessException(String x){
		super(x);
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}
}
