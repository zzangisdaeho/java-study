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
//		//�迭�� ����Ʈ�� ��ȯ�Ѵ�.
//		List<Integer> toList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
//		
//		//���� ���Ͽ� ���� ū ������ ���� �� ���� ������� ����Ʈ
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
//			//���� ū ���ڸ� ����Ʈ�� ����ֵ�, ���� ū ���ڰ� ������ ���� ���ڱ��� ���Ѵ�.
//			choiceOne.add(numbers[i])
//			
//		}
//		
//	}
//
//	private static int getFirstNum(List<Integer> choiceOne, int index, int powIndex) {
//		//�ռ� �� ù°�ڸ��� ����
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
