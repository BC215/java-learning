package kh.java.test7;

public class CalcImpl implements Calc {

	@Override
	public int sum(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result; // 합산된 결과값을 반환해야 합니다.
	}

}
