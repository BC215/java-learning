package kr.co.iei.point.vo;

public class SearchResult {
	private String grade;
	private int index;

	public SearchResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SearchResult(String grade, int index) {
		super();
		this.grade = grade;
		this.index = index;
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}

}
