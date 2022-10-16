import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyJFrame extends JFrame{
    private JPanel contentPane;
    String front="";//使用者輸入以字串合併
    double fr=0;//轉成數字做運算
    String behind="";//乘除加減數，以字串合併
    double be=0;//轉成數字運算
    double answer=0;//fr與be做運算
    boolean cal=false;//判斷前面數字是否輸入，若否則應該先輸入前面才可以做後續運算
    String calculate="";//判斷運算子

    MyJFrame(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//按下X結束
        setTitle("Calculator");
        setVisible(true);//視窗可見
        setBounds(0,0,300,400);//x,y視窗左上角座標，設定視窗大小

        contentPane=new JPanel();
        contentPane.setLayout(new GridLayout(5,5,0,0));
        setContentPane(contentPane);//設定容器
        JButton btn1=new JButton("7");
        //btn1.addActionListener(this);
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(cal){//當前面數字輸入完成則輸入後面數字
                    behind=behind+btn1.getText();
                }else{
                    front=front+btn1.getText();
                }
            }
        });
        contentPane.add(btn1);
        JButton btn2=new JButton("8");
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(cal){
                    behind=behind+btn2.getText();
                }else{
                    front=front+btn2.getText();
                }
            }
        });
        contentPane.add(btn2);
        JButton btn3=new JButton("9");
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(cal){
                    behind=behind+btn3.getText();
                }else{
                    front=front+btn3.getText();
                }
            }
        });
        contentPane.add(btn3);
        JButton btn4=new JButton("+");
        btn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(front!=""){
                    fr=Double.parseDouble(front);
                }
                else{
                    fr=0;
                }
                cal=true;
                calculate="add";
            }
        });
        contentPane.add(btn4);
        JButton btn5=new JButton("4");
        btn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(cal){
                    behind=behind+btn5.getText();
                }else{
                    front=front+btn5.getText();
                }
            }
        });
        contentPane.add(btn5);
        JButton btn6=new JButton("5");
        btn6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(cal){
                    behind=behind+btn6.getText();
                }else{
                    front=front+btn6.getText();
                }
            }
        });
        contentPane.add(btn6);

        JButton btn7=new JButton("6");
        btn7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(cal){
                    behind=behind+btn7.getText();
                }else{
                    front=front+btn7.getText();
                }
            }
        });
        contentPane.add(btn7);

        JButton btn8=new JButton("-");
        btn8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(front!=""){
                    fr=Double.parseDouble(front);
                }
                else{
                    fr=0;
                }
                cal=true;
                calculate="minus";
            }
        });
        contentPane.add(btn8);

        JButton btn9=new JButton("1");
        btn9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(cal){
                    behind=behind+btn9.getText();
                }else{
                    front=front+btn9.getText();
                }
            }
        });
        contentPane.add(btn9);

        JButton btn10=new JButton("2");
        btn10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(cal){
                    behind=behind+btn10.getText();
                }else{
                    front=front+btn10.getText();
                }
            }
        });
        contentPane.add(btn10);

        JButton btn11=new JButton("3");
        btn11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(cal){
                    behind=behind+btn11.getText();
                }else{
                    front=front+btn11.getText();
                }
            }
        });
        contentPane.add(btn11);

        JButton btn12=new JButton("*");
        btn12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(front!=""){
                    fr=Double.parseDouble(front);
                }
                else{
                    fr=0;
                }
                cal=true;
                calculate="times";
            }
        });
        contentPane.add(btn12);

        JButton btn13=new JButton(".");
        btn13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(cal){
                    if(behind!=""){
                        behind=behind+btn13.getText();
                    }else{
                        behind="0"+btn13.getText();
                    }
                }else{
                    if(front!=""){
                        front=front+btn13.getText();
                    }
                    else{
                        front="0"+btn13.getText();
                    }
                }
            }
        });
        contentPane.add(btn13);

        JButton btn14=new JButton("0");
        btn14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(cal){
                    behind=behind+btn14.getText();
                }else{
                    front=front+btn14.getText();
                }
            }
        });
        contentPane.add(btn14);

        JButton btn15=new JButton("=");
        btn15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(behind!=""){
                    be=Double.parseDouble(behind);
                }
                else{
                    be=0;
                }
                if(calculate=="add"){
                    answer=fr+be;
                    JOptionPane.showMessageDialog(null,fr+"+"+be+"="+answer);
                }
                else if(calculate=="minus"){
                    answer=fr-be;
                    JOptionPane.showMessageDialog(null,fr+"-"+be+"="+answer);
                }
                else if(calculate=="times"){
                    answer=fr*be;
                    JOptionPane.showMessageDialog(null,fr+"*"+be+"="+answer);
                }
                else if(calculate=="divide"){
                    answer=fr/be;
                    JOptionPane.showMessageDialog(null,fr+"/"+be+"="+answer);
                }
                else{
                    if(front!=""){
                        fr=Double.parseDouble(front);
                    }
                    else{
                        fr=0;
                    }
                    answer=fr;
                    fr=0;
                    JOptionPane.showMessageDialog(null,answer);
                }
                answer=0;
                fr=0;
                cal=false;               
                behind="";
                front="";
                calculate="";
            }
        });
        contentPane.add(btn15);

        JButton btn16=new JButton("/");
        btn16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(front!=""){
                    fr=Double.parseDouble(front);
                }
                else{
                    fr=0;
                }
                cal=true;
                calculate="divide";
                }
        });
        
        contentPane.add(btn16);

        JButton btn17=new JButton("C");
        btn17.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                cal=false;
                front="";
                behind="";
                fr=0;
                be=0;
                answer=0;
                calculate="";
            }
        });
        contentPane.add(btn17);     
    }
}
public class week5_homework_calculator {
    public static void main(String[] agrs) throws Exception{
        MyJFrame f1=new MyJFrame();
    }
}
