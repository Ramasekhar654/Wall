package com.wall.po_download.exception;

public class PoNumberNotFound extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;


	public PoNumberNotFound(String message) {

		super(message);
		this.message = message;
	}
}
