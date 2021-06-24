package spring.di.entity;

public class NewLecExam implements Exam {

	private int kor;
	private int eng;
	private int math;
	private int com;
	
	public NewLecExam() {
		
	}
	
	
	
	public NewLecExam(int kor, int eng, int math, int com) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	} // setting.xml에서 <constructor-arg에서 설정해준 것을 사용하는 값



	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public int total() {
		return kor+eng+math+com;
	}
	
	public float avg() {
		return total() / 4.0f;
	}



	@Override
	public String toString() {
		return "NewLecExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	} // 국어 영어 등의 설정값을 리턴해준다

	
	
}
