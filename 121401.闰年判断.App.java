package java201214;

import java.util.Scanner;

public class java121401 {

   
    public static void main(String[] args) {
    	 //用户输入一个int型数字的年份，输出是否为闰年
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入年份:");
          
            while (true){
            	 int year=scanner.nextInt();
                if((year%4==0)&&(year%100!=0)){
                    System.out.println(year+"是闰年");
                }else if((year%400==0)){
                    System.out.println(year+"是闰年");
                }else{
                    System.out.println(year+"不是闰年");
                }
            }


    }
}
