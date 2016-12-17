package com.ye.http;

public class Demo2 {
	/*
	 *九九乘法表
	 */
//	调入入口
public static void main(String[] args) {
//	for条件及方法
	 for (int i = 1; i <= 9; i++) {
		for (int j =1; j <=i; j++){
			int sub = j * i;
//			输出
			System.out.print(j + "*" + i + "=" + sub + "\t");
		}
//		在外排列输出
		System.out.println();
	}
}
}