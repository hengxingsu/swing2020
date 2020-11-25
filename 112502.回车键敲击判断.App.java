import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    //构造方法
    public App() {
        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode()== KeyEvent.VK_ENTER) {
                    if (textArea_A.getText().equals("公主")){
                        textArea_B.setText("答对啦！\n");
                    }else{
                        textArea_B.append("错误\n");
                    }

                }

            }
        });
    }
    //显示窗体方法
    void go(){
        textArea_A.setText("谁是最漂亮的人！");
        textArea_A.setBounds(100,100,150,130);
        //设置颜色
        textArea_A.setBackground(Color.orange);
        myPanel.add(textArea_A);
        textArea_B.setBounds(100,300,150,130);
        textArea_B.setBackground(Color.orange);
        myPanel.add(textArea_B);
        JFrame frame = new JFrame("键盘敲击swing程序");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
