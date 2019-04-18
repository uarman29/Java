package application;

public class Contact implements Comparable<Contact>
{
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String picture;
	
	public Contact(String fname, String lname, String email, String phoneNumber)
	{
		this.firstName = fname;
		this.lastName = lname;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.picture = getClass().getResource("default.jpg").toString();
	}
	
	public Contact(String fname, String lname, String email, String phoneNumber,String image)
	{
		this.firstName = fname;
		this.lastName = lname;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.picture = image;
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
	public String getPicture()
	{
		return this.picture;
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
	public void setPicture(String image)
	{
		this.picture = image;
	}

	public String toString()
	{
		return this.getLastName();
	}
	
	public int compareTo(Contact other)
	{
		return (lastName.toUpperCase()).compareTo(other.getLastName().toUpperCase());
	}
}
