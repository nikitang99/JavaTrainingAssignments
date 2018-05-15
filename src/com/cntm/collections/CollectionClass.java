package com.cntm.collections;

public class CollectionClass
{
	private final String name;
	private final double salary;
	private final int age;
	private final String dept;

	public CollectionClass(String name, double salary, int age, String dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.dept = dept;
	}
	
	public int getAge() {
		return age;
	}
	public String getDept() {
		return dept;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CollectionClass other = (CollectionClass) obj;
		if (age != other.age)
			return false;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("%-15s%10.2f%10d%10s", this.name,this.salary,this.age,this.dept);
		//return "CollectionClass [name=" + name + ", salary=" + salary + ", age=" + age + ", dept=" + dept + "]";
	}
	
	

}
