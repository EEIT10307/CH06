package ch06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class CH06HomeWork {
	/*------------------CH06-1 -------------------- */	
	void starSquare(int width, int height) {

		for (int x = 0; x < height; x++) {

			for (int y = 0; y < width; y++) {

				if (y < width - 1) {
					System.out.print("* ");
				} else {
					System.out.println("*");
				}

			}

		}

	}

	/*------------------CH06-2 -------------------- */		
	long factorial(int n ) {
		 long sum = 1  ; 
		for(int  x = 1 ; x<= n  ;x++) {
			sum *= x  ; 
			
		}
	       
		return sum ; 
		
	}
	
	/*------------------CH06-3 -------------------- */		
	int [] mySort(int[] arrayInt )  {
		
		Arrays.sort(arrayInt);
     return arrayInt ; 		
	}
	
	/*------------------CH06-4 -------------------- */		
	int [] luckyNumber() {
		int [] lot =new  int [6]   ;
		
		for (int x = 0 ; x <6 ; x++) {
			
			lot [x] = (int) ( Math.random()*42 +1 ) ; 
		}
		
		
		return lot ; 
	}
	
/*------------------CH06-5 -------------------- */	
	String [] hw5() {
		
		String [] sum = new String[10000] ; 
        String [] su = new String [10] ; 
		System.out.println("請輸入數字, 如要結算請輸入quit");
		
		tk:for(int y = 0 ;y < 10000; y++) {
		Scanner x = new Scanner(System.in)  ; 		
			String str = x.next() ; 
			
			if(str.equals("quit") ) {
				
			} else {						
			try {
				Integer.parseInt(str) ; 
			} catch (Exception e) {
				System.out.println("輸入非數字字串 請重新輸入");
				y-- ; 
				continue tk ;
			     }
		    }						
			if(str.equals("quit") ) {
				su = Arrays.copyOf(sum, y) ; 
				break tk; 
			} else {
				
				sum[y] = str ; 
				
			}				
		
		}
		int r = 0;
		int [] su2 = new int [su.length] ; 
		for(int x = 0 ; x< su.length ; x++) {
			
		 r += Integer.parseInt(sum[x]) ; 
        su2 [x] =  Integer.parseInt(sum[x]) ; 
		}
		 
		System.out.println("陣列總和"+r);
		
		System.out.println("陣列平均"+r/su.length);
		
		Arrays.sort(su2) ; 
		System.out.println("陣列最小值"+su2[0]);
		System.out.println("陣列最大值"+su2[su2.length-1]);
		
		return sum ; 
	}
	/*------------------CH06-6 -------------------- */		
	
	
	public String toUnicodeString(String s ) {
		
		String str = s ; 
		for(int x = 0 ; x<str.length() ; x++ ) {						
		 int y =str.charAt(x); 
		 String z = Integer.toHexString(y) ; 
		 
		switch(z.length()) {
		case 1 :
			System.out.print("\\u000"+z);
			break ; 
		case 2 :
			System.out.print("\\u00"+z);
			break ;
		case 3 :
			System.out.print("\\u0"+z);
			break ;
		case 4 :
			System.out.print("\\u"+z);
			break ;
		}
		 
		}
		
		return str ; 
	}
	
	/*------------------  以上為方法 -------------------- */	
	
	public static void main(String[] args) {

//		CH06HomeWork HW1 = new CH06HomeWork();
//		HW1.starSquare(20, 10);
		
//		CH06HomeWork HW2 = new CH06HomeWork();
//		System.out.println(HW2.factorial(5)); 
		
//		CH06HomeWork HW3 = new CH06HomeWork();
//		int[] hw3 = {10 , 15 , 9 , 5 , 13} ; 
//		HW3.mySort(hw3) ; 
//		System.out.print("陣列hw3重新排序" );
//		for(int x = 0; x < hw3.length; x++) {
//			System.out.print(hw3[x]+" " );
//		}
		
		
//		CH06HomeWork HW4 = new CH06HomeWork();
//         				
//		int [] a = HW4.luckyNumber() ;			
//      	System.out.println("隨機六個可重複數字");
//      	
//        for(int x = 0; x <a.length; x++) {
//        	
//        	System.out.print(a[x]+" ");
//        	
//        }
		
		
//       
//		CH06HomeWork HW5 = new CH06HomeWork();
//		HW5.hw5() ;
		
		
		CH06HomeWork HW6 = new CH06HomeWork();
		HW6.toUnicodeString("張君雅") ;
	
        
        
        
 		}

	}


