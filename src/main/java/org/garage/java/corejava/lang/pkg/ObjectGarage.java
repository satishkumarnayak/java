package org.garage.java.corejava.lang.pkg;

public class ObjectGarage {

}

class Employee {
	String name;
	int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "name->" + name + ",id->" + id;

	}

	@Override
	public int hashCode() {
		return id;

	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		Employee other = (Employee) o;
		if (this.getName().equals(other.getName()) && this.id == other.id) {
			return true;
		} else
			return false;
	}

}

class TestClone implements Cloneable {
	int i;
	int j;
	Employee emp;

	public TestClone() {
		
	}
	public TestClone(int i, int j,Employee emp) {
		this.i=i;
		this.j=j;
		this.emp=emp;
	}
	TestClone cloneme(TestClone obj) throws CloneNotSupportedException {
		return (TestClone) obj.clone();
	}
	
	@Override
	protected Object clone() {
		TestClone clone;
		Employee emp = this.emp;
		clone = new TestClone(this.i,this.j,new Employee(emp.getName(),emp.getId()));
		return clone;
		
	}
}
