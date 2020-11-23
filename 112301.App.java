
import java.util.Scanner;

public class java112301 {

    public static void main(String[] args) {
        System.out.println("请输入数字");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            int x = (int) (Math.random() * 100);
            int y = (int) (Math.random() * 100);
            if (num==1){
                System.out.println("随机坐标为:(" + x + "," + y + ")");
            }else {
                System.out.println("输入数字错误");
            }


        }
    }

}
