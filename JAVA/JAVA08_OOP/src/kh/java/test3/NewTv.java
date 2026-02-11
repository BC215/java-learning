package kh.java.test3;

public class NewTv {
	// 속성 : 크기/전원/볼륨/채널
	// 전역변수를 생성할때 접근제어 지시자를 이용해서 외부에서 접근을 막음
	private int inch;
	private boolean power;
	private int channel;
	public int volume;

	// 생성자 : 객체를 생성할때만 호출되는 특수 메소드
	// 생성자 만드는 방법
	// 1. 접근제어지시자 : public
	// 2. 리턴타입 : 없음 ( void가 아니라 아예 명시 X)
	// 3. 메소드 이름 : 클래스이름과 같아야함
	// 4.매개변수 : 생성자의 역할에 따라 다름

	// 만약 클래스 생성 시 생성자를 작성하지 않으면
	// JVM이 실행할때 기본생성자를 자동으로 생성
	// 생성자를 어떠한 형태든 1개라도 만들면 JVM은 기본생성자를 생성하지 않음.

	// 기본생성자 : 매개변수가 1개도 없는 생성자
	// -> 객체를 생성하는 역할만 하고 전역변수 초기화는 안함
	public NewTv() {

	}

	// 모든전역변수를 초기화 할수있는 생성자
	public NewTv(int inch, boolean power, int channel, int volume) {
		this.inch = inch;
		this.power = power;
		this.channel = channel;
		this.volume = volume;

	}

	// tv크기를 매개변수로 받아서 inch에 초기화 하는 생성자
	public NewTv(int inch) {
		this.inch = inch;
	}

	// getter : 클래스 외부에서 해당 메소드를 이용하여 전역변수 데이터를 가져오기 위한 메소드
	// 1. 접근제어 지시자 : public
	// 2. 리턴타입 : 되돌려줄 변수의 자료형과 동일
	// 3. 메소드이름 : get변수명 -> 카멜표기범
	// 4. 매개변수 : 없음
	// 5. 소스코드 : 해당 전역변수값 리턴
	public int getInch() {
		return inch;
	}

	// boolean형 데이터의 getter생성시 메소드이름 만들때 get이 아닌 is로 지정
	public boolean isPower() {
		return power;
	}

	public int getChannel() {
		return channel;
	}

	public int getvolume() {
		return volume;
	}

	// setter : 외부에서 해당 메소드를 이용하여 전역변수를 수정
	// 1.접근제어 지시자 : public
	// 2.리턴타입 : void
	// 3.메소드이름 : set변수명 ->카멜표기법
	// 4. 매개변수 : 해당 전역변수와 동일한 자료형으로 1개(매개변수의 변수명은 전역변수와 동일)
	// 5. 소스코드 : 매개변수로 받은 데이터를 전역변수에 대입
	/*
	 * public void setInch(int inch) { // this.변수 -> 해당 클래스의 전역변수를 지칭하는 키워드
	 * this.inch = inch; }
	 */
	// 인치값은 변할필요가 없음

	public void setPower(boolean power) {
		this.power = power;

	}

	public void setVolume(int volume) {

		this.volume = volume;

	}

	public void setChannel(int channel) {

		this.channel = channel;

	}

}
