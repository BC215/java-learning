package kr.co.iei.point.vo;

public class Gold extends Silver {

	public Gold() {
		super();
	}

	public Gold(String grade, String name, int point) {
		super(grade, name, point);
	}

	// Silver의 getBonus 메소드를 재정의 (Override)
	@Override
	public double getBonus() {
		return 0.05 * getPoint(); // Gold는 5% 보너스
	}
}