
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Programmer PC
 */
public class start extends javax.swing.JFrame {

    /**
     * Creates new form start
     */
    PreparedStatement pst;
    ResultSet rs;
    Connection conn;
    Timer t;
    public start() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(null);
        conn=Database.Connect();
        p2.hide();
        load();
        timer();
        icon();
    }
    private void icon(){
        try {
            this.setIconImage(ImageIO.read(new File("C:\\Program Files (x86)\\S K Enterprise\\Software\\Shop\\Sk Shop Software\\icon.JPG")));
        } catch (IOException ex) {
            Logger.getLogger(Change_password.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void check(){
        if(bar.getValue()==100){
            p2.setVisible(true);
        }
    }
    private void timer(){
        Delay.delay(2);
        t=new Timer(200,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                bar.setValue(bar.getValue()+1);
                check();
            }
        });
        t.start();
    }
    private void load(){
        try {
            Image img=ImageIO.read(getClass().getResource("/Images/sk_enterprise.jpg"));
            img=img.getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH);
            image.setIcon(new ImageIcon(img));
            Image II=ImageIO.read(getClass().getResource("/Images/login.jpg"));
            II=II.getScaledInstance(imgi.getWidth(), imgi.getHeight(), Image.SCALE_SMOOTH);
            imgi.setIcon(new ImageIcon(II));
        } catch (IOException ex) {
            Logger.getLogger(start.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        imgi = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bar = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 44, 539, 242));

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Username");
        p2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 34, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Password");
        p2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 69, -1, -1));
        p2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 33, 231, -1));
        p2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 69, 231, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        p2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 110, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        p2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 110, -1));
        p2.add(imgi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 130, 120));

        jPanel1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 550, 160));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Loading ......");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 324, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Made By : Hrishav Dhawaj Purkayastha");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 478, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        username.setText(null);
        password.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String sql="select * from user where username='"+username.getText()+"' and password='"+password.getText()+"'";
        try{
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                this.dispose();
                new main().setVisible(true);
            }
            else
                JOptionPane.showMessageDialog(null, "No Such User Found");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private static String getLookAndFeel(){
        String sql="select * from look_and_feel";
        Connection conn=Database.Connect();
        PreparedStatement pst;
        ResultSet rs;
        try{
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                return rs.getString("laf").toString();
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
        return null;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (getLookAndFeel().equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar;
    private javax.swing.JLabel image;
    private javax.swing.JLabel imgi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel p2;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
