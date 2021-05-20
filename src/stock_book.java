
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Programmer PC
 */
public class stock_book extends javax.swing.JPanel {

    /**
     * Creates new form stock_book
     */
    private PreparedStatement pst;
    private ResultSet rs,RS;
    private Connection conn;
    private DefaultTableModel model; 
    public stock_book() {
        initComponents();
        conn=Database.Connect();
        model=(DefaultTableModel) tab.getModel();
        set_value();
        set_company();
    }
    private void set_company(){
        String sql="select company from product";
        try{
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                company.addItem(rs.getString("company"));
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    private void set_value(){
        String sql="select * from product";
        String SQL="select * from stock";
        try{
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            pst=conn.prepareStatement(SQL);
            RS=pst.executeQuery();
            model.setRowCount(0);
            while(rs.next() && RS.next()){
                model.addRow(new Object[] {rs.getString("item_name"),rs.getString("batch_number"),rs.getString("company"),rs.getString("mfd_on"),rs.getString("net_weight"),
                rs.getString("exp_date"),rs.getString("rate"),rs.getString("GST"),rs.getString("Total_MRP"),RS.getString("stock_available"),rs.getString("date"),rs.getString("time"),});
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        tab.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        from = new com.toedter.calendar.JDateChooser();
        to = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        item_name = new javax.swing.JTextField();
        ins = new javax.swing.JRadioButton();
        ds = new javax.swing.JRadioButton();
        filter = new javax.swing.JRadioButton();
        company = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Stock Book");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("From");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("To");

        from.setDateFormatString("dd MMM yyyy");

        to.setDateFormatString("dd MMM yyyy");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Enter Item Name");

        buttonGroup1.add(ins);
        ins.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        ins.setText("Item Name Search");

        buttonGroup1.add(ds);
        ds.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        ds.setText("Date Search");

        filter.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        filter.setText("Filter By Company");

        company.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        company.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jButton1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(to, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(from, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(item_name)))
                    .addComponent(ins)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ds)
                        .addGap(35, 35, 35))
                    .addComponent(filter)
                    .addComponent(company, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ins)
                .addGap(18, 18, 18)
                .addComponent(ds)
                .addGap(21, 21, 21)
                .addComponent(filter)
                .addGap(21, 21, 21)
                .addComponent(company, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Batch Number", "Company", "Manufactured On", "Net Weight", "Expiry Date", "Rate", "GST", "Total MRP (Inclisuve Of All Taxes)", "Quantity Available", "Date Added", "Time Added"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tab);
        if (tab.getColumnModel().getColumnCount() > 0) {
            tab.getColumnModel().getColumn(0).setResizable(false);
            tab.getColumnModel().getColumn(0).setPreferredWidth(200);
            tab.getColumnModel().getColumn(1).setResizable(false);
            tab.getColumnModel().getColumn(2).setResizable(false);
            tab.getColumnModel().getColumn(2).setPreferredWidth(170);
            tab.getColumnModel().getColumn(3).setResizable(false);
            tab.getColumnModel().getColumn(4).setResizable(false);
            tab.getColumnModel().getColumn(5).setResizable(false);
            tab.getColumnModel().getColumn(6).setResizable(false);
            tab.getColumnModel().getColumn(7).setResizable(false);
            tab.getColumnModel().getColumn(8).setResizable(false);
            tab.getColumnModel().getColumn(8).setPreferredWidth(150);
            tab.getColumnModel().getColumn(9).setResizable(false);
            tab.getColumnModel().getColumn(10).setResizable(false);
            tab.getColumnModel().getColumn(11).setResizable(false);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 430));

        jScrollPane3.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String sql = null;
        if(ins.isSelected()){
            if(filter.isSelected()){
                if(company.getSelectedItem().toString().equals("Select"))
                    JOptionPane.showMessageDialog(null, "No Company Selected");
                else
                    sql="select * from product where item_name='"+item_name.getText()+"' and company='"+company.getSelectedItem().toString()+"'";
            }
            else{
                sql="select * from product where item_name='"+item_name.getText()+"'";
            }
        }
        else if(ds.isSelected()){
            if(filter.isSelected()){
                if(company.getSelectedItem().toString().equals("Select"))
                    JOptionPane.showMessageDialog(null, "No Company Selected");
                else
                   sql="select * from product where date>='"+new SimpleDateFormat("yyyy-MM-dd").format(from.getDate())+"' and date<='"+new SimpleDateFormat("yyyy-MM-dd").format(to.getDate())+"' and company='"+company.getSelectedItem()+"'";  
            }
            else{
                 sql="select * from product where date>='"+new SimpleDateFormat("yyyy-MM-dd").format(from.getDate())+"' and date<='"+new SimpleDateFormat("yyyy-MM-dd").format(to.getDate())+"'";
            }
        }
        else
            JOptionPane.showMessageDialog(null, "Select From The Above Options");
        try{
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(ins.isSelected())
                pst=conn.prepareStatement("select * from stock where item_name='"+item_name.getText()+"'");
            if(ds.isSelected())
                pst=conn.prepareStatement("select * from stock");
            RS=pst.executeQuery();
            model.setRowCount(0);
            while(rs.next() && RS.next()){
                if(rs.getString("item_name").equals(RS.getString("item_name"))){
                     model.addRow(new Object[] {rs.getString("item_name"),rs.getString("batch_number"),rs.getString("company"),rs.getString("mfd_on"),rs.getString("net_weight"),
                        rs.getString("exp_date"),rs.getString("rate"),rs.getString("GST"),rs.getString("Total_MRP"),RS.getString("stock_available"),rs.getString("date"),rs.getString("time"),});
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        tab.setModel(model);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            // TODO add your handling code here:        
        try {
            JasperDesign jd=JRXmlLoader.load(getClass().getResourceAsStream("/stock_book.jrxml"));
            JasperReport jp=JasperCompileManager.compileReport(jd);
            JasperPrint jpp=JasperFillManager.fillReport(jp, null, conn);
            JasperViewer.viewReport(jpp, false);
        } catch (JRException ex) {
            Logger.getLogger(stock_book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> company;
    private javax.swing.JRadioButton ds;
    private javax.swing.JRadioButton filter;
    private com.toedter.calendar.JDateChooser from;
    private javax.swing.JRadioButton ins;
    private javax.swing.JTextField item_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tab;
    private com.toedter.calendar.JDateChooser to;
    // End of variables declaration//GEN-END:variables
}