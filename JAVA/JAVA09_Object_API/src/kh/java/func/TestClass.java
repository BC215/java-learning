package kh.java.func;

public class TestClass {
	private int num;
	private String str;

	public TestClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestClass(int num, String str) {
		super();
		this.num = num;
		this.str = str;
	}

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * @return the str
	 */
	public String getStr() {
		return str;
	}

	/**
	 * @param str the str to set
	 */
	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "TestClass [num=" + num + ", str=" + str + "]";
	}

}
