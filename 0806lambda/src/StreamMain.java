

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		//���ڿ� �迭 ����
		String [] ar = {"����", "Ƽ�Ĵ�", "�¿�", "���", "����", "����","����", "ȿ��", "�¿�"};
		
		//�迭 ��Ʈ�� �����
		Stream <String> stream = Arrays.stream(ar);
		//����۾� ����
		//stream.forEach(name ->{System.out.println(name);});
		
		//�߰�ó�� �۾� 
		//stream.distinct().skip(2).limit(3).forEach(name->{System.out.println(name);});
		
		// "��"�� �����ϴ� �����͸� ã�Ƽ� ���
		//stream.filter(name->name.startsWith("��")).forEach(name->System.out.println(name));
		stream.filter(name->name.startsWith("��")).forEach(name->System.out.println(name));
		System.out.println("=============");
		
		//���ڿ� ����Ʈ ����
		List <String> person = new ArrayList();
		person.add("����");
		person.add("����");
		person.add("����");
		person.add("����");
		//list ��Ʈ�� �����
		stream = person.stream();
		stream.forEach(name ->{System.out.println(name);});
	}

}
