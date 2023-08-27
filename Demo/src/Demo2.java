import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Demo2 extends JFrame
{
    Demo2(Demo1 demo1)
    {
        demo1.setVisible(false);
        Font f = new Font("华文行楷", Font.BOLD, 36);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // 使用绝对定位
        //1.绘制背景
        // 创建带有背景图片的JLabel
        JLabel backgroundImageLabel = new JLabel(new ImageIcon("Demo/Image2/new.jpg"));
        //获取当前屏幕的尺寸（长、宽的值）
        Toolkit k = Toolkit.getDefaultToolkit();
        Dimension d = k.getScreenSize();
        backgroundImageLabel.setBounds(0, 0, 1161, 650);
        //将当前窗口设置到屏幕正中央进行显示
        setBounds(d.width / 2 - 1161/ 2, d.height / 2 - 650 / 2, 1161, 650);
        //backgroundImageLabel.setOpaque(false); // 设置背景透明
        add(backgroundImageLabel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1161,680);
        setResizable(false);

        //2.绘制退出按钮
        //得到鼠标的坐标（用于推算对话框应该摆放的坐标）
    /* backgroundImageLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                System.out.println("鼠标点击位置：X=" + x + ", Y=" + y);
            }
        });*/

       JButton exit=new JButton("按钮");
       exit.setBounds(977,515,121,57);
       exit.setOpaque(false);
       exit.addActionListener(event->
       {
           setVisible(false);
           demo1.setVisible(true);
       });
       add(exit);

       //绘制五大功能区域
        JButton btn1=new JButton("按阿牛");
        btn1.setBounds(135,262,272,82);
        btn1.setOpaque(false);
        btn1.addActionListener(event->
        {
            System.out.println("跳转图书管界面");
        });
        add(btn1);

        JButton btn2=new JButton("按钮");
        btn2.setBounds(459,242,219,80);
        btn2.setOpaque(false);
        btn2.addActionListener(event->
        {
            System.out.println("跳转选课界面");
        });
        add(btn2);


        JButton btn3=new JButton("按钮");
        btn3.setBounds(75,396,302,85);
        btn3.setOpaque(false);
        btn3.addActionListener(event->
        {
            System.out.println("跳转学籍管理界面");
        });
        add(btn3);

        JButton btn4=new JButton("阿牛");
        btn4.setOpaque(false);
        btn4.setBounds(519,389,206,73);
        btn4.addActionListener(event->
        {
            System.out.println("跳转宿舍界面");
        });
        add(btn4);




        JButton btn5=new JButton("阿牛");
        btn5.setBounds(258,517,196,86);
        btn5.setOpaque(false);
        btn5.addActionListener(event->
        {
            System.out.println("跳转商店界面");
        });
        add(btn5);
        setVisible(true);


    }
}
