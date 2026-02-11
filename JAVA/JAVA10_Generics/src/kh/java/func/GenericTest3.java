package kh.java.func;

public class GenericTest3<T> {
	// data1 변수의 자료형은 클래스 작성할 떄 지정을 X
	// data1 변수의 자료형은 해당 클래스로 객체를 생성할 때 자료형을 지정
	private T data1;
	private String data2;

	public GenericTest3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GenericTest3(T data1, String data2) {
		super();
		this.data1 = data1;
		this.data2 = data2;
	}

	/**
	 * @return the data1
	 */
	public T getData1() {
		return data1;
	}

	/**
	 * @param data1 the data1 to set
	 */
	public void setData1(T data1) {
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

}
