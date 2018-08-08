
public class Student {

	private String name;
	private String gender;
	private int age;
	private int score;
	private String subject;
	public Student() {
		super();
	}
	
	
	
	public Student(String name, String gender, int age, int score, String subject) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.score = score;
		this.subject = subject;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", age=" + age + ", score=" + score + ", subject="
				+ subject + "]";
	}
	
}
