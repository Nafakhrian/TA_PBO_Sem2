/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_pbo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class FrameUtama extends javax.swing.JFrame {

    /**
     * Creates new form FrameUtama
     */
    public FrameUtama() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgKelas = new javax.swing.ButtonGroup();
        bgKeberangkatan = new javax.swing.ButtonGroup();
        bgTujuan = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        rbB = new javax.swing.JRadioButton();
        rbA = new javax.swing.JRadioButton();
        rbD = new javax.swing.JRadioButton();
        rbC = new javax.swing.JRadioButton();
        rbA1 = new javax.swing.JRadioButton();
        rbB1 = new javax.swing.JRadioButton();
        rbC1 = new javax.swing.JRadioButton();
        rbD1 = new javax.swing.JRadioButton();
        rbA2 = new javax.swing.JRadioButton();
        rbB2 = new javax.swing.JRadioButton();
        rbC2 = new javax.swing.JRadioButton();
        rbD2 = new javax.swing.JRadioButton();
        tanggal = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 0));
        setSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nama");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 188, 130, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Kelas");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 348, 130, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Keberangkatan");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 441, 130, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nomor Reservasi");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 104, 220, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tujuan");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 537, 130, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tanggal Pemesanan");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 268, 130, 22);
        getContentPane().add(txtNo);
        txtNo.setBounds(50, 140, 220, 30);
        getContentPane().add(txtNama);
        txtNama.setBounds(50, 220, 220, 30);

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Myriad Pro Light", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(null);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(342, 104, 96, 40);

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setFont(new java.awt.Font("Myriad Pro Light", 0, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setBorder(null);
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(462, 104, 96, 40);

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Myriad Pro Light", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(null);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(582, 104, 96, 40);

        btnPrint.setBackground(new java.awt.Color(255, 255, 255));
        btnPrint.setFont(new java.awt.Font("Myriad Pro Light", 0, 18)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.setBorder(null);
        btnPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrint);
        btnPrint.setBounds(702, 104, 96, 40);

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Myriad Pro Light", 0, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.setBorder(null);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(822, 104, 96, 40);

        bgKelas.add(rbB);
        rbB.setText("Bisnis");
        getContentPane().add(rbB);
        rbB.setBounds(170, 377, 80, 23);

        bgKelas.add(rbA);
        rbA.setText("Ekonomi");
        getContentPane().add(rbA);
        rbA.setBounds(60, 377, 92, 23);

        bgKelas.add(rbD);
        rbD.setText("Private Jet");
        rbD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDActionPerformed(evt);
            }
        });
        getContentPane().add(rbD);
        rbD.setBounds(170, 400, 80, 23);

        bgKelas.add(rbC);
        rbC.setText("First Class");
        getContentPane().add(rbC);
        rbC.setBounds(60, 400, 92, 23);

        bgKeberangkatan.add(rbA1);
        rbA1.setText("Jakarta");
        getContentPane().add(rbA1);
        rbA1.setBounds(60, 470, 90, 23);

        bgKeberangkatan.add(rbB1);
        rbB1.setText("Malang");
        rbB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbB1ActionPerformed(evt);
            }
        });
        getContentPane().add(rbB1);
        rbB1.setBounds(168, 470, 80, 23);

        bgKeberangkatan.add(rbC1);
        rbC1.setText("Surabaya");
        getContentPane().add(rbC1);
        rbC1.setBounds(60, 496, 90, 23);

        bgKeberangkatan.add(rbD1);
        rbD1.setText("Solo");
        rbD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbD1ActionPerformed(evt);
            }
        });
        getContentPane().add(rbD1);
        rbD1.setBounds(168, 496, 80, 23);

        bgTujuan.add(rbA2);
        rbA2.setText("Medan");
        getContentPane().add(rbA2);
        rbA2.setBounds(60, 566, 89, 23);

        bgTujuan.add(rbB2);
        rbB2.setText("Denpasar");
        getContentPane().add(rbB2);
        rbB2.setBounds(167, 566, 80, 23);

        bgTujuan.add(rbC2);
        rbC2.setText("Makassar");
        getContentPane().add(rbC2);
        rbC2.setBounds(60, 589, 89, 23);

        bgTujuan.add(rbD2);
        rbD2.setText("Gorontalo");
        getContentPane().add(rbD2);
        rbD2.setBounds(167, 589, 80, 23);
        getContentPane().add(tanggal);
        tanggal.setBounds(50, 301, 220, 29);

        jTable1.setForeground(new java.awt.Color(51, 102, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "no_reservasi", "nama", "tanggal", "kelas", "bandara_berangkat", "bandara_tujuan"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(330, 200, 600, 402);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ta_pbo/pbo2.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtNo.setText("");
        txtNama.setText("");
        tanggal.setDate(null);
        bgKelas.clearSelection();
        bgKeberangkatan.clearSelection();
        bgTujuan.clearSelection();
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void rbB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbB1ActionPerformed

    private void rbD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbD1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggala = dateFormat.format(tanggal.getDate());
        String Kls = "";
            if(rbA.isSelected()){
                Kls = "A";
            } else if(rbB.isSelected()) {
                Kls = "B";
            } else if(rbC.isSelected()) {
                Kls = "C";
            }else if(rbD.isSelected()){
                Kls = "D";
            }
        String Brkt = "";
            if(rbA1.isSelected()){
                Kls = "O";
            } else if(rbB1.isSelected()) {
                Kls = "P";
            } else if(rbC1.isSelected()) {
                Kls = "Q";
            }else if(rbD1.isSelected()){
                Kls = "R";
            }
        String Tjn = "";
            if(rbA1.isSelected()){
                Kls = "W";
            } else if(rbB1.isSelected()) {
                Kls = "X";
            } else if(rbC1.isSelected()) {
                Kls = "Y";
            }else if(rbD2.isSelected()){
                Kls = "Z";
            }
            
        if("".equals(txtNo.getText()) 
                || "".equals(txtNama.getText())
                || tanggal.equals("")
                || Kls.equals("")
                || Brkt.equals("")
                || Tjn.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            
            String SQL = "INSERT INTO t_pemesanan (no_reservasi,nama,tanggal,kelas,bandara_berangkat,bandara_tujuan)" 
                    + "VALUES('" + txtNo.getText()+"','"
                    + txtNama.getText()+"','"
                    + tanggal.getDate()+"','"
                    + Kls +"','"
                    + Brkt +"','"
                    + Tjn +"','"
                    +"')";
            int status = KoneksiDB.execute(SQL);
            if(status==1){
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else{
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int baris = jTable1.getSelectedRow();
        if (baris != -1){
            String No = jTable1.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM t_pemesanan WHERE No='"+No+"'";
            int status = KoneksiDB.execute(SQL);
            if(status==1){
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else{
                JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } else{
            JOptionPane.showMessageDialog(this, "Pilih Baris Terlebih Dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Laporan Pemesanan Tiket Pesawat Coaster");
        MessageFormat body =  new MessageFormat("Bulan Mei 2017");
        MessageFormat footer = new MessageFormat("Page {0,number,integer}   ");
        try {
            jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        } catch(java.awt.print.PrinterException e){
            System.err.format("Cannot print 5s%n", e.getMessage());
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void rbDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbDActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgKeberangkatan;
    private javax.swing.ButtonGroup bgKelas;
    private javax.swing.ButtonGroup bgTujuan;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbA;
    private javax.swing.JRadioButton rbA1;
    private javax.swing.JRadioButton rbA2;
    private javax.swing.JRadioButton rbB;
    private javax.swing.JRadioButton rbB1;
    private javax.swing.JRadioButton rbB2;
    private javax.swing.JRadioButton rbC;
    private javax.swing.JRadioButton rbC1;
    private javax.swing.JRadioButton rbC2;
    private javax.swing.JRadioButton rbD;
    private javax.swing.JRadioButton rbD1;
    private javax.swing.JRadioButton rbD2;
    private com.toedter.calendar.JDateChooser tanggal;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNo;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom[] = {"no_reservasi","nama","tanggal","kelas","bandara_berangkat","bandara_tujuan"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM t_pemesanan";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try{
            while(rs.next()){
                String no_reservasi = rs.getString(1);
                String nama = rs.getString(2);
                String tanggal = rs.getString(3);
                String kelas = "";
                if("A".equals(rs.getString(4))) {
                    kelas = "Ekonomi";
                } else if("B".equals(rs.getString(4))){
                    kelas = "Bisnis";
                } else if("C".equals(rs.getString(4))){
                    kelas = "First Class";
                } else if("D".equals(rs.getString(4))){
                    kelas = "Private Jet";
                }
                String bandara_berangkat = "";
                if("A1".equals(rs.getString(5))) {
                    bandara_berangkat = "Jakarta";
                } else if("B1".equals(rs.getString(5))){
                    bandara_berangkat = "Malang";
                } else if("C1".equals(rs.getString(5))){
                    bandara_berangkat = "Surabaya";
                } else if("D1".equals(rs.getString(5))){
                    bandara_berangkat = "Solo";
                }
                String bandara_tujuan = "";
                if("A2".equals(rs.getString(6))) {
                    bandara_tujuan = "Medan";
                } else if("B2".equals(rs.getString(6))){
                    bandara_tujuan = "Denpasar";
                } else if("C2".equals(rs.getString(6))){
                    bandara_tujuan = "Makassar";
                } else if("D2".equals(rs.getString(6))){
                    bandara_tujuan = "Gorontalo";
                }
                String data[] = {no_reservasi,nama,tanggal,kelas,bandara_berangkat,bandara_tujuan};
                dtm.addRow(data);
            }
        } catch(SQLException ex){
            Logger.getLogger(FrameUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTable1.setModel(dtm);
    }
}
