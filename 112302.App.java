public class java112301 {

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Thread.sleep(1000);
            int x = (int) (Math.random() * 100);
            int y = (int) (Math.random() * 100);
            System.out.println("随机坐标为:(" + x + "," + y + ")");

        }
    }

}
