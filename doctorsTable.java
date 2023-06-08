package StudentManagement;

//import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.sql.Statement;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class doctorsTable extends javax.swing.JFrame {
    static ServerSocket ss;
    static Socket s;
    static DataInputStream dis;
    static DataOutputStream dout;

    public doctorsTable() {
        initComponents();
        this.setTitle("Doctors");
        this.getContentPane().setBackground((new Color(60, 80, 100)));
        connection();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        msg_send = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(60, 80, 100));

        jButton1.setBackground(new java.awt.Color(20, 40, 60));
        jButton1.setFont(new java.awt.Font("Urdu Typesetting", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        msg_send.setBackground(new java.awt.Color(20, 40, 60));
        msg_send.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        msg_send.setForeground(new java.awt.Color(255, 255, 255));
        msg_send.setText("Contact with one of your Doctors?");
        msg_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msg_sendActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(60, 80, 100));
        jScrollPane2.setBorder(null);

        table.setBackground(new java.awt.Color(60, 80, 100));
        table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        table.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor Name", "Doctor Phone", "Doctor E-mail", "Doctor Subject"
            }
        ));
        table.setAlignmentY(2.0F);
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setGridColor(new java.awt.Color(30, 50, 70));
        table.setRowHeight(25);
        table.setRowMargin(3);
        table.setSelectionBackground(new java.awt.Color(40, 60, 80));
        table.setSurrendersFocusOnKeystroke(true);
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setHeaderValue("Doctor Name");
            table.getColumnModel().getColumn(1).setHeaderValue("Doctor Phone");
            table.getColumnModel().getColumn(2).setHeaderValue("Doctor E-mail");
            table.getColumnModel().getColumn(3).setHeaderValue("Doctor Subject");
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(msg_send, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msg_send, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void msg_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msg_sendActionPerformed
        new docChat();

    }//GEN-LAST:event_msg_sendActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainMenu menu = new MainMenu();
        this.setVisible(false);
        menu.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
 
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctorsTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton msg_send;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
    public static String url = "jdbc:mysql://localhost:3306/test";
    String password = "";
    String userName = "root";

    public void connection() {
        try {
//Class.forName("jdbc:mysql:DriverManager");
            Connection c = DriverManager.getConnection(url, userName, password);
            String sql = "select * from doctors";
            java.sql.Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("doc_name");
                String phone = rs.getString("doc_phone");
                String email = rs.getString("doc_email");
                String subject = rs.getString("doc_sub");
                String row[] = {name, phone, email, subject};
                DefaultTableModel dtbm = (DefaultTableModel) table.getModel();
                dtbm.addRow(row);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


