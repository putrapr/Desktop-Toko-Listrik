package main;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import utility.Koneksi_db;

/**
 * @author Putra Prasetya
 */
public class Stok extends javax.swing.JFrame {
    private Connection conn = new Koneksi_db().connect();
    private DefaultTableModel tabmode;
    
    public Stok() {
        initComponents();
    }
    
    public Stok(Rectangle bound) {
        initComponents();
        tabelStok();
        
        // terima ukuran window & tetapkan di window yang aktif
        this.setBounds(bound);
               
        //saat restore dari kondisi maximize kembali ke ukuran minimal
        Dimension size = this.getSize();
        Double width = size.getWidth();
        Double height = size.getHeight();
        if (width > 1381 && height > 743) {
            this.setSize(800,500);
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
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

        bg21 = new utility.bg2();
        jLabel7 = new javax.swing.JLabel();
        btn_cari = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_stok = new javax.swing.JTable();
        tf_pencarian = new javax.swing.JTextField();
        btn_ubah = new javax.swing.JButton();
        btn_kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Stok Barang");

        btn_cari.setText("Cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        tbl_stok.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Barang", "Nama Barang", "Satuan", "Qty", "Harga Beli", "Harga Jual", "Supplier", "Tanggal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_stok.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(tbl_stok);

        btn_ubah.setText("Ubah");
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });

        btn_kembali.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_kembali.setText("<< Kembali");
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bg21Layout = new javax.swing.GroupLayout(bg21);
        bg21.setLayout(bg21Layout);
        bg21Layout.setHorizontalGroup(
            bg21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg21Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(bg21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                    .addGroup(bg21Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_reset))
                    .addGroup(bg21Layout.createSequentialGroup()
                        .addComponent(btn_kembali)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        bg21Layout.setVerticalGroup(
            bg21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg21Layout.createSequentialGroup()
                .addGroup(bg21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg21Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel7)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(bg21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bg21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_cari)
                                .addComponent(btn_reset)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bg21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_hapus)
                    .addComponent(btn_ubah)
                    .addComponent(btn_kembali))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelStok(){
        Object[] Baris = {"ID Barang", "Nama Barang", "Satuan", "Kuantitas", "Harga Beli", "Harga Jual", "Pemasok", "Tanggal"};
        tabmode = new DefaultTableModel(null, Baris);
        tbl_stok.setModel(tabmode);        
        String sql = "SELECT * FROM barang JOIN pemasok ON (barang.id_pms_brg = pemasok.id_pms)";        
        try {
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            String a="", b="", c="",d="",e="", f="", g="", h="";
            while (hasil.next()){
                a = hasil.getString("id_brg");
                b = hasil.getString("nama_brg");
                c = hasil.getString("satuan_brg");
                d = hasil.getString("kuantitas_brg");
                e = hasil.getString("harga_beli_brg");
                f = hasil.getString("harga_jual_brg");
                g = hasil.getString("nama_pms");
                h = hasil.getString("tgl_beli_brg");
                
                String[] data={a,b,c,d,e,f,g,h};
                tabmode.addRow(data); 
            }
        } catch (SQLException e){
            pesanSQLPopUp("Data gagal ditampilkan",e);
            JOptionPane.showMessageDialog(null, "Data Gagal Ditampilkan: " + e);
        }
    }
    
    private void pesanPopUp(String pesan){
        JOptionPane.showMessageDialog(null, pesan);
    }
    
    private void pesanSQLPopUp(String pesan, SQLException ee){
        JOptionPane.showMessageDialog(null, pesan+" : "+ee);
    }
    
    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        Rectangle stokBound = this.getBounds();
        new Menu(stokBound).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_kembaliActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        Object[] Baris = {"ID Barang", "Nama Barang", "Satuan", "Kuantitas", "Harga Beli", "Harga Jual", "Pemasok", "Tanggal"};
        tabmode = new DefaultTableModel(null, Baris);
        tbl_stok.setModel(tabmode);
        String cari = tf_pencarian.getText();
        String sql = "SELECT * FROM barang JOIN pemasok "
                     + "ON (barang.id_pms_brg = pemasok.id_pms) "
                     + "WHERE barang.id_brg LIKE '%"+cari+"%' "
                       + "OR barang.nama_brg LIKE '%"+cari+"%' "
                       + "OR barang.satuan_brg LIKE '%"+cari+"%' "
                       + "OR barang.kuantitas_brg LIKE '%"+cari+"%' "
                       + "OR barang.harga_beli_brg LIKE '%"+cari+"%' "
                       + "OR barang.harga_jual_brg LIKE '%"+cari+"%' "
                       + "OR pemasok.nama_pms LIKE '%"+cari+"%' "
                       + "OR barang.tgl_beli_brg LIKE '%"+cari+"%'";
        try {
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            String a="",b="",c="",d="",e="",f="",g="",h="";
            while (hasil.next()){
                a = hasil.getString("id_brg");
                b = hasil.getString("nama_brg");
                c = hasil.getString("satuan_brg");
                d = hasil.getString("kuantitas_brg");
                e = hasil.getString("harga_beli_brg");
                f = hasil.getString("harga_jual_brg");
                g = hasil.getString("nama_pms");
                h = hasil.getString("tgl_beli_brg");                
                String[] data={a,b,c,d,e,f,g,h};
                tabmode.addRow(data); 
            }            
        }catch (SQLException e){
            pesanSQLPopUp("Data gagal ditampilkan",e);
        }
    }//GEN-LAST:event_btn_cariActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        tabelStok();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        int bar = tbl_stok.getSelectedRow();
        if (bar == -1) pesanPopUp("Pilih baris data yang ingin diubah !");
        else {
            String id = tabmode.getValueAt(bar, 0).toString();
            String nama = tabmode.getValueAt(bar, 1).toString();
            String satuan = tabmode.getValueAt(bar, 2).toString();
            String kuantitas = tabmode.getValueAt(bar, 3).toString();
            String harga_jual = tabmode.getValueAt(bar, 5).toString();
            
            JTextField tf_nama = new JTextField();
            JTextField tf_satuan = new JTextField();
            JTextField tf_kuantitas = new JTextField();            
            JTextField tf_harga_jual = new JTextField();
            tf_nama.setText(nama);
            tf_satuan.setText(satuan);
            tf_kuantitas.setText(kuantitas);
            tf_harga_jual.setText(harga_jual);

            Object[] fields = {
                "Nama :", tf_nama,
                "Satuan :", tf_satuan,
                "Kuantitas :", tf_kuantitas,
                "Harga_jual :", tf_harga_jual
            };
            int ok = JOptionPane.showConfirmDialog(null, fields, "Ubah Stok Barang",
                     JOptionPane.OK_CANCEL_OPTION);
            if (ok==0){
                try {
                    String sql = "UPDATE barang SET nama_brg=?, satuan_brg=?, kuantitas_brg=?, harga_jual_brg=? WHERE id_brg=?";
                    PreparedStatement stat = conn.prepareStatement(sql);
                    stat.setString(1, tf_nama.getText());
                    stat.setString(2, tf_satuan.getText());
                    stat.setString(3, tf_kuantitas.getText());
                    stat.setString(4, tf_harga_jual.getText());
                    stat.setString(5, id);
                    stat.executeUpdate();
                }catch(SQLException e){
                    pesanSQLPopUp("Data gagal diubah",e);
                }
            }
            tabelStok();  
        }
        
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        int baris = tbl_stok.getSelectedRow();
        if (baris == -1) pesanPopUp("Pilih baris data yang ingin dihapus !");
        else {
            String id = tabmode.getValueAt(baris, 0).toString();        
            int ok = JOptionPane.showConfirmDialog(null,"Hapus","Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
            if (ok==0){
                String sql = "DELETE FROM barang WHERE id_brg='"+id+"'";
                try {
                    PreparedStatement stat = conn.prepareStatement(sql);
                    stat.executeUpdate();
                    tabelStok();
                } catch(SQLException e){
                    pesanSQLPopUp("Data gagal dihapus",e);
                }
            }
        }        
    }//GEN-LAST:event_btn_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(Stok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stok().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private utility.bg2 bg21;
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_ubah;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable tbl_stok;
    private javax.swing.JTextField tf_pencarian;
    // End of variables declaration//GEN-END:variables
}
