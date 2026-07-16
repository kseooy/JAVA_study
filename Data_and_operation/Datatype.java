public class Datatype{
	public static void main(String[] args) {
		System.out.println(6); // Number
		System.out.println("six"); // String (문자열)
		
		System.out.println("6"); // String 6 (컴퓨터는 문자로 인식)
		
		System.out.println(6+6); // 12 더하기 연산자
		System.out.println("6" + "6"); // 문자열 6 + 문자열 6 = 66
		// 양옆에 문자열이 있으면 결합 연산자 (문자열을 위한 연산자)
		
		System.out.println(6*6); // 36
//		System.out.println("6"*"6"); 에러 발생! 
		
		System.out.println("1111".length()); // 4 문자열의 길이를 알려 줌
		System.out.println(1111); // 숫자 1111, (1111.length())는 불가능
	}
}