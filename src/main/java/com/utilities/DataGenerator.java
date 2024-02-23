package com.utilities;

import com.github.javafaker.Faker;

public class DataGenerator 
{
	Faker faker =new Faker();
	private String username ;
	private String Firstname;
	private String Lastname;
	private String password;
	public Faker getFaker() {
		return faker;
	}
	public void setFaker(Faker faker) {
		this.faker = faker;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username)
	{
		username=faker.name().username();
		this.username = username;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) 
	{
		firstname=faker.name().username();
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) 
	{
		password=faker.internet().password();
		
		this.password = password;
	}
	
	
}
