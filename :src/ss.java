package smart;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import smart.ss.1;
import smart.ss.2;
import smart.ss.3;
import smart.ss.4;

public class ss extends JFrame {
   private JSlider humidity;
   private JButton jButton1;
   private JLabel jLabel1;
   private JLabel jLabel2;
   private JLabel jLabel3;
   private JLabel jLabel4;
   private JLabel jLabel5;
   private JLabel jLabel6;
   private JLabel jLabel7;
   private JLabel jLabel8;
   private JLabel jLabel9;
   private JMenu jMenu1;
   private JMenu jMenu2;
   private JPanel jPanel1;
   private JPanel jPanel2;
   private JPopupMenu jPopupMenu1;
   private JSlider jSlider3;
   private JSlider jSlider4;
   private JSlider k;
   private JSlider n;
   private JSlider p;
   private JSlider ph;
   private JButton qa;
   private JSlider rainfall;
   private JTextField ss;
   private JSlider temp;

   public ss() {
      this.initComponents();
   }

   private void initComponents() {
      this.jMenu1 = new JMenu();
      this.jMenu2 = new JMenu();
      this.jPopupMenu1 = new JPopupMenu();
      this.jSlider4 = new JSlider();
      this.jLabel3 = new JLabel();
      this.jPanel1 = new JPanel();
      this.qa = new JButton();
      this.ss = new JTextField();
      this.n = new JSlider();
      this.jPanel2 = new JPanel();
      this.jLabel1 = new JLabel();
      this.temp = new JSlider();
      this.jSlider3 = new JSlider();
      this.ph = new JSlider();
      this.p = new JSlider();
      this.humidity = new JSlider();
      this.k = new JSlider();
      this.jLabel2 = new JLabel();
      this.jLabel4 = new JLabel();
      this.jLabel5 = new JLabel();
      this.jLabel6 = new JLabel();
      this.jLabel7 = new JLabel();
      this.jLabel8 = new JLabel();
      this.rainfall = new JSlider();
      this.jLabel9 = new JLabel();
      this.jButton1 = new JButton();
      this.jMenu1.setText("jMenu1");
      this.jMenu2.setText("jMenu2");
      this.jLabel3.setFont(new Font("Helvetica Neue", 0, 8));
      this.jLabel3.setText("Nitrogen");
      this.setDefaultCloseOperation(3);
      this.jPanel1.setBackground(new Color(255, 255, 255));
      this.qa.setBackground(new Color(0, 0, 0));
      this.qa.setForeground(new Color(255, 255, 255));
      this.qa.setText("Suggest");
      this.qa.addActionListener(new 1(this));
      this.ss.addActionListener(new 2(this));
      this.n.setBackground(new Color(102, 255, 255));
      this.n.setFont(new Font("Helvetica Neue", 0, 8));
      this.n.setMajorTickSpacing(20);
      this.n.setMaximum(150);
      this.n.setMinorTickSpacing(10);
      this.n.setPaintLabels(true);
      this.n.setPaintTicks(true);
      this.jPanel2.setBackground(new Color(0, 0, 0));
      this.jLabel1.setFont(new Font("Helvetica Neue", 1, 24));
      this.jLabel1.setForeground(new Color(255, 255, 255));
      this.jLabel1.setText("Crop Recommendation");
      GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
      this.jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel1).addGap(150, 150, 150)));
      jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(15, 32767).addComponent(this.jLabel1, -2, 26, -2).addGap(14, 14, 14)));
      this.temp.setFont(new Font("Helvetica Neue", 0, 8));
      this.temp.setMajorTickSpacing(5);
      this.temp.setMaximum(40);
      this.temp.setMinorTickSpacing(2);
      this.temp.setPaintLabels(true);
      this.temp.setPaintTicks(true);
      this.ph.setFont(new Font("Helvetica Neue", 0, 8));
      this.ph.setMajorTickSpacing(1);
      this.ph.setMaximum(8);
      this.ph.setPaintLabels(true);
      this.ph.setPaintTicks(true);
      this.p.setFont(new Font("Helvetica Neue", 0, 8));
      this.p.setMajorTickSpacing(30);
      this.p.setMaximum(150);
      this.p.setMinorTickSpacing(10);
      this.p.setPaintLabels(true);
      this.p.setPaintTicks(true);
      this.humidity.setFont(new Font("Helvetica Neue", 0, 8));
      this.humidity.setMajorTickSpacing(10);
      this.humidity.setMinorTickSpacing(5);
      this.humidity.setPaintLabels(true);
      this.humidity.setPaintTicks(true);
      this.k.setFont(new Font("Helvetica Neue", 0, 8));
      this.k.setMajorTickSpacing(50);
      this.k.setMaximum(250);
      this.k.setMinorTickSpacing(30);
      this.k.setPaintLabels(true);
      this.k.setPaintTicks(true);
      this.jLabel2.setFont(new Font("Helvetica Neue", 0, 8));
      this.jLabel2.setText("Temperature");
      this.jLabel4.setFont(new Font("Helvetica Neue", 0, 8));
      this.jLabel4.setText("Nitrogen");
      this.jLabel5.setFont(new Font("Helvetica Neue", 0, 8));
      this.jLabel5.setText("Phosporus");
      this.jLabel6.setFont(new Font("Helvetica Neue", 0, 8));
      this.jLabel6.setText("Potassium");
      this.jLabel7.setFont(new Font("Helvetica Neue", 0, 8));
      this.jLabel7.setText("pH level");
      this.jLabel8.setFont(new Font("Helvetica Neue", 0, 8));
      this.jLabel8.setText("Humidity");
      this.rainfall.setFont(new Font("Helvetica Neue", 0, 8));
      this.rainfall.setMajorTickSpacing(50);
      this.rainfall.setMaximum(300);
      this.rainfall.setMinorTickSpacing(20);
      this.rainfall.setPaintLabels(true);
      this.rainfall.setPaintTicks(true);
      this.jLabel9.setFont(new Font("Helvetica Neue", 0, 8));
      this.jLabel9.setText("Rainfall (mm)");
      this.jButton1.setBackground(new Color(0, 0, 0));
      this.jButton1.setForeground(new Color(255, 255, 255));
      this.jButton1.setText("Show Details");
      this.jButton1.addActionListener(new 3(this));
      GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
      this.jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(199, 199, 199).addComponent(this.rainfall, -2, 163, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(207, 207, 207).addComponent(this.jLabel9))).addContainerGap(-1, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(49, 49, 49).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(8, 8, 8).addComponent(this.jLabel4).addGap(233, 233, 233).addComponent(this.jLabel2)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.n, -2, 163, -2).addGroup(jPanel1Layout.createSequentialGroup().addGap(6, 6, 6).addComponent(this.jLabel5))).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(100, 100, 100).addComponent(this.temp, -2, 163, -2)).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jLabel7).addGap(125, 125, 125)))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jSlider3, -2, 163, -2).addComponent(this.p, -2, 163, -2).addComponent(this.k, -2, 163, -2).addGroup(jPanel1Layout.createSequentialGroup().addGap(6, 6, 6).addComponent(this.jLabel6))).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(100, 100, 100).addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING).addComponent(this.ph, -2, 163, -2).addComponent(this.humidity, -2, 163, -2))).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jLabel8).addGap(122, 122, 122)))))).addGroup(jPanel1Layout.createSequentialGroup().addGap(86, 86, 86).addComponent(this.qa).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.ss, -2, 198, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 114, -2))).addGap(0, 52, 32767)));
      jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel2, -2, -1, -2).addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(this.jSlider3, -2, -1, -2))).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING).addComponent(this.jLabel4, -2, 19, -2).addComponent(this.jLabel2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.n, -2, -1, -2).addComponent(this.temp, -2, -1, -2)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel7).addComponent(this.jLabel5)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.p, -2, -1, -2).addComponent(this.ph, -2, -1, -2)).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel6).addPreferredGap(ComponentPlacement.RELATED)).addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(this.jLabel8).addPreferredGap(ComponentPlacement.RELATED, -1, 32767))).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.k, -2, -1, -2).addComponent(this.humidity, -2, -1, -2)).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jLabel9).addGap(5, 5, 5).addComponent(this.rainfall, -2, -1, -2).addGap(31, 31, 31).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.ss, -2, -1, -2).addComponent(this.qa).addComponent(this.jButton1)).addContainerGap()));
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -2, -1, -2));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, Alignment.TRAILING, -1, -1, 32767));
      this.pack();
   }

   private void qaActionPerformed(ActionEvent evt) {
      try {
         int nitrogen = this.n.getValue();
         int phosporus = this.p.getValue();
         int potassium = this.k.getValue();
         int temperature = this.temp.getValue();
         int pH = this.ph.getValue();
         int humi = this.humidity.getValue();
         int rain = this.rainfall.getValue();
         String apiUrl = "http://localhost:5000/predict";
         URL url = new URL(apiUrl);
         HttpURLConnection conn = (HttpURLConnection)url.openConnection();
         conn.setRequestMethod("POST");
         conn.setRequestProperty("Content-Type", "application/json; utf-8");
         conn.setDoOutput(true);
         String jsonInputString = "{\"features\":[" + nitrogen + "," + phosporus + "," + potassium + "," + temperature + "," + pH + "," + humi + "," + rain + "]}";
         OutputStream os = conn.getOutputStream();

         try {
            byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
            os.write(input, 0, input.length);
         } catch (Throwable var21) {
            if (os != null) {
               try {
                  os.close();
               } catch (Throwable var20) {
                  var21.addSuppressed(var20);
               }
            }

            throw var21;
         }

         if (os != null) {
            os.close();
         }

         int responseCode = conn.getResponseCode();
         System.out.println("POST Response Code :: " + responseCode);
         if (responseCode == 200) {
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
            StringBuilder response = new StringBuilder();

            String line;
            while((line = in.readLine()) != null) {
               response.append(line);
            }

            in.close();
            JSONParser parser = new JSONParser();
            JSONObject jsonResponse = (JSONObject)parser.parse(response.toString());
            String predictedCrop = (String)jsonResponse.get("predicted_crop");
            this.ss.setText(predictedCrop);
         } else {
            this.ss.setText("POST request failed.");
         }
      } catch (Exception var22) {
         var22.printStackTrace();
      }

   }

   private void ssActionPerformed(ActionEvent evt) {
   }

   private void jButton1ActionPerformed(ActionEvent evt) {
      if (this.ss.getText().equalsIgnoreCase("rice")) {
         Rice hpage = new Rice();
         hpage.show();
      } else if (this.ss.getText().equalsIgnoreCase("maize")) {
         Maize hpage = new Maize();
         hpage.show();
      } else if (this.ss.getText().equalsIgnoreCase("chickpea")) {
         Chickpeas hpage = new Chickpeas();
         hpage.show();
      } else if (this.ss.getText().equalsIgnoreCase("kidneybeans")) {
         KidneyBeans hpage = new KidneyBeans();
         hpage.show();
      } else if (this.ss.getText().equalsIgnoreCase("pigeonpeas")) {
         Pigeonpeas hpage = new Pigeonpeas();
         hpage.show();
      } else if (this.ss.getText().equalsIgnoreCase("mothbeans")) {
         MothBeans hpage = new MothBeans();
         hpage.show();
      } else if (this.ss.getText().equalsIgnoreCase("mungbean")) {
         Mungbeans hpage = new Mungbeans();
         hpage.show();
      } else if (this.ss.getText().equalsIgnoreCase("blackgram")) {
         Blackgram hpage = new Blackgram();
         hpage.show();
      } else if (this.ss.getText().equalsIgnoreCase("lentil")) {
         Lentils hpage = new Lentils();
         hpage.show();
      } else if (this.ss.getText().equalsIgnoreCase("pomegranate")) {
         Pomegranate hpage = new Pomegranate();
         hpage.show();
      } else if (this.ss.getText().equalsIgnoreCase("banana")) {
         Bananas hpage = new Bananas();
         hpage.show();
      } else if (this.ss.getText().equalsIgnoreCase("mango")) {
         Mango hpage = new Mango();
         hpage.show();
      } else if (this.ss.getText().equalsIgnoreCase("grapes")) {
         Grapes hpage = new Grapes();
         hpage.show();
      } else if (this.ss.getText().equalsIgnoreCase("watermelon")) {
         Watermelon hpage = new Watermelon();
         hpage.show();
      } else if (this.ss.getText().equalsIgnoreCase("muskmelon")) {
         Muskmelon hpage = new Muskmelon();
         hpage.show();
      } else {
         Apples hpage;
         if (this.ss.getText().equalsIgnoreCase("apple")) {
            hpage = new Apples();
            hpage.show();
         } else if (this.ss.getText().equalsIgnoreCase("apple")) {
            hpage = new Apples();
            hpage.show();
         } else if (this.ss.getText().equalsIgnoreCase("orange")) {
            Oranges hpage = new Oranges();
            hpage.show();
         } else if (this.ss.getText().equalsIgnoreCase("papaya")) {
            Papaya hpage = new Papaya();
            hpage.show();
         } else if (this.ss.getText().equalsIgnoreCase("coconut")) {
            Coconut hpage = new Coconut();
            hpage.show();
         } else if (this.ss.getText().equalsIgnoreCase("cotton")) {
            Cotton hpage = new Cotton();
            hpage.show();
         } else if (this.ss.getText().equalsIgnoreCase("jute")) {
            Jute hpage = new Jute();
            hpage.show();
         } else if (this.ss.getText().equalsIgnoreCase("coffee")) {
            CoffeeBeans hpage = new CoffeeBeans();
            hpage.show();
         }
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
         Logger.getLogger(ss.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(ss.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(ss.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(ss.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(new 4());
   }
}
