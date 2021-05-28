package com.kh.example.chap03_assist_part03_object.model.DAO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.example.chap03_assist_part03_object.model.vo.Member;

public class ObjectDAO {
	public void fileSave() {
		Member[] mar = {
				new Member("user01", "pass01", "�ڽſ�", "psw11@pp.pp", 25, '��', 1250.7),
				new Member("user02", "pass02", "���ǰ�", "kkk22@kk.kk", 16, '��', 1221.6),
				new Member("user03", "pass03", "������", "nnn33@nn.nn", 22, '��', 1234.4)
		};
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_Object.txt"));) {
			
			for(int i = 0; i < mar.length; i++) {
				oos.writeObject(mar[i]);
				System.out.println(mar[i] + ": one mar :");
			}
//			oos.writeObject(mar);
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void fileOpen() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object.txt"));) {
			
			Member[] mArr = new Member[5];
			
			for(int i = 0; i < mArr.length; i++) { //���� ������Ʈ�� ũ��� 3�ε� 5�� ������ �ϱ� ������ EOEF exception�� �߻�
				mArr[i] = (Member)ois.readObject();
				System.out.println(mArr[i] + ": one mar :");
			}
			
			
//			Member[] m = (Member[])ois.readObject(); // �̷������� �޴°� �� �ȵǴ°ǰ�
//			System.out.println(m[1]);
			
//			for(Member m : mArr) { // ���� for��, for each��
//				System.out.println(m); //���۷��� ���� m�� �ּҰ�������, MemberŬ������ toString�� �������̵��ؼ� �������̵��� �μ�ȴ�.
//			}
			
//			for(int i = 0; i < mArr.length; i++) {
//				System.out.println(mArr[i].getPoint());
//			}
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
