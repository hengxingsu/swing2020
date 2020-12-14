package java201214;

public class java2 {

	public static void main(String[] args) {
		// 奇数求和，求下列算式的值: 1+3+5+7+....+2147483647=?
		
		long sum=0;
		for(long i=1;i<=2147483647;i++){
			if (i%2!=0) {
				sum=sum+i;
			}		    
		}	
		System.out.println("奇数和的值为："+sum);	

	}

}
