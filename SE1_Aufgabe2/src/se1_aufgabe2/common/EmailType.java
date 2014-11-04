package se1_aufgabe2.common;

import se1_aufgabe2.accounting.InvalidEmailException;

public class EmailType {
	private final String address;
	
	public EmailType(String inAddress)
	{
		if(!isValidMailAddress(inAddress))
			throw new InvalidEmailException();
		
		this.address = inAddress;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public String getDomain()
	{
		return this.address.split("@")[1];
	}
	
	public String getTopLevelDomain()
	{
		String[] domainSplit = this.getDomain().split("\\.");
		return domainSplit[domainSplit.length - 1];
	}
	
	public String getUsername()
	{
		return this.address.split("@")[0];
	}
	
	public static boolean isValidMailAddress(String inAddress)
	{
		return inAddress.matches("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?");
	}
}
