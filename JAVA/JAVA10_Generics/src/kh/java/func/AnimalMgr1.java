package kh.java.func;

public class AnimalMgr1 {
	// Tiger 또는 Rabbit 을저장하는 변수
	// Tiger, Rabbit 두 클래스의 공통 조상클래스 -> Object
	private Object data1;

	public AnimalMgr1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnimalMgr1(Object data1) {
		super();
		this.data1 = data1;
	}

	/**
	 * @return the data1
	 */
	public Object getData1() {
		return data1;
	}

	/**
	 * @param data1 the data1 to set
	 */
	public void setData1(Object data1) {
		this.data1 = data1;
	}

}
