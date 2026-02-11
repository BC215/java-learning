package kh.java.func;

public class AnimalMgr3<T> extends Animal {
	private T data1;

	public AnimalMgr3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnimalMgr3(T data1) {
		super();
		this.data1 = data1;
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

}
