package kr.co.iei.point.vo;

public class Vip extends Silver {

	public Vip() {
		super();
	}

	public Vip(String grade, String name, int point) {
		super(grade, name, point);
	}

	// Silver의 getBonus 메소드를 재정의 (Override)
	@Override
	public double getBonus() {
		return 0.07 * getPoint(); // Vip는 7% 보너스
	}

}