/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversibilangan;

import javax.swing.JOptionPane;

/**
 *
 * @author WAN
 */
public class formkonversibilangan extends javax.swing.JFrame {

    /**
     * Creates new form formkonversibilangan
     */
    public formkonversibilangan() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputdata = new javax.swing.JLabel();
        outputdata = new javax.swing.JLabel();
        bilangan_dari = new javax.swing.JComboBox<>();
        bilangan_ke = new javax.swing.JComboBox<>();
        input_bilangan = new javax.swing.JTextField();
        output_bilangan = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Program Konversi Bilangan");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("PROGRAM KONVERSI BILANGAN");

        jLabel2.setText("Dari :");

        jLabel3.setText("Ke :");

        inputdata.setText("INPUT");

        outputdata.setText("OUTPUT");

        bilangan_dari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Heksadesimal", "Desimal", "Biner", "Oktal" }));
        bilangan_dari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilangan_dariActionPerformed(evt);
            }
        });

        bilangan_ke.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Heksadesimal", "Desimal", "Biner", "Oktal" }));
        bilangan_ke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilangan_keActionPerformed(evt);
            }
        });

        input_bilangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_bilanganActionPerformed(evt);
            }
        });

        output_bilangan.setEditable(false);
        output_bilangan.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("KONVERSI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sitka Subheading", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 0));
        jLabel4.setText("Wira Aji Nugraha (32602000064)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(bilangan_dari, 0, 141, Short.MAX_VALUE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(bilangan_ke, 0, 141, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputdata)
                            .addComponent(outputdata))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(output_bilangan, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(input_bilangan))))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(215, 215, 215))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(bilangan_dari)
                    .addComponent(bilangan_ke))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputdata)
                    .addComponent(input_bilangan))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(output_bilangan)
                    .addComponent(outputdata))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_bilanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_bilanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_bilanganActionPerformed

    private void bilangan_dariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilangan_dariActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_bilangan_dariActionPerformed

    private void bilangan_keActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilangan_keActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_bilangan_keActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            //Konversi bilangan Heksadesimal
            if(bilangan_dari.getSelectedItem() == "Heksadesimal"){
                //Konversi bilangan Heksadesimal ke desimal
                if(bilangan_ke.getSelectedItem() == "Desimal"){
                    String heksa = input_bilangan.getText();
                    int outDes = Integer.parseInt(heksa,16);
                    output_bilangan.setText(Integer.toUnsignedString(outDes));
                }
                
                //Konversi bilangan Heksadesimal ke Biner
                else if(bilangan_ke.getSelectedItem() == "Biner"){
                    String heksa2 = input_bilangan.getText();
                    int outDes2 = Integer.parseInt(heksa2,16);
                    String hasilDes = Integer.toUnsignedString(outDes2);
                    int hasilBiner = Integer.parseInt(hasilDes);
                    output_bilangan.setText(Integer.toBinaryString(hasilBiner));
                }
                
                //Konversi bilangan Heksadesimal ke Oktal
                else if(bilangan_ke.getSelectedItem() == "Oktal"){
                    String heksa3 = input_bilangan.getText();
                    int outDes3 = Integer.parseInt(heksa3,16);
                    String hasilDes2 = Integer.toUnsignedString(outDes3);
                    int hasilOktal2 = Integer.parseInt(hasilDes2);
                    output_bilangan.setText(Integer.toOctalString(hasilOktal2));
                }
                
                //Konversi bilangan Heksadesimal ke Heksadesimal
                else if(bilangan_ke.getSelectedItem()== "Heksadesimal"){
                    String heksa4 = input_bilangan.getText();
                    output_bilangan.setText(heksa4);    
                }
            }
            
            //konversi bil. oktal
            else if (bilangan_dari.getSelectedItem () == "Oktal"){
                //konversi bil. oktal ke desimal
                if(bilangan_ke.getSelectedItem() == "Desimal"){
                    String oktal = input_bilangan.getText();
                    int outDes3 = Integer.parseInt(oktal,8);
                    output_bilangan.setText(Integer.toUnsignedString(outDes3));
                }
 
                //konversi bil. oktal ke biner
                else if(bilangan_ke.getSelectedItem() == "Biner"){
                    String oktal2 = input_bilangan.getText();
                    int outDes4 = Integer.parseInt(oktal2,8);
                    String hasilDes2 = Integer.toUnsignedString(outDes4);
                    int hasilBiner2 = Integer.parseInt(hasilDes2); 
                    output_bilangan.setText(Integer.toBinaryString(hasilBiner2));
                }
                
                //konversi bil. oktal ke heksadesimal
                else if(bilangan_ke.getSelectedItem() == "Heksadesimal"){
                    String heksa3 = input_bilangan.getText();
                    int outDes5 = Integer.parseInt(heksa3,8);
                    String hasilDes3 = Integer.toUnsignedString(outDes5);
                    int hasilHex3 = Integer.parseInt(hasilDes3);
                    output_bilangan.setText(Integer.toHexString(hasilHex3));
                }
                
                //konversi bil. oktal ke oktal
                else if(bilangan_ke.getSelectedItem()== "Oktal"){
                    String oktal7 = input_bilangan.getText();
                    output_bilangan.setText(oktal7);    
                }
            }
            
            //konversi bil. Biner
            else if (bilangan_dari.getSelectedItem () == "Biner"){
                //konversi bil. Biner ke desimal
                if(bilangan_ke.getSelectedItem() == "Desimal"){
                    String biner4 = input_bilangan.getText();
                    int outDes6 = Integer.parseInt(biner4,2);
                    output_bilangan.setText(Integer.toUnsignedString(outDes6));
                }
                
                //konversi bil. biner ke oktal
                else if(bilangan_ke.getSelectedItem() == "Oktal"){
                    String biner7 = input_bilangan.getText();
                    int outDes7 = Integer.parseInt(biner7,2);
                    String hasilBiner7 = Integer.toUnsignedString(outDes7);
                    int hasilOktal7 = Integer.parseInt(hasilBiner7); 
                    output_bilangan.setText(Integer.toOctalString(hasilOktal7));
                }
                
                //konversi bil. biner ke heksadesimal
                else if(bilangan_ke.getSelectedItem() == "Heksadesimal"){
                    String biner8 = input_bilangan.getText();
                    int outDes8 = Integer.parseInt(biner8,2);
                    String hasilBiner8 = Integer.toUnsignedString(outDes8);
                    int hasilHeksa8 = Integer.parseInt(hasilBiner8);
                    output_bilangan.setText(Integer.toHexString(hasilHeksa8));
                }
                
                //konversi bil. biner ke biner
                else if(bilangan_ke.getSelectedItem()== "Biner"){
                    String biner10 = input_bilangan.getText();
                    output_bilangan.setText(biner10);    
                }
            }
            
            //konversi bil. Desimal
            else if (bilangan_dari.getSelectedItem () == "Desimal"){
                //konversi bil. Desimal ke Oktal
                if(bilangan_ke.getSelectedItem() == "Oktal"){
                    String desimal1 = input_bilangan.getText();
                    int outOktal9 = Integer.parseInt(desimal1);
                    output_bilangan.setText(Integer.toOctalString(outOktal9));
                }
                
                //konversi bil. desimal ke Biner
                else if(bilangan_ke.getSelectedItem() == "Biner"){
                    String desimal2 = input_bilangan.getText();
                    int outBiner9 = Integer.parseInt(desimal2);
                    output_bilangan.setText(Integer.toBinaryString(outBiner9));
                }
                
                //konversi bil. desimal ke heksadesimal
                else if(bilangan_ke.getSelectedItem() == "Heksadesimal"){
                    String desimal3 = input_bilangan.getText();
                    int outHeksa9 = Integer.parseInt(desimal3);
                    output_bilangan.setText(Integer.toHexString(outHeksa9));
                }
                
                //konversi bil. desimal ke desimal
                else if(bilangan_ke.getSelectedItem()== "Desimal"){
                    String des13 = input_bilangan.getText();
                    output_bilangan.setText(des13);    
                }
            }
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Input Tidak Sesuai");
        }
                
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formkonversibilangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formkonversibilangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formkonversibilangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formkonversibilangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formkonversibilangan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bilangan_dari;
    private javax.swing.JComboBox<String> bilangan_ke;
    private javax.swing.JTextField input_bilangan;
    private javax.swing.JLabel inputdata;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField output_bilangan;
    private javax.swing.JLabel outputdata;
    // End of variables declaration//GEN-END:variables
}
