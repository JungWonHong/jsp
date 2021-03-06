/*
 * HashMap Generic 사용하지 않은 예
 *  Map 인터페이스
 *   - HashMap, HashTable (상속받는 클래스)
 *   	1. 여러가지 자료형의 Data를 모두 저장할 수 있습니다.
 *   		ex) int, double, char, boolean, String etc
 *   	2. Data를 저장할 때  Key, Value 를 동시에 저장합니다.
 *   	   Key값은 중복되지 않습니다.
 *   	3. 단 하나의 null key, 여러개의 null 값 허용
 */
//Key가 null인 경우
package ex15_4_HashMap;

import java.util.HashMap;

public class HashMap2_Key_null {

	public static void main(String[] args) {
		// HashMap 객체 생성 방법 두 가지
		// Map hm = new HashMap(); //방법1. 업캐스팅
		HashMap hm = new HashMap();// 방법2. 구현 클래스를 통한 객체 생성

		// Key와 Value 쌍을 삽입
		// Map의 메소드는 put을 이용해(Key, Value) 쌍으로 자료 저장한다.
		hm.put("name", "아이유");
		hm.put("blood", "A");
		hm.put("age", new Integer(10));// hm.put("age", 10);
		hm.put("city", "seoul");

		// Key값이 중복된 경우 (여러 개인 경우) 마지막 데이터가 저장된다.
		hm.put(null, "소풍");
		hm.put(null, "맛집");
		hm.put(null, "최고");
		hm.put("city", null);

		// HashMap에 있는 객체들을 출력
		// 출력방법1. 해당 객체명으로 출력
		System.out.println(hm);

		// 출력 방법2. Key 값만 출력
		System.out.println(hm.keySet());
		
		// 출력방법3. Value 값만 출력
		System.out.println(hm.values());

		// 출력방법4.
		// get(Key) : Key에 해당하는 Value를 출력 - 가장 많이 사용
		System.out.println(hm.get("woman"));
		System.out.println(hm.get("city"));
	}

}
