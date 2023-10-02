package creational.prototype;

class Student implements Cloneable {
	public String[] name;
	public Address address;
	public Student(String[] name, Address address) {
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student name :: "+name.toString()+" and address :: "+address;
	}
}

class Address {
	public String streetName;
	public int houseNumber;
	public String cityName;
	public Address(String streetName, int houseNumber, String cityName) {
		this.streetName = streetName;
		this.houseNumber = houseNumber;
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "(village "+streetName+", house number : "+houseNumber+", city name : "+cityName+").";
	}
}

public class CloneUsingCloneable {
	public static void main(String[] args) {
		Student stu1 = new Student(new String[] {"Ram", "Prakash"}, new Address("Lakshmipur", 52, "Sitamarhi"));
		System.out.println(stu1);
	}
}
