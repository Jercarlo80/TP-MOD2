import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame{

    private JPanel mainPanel;
    private JLabel EnterName;
    private JTextField txtName;
    private JButton btnClick;

    public LoginGUI() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnClick,txtName.getText()+"PRAKTIKUM KONSTRUKSI PERANGKAT LUNAK MOD ");
            }
        });
    }

    public static void main(String[] args) {
        LoginGUI h=new LoginGUI();
        h.setContentPane(h.mainPanel);
        h.setTitle("PRAKTIKUM KONSTRUKSI PERANGKAT LUNAK MOD 2");
        h.setSize(300,440);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
