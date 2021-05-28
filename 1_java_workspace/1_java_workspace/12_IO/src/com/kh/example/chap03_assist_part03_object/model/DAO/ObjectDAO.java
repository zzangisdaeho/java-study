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
				new Member("user01", "pass01", "박신우", "psw11@pp.pp", 25, '여', 1250.7),
				new Member("user02", "pass02", "강건강", "kkk22@kk.kk", 16, '남', 1221.6),
				new Member("user03", "pass03", "남나눔", "nnn33@nn.nn", 22, '여', 1234.4)
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
			
			for(int i = 0; i < mArr.length; i++) { //적힌 오브젝트의 크기는 3인데 5번 읽으려 하기 때문에 EOEF exception이 발생
				mArr[i] = (Member)ois.readObject();
				System.out.println(mArr[i] + ": one mar :");
			}
			
			
//			Member[] m = (Member[])ois.readObject(); // 이런식으로 받는건 왜 안되는건가
//			System.out.println(m[1]);
			
//			for(Member m : mArr) { // 향상된 for문, for each문
//				System.out.println(m); //레퍼런스 변수 m은 주소값이지만, Member클래스에 toString을 오버라이딩해서 오버라이딩이 인쇄된다.
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
