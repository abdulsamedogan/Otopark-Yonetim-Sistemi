/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _grup_12;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

/**
 *
 * @author Furkan
 */
public class _Grup_12_AracGiris extends javax.swing.JFrame {

    _Grup_12_DbOperation dbOperation = new _Grup_12_DbOperation();
    ArrayList<JRadioButton> JRadioButtons = new ArrayList<JRadioButton>();
    
    public _Grup_12_AracGiris() {
        initComponents();
        dbOperation.setArrayListOtopark();
        setArrayListJToggleButton();
        setTbtnOtopark();
        jToggleButton();
        setJRadioButtonActionCommand();
    }

    public void jToggleButton ()
    {
        for(int i = 0; i<JRadioButtons.size();i++)
        {
            if(JRadioButtons.get(i).isSelected() == true)
        {
            JRadioButtons.get(i).setBackground(Color.red);
        }
            else
            {
            JRadioButtons.get(i).setBackground(Color.green);   
            }
        }    
    }
    public void setArrayListJToggleButton()
    {
        JRadioButtons.add(Rbtn_1_1);
        JRadioButtons.add(Rbtn_1_2);
        JRadioButtons.add(Rbtn_1_3);
        JRadioButtons.add(Rbtn_1_4);
        JRadioButtons.add(Rbtn_1_5);
        JRadioButtons.add(Rbtn_1_6);
        JRadioButtons.add(Rbtn_1_7);
        JRadioButtons.add(Rbtn_1_8);
        JRadioButtons.add(Rbtn_2_1);
        JRadioButtons.add(Rbtn_2_2);
        JRadioButtons.add(Rbtn_2_3);
        JRadioButtons.add(Rbtn_2_4);
        JRadioButtons.add(Rbtn_2_5);
        JRadioButtons.add(Rbtn_2_6);
        JRadioButtons.add(Rbtn_2_7);
        JRadioButtons.add(Rbtn_2_8);
        JRadioButtons.add(Rbtn_3_1);
        JRadioButtons.add(Rbtn_3_2);
        JRadioButtons.add(Rbtn_3_3);
        JRadioButtons.add(Rbtn_3_4);
        JRadioButtons.add(Rbtn_3_5);
        JRadioButtons.add(Rbtn_3_6);
        JRadioButtons.add(Rbtn_3_7);
        JRadioButtons.add(Rbtn_3_8);     
    }
    
    public void setTbtnOtopark()
    {
        int size = dbOperation.otopark.size();
        for(int i=0; i < size ;i++)
        {
            //JRadioButtons.get(i).setSelected(dbOperation.otopark.get(i).otoparkDoluluk);
            if(dbOperation.otopark.get(i).otoparkDoluluk)
            {
                JRadioButtons.get(i).setForeground(Color.red);
            }
            JRadioButtons.get(i).setEnabled(!dbOperation.otopark.get(i).otoparkDoluluk);
            
        }
    }
    public void setJRadioButtonActionCommand()
    {
        Rbtn_1_1.setActionCommand("1");
        Rbtn_1_2.setActionCommand("2");
        Rbtn_1_3.setActionCommand("3");
        Rbtn_1_4.setActionCommand("4");
        Rbtn_1_5.setActionCommand("5");
        Rbtn_1_6.setActionCommand("6");
        Rbtn_1_7.setActionCommand("7");
        Rbtn_1_8.setActionCommand("8");
        Rbtn_2_1.setActionCommand("9");
        Rbtn_2_2.setActionCommand("10");
        Rbtn_2_3.setActionCommand("11");
        Rbtn_2_4.setActionCommand("12");
        Rbtn_2_5.setActionCommand("13");
        Rbtn_2_6.setActionCommand("14");
        Rbtn_2_7.setActionCommand("15");
        Rbtn_2_8.setActionCommand("16");
        Rbtn_3_1.setActionCommand("17");
        Rbtn_3_2.setActionCommand("18");
        Rbtn_3_3.setActionCommand("19");
        Rbtn_3_4.setActionCommand("20");
        Rbtn_3_5.setActionCommand("21");
        Rbtn_3_6.setActionCommand("22");
        Rbtn_3_7.setActionCommand("23");
        Rbtn_3_8.setActionCommand("24");
        
        Rbtn_Sure1.setActionCommand("3saatten az");
        Rbtn_Sure2.setActionCommand("3 Saat ile 7 Saat Arası");
        Rbtn_Sure3.setActionCommand("7 Saat ile 12 Saat Arası");
        Rbtn_Sure4.setActionCommand("12 Saat ile 24 Saat Arası");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        Rbtn_1_1 = new javax.swing.JRadioButton();
        Rbtn_1_2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        Rbtn_1_3 = new javax.swing.JRadioButton();
        Rbtn_1_4 = new javax.swing.JRadioButton();
        Rbtn_1_5 = new javax.swing.JRadioButton();
        Rbtn_1_6 = new javax.swing.JRadioButton();
        Rbtn_1_7 = new javax.swing.JRadioButton();
        Rbtn_1_8 = new javax.swing.JRadioButton();
        Rbtn_2_7 = new javax.swing.JRadioButton();
        Rbtn_2_8 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        Rbtn_2_3 = new javax.swing.JRadioButton();
        Rbtn_2_4 = new javax.swing.JRadioButton();
        Rbtn_2_5 = new javax.swing.JRadioButton();
        Rbtn_2_6 = new javax.swing.JRadioButton();
        Rbtn_2_1 = new javax.swing.JRadioButton();
        Rbtn_2_2 = new javax.swing.JRadioButton();
        Rbtn_3_6 = new javax.swing.JRadioButton();
        Rbtn_3_1 = new javax.swing.JRadioButton();
        Rbtn_3_2 = new javax.swing.JRadioButton();
        Rbtn_3_7 = new javax.swing.JRadioButton();
        Rbtn_3_8 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        Rbtn_3_3 = new javax.swing.JRadioButton();
        Rbtn_3_4 = new javax.swing.JRadioButton();
        Rbtn_3_5 = new javax.swing.JRadioButton();
        txt_Plaka = new javax.swing.JTextField();
        lbl_Plaka = new javax.swing.JLabel();
        btn_KayıtYap = new javax.swing.JButton();
        lbl_Süre = new javax.swing.JLabel();
        Rbtn_Sure1 = new javax.swing.JRadioButton();
        Rbtn_Sure2 = new javax.swing.JRadioButton();
        Rbtn_Sure3 = new javax.swing.JRadioButton();
        Rbtn_Sure4 = new javax.swing.JRadioButton();
        lbl_Ücret = new javax.swing.JLabel();
        lbl_SonucUcret = new javax.swing.JLabel();
        btn_GeriDon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(Rbtn_1_1);
        Rbtn_1_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_1_1.setText("1 Numara");

        buttonGroup1.add(Rbtn_1_2);
        Rbtn_1_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_1_2.setText("2 Numara");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("1.Kat");

        buttonGroup1.add(Rbtn_1_3);
        Rbtn_1_3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_1_3.setText("3 Numara");
        Rbtn_1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbtn_1_3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Rbtn_1_4);
        Rbtn_1_4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_1_4.setText("4 Numara");

        buttonGroup1.add(Rbtn_1_5);
        Rbtn_1_5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_1_5.setText("5 Numara");

        buttonGroup1.add(Rbtn_1_6);
        Rbtn_1_6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_1_6.setText("6 Numara");

        buttonGroup1.add(Rbtn_1_7);
        Rbtn_1_7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_1_7.setText("7 Numara");

        buttonGroup1.add(Rbtn_1_8);
        Rbtn_1_8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_1_8.setText("8 Numara");

        buttonGroup1.add(Rbtn_2_7);
        Rbtn_2_7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_2_7.setText("7 Numara");

        buttonGroup1.add(Rbtn_2_8);
        Rbtn_2_8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_2_8.setText("8 Numara");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("2.Kat");

        buttonGroup1.add(Rbtn_2_3);
        Rbtn_2_3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_2_3.setText("3 Numara");

        buttonGroup1.add(Rbtn_2_4);
        Rbtn_2_4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_2_4.setText("4 Numara");

        buttonGroup1.add(Rbtn_2_5);
        Rbtn_2_5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_2_5.setText("5 Numara");

        buttonGroup1.add(Rbtn_2_6);
        Rbtn_2_6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_2_6.setText("6 Numara");

        buttonGroup1.add(Rbtn_2_1);
        Rbtn_2_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_2_1.setText("1 Numara");

        buttonGroup1.add(Rbtn_2_2);
        Rbtn_2_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_2_2.setText("2 Numara");

        buttonGroup1.add(Rbtn_3_6);
        Rbtn_3_6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_3_6.setText("6 Numara");

        buttonGroup1.add(Rbtn_3_1);
        Rbtn_3_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_3_1.setText("1 Numara");

        buttonGroup1.add(Rbtn_3_2);
        Rbtn_3_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_3_2.setText("2 Numara");

        buttonGroup1.add(Rbtn_3_7);
        Rbtn_3_7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_3_7.setText("7 Numara");
        Rbtn_3_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbtn_3_7ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Rbtn_3_8);
        Rbtn_3_8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_3_8.setText("8 Numara");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("3.Kat");

        buttonGroup1.add(Rbtn_3_3);
        Rbtn_3_3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_3_3.setText("3 Numara");

        buttonGroup1.add(Rbtn_3_4);
        Rbtn_3_4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_3_4.setText("4 Numara");

        buttonGroup1.add(Rbtn_3_5);
        Rbtn_3_5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Rbtn_3_5.setText("5 Numara");
        Rbtn_3_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbtn_3_5ActionPerformed(evt);
            }
        });

        txt_Plaka.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbl_Plaka.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Plaka.setText("Plaka:");

        btn_KayıtYap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_KayıtYap.setText("Kayıt Yap");
        btn_KayıtYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KayıtYapActionPerformed(evt);
            }
        });

        lbl_Süre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Süre.setText("Süre:");

        buttonGroup2.add(Rbtn_Sure1);
        Rbtn_Sure1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Rbtn_Sure1.setText("3 Saatten Az");
        Rbtn_Sure1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbtn_Sure1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(Rbtn_Sure2);
        Rbtn_Sure2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Rbtn_Sure2.setText("3 Saat ile 7 Saat Arası");
        Rbtn_Sure2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbtn_Sure2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(Rbtn_Sure3);
        Rbtn_Sure3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Rbtn_Sure3.setText("7 Saat ile 12 Saat Arası");
        Rbtn_Sure3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbtn_Sure3ActionPerformed(evt);
            }
        });

        buttonGroup2.add(Rbtn_Sure4);
        Rbtn_Sure4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Rbtn_Sure4.setText("12 Saat ile 24 Saat Arası");
        Rbtn_Sure4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbtn_Sure4ActionPerformed(evt);
            }
        });

        lbl_Ücret.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Ücret.setText("Ücret:");

        lbl_SonucUcret.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_SonucUcret.setText("______");

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
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Rbtn_1_1)
                    .addComponent(Rbtn_1_2)
                    .addComponent(Rbtn_2_1)
                    .addComponent(Rbtn_2_2)
                    .addComponent(Rbtn_3_1)
                    .addComponent(Rbtn_3_2))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rbtn_1_3)
                    .addComponent(Rbtn_1_4)
                    .addComponent(Rbtn_2_3)
                    .addComponent(Rbtn_2_4)
                    .addComponent(Rbtn_3_3)
                    .addComponent(Rbtn_3_4))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Rbtn_1_5)
                    .addComponent(Rbtn_1_6)
                    .addComponent(Rbtn_2_5)
                    .addComponent(Rbtn_2_6)
                    .addComponent(Rbtn_3_6)
                    .addComponent(Rbtn_3_5))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Rbtn_1_7)
                    .addComponent(Rbtn_1_8)
                    .addComponent(Rbtn_2_7)
                    .addComponent(Rbtn_2_8)
                    .addComponent(Rbtn_3_7)
                    .addComponent(Rbtn_3_8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Plaka, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Plaka, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Süre, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rbtn_Sure2)
                    .addComponent(Rbtn_Sure3)
                    .addComponent(Rbtn_Sure1)
                    .addComponent(Rbtn_Sure4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_GeriDon)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_KayıtYap)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Ücret, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_SonucUcret)))
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Rbtn_1_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Rbtn_1_2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Rbtn_1_5)
                                    .addComponent(Rbtn_1_3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Rbtn_1_6)
                                    .addComponent(Rbtn_1_4)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Rbtn_1_7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Rbtn_1_8)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Rbtn_2_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Rbtn_2_2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Rbtn_2_5)
                                    .addComponent(Rbtn_2_3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Rbtn_2_6)
                                    .addComponent(Rbtn_2_4)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Rbtn_2_7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Rbtn_2_8)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Rbtn_3_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Rbtn_3_2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Rbtn_3_5)
                                    .addComponent(Rbtn_3_3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Rbtn_3_6)
                                    .addComponent(Rbtn_3_4)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Rbtn_3_7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Rbtn_3_8)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Ücret)
                            .addComponent(lbl_SonucUcret))
                        .addGap(18, 18, 18)
                        .addComponent(btn_KayıtYap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_GeriDon))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_Plaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_Plaka)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(Rbtn_Sure1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Rbtn_Sure2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Rbtn_Sure3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(lbl_Süre)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Rbtn_Sure4)))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Rbtn_1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbtn_1_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rbtn_1_3ActionPerformed

    private void Rbtn_3_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbtn_3_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rbtn_3_5ActionPerformed

    private void Rbtn_3_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbtn_3_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rbtn_3_7ActionPerformed

    private void Rbtn_Sure1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbtn_Sure1ActionPerformed
        lbl_SonucUcret.setText("8 TL");
    }//GEN-LAST:event_Rbtn_Sure1ActionPerformed

    private void Rbtn_Sure2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbtn_Sure2ActionPerformed
        lbl_SonucUcret.setText("18 TL");
    }//GEN-LAST:event_Rbtn_Sure2ActionPerformed

    private void Rbtn_Sure3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbtn_Sure3ActionPerformed
        lbl_SonucUcret.setText("30 TL");
    }//GEN-LAST:event_Rbtn_Sure3ActionPerformed

    private void Rbtn_Sure4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbtn_Sure4ActionPerformed
        lbl_SonucUcret.setText("45 TL");
    }//GEN-LAST:event_Rbtn_Sure4ActionPerformed

    private void btn_GeriDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GeriDonActionPerformed
        _Grup_12_AnaSayfa anaSayfa = new _Grup_12_AnaSayfa();
        anaSayfa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_GeriDonActionPerformed

    private void btn_KayıtYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KayıtYapActionPerformed
        //lbl_1.setText(""+buttonGroup1.getSelection().getActionCommand());  
        if(dbOperation.arac_kontrol(dbOperation.plakaKontrol(txt_Plaka.getText())) == 0)
        {
            JOptionPane.showMessageDialog(null, "Böyle bir plaka bulunmamaktadır");
        }
        else
        {
            String otoparkId_Stirng =buttonGroup1.getSelection().getActionCommand();
            int otoparkId_int = Integer.parseInt(otoparkId_Stirng);
            //int b = otoparkId_int + 3;
            int otoparkId = 0;
            String sure =buttonGroup2.getSelection().getActionCommand();
            dbOperation.fisOlusturma(
                    dbOperation.arac_kontrol(dbOperation.plakaKontrol(txt_Plaka.getText())),
                    otoparkId_int,
                    sure,
                    lbl_SonucUcret.getText());
            JOptionPane.showMessageDialog(null, "Kayıt işlemi başarılı!");
            _Grup_12_AnaSayfa anaSayfa = new _Grup_12_AnaSayfa();
            anaSayfa.setVisible(true);
            this.setVisible(false);
            //dbOperation.otoparkDolulukDeğiştirme(1, otoparkId);
        }
    }//GEN-LAST:event_btn_KayıtYapActionPerformed
    
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
            java.util.logging.Logger.getLogger(_Grup_12_AracGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_Grup_12_AracGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_Grup_12_AracGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_Grup_12_AracGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _Grup_12_AracGiris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Rbtn_1_1;
    private javax.swing.JRadioButton Rbtn_1_2;
    private javax.swing.JRadioButton Rbtn_1_3;
    private javax.swing.JRadioButton Rbtn_1_4;
    private javax.swing.JRadioButton Rbtn_1_5;
    private javax.swing.JRadioButton Rbtn_1_6;
    private javax.swing.JRadioButton Rbtn_1_7;
    private javax.swing.JRadioButton Rbtn_1_8;
    private javax.swing.JRadioButton Rbtn_2_1;
    private javax.swing.JRadioButton Rbtn_2_2;
    private javax.swing.JRadioButton Rbtn_2_3;
    private javax.swing.JRadioButton Rbtn_2_4;
    private javax.swing.JRadioButton Rbtn_2_5;
    private javax.swing.JRadioButton Rbtn_2_6;
    private javax.swing.JRadioButton Rbtn_2_7;
    private javax.swing.JRadioButton Rbtn_2_8;
    private javax.swing.JRadioButton Rbtn_3_1;
    private javax.swing.JRadioButton Rbtn_3_2;
    private javax.swing.JRadioButton Rbtn_3_3;
    private javax.swing.JRadioButton Rbtn_3_4;
    private javax.swing.JRadioButton Rbtn_3_5;
    private javax.swing.JRadioButton Rbtn_3_6;
    private javax.swing.JRadioButton Rbtn_3_7;
    private javax.swing.JRadioButton Rbtn_3_8;
    private javax.swing.JRadioButton Rbtn_Sure1;
    private javax.swing.JRadioButton Rbtn_Sure2;
    private javax.swing.JRadioButton Rbtn_Sure3;
    private javax.swing.JRadioButton Rbtn_Sure4;
    private javax.swing.JButton btn_GeriDon;
    private javax.swing.JButton btn_KayıtYap;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_Plaka;
    private javax.swing.JLabel lbl_SonucUcret;
    private javax.swing.JLabel lbl_Süre;
    private javax.swing.JLabel lbl_Ücret;
    private javax.swing.JTextField txt_Plaka;
    // End of variables declaration//GEN-END:variables
}
