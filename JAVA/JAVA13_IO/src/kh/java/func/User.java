package kh.java.func;

import java.io.Serializable;

//Serializable 마커인터페이스 / 해당객체가 직렬화 가능함을 표시
public class User implements Serializable {
	private String id;
	private transient String pw;
	private String name;
	private int age1;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the pw
	 */
	public String getPw() {
		return pw;
	}

	/**
	 * @param pw the pw to set
	 */
	public void setPw(String pw) {
		this.pw = pw;
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
		return age1;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age1 = age;
	}

	public User(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age1 = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age1 + "]";
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int age;
}
