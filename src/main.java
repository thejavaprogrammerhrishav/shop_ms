
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        this.setIconImage(null);
        load();
        set_Image();
        set_date_time();  
        tab.hide();
        icon();
    }
    private void icon(){
        try {
            this.setIconImage(ImageIO.read(new File("C:\\Program Files (x86)\\S K Enterprise\\Software\\Shop\\Sk Shop Software\\icon.JPG")));
        } catch (IOException ex) {
            Logger.getLogger(Change_password.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void set_date_time(){
        date.setText(new SimpleDateFormat("EEEE, dd MMMMM yyyy").format(new Date()));
        new Timer(1, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=DateFormat.getTimeInstance().format(new Date()); 
                time.setText(s);
            }
        }).start();
    }
    private void load(){
        try {
            Image img=ImageIO.read(getClass().getResource("/Images/sk.jpg"));
            img=img.getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH);
            image.setIcon(new ImageIcon(img));
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void set_Image(){
        Image_Load.load_image("/Images/home.jpg", home);
        Image_Load.load_image("/Images/purchase.png", purchase);
        Image_Load.load_image("/Images/payment.png", payment);
        Image_Load.load_image("/Images/voucher.jpg", voucher);
        Image_Load.load_image("/Images/stock.jpg", stock);
        Image_Load.load_image("/Images/pd.jpg", pd);
        Image_Load.load_image("/Images/supplier.jpg", supplier);
        Image_Load.load_image("/Images/customer.jpg", customer);
        Image_Load.load_image("/Images/account.jpg", account);
        Image_Load.load_image("/Images/estimate.jpg", estimate);
        Image_Load.load_image("/Images/close.jpg", close);
        Image_Load.load_image("/Images/users.jpg", users);
        Image_Load.load_image("/Images/cp.jpg", cp);
        Image_Load.load_image("/Images/sb.jpg", sb);
        Image_Load.load_image("/Images/invoice.png", invoice);
        Image_Load.load_image("/Images/summary.jpg", summary);
        Image_Load.load_image("/Images/monthly.jpg", monthly);
        Image_Load.load_image("/Images/db.jpg", db);
        Image_Load.load_image("/Images/laf.jpg", laf);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paan = new javax.swing.JPanel();
        tab = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        purchase = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        payment = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        voucher = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        stock = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        pd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        supplier = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        customer = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        account = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        estimate = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        close = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        sb = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        invoice = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        summary = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        monthly = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        db = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        users = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        cp = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        laf = new javax.swing.JButton();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        image = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paan.setBackground(new java.awt.Color(255, 255, 255));
        paan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        paan.add(tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1370, 560));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Home");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 60, -1));

        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel2.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 60));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 6, 5, 110));

        purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseActionPerformed(evt);
            }
        });
        jPanel2.add(purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 60, 60));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Purchase");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 60, -1));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 6, 5, 110));

        payment.setBackground(new java.awt.Color(102, 102, 102));
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });
        jPanel2.add(payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 20, 60, 60));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Payment");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 90, 50, -1));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 7, 5, 110));

        voucher.setBackground(new java.awt.Color(102, 102, 102));
        voucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voucherActionPerformed(evt);
            }
        });
        jPanel2.add(voucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 20, 60, 60));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Voucher");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 50, -1));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 7, 5, 110));

        stock.setBackground(new java.awt.Color(102, 102, 102));
        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });
        jPanel2.add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 20, 60, 60));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Stock");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 60, -1));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 7, 5, 110));

        pd.setBackground(new java.awt.Color(102, 102, 102));
        pd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdActionPerformed(evt);
            }
        });
        jPanel2.add(pd, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 20, 60, 60));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Product Details");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 90, -1));

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 7, 5, 110));

        supplier.setBackground(new java.awt.Color(102, 102, 102));
        supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierActionPerformed(evt);
            }
        });
        jPanel2.add(supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 60, 60));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Supplier");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 60, -1));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 7, 5, 110));

        customer.setBackground(new java.awt.Color(102, 102, 102));
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });
        jPanel2.add(customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 20, 60, 60));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Customer");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 90, 60, -1));

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 7, 5, 110));

        account.setBackground(new java.awt.Color(102, 102, 102));
        account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountActionPerformed(evt);
            }
        });
        jPanel2.add(account, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 60, 60));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Account");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 60, -1));

        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 7, 5, 110));

        estimate.setBackground(new java.awt.Color(102, 102, 102));
        estimate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estimateActionPerformed(evt);
            }
        });
        jPanel2.add(estimate, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 20, 60, 60));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel10.setText(" Estimation");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 90, 70, -1));

        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(855, 7, 5, 110));

        close.setBackground(new java.awt.Color(102, 102, 102));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, 60, 60));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Close");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, 60, -1));

        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 7, 5, 110));

        jTabbedPane1.addTab("Home", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbActionPerformed(evt);
            }
        });
        jPanel3.add(sb, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 20, 60, 60));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel12.setText("Stock Book");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 90, -1, -1));

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 6, 5, 110));

        invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceActionPerformed(evt);
            }
        });
        jPanel3.add(invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 20, 60, 60));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Invoice");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 90, 60, -1));

        jSeparator14.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 7, 5, 110));

        summary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summaryActionPerformed(evt);
            }
        });
        jPanel3.add(summary, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 20, 60, 60));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Summary");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 90, 60, -1));

        jSeparator15.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 7, 5, 110));

        monthly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyActionPerformed(evt);
            }
        });
        jPanel3.add(monthly, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 20, 60, 60));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Monthly");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 90, 60, -1));

        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 7, 5, 110));

        db.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbActionPerformed(evt);
            }
        });
        jPanel3.add(db, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 20, 60, 60));

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Due Bills");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 90, 60, -1));

        jSeparator17.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 7, 5, 110));

        jTabbedPane1.addTab("Reports", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersActionPerformed(evt);
            }
        });
        jPanel4.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 20, 60, 60));

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Users");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 90, 60, -1));

        jSeparator18.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 6, 5, 110));

        cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpActionPerformed(evt);
            }
        });
        jPanel4.add(cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 60, 60));

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Change Password");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 90, 110, -1));

        jSeparator19.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 7, 5, 110));

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Look And Feel");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 90, 80, -1));

        laf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lafActionPerformed(evt);
            }
        });
        jPanel4.add(laf, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 20, 60, 60));

        jSeparator20.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 5, 5, 110));

        jTabbedPane1.addTab("Others", jPanel4);

        paan.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1880, 150));
        paan.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1370, 5));

        image.setOpaque(true);
        paan.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 810, 460));

        date.setFont(new java.awt.Font("Lucida Calligraphy", 0, 32)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paan.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, 520, 100));

        time.setFont(new java.awt.Font("LCD", 0, 72)); // NOI18N
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paan.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 390, 480, 120));

        jLabel19.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel19.setText("Made By");
        paan.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 590, -1, -1));

        jLabel20.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel20.setText("Hrishav Dhawaj Purkayastha");
        paan.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 620, 430, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paan, javax.swing.GroupLayout.PREFERRED_SIZE, 1369, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paan, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        tab.removeAll();
        tab.show();
    }//GEN-LAST:event_homeActionPerformed

    private void purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseActionPerformed
        // TODO add your handling code here:
        tab.add(new purchase());
        tab.setTitleAt(tab.getTabCount()-1, "Purchase");
        tab.setSelectedIndex(tab.getTabCount()-1);
    }//GEN-LAST:event_purchaseActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        // TODO add your handling code here:
        tab.add(new payment());
        tab.setTitleAt(tab.getTabCount()-1, "Payment");
        tab.setSelectedIndex(tab.getTabCount()-1);
    }//GEN-LAST:event_paymentActionPerformed

    private void voucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voucherActionPerformed
        // TODO add your handling code here:
        tab.add(new voucher());
        tab.setTitleAt(tab.getTabCount()-1, "Credit Voucher");
        tab.setSelectedIndex(tab.getTabCount()-1);
    }//GEN-LAST:event_voucherActionPerformed

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionPerformed
        // TODO add your handling code here:
        tab.add(new stock());
        tab.setTitleAt(tab.getTabCount()-1, "Stock");
        tab.setSelectedIndex(tab.getTabCount()-1);
    }//GEN-LAST:event_stockActionPerformed

    private void pdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdActionPerformed
        // TODO add your handling code here:
        tab.add(new product_details());
        tab.setTitleAt(tab.getTabCount()-1, "Product_Details");
        tab.setSelectedIndex(tab.getTabCount()-1);
    }//GEN-LAST:event_pdActionPerformed

    private void supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierActionPerformed
        // TODO add your handling code here:
        tab.add(new supplier());
        tab.setTitleAt(tab.getTabCount()-1, "Supplier");
        tab.setSelectedIndex(tab.getTabCount()-1);
    }//GEN-LAST:event_supplierActionPerformed

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
        // TODO add your handling code here:
        tab.add(new customer());
        tab.setTitleAt(tab.getTabCount()-1, "Customer");
        tab.setSelectedIndex(tab.getTabCount()-1);
    }//GEN-LAST:event_customerActionPerformed

    private void accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountActionPerformed
        // TODO add your handling code here:
        tab.add(new account());
        tab.setTitleAt(tab.getTabCount()-1, "Account");
        tab.setSelectedIndex(tab.getTabCount()-1);
    }//GEN-LAST:event_accountActionPerformed

    private void estimateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estimateActionPerformed
        // TODO add your handling code here:
        tab.add(new estimate());
        tab.setTitleAt(tab.getTabCount()-1, "Estimate");
        tab.setSelectedIndex(tab.getTabCount()-1);
    }//GEN-LAST:event_estimateActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        try{
            tab.remove(tab.getSelectedIndex());
        }catch(Exception ex){
            tab.hide();
        }
    }//GEN-LAST:event_closeActionPerformed

    private void sbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbActionPerformed
        // TODO add your handling code here:
        tab.add(new stock_book());
        tab.setTitleAt(tab.getTabCount()-1, "Stock Book");
        tab.setSelectedIndex(tab.getTabCount()-1);
    }//GEN-LAST:event_sbActionPerformed

    private void invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceActionPerformed
        // TODO add your handling code here:
        tab.add(new invoice());
        tab.setTitleAt(tab.getTabCount()-1, "Invoice");
        tab.setSelectedIndex(tab.getTabCount()-1);
    }//GEN-LAST:event_invoiceActionPerformed

    private void summaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_summaryActionPerformed
        // TODO add your handling code here:
        tab.add(new summary());
        tab.setTitleAt(tab.getTabCount()-1, "Summary");
        tab.setSelectedIndex(tab.getTabCount()-1);
    }//GEN-LAST:event_summaryActionPerformed

    private void monthlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlyActionPerformed
        // TODO add your handling code here:
        tab.add(new monthly());
        tab.setTitleAt(tab.getTabCount()-1, "Monthly");
        tab.setSelectedIndex(tab.getTabCount()-1);
    }//GEN-LAST:event_monthlyActionPerformed

    private void dbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbActionPerformed
        // TODO add your handling code here:
        tab.add(new due_bills());
        tab.setTitleAt(tab.getTabCount()-1, "Due Bills");
        tab.setSelectedIndex(tab.getTabCount()-1);
    }//GEN-LAST:event_dbActionPerformed

    private void usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersActionPerformed
        // TODO add your handling code here:
        new User().setVisible(true);
    }//GEN-LAST:event_usersActionPerformed

    private void cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpActionPerformed
        // TODO add your handling code here:
        new Change_password().setVisible(true);
    }//GEN-LAST:event_cpActionPerformed

    private void lafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lafActionPerformed
        // TODO add your handling code here:
        new Look_Feel().setVisible(true);
    }//GEN-LAST:event_lafActionPerformed

    /*
    * Getting User Defined Look And Feel
    */
    
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton account;
    private javax.swing.JButton close;
    private javax.swing.JButton cp;
    private javax.swing.JButton customer;
    private javax.swing.JLabel date;
    private javax.swing.JButton db;
    private javax.swing.JButton estimate;
    private javax.swing.JButton home;
    private javax.swing.JLabel image;
    private javax.swing.JButton invoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton laf;
    private javax.swing.JButton monthly;
    private javax.swing.JPanel paan;
    private javax.swing.JButton payment;
    private javax.swing.JButton pd;
    private javax.swing.JButton purchase;
    private javax.swing.JButton sb;
    private javax.swing.JButton stock;
    private javax.swing.JButton summary;
    private javax.swing.JButton supplier;
    public static javax.swing.JTabbedPane tab;
    private javax.swing.JLabel time;
    private javax.swing.JButton users;
    private javax.swing.JButton voucher;
    // End of variables declaration//GEN-END:variables
}
