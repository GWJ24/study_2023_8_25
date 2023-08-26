

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//------------主界面测试------------------
public class Demo1 extends JFrame{
    Demo1() {
        Font f = new Font("华文行楷", Font.BOLD, 36);
        //身份选择按钮啊啊啊啊
        JRadioButton btn3=new JRadioButton("学生端");
        JRadioButton btn4=new JRadioButton("教师端");
        JRadioButton btn5=new JRadioButton("管理端");
        JPanel p=new JPanel();
        ButtonGroup pbtns=new ButtonGroup();
        pbtns.add(btn3);
        pbtns.add(btn4);
        pbtns.add(btn5);
        btn3.setFont(f);
        btn4.setFont(f);
        btn5.setFont(f);
        btn3.setBackground(Color.WHITE);
        btn4.setBackground(Color.WHITE);
        btn5.setBackground(Color.WHITE);

        btn3.setBounds(602,181,150,60);
        btn4.setBounds(780,181,150,60);
        btn5.setBounds(950,181,150,60);
        add(btn3);
        add(btn4);
        add(btn5);
        btn3.addActionListener(event->
        {
            System.out.println("选择了学生端");
        });
        btn4.addActionListener(event->
        {
            System.out.println("选择了教师端");
        });
        btn5.addActionListener(event->
        {
            System.out.println("选择了管理端");
        });


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // 使用绝对定位

        // 创建带有背景图片的JLabel
        JLabel backgroundImageLabel = new JLabel(new ImageIcon("Demo/Image1/1.jpg"));
        //获取当前屏幕的尺寸（长、宽的值）
        Toolkit k = Toolkit.getDefaultToolkit();
        Dimension d = k.getScreenSize();
        backgroundImageLabel.setBounds(0, 0, 1250, 705);
        //将当前窗口设置到屏幕正中央进行显示
        setBounds(d.width / 2 - 1250 / 2, d.height / 2 - 705 / 2, 1250, 705);
        backgroundImageLabel.setOpaque(false); // 设置背景透明


        setResizable(false); //阻止用户拖拽改变窗口的大小


        // 创建并设置JTextField的位置
        //用户名输入框配置---------
        JTextField f3 = new JTextField();
        f3.setFont(f);
        f3.setOpaque(false);
        f3.setBounds(791, 267, 1077 - 791 + 2, 317 - 267 + 5);
        add(f3);



        //----密码输入框配置-------
        JTextField f1 = new JTextField();
        f1.setFont(f);
        f1.setOpaque(false);
        f1.setForeground(Color.BLACK);
        f1.setCaretColor(Color.BLACK);
        f1.setBounds(792, 360, 1077 - 791 + 2, 317 - 267 + 5);
        add(f1);


        //验证码输入框配置------------
        Font f4 = new Font("Cambria", Font.BOLD, 36);
        JTextField f2 = new JTextField();
        f2.setFont(f4);
        f2.setBounds(792, 442, 1077 - 791 + 2, 317 - 267 + 5);
        f2.setOpaque(false);
        f2.setForeground(Color.BLACK);
        f2.setCaretColor(Color.BLACK);  //设置光标颜色
        add(f2);

        add( backgroundImageLabel);


        //登录按钮配置
        JButton btn1=new JButton(new ImageIcon("Demo/Image1/2.png"));
        btn1.setBounds(733,528,111,54);
        btn1.addActionListener(event->
        {
            System.out.println("跳转登陆界面");
            Demo2 dd=new Demo2(this);
        });
        add(btn1);
        btn1.setOpaque(false);


        JButton btn2=new JButton(new ImageIcon("Demo/Image1/3.png"));
        btn2.setBounds(926,529,112,54);
        btn2.addActionListener(event->
        {
            System.out.println("跳转注册界面");
        });
        btn2.setOpaque(false);
        add(btn2);
        setVisible(true);
    }
    public static void main(String[] args) {
        Demo1 d=new Demo1();
    }
}
