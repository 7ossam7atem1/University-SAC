package StudentManagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame implements ActionListener {

    public static String idTxt;

    JComboBox comboBox;
    JButton login;
    JTextField id;
    JPasswordField passwordF;
    public static String url = "jdbc:mysql://localhost:3306/test";
    String password = "";
    String userName = "root";
    String sql = "select * from student";
    JLabel mainImage = new JLabel();
    JButton cancel;//...................
    JLabel error = new JLabel();

    public void connection() {
        try {
            Connection c = DriverManager.getConnection(url, userName, password);
            Statement s = c.createStatement();
            ResultSet R = s.executeQuery(sql);
//            int i = 0;
            while (R.next()) {
//                i++;
                if (R.getString("id").toString().equals(id.getText())) {
                    if (R.getString("password").toString().equals(passwordF.getText())) {
                        JOptionPane.showMessageDialog(null, "logged in successfully");
                        this.dispose();
                        MainMenu menu = new MainMenu();
                        menu.setVisible(true);
//                        new showMessages();
                        if (comboBox.getItemAt(comboBox.getSelectedIndex()) == "Doctor") {
                            showMessages.anything();
                        }
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "this password isn't correct");
                        break;
                    }

                }
            }
            if (R.next() == false) {
                JOptionPane.showMessageDialog(null, "this user doesn't exist");

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    login() {
        this.setSize(600,500);//...........
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    ImageIcon backGround = new ImageIcon("login.png");
//          ImageIcon  backGround= new ImageIcon(new ImageIcon("login.png").getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH));  //CCCC
////    this.setIconImage(backGround.getImage());
//        mainImage.setIcon(backGround);
//        mainImage.setBounds(100, 0, 400,200 );
//this.setBackground(new ImageIcon("login.png").getImage());
        this.getContentPane().setBackground(new Color(60, 80, 100));
        this.setLayout(null);
        this.add(mainImage);
        this.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("image1.jpg");
        this.setIconImage(icon.getImage());
//        this.setBackground(new Color(60, 80, 100));
        JLabel idLbl = new JLabel("id");
        JLabel passwordLbl = new JLabel("password");
        JLabel loginAsLbl = new JLabel("Login As");
        login = new JButton("login");

        id = new JTextField();
        passwordF = new JPasswordField();//............
        id.setBounds(200, 200, 300, 40);//..........

        idLbl.setBounds(50, 200, 300, 40);//.........
        loginAsLbl.setBounds(50, 300, 300, 40);//.........
        idLbl.setFont(new Font(Font.MONOSPACED, Font.BOLD, 19));//...............
        passwordLbl.setFont(new Font(Font.MONOSPACED, Font.BOLD, 19));//.........
        loginAsLbl.setFont(new Font(Font.MONOSPACED, Font.BOLD, 19));//.........
        passwordLbl.setBounds(50, 250, 300, 40);//................
        passwordLbl.setForeground(Color.WHITE);
        loginAsLbl.setForeground(Color.WHITE);
        idLbl.setForeground(Color.WHITE);
        passwordF.setBounds(200, 250, 300, 40);//............
        String members[] = {"Doctor", "Student"};
        comboBox = new JComboBox(members);
        comboBox.setBounds(200, 300, 300, 30);//............
        this.add(comboBox);
        login.setBounds(200, 360, 130, 50);//......................
        login.addActionListener(this);
        error.setBounds(80, 320, 450, 50);
        error.setFont(new Font(Font.MONOSPACED, Font.BOLD, 16));//.........
        error.setForeground(Color.white);
        ImageIcon panner = new ImageIcon("AddStudent.png");
        JLabel label = new JLabel();
        label.setIcon(panner);
        label.setBounds(250, 40, 200, 150);
        this.add(label);
        ImageIcon loginImage = new ImageIcon("login1.png");
        login.setIcon(loginImage);
        cancel = new JButton("cancel");
        ImageIcon cancelImage = new ImageIcon("cancel1.png");
        cancel.setBounds(370, 360, 130, 50);
        cancel.addActionListener(this);
        cancel.setFont(new Font(Font.MONOSPACED, Font.BOLD, 17));//.........
        login.setFont(new Font(Font.MONOSPACED, Font.BOLD, 17));//.........
        cancel.setIcon(cancelImage);

        this.add(cancel);//..........
        this.add(error);//.........
        this.setTitle("Login");//............

        this.add(idLbl);
        this.add(passwordLbl);
        this.add(passwordF);
        this.add(id);
        this.add(login);
        this.add(loginAsLbl);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new login();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            this.idTxt = id.getText();
            if ("".equals(id.getText()) && "".equals(passwordF.getText())) {
                error.setText("plesse enter the user id and the password");
            } else if (passwordF.getText().equals("")) {
                error.setText("please enter a password");
            } else if (id.getText().equals("")) {
                error.setText("please enter your user name");
            } else if (!"".equals(id.getText()) && !"".equals(passwordF.getText())) {
                connection();
                error.setText("");
                passwordF.setText("");
                id.setText("");

            }
        }
        if (e.getSource() == cancel) {
            System.exit(0);
        }
    }

    static class idTxt {

        public String idTxt() {
            return idTxt;
        }
    }
}
