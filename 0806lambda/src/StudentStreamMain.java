import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudentStreamMain {

	public static void main(String[] args) {

		/*//Student Ŭ������ �ν��Ͻ��� �迭
		Student [] ar = new Student[5];
		ar[0] = new Student("��������", "����", 24, 95, "ü���а�");
		ar[1] = new Student("�ּ���", "����", 23, 89, "��ǻ���а�");
		ar[2] = new Student("������", "����", 31, 92, "�߹��а�");
		ar[3] = new Student("�����", "����", 22, 90, "�����а�");
		ar[4] = new Student("�ڱ���", "����", 32, 94, "�����а�");
		//������ ������ �����͸� ���
		Stream <Student> stream1 = Arrays.stream(ar);
		stream1.filter(student ->student.getGender().equals("����")).forEach(student->System.out.println(student));
		
		//������ ���ڰ� ���̰� 30�̻��� ������
		Stream <Student> stream2 = Arrays.stream(ar);
		stream2.filter(student ->student.getAge() >= 30 && student.getGender().equals("����")).forEach(student->System.out.println(student));
		
		// Strudent�� score�� ����
		Stream <Student> stream3 = Arrays.stream(ar);
		stream3.mapToInt(Student :: getScore).forEach(student->System.out.println(student));
		*/
		//���� - sort
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
