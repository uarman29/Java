package application;

public class Contact 
{
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	
	public Contact(String fname, String lname, String email, String phoneNumber)
	{
		this.firstName = fname;
		this.lastName = lname;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	public String getEmail()
	{
		return this.email;
	}
	public String getPhoneNumber()
	{
		return this.phoneNumber;
	}

	public void setFirstName(String fname)
	{
		this.firstName = fname;
	}
	public void setLastName(String lname)
	{
		this.lastName = lname;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public String toString()
	{
		return this.getLastName();
	}
}
