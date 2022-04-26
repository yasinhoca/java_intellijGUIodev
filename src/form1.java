import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class form1 extends JFrame {
    private JButton button1;
    private JButton button2;
    private JPanel panel;

    form1(){
        add(panel);
        setSize(500,500);
        setTitle("Sınav kağıdı");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form2 f2 = new form2();
                f2.setVisible(true);
            }
        });
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                Random r = new Random();
                int x,y,w,h;
                w=button2.getBounds().width;
                h=button2.getBounds().height;
                x=r.nextInt(500-w);
                y=r.nextInt(500-h);
                button2.setBounds(x,y,w,h);
            }
        });
    }

}
