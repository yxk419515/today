package com.ye.http;

public class Demo1 {
	/*
	 * 阶乘计算
	 */
	public void mul(int x){
	 
	int y=1;
	for(int i=1; i<=x ;i++ ){
		y=y*i;
	 
	 
	}
	System.out.println(y);
	
}
	public static void main(String[] args){
		
		Demo1 a =new Demo1();
		a.mul(4);

	}
	

      
}
