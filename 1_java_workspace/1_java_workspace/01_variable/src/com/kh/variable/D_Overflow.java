package com.kh.variable;

public class D_Overflow {
	public void overflow() {
		byte bNum = 127;
		bNum = (byte)(bNum + 2);
		
		System.out.println("bNum : "+bNum);
	}
}
