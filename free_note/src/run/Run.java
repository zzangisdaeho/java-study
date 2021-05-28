package run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Run {

	public static void main(String[] args) {

		int[] numbers = {6123, 1087, 2223};
		
		
		
		
//		int biggest = 0;
//		
//		//배열을 리스트로 전환한다.
//		List<Integer> toList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
//		
//		//수를 비교하여 가장 큰 조합을 만들 수 부터 집어넣을 리스트
//		List<Integer> choiceOne = new ArrayList<Integer>();
//		
//		
//		for (int i = 1; i < toList.size(); i++) {
//			
//			choiceOne.add(toList.get(i-1));
//			choiceOne.add(toList.get(i));
//			
//			int firstNum = getFirstNum(choiceOne, 0, 1);
//			int secondNum = getFirstNum(choiceOne, 1, 1);
//			
//			if(firstNum > secondNum) {
//				choiceOne.remove(i);
//			}else if(firstNum < secondNum) {
//				choiceOne.remove(i-1);
//			}else {
//				
//			}
//			
//			
//			//가장 큰 숫자를 리스트에 집어넣되, 가장 큰 숫자가 같으면 다음 숫자까지 비교한다.
//			choiceOne.add(numbers[i])
//			
//		}
//		
//	}
//
//	private static int getFirstNum(List<Integer> choiceOne, int index, int powIndex) {
//		//앞선 수 첫째자리수 추출
//		int targetNum = choiceOne.get(index);
//		System.out.println("==== targetNum ====");
//		System.out.println(targetNum);
//		int firstNum = targetNum%10;
//		
//		while(targetNum > Math.pow(10, powIndex)) {
//			targetNum /= 10;
//			firstNum = targetNum%10;
//		}
//		System.out.println("==== result ====");
//		System.out.println(firstNum);
//		System.out.println();
//		
//		return firstNum;
	
	
	}

}
