package run;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4,};
		int r = arr.length;
		Permutation perm = new Permutation(arr.length, r);
		perm.permutation(arr, 0);
		ArrayList<ArrayList<Integer>> result = perm.getResult();
		System.out.println("���� ����Ʈ : " + result);
		System.out.println("��� ������ ��: " + result.size());
		for (int i = 0; i < result.size(); i++) {
			for (int j = 0; j < result.get(i).size(); j++) {
				System.out.print(result.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}

class Permutation {
	private int n; // ���� ����
	private int r; // ������ ����
	private int[] now; // ���� ����
	private ArrayList<ArrayList<Integer>> result; // ��� ����
	
	public ArrayList<ArrayList<Integer>> getResult() {
		return result;
	}
	
	public Permutation(int n, int r) {
		this.n = n;
		this.r = r;
		this.now = new int[r];
		this.result = new ArrayList<ArrayList<Integer>>();
	}
	
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void permutation(int[] arr, int depth) {
		// ���� ������ ���̰� r�� �� ��� ����
		if (depth == r) {
			ArrayList<Integer> temp = new ArrayList<>();
			for (int i = 0; i < now.length; i++) {
				temp.add(now[i]);
			}
			result.add(temp);
			return;
		}
		
		for (int i = depth; i < n; i++) {
			swap(arr, i, depth);
			now[depth] = arr[depth];
			permutation(arr, depth + 1);
			swap(arr, i, depth);
		}
	}
}