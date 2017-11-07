import javax.swing.*;
import java.awt.*;
//姓名  10分
public class test_1 extends JFrame {
    private JLabel jlname = new JLabel("資工系劉佳媛");


    private Container cp;

    public test_1(){
        initComp();
    }
    private void initComp(){

        this.setBounds(100,100,300,300);
        cp =this.getContentPane();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jlname.setBounds(100,100,80,30);
this.setLayout(null);
        jlname.setHorizontalAlignment(JLabel.CENTER);
        jlname.setBackground(Color.CYAN);
        jlname.setOpaque(true);
        cp.add(jlname);




    }
}
