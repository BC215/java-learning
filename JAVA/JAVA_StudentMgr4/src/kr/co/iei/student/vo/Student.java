package kr.co.iei.student.vo;

import java.util.Objects;

public class Student {
	private String name;
	private int age;
	private String add;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, String add) {
		super();
		this.name = name;
		this.age = age;
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", add=" + add + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(add, age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(add, other.add) && age == other.age && Objects.equals(name, other.name);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the add
	 */
	public String getAdd() {
		return add;
	}

	/**
	 * @param add the add to set
	 */
	public void setAdd(String add) {
		this.add = add;
	}

}
