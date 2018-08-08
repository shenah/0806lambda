

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		//문자열 배열 생성
		String [] ar = {"서현", "티파니", "태연", "써니", "유리", "윤아","수영", "효연", "태연"};
		
		//배열 스트림 만들기
		Stream <String> stream = Arrays.stream(ar);
		//출력작업 수행
		//stream.forEach(name ->{System.out.println(name);});
		
		//중간처리 작업 
		//stream.distinct().skip(2).limit(3).forEach(name->{System.out.println(name);});
		
		// "서"로 시작하는 데이터만 찾아서 출력
		//stream.filter(name->name.startsWith("서")).forEach(name->System.out.println(name));
		stream.filter(name->name.startsWith("서")).forEach(name->System.out.println(name));
		System.out.println("=============");
		
		//문자열 리스트 생성
		List <String> person = new ArrayList();
		person.add("제니");
		person.add("지수");
		person.add("로제");
		person.add("리사");
		//list 스트림 만들기
		stream = person.stream();
		stream.forEach(name ->{System.out.println(name);});
	}

}
