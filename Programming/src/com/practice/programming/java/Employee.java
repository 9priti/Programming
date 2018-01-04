package com.practice.programming.java;

public class Employee {
	
	int id;
	String firstName;
	String lastName;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Equality Check -->"+employee1.equals(employee2) );
		System.out.println("Hashcode method values -->"+employee1.hashCode() );
		System.out.println("Hashcode method values -->"+employee2.hashCode() );
		System.out.println("Hashcode method values -->"+employee3.hashCode() );

	}
	
	static Employee employee1 = new Employee (1,"Priti", "Sinha");
	static Employee employee2 = new Employee (1,"Priti","Sinha");
	static Employee employee3 = new Employee (3,"Abhishek","Anand");
	
	Employee (int id , String firstName , String lastName)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName ;
	}
	@Override
	
	public boolean equals (Object obj)
	{
		if (obj == this)
			return true;

	if (obj == null || (obj.getClass () != this.getClass())){
		return false ;
	}
	Employee tempEmployee = (Employee)obj ;
	return ((id == tempEmployee.id) && (firstName == tempEmployee.firstName || firstName != null && firstName.equalsIgnoreCase(tempEmployee.firstName)  )&&(lastName == tempEmployee.lastName || lastName != null && lastName.equalsIgnoreCase(tempEmployee.lastName) ));
	}
	
	@Override
	public int hashCode ()
	{
		final int prime = 31 ;
		int result = 1;
		result  = prime*result + (firstName != null ? 0 : firstName.hashCode());
		result =  prime*result + id ;
		result = prime *result + (lastName != null ? 0 : lastName.hashCode());
		return result;
		
	}
}
