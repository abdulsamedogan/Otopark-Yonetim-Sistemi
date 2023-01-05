package _grup_12;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class _Grup_12_AracCikis extends javax.swing.JFrame {

    DefaultTableModel model;
    _Grup_12_DbOperation dbOperation = new _Grup_12_DbOperation();
    int tblSatir = 0;
    int otoparkID = 0;
    public _Grup_12_AracCikis() {
        initComponents();
        model = (DefaultTableModel) tbl_Arama.getModel();
        dbOperation.setArrayListFiss();
        dbOperation.setArrayListUsers();
        dbOperation.setArrayListkln_iletisim_arac();
        dbOperation.setArrayListOtopark();
        ArrayList<_Grup_12_fis> fiss = dbOperation.fiss;
        ArrayList<_Grup_12_User> users = dbOperation.users;
        ArrayList<_Grup_12_kln_iletisim_arac> kln_iletsim_aracs = dbOperation.grup_12_kln_iletisim_aracs;
        ArrayList<_Grup_12_Otopark> otoparks = dbOperation.otopark;
        for(int i=0;i<fiss.size();i++)
        {
            int a = fiss.get(i).getKln_iletisim_arac();
            int c = fiss.get(i).getOtoparkID();
            int otoparkKatNo = 0;
            int otoparkNo = 0;
            int ID = 0;
            String isim = null;
            for(int l =0; l<otoparks.size();l++)
            {
                if(otoparks.get(l).otoparkID == c)
                {
                    otoparkKatNo = otoparks.get(l).getOtoparkKat();
                    otoparkNo = otoparks.get(l).otoparkNo;
                }
            }
            for(int b=0;b<kln_iletsim_aracs.size();b++)
            {
                if(kln_iletsim_aracs.get(b).getID()== a)
                {
                    ID = kln_iletsim_aracs.get(b).getKlnID();
                }
            }
            for(int k = 0;k < users.size();k++)
            {
                if(users.get(k).getId() == ID)
                {
                    isim = users.get(k).getIsim();
                }
            }
            Object[] row = {
                fiss.get(i).getId(),
                isim,
                otoparkKatNo,
                otoparkNo,
                fiss.get(i).getFisUcret()
            };
            model.addRow(row);
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

        lbl_Plaka = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        btn_AracCikis = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Arama = new javax.swing.JTable();
        btn_GeriDon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Plaka.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Plaka.setText("Arama Kutusu:");

        txt_search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_search.setText("_______");
        txt_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_searchMouseClicked(evt);
            }
        });
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_searchKeyTyped(evt);
            }
        });

        btn_AracCikis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_AracCikis.setText("Araç Çıkışı");
        btn_AracCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AracCikisActionPerformed(evt);
            }
        });

        tbl_Arama.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "İsim", "Otopark Kat No", "Otopark No", "Fiyat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_Arama);

        btn_GeriDon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_GeriDon.setText("Geri Dön");
        btn_GeriDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GeriDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_AracCikis)
                        .addGap(105, 105, 105)
                        .addComponent(btn_GeriDon))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl_Plaka, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(158, 158, 158)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Plaka)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btn_GeriDon))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_AracCikis)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GeriDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GeriDonActionPerformed
        _Grup_12_AnaSayfa anaSayfa = new _Grup_12_AnaSayfa();
        anaSayfa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_GeriDonActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        
    }//GEN-LAST:event_txt_searchActionPerformed

    private void txt_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_searchMouseClicked
        txt_search.setText("");
    }//GEN-LAST:event_txt_searchMouseClicked

    private void btn_AracCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AracCikisActionPerformed
        tblSatir = tbl_Arama.getSelectedRow();
        if(tblSatir != -1)
        {
            int a = (int) model.getValueAt(tblSatir,0);
            //dbOperation.setArrayListFiss();
            //int b = dbOperation.fiss.get(tblSatir).getOtoparkID();
            //dbOperation.otoparkDolulukDeğiştirme(0, b);
            dbOperation.deleteFis(a);
            JOptionPane.showMessageDialog(null, "Araç çıkma işlemi başarılı");
            _Grup_12_AnaSayfa anaSayfa = new _Grup_12_AnaSayfa();
            anaSayfa.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btn_AracCikisActionPerformed

    private void txt_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchKeyTyped

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        String searchKey = txt_search.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<>(model);
        tbl_Arama.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }//GEN-LAST:event_txt_searchKeyReleased

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
            java.util.logging.Logger.getLogger(_Grup_12_AracCikis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_Grup_12_AracCikis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_Grup_12_AracCikis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_Grup_12_AracCikis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _Grup_12_AracCikis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AracCikis;
    private javax.swing.JButton btn_GeriDon;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Plaka;
    private javax.swing.JTable tbl_Arama;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}