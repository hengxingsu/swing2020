import java.util.Scanner;

public class App {
    int fib(int n) {//递归
                 if (n <=2) return 1;//数列前两个返回1，无规律可寻。
                 return (fib(n -1) +fib(n - 2));//从第三个开始，则是前面两个数字的和。
             }
      public static void main(String[] args) {
          App f=new App();
                 /*控制控制台，输入一个数字，显示相应数字的个数*/
                 Scanner sc=new Scanner(System.in);
                 System.out.println("请输入一个数字：");
                 int i= sc.nextInt();
                 for(int j=i;j<=i;j++) {
                         System.out.print(f.fib(j)+" ");
                     }
             }
 }
