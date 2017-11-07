import javax.swing.*;
import java.awt.*;

public class test_1 extends JFrame {
    private JLabel jlname = new JLabel("資工系劉佳媛");
    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    private int frmW = 300, frmH = 150, screenW, screenH;
    private Container cp;

    public test_1(){
        initComp();
    }
    private void initComp(){
        screenW = dim.width;
        screenH = dim.height;
        this.setBounds(screenW/2-frmW/2,screenH/2-frmH/2,frmW,frmH);
        cp =this.getContentPane();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jlname.setHorizontalAlignment(JLabel.CENTER);
        jlname.setBackground(Color.CYAN);
        jlname.setOpaque(true);
        cp.add(jlname);




    }
}
