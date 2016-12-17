package com.ye.http;

public class Triangular {
	public void tri(int a, int b, int c){
		if (((a*a)+(b*b)==(c*c))||((a*a)+(b*b)==(c*c))||((c*c)+(b*b)==(a*a)))
		 {
//			System.out.println("这是最基本条件");
//		}else 
//		if(a+b>c||a+c>b||c+b>a){
			System.out.println("是一个直角三角形");
		} else
		if((a>0 && b>0 && c>0) && (a+b>c && a+c>b && c+b>a)){
			System.out.println("这只是一个三角形");
		}else{
//			System.out.println("不能构成直角三角形");
		}
	}


	
   public static void main(String[] args){
	   Triangular p = new Triangular();
	   p.tri(3,4,5);
   }   
   
}