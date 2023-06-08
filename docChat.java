package StudentManagement;

//import static hossam.docToStudentmsg.main2;
import static StudentManagement.showMessages.anything;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;


public class docChat extends javax.swing.JFrame {

    public docChat() {
        initComponents();
        this.setResizable(false);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.getContentPane().setBackground(new Color(50, 80, 150));
        this.setVisible(true);
//                 main1();       

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        docmsg = new javax.swing.JTextField();
        send = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        s_id = new javax.swing.JTextField();
        view = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        selectDoc = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\blue_re-pict-house-base.png_32.png")); // NOI18N
        jLabel5.setText("Home");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setIconTextGap(3);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        docmsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docmsgActionPerformed(evt);
            }
        });

        send.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StudentManagement/Images/submit.png"))); // NOI18N
        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel1.setText("Student ID");

        s_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_idActionPerformed(evt);
            }
        });

        view.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        view.setText("Read Messages");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel3.setText("Select the Doctor you want to contact with");

        selectDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr.Hatem", "Dr.Eman", "Dr.Ahmed sakr", "Dr.Hamdy", "Dr.Anas AbdElaziz", "Dr.Ashraf Elsisi" }));
        selectDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDocActionPerformed(evt);
            }
        });

        textArea2.setBackground(new java.awt.Color(100, 130, 180));
        textArea2.setColumns(20);
        textArea2.setFont(new java.awt.Font("Myanmar Text", 1, 16)); // NOI18N
        textArea2.setForeground(new java.awt.Color(255, 255, 255));
        textArea2.setRows(5);
        textArea2.setFocusable(false);
        jScrollPane2.setViewportView(textArea2);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        jLabel2.setText("Contact Easily with your Doctor");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("Enter your Messege");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(s_id, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(selectDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(docmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(view, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(send, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(8, 8, 8))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1019, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void docmsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docmsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docmsgActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed

        connection();
        connectiontwo();
    }//GEN-LAST:event_sendActionPerformed

    private void s_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s_idActionPerformed
    public static String url = "jdbc:mysql://localhost:3306/test";
    String password = "";
    String userName = "root";
    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
            // TODO add your handling code here:
            
connectiontwo();
        

    }//GEN-LAST:event_viewActionPerformed

    private void selectDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectDocActionPerformed



    }//GEN-LAST:event_selectDocActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        MainMenu menu = new MainMenu();
        this.setVisible(false);
        menu.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    public static void main(String args[]) {
//        new docChat();

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(docChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(docChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(docChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(docChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
//        </editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new docChat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField docmsg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField s_id;
    private javax.swing.JComboBox<String> selectDoc;
    private javax.swing.JButton send;
    private javax.swing.JTextArea textArea2;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables

    String data;
    static int id = 100;
    int r_id;

    public void connection() {
        try {
            if (null != selectDoc.getItemAt(selectDoc.getSelectedIndex())) {
                switch (selectDoc.getItemAt(selectDoc.getSelectedIndex())) {
                    case "Dr.Hatem":
                        r_id = 2000;
                        break;
                    case "Dr.Ahmed sakr":
                        r_id = 2001;
                        break;
                    case "Dr.Hamdy":
                        r_id = 2002;
                        break;
                    case "Dr.Anas AbdElaziz":
                        r_id = 2003;
                        break;
                    case "Dr.Ashraf Elsisi":
                        r_id = 2004;
                        break;
                    case "Dr.Eman":
                        r_id = 2005;
                        break;
                    default:
                        break;
                }
            }

            data = docmsg.getText();
            Connection c = DriverManager.getConnection(url, userName, password);
            String sql = "insert into message(id,message,s_id,r_id) values('" + ++id + "','" + data + "','" + s_id.getText() + "','" + r_id + "') ";
            Statement s = c.createStatement();
            s.executeUpdate(sql);

//            s_id.setText("");
            System.out.println(selectDoc.getItemAt(selectDoc.getSelectedIndex()));
            docmsg.setText("");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void connection3() {
        try {
            if (null != selectDoc.getItemAt(selectDoc.getSelectedIndex())) {
                switch (selectDoc.getItemAt(selectDoc.getSelectedIndex())) {
                    case "Dr.Hatem":
                        r_id = 2000;
                        break;
                    case "Dr.Ahmed sakr":
                        r_id = 2001;
                        break;
                    case "Dr.Hamdy":
                        r_id = 2002;
                        break;
                    case "Dr.Anas AbdElaziz":
                        r_id = 2003;
                        break;
                    case "Dr.Ashraf Elsisi":
                        r_id = 2004;
                        break;
                    case "Dr.Eman":
                        r_id = 2005;
                        break;
                    default:
                        break;
                }
            }
            Connection c = DriverManager.getConnection(url, userName, password);
            String sql = "select message from message where'" + +r_id + "' ";
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            while (r.next()) {
            }
//            new docToStudentmsg();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    public void receieverDocmsg() throws SQLException {
        if (null != selectDoc.getItemAt(selectDoc.getSelectedIndex())) {
            switch (selectDoc.getItemAt(selectDoc.getSelectedIndex())) {
                case "Dr.Hatem":
                    r_id = 2000;
                    break;
                case "Dr.Ahmed sakr":
                    r_id = 2001;
                    break;
                case "Dr.Hamdy":
                    r_id = 2002;
                    break;
                case "Dr.Anas AbdElaziz":
                    r_id = 2003;
                    break;
                case "Dr.Ashraf Elsisi":
                    r_id = 2004;
                    break;
                case "Dr.Eman":
                    r_id = 2005;
                    break;
                default:
                    break;
            }
        }
        String sql = "select * from message where s_id='" + r_id + "'";
        try {
            Connection c = DriverManager.getConnection(url, userName, password);
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);

            textArea2.setText("");
            while (r.next()) {
                String message = r.getString("message");
                textArea2.setText(textArea2.getText() + "\nDoc : " + message);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    public void connectiontwo() {
                    switch (selectDoc.getItemAt(selectDoc.getSelectedIndex())) {
                case "Dr.Hatem":
                    r_id = 2000;
                    break;
                case "Dr.Ahmed sakr":
                    r_id = 2001;
                    break;
                case "Dr.Hamdy":
                    r_id = 2002;
                    break;
                case "Dr.Anas AbdElaziz":
                    r_id = 2003;
                    break;
                case "Dr.Ashraf Elsisi":
                    r_id = 2004;
                    break;
                case "Dr.Eman":
                    r_id = 2005;
                    break;
                default:
                    break;
            }
        String sql2 = "SELECT * FROM `message` WHERE (s_id = '"+r_id+"' AND r_id = '"+s_id.getText()+"') OR s_id = '"+s_id.getText()+"' AND r_id = '"+r_id+"'";
        try {
            Connection c = DriverManager.getConnection(url, userName, password);
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql2);
            textArea2.setText("");
            while (r.next()) {
                String message = r.getString("message");
//                if(r.getString("s_id").equals(s_id.getText())){
                if(r.getString("s_id").equals(s_id.getText())){
                textArea2.setText(textArea2.getText() + "\n You : " + message);
                }else{
                textArea2.setText(textArea2.getText() + "\n "+selectDoc.getItemAt(selectDoc.getSelectedIndex())+" : " + message);
                
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
