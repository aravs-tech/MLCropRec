package smart;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;
import smart.loginScreen.1;
import smart.loginScreen.2;
import smart.loginScreen.3;

public class loginScreen extends JFrame {
   private JTextField emailtxt;
   private JButton jButton1;
   private JLabel jLabel1;
   private JLabel jLabel2;
   private JPanel jPanel1;
   private JPasswordField passwordtxt;

   public loginScreen() {
      this.initComponents();
   }

   private void initComponents() {
      this.jPanel1 = new JPanel();
      this.jLabel1 = new JLabel();
      this.jLabel2 = new JLabel();
      this.emailtxt = new JTextField();
      this.passwordtxt = new JPasswordField();
      this.jButton1 = new JButton();
      this.setDefaultCloseOperation(3);
      this.jPanel1.setBackground(new Color(255, 255, 255));
      this.jLabel1.setFont(new Font("Helvetica Neue", 1, 24));
      this.jLabel1.setText("Welcome!");
      this.jLabel2.setFont(new Font("Helvetica Neue", 0, 14));
      this.jLabel2.setText("Log in to your account to continue");
      this.emailtxt.setText("Email");
      this.emailtxt.addActionListener(new 1(this));
      this.passwordtxt.setText("jPasswordField1");
      this.jButton1.setBackground(new Color(0, 0, 0));
      this.jButton1.setForeground(new Color(255, 255, 255));
      this.jButton1.setText("Log In");
      this.jButton1.addActionListener(new 2(this));
      GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
      this.jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(126, 32767).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.jLabel1).addGap(175, 175, 175)).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.jLabel2).addGap(125, 125, 125)))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(64, 64, 64).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.emailtxt).addComponent(this.passwordtxt, -1, 321, 32767))).addGroup(jPanel1Layout.createSequentialGroup().addGap(147, 147, 147).addComponent(this.jButton1, -2, 149, -2))).addGap(0, 0, 32767)));
      jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(12, 12, 12).addComponent(this.jLabel1).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jLabel2).addGap(29, 29, 29).addComponent(this.emailtxt, -2, -1, -2).addGap(18, 18, 18).addComponent(this.passwordtxt, -2, -1, -2).addGap(26, 26, 26).addComponent(this.jButton1, -2, 31, -2).addContainerGap(84, 32767)));
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
      this.pack();
   }

   private void emailtxtActionPerformed(ActionEvent evt) {
   }

   private void jButton1ActionPerformed(ActionEvent evt) {
      Connection connection = null;
      Statement stm = null;
      ResultSet rs = null;

      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/farm", "root", "Positiv9");
         String email = this.emailtxt.getText();
         String password = new String(this.passwordtxt.getPassword());
         stm = connection.createStatement();
         String sql = "SELECT * FROM farmers WHERE email='" + email + "' AND password='" + password + "'";
         rs = stm.executeQuery(sql);
         if (rs.next()) {
            ss hpage = new ss();
            hpage.show();
            this.dispose();
         } else {
            JOptionPane.showMessageDialog(this, "Email or password wrong");
            this.emailtxt.setText("");
            this.passwordtxt.setText("");
         }
      } catch (SQLException | ClassNotFoundException var9) {
         Logger.getLogger(loginScreen.class.getName()).log(Level.SEVERE, (String)null, var9);
      }

   }

   public static void main(String[] args) {
      try {
         LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            LookAndFeelInfo info = var1[var3];
            if ("Nimbus".equals(info.getName())) {
               UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException var5) {
         Logger.getLogger(loginScreen.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(loginScreen.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(loginScreen.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(loginScreen.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(new 3());
   }
}
