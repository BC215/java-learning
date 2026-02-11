package kh.java.func;

public class GenericTest1 {
	private int data1;
	private String data2;

	public GenericTest1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GenericTest1(int data1, String data2) {
		super();
		this.data1 = data1;
		this.data2 = data2;
	}

	/**
	 * @return the data1
	 */
	public int getData1() {
		return data1;
	}

	/**
	 * @param data1 the data1 to set
	 */
	public void setData1(int data1) {
		this.data1 = data1;
	}

	/**
	 * @return the data2
	 */
	public String getData2() {
		return data2;
	}

	/**
	 * @param data2 the data2 to set
	 */
	public void setData2(String data2) {
		this.data2 = data2;
	}

	@Override
	public String toString() {
		return "GenericTest1 [data1=" + data1 + ", data2=" + data2 + "]";
	}

}
