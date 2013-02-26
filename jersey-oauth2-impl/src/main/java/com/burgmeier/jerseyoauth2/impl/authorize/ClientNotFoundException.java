package com.burgmeier.jerseyoauth2.impl.authorize;

public class ClientNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String clientId;
	
	public ClientNotFoundException(String clientId)
	{
		super();
		this.clientId = clientId;
	}

	public String getClientId() {
		return clientId;
	}
	
}