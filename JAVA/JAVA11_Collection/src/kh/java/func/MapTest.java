package kh.java.func;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public void test1() {
		// 인덱스 번호를 이용해서 문자열을 관리하는 ArrayList
		ArrayList<String> list = new ArrayList<String>();
		list.add("hi");
		list.add("hello");
		list.add("hi");
		System.out.println(list);
		System.out.println(list.get(1));
		// 리스트와 유사하게 번호를 통해서 문자열을 관리하는 HashMap
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "hi");
		map.put(1, "hello");
		map.put(2, "hi");
		System.out.println(map);
		System.out.println(map.get(1));
	}

	public void test2() {
		// 문자열을 통해서 문자열을 관리하는 Map
		HashMap<String, String> map = new HashMap<String, String>();
		// put(param1,param2): map에 데이터를 추가 -> 첫번째 파라미터를 key 두번쨰 파라미터를 value 등록
		map.put("영", "hi");
		map.put("일", "hello");
		map.put("이", "bye");
		System.out.println(map);
		// get(param1) : 매개변수로 받은 key에 해당하는 value를 리턴
		String data = map.get("일");
		System.out.println(data);
		System.out.println(map.get("이"));
		String data1 = map.get("삼"); // 없는 키를 요청하면 null을 리턴
		System.out.println(data1);

		// put 메소드 사용시 이미 사용중인 key 인경우 나중에 put된 데이터로 덮어쓰기 -> 기존 데이터가 사라짐
		map.put("이", "byebye");
		System.out.println(map);

		// put 메소드 사용시 이미 들어있는 value가 겹치는 경우 아무 상관이 없음(key가 겹치지 않는다면)
		map.put("삼", "hi");
		System.out.println(map);

		// remove(key) : 키에 해당하는 데이터를 삭제 / 삭제된 Value를 리턴
		String data3 = map.remove("이");
		System.out.println(map);
		System.out.println(data3);

		// contaunskey(param) : 매개변수로 전달한 데이터가 키로 사용중이면 true / 아니면 false
		boolean bool11 = map.containsKey("영");
		boolean bool12 = map.containsKey("이");
		System.out.println(bool11);
		System.out.println(bool12);

		// contaunsValue(param) : 매개변수로 전달한 데이터가 키로 존재하면 true / 아니면 false
		boolean bool13 = map.containsKey("hello");
		boolean bool14 = map.containsKey("bye");
		System.out.println(bool13);
		System.out.println(bool14);

		// map에 있는 데이터 1개를 가져올때 map.get(key)를 이용
		// map에 있는 모든 데이터를 가지고 오려면 ?
		// keySet(): 맵에 있는 모든 key를 Set(HashSet) 형태로 변환
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key + ":" + map.get(key));

		}
	}

	public void test3() {
		// 문자열을 통해서 숫자를 관리하는 map
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("data1", 100);
		map.put("year", 2026);
		map.put("month", 1);
		map.put("date", 2);

		System.out.println(map.get("year"));
		System.out.println(map.get("month"));
		System.out.println(map.get("date"));
		System.out.println(map.get("hour"));
	}
}
