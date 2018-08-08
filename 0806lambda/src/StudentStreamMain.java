import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudentStreamMain {

	public static void main(String[] args) {

		/*//Student 클래스의 인스턴스의 배열
		Student [] ar = new Student[5];
		ar[0] = new Student("을지문덕", "남자", 24, 95, "체육학과");
		ar[1] = new Student("최성재", "남자", 23, 89, "컴퓨터학과");
		ar[2] = new Student("이지연", "여자", 31, 92, "중문학과");
		ar[3] = new Student("김수정", "여자", 22, 90, "번역학과");
		ar[4] = new Student("박광석", "남자", 32, 94, "영문학과");
		//성별이 남자인 데이터만 출력
		Stream <Student> stream1 = Arrays.stream(ar);
		stream1.filter(student ->student.getGender().equals("남자")).forEach(student->System.out.println(student));
		
		//성별이 여자고 나이가 30이상인 데이터
		Stream <Student> stream2 = Arrays.stream(ar);
		stream2.filter(student ->student.getAge() >= 30 && student.getGender().equals("여자")).forEach(student->System.out.println(student));
		
		// Strudent를 score로 변경
		Stream <Student> stream3 = Arrays.stream(ar);
		stream3.mapToInt(Student :: getScore).forEach(student->System.out.println(student));
		*/
		//정열 - sort
		int [] ar = {10,87,30,49,12};
		IntStream stream = Arrays.stream(ar);
		//stream.sorted().forEach(num -> System.out.println(num));
		

		/*String [] array = {"Afternoon", "Morning", "Evening", "Night"};
		Stream<String> s = Arrays.stream(array);
		//s.sorted().forEach(str ->System.out.println(str));
		s.sorted((n1, n2)->n2.compareTo(n1)).forEach(n->System.out.println(n));*/
		
		//Stream <Student> stream4 = Arrays.stream(ar);
		//stream4.sorted((n1, n2)->n2.getAge() - n1.getAge()).forEach(n->System.out.println(n));
		//stream4.sorted((n1,n2)->n2.getName().compareTo(n1.getName())).forEach(n->System.out.println(n));
		
		
	}

}
