import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    //创建List集合
    List<JLabel> label_list=new ArrayList<>();
    //创建二位数组
    int array2d[][]={
            {1,2,3},
            {4,5,6},
    };
    //定义cnt初始值为0
    int cnt=0;
    int cell=128;
    //构造方法
    public App() {
        for (int i = 0; i <=6; i++) {
            //添加新的JLable标签组件
            label_list.add(new JLabel());
            //引用图片，将int变量i转换成字符串
            java.net.URL imgURL = App.class.getResource("img/nezha_"+String.valueOf(i)+".png");
            label_list.get(i).setIcon(new ImageIcon(imgURL));
        }
//          双重for循环，可以设置x，y坐标，还可以添加mypanel元素。
        for (int row = 0; row < array2d.length; row++) {
            for (int column = 0; column < array2d[0].length; column++) {
                label_list.get(cnt).setBounds(column*cell,row*cell,cell,cell);
                myPanel.add(label_list.get(cnt));
                cnt++;
            }
        }



    }
    //显示窗体方法
    void go(){
        label_txt.setText("这是一个Label标签。");
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,384,512);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
