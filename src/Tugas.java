
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rizaalvin
 */
public class Tugas extends javax.swing.JFrame {

    /**
     * Creates new form Tugas
     */
    public Tugas() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        nama = new javax.swing.JTextField();
        tinggi = new javax.swing.JTextField();
        berat = new javax.swing.JTextField();
        rperempuan = new javax.swing.JRadioButton();
        rlakilaki = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        bideal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        hasil2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        hasil1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("CEK IDEAL TUBUH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 0, 130, 40);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 50, 60, 20);

        jLabel3.setText("Tinggi");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 90, 50, 20);

        jLabel4.setText("Berat");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 120, 50, 30);

        jLabel5.setText("Jenis Kelamin");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 170, 90, 30);

        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 210, 70, 30);

        jButton2.setText("Coba Lagi");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(150, 210, 90, 30);

        jButton3.setText("Keluar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(260, 210, 80, 30);
        getContentPane().add(nama);
        nama.setBounds(110, 50, 200, 30);
        getContentPane().add(tinggi);
        tinggi.setBounds(110, 90, 70, 30);
        getContentPane().add(berat);
        berat.setBounds(110, 130, 70, 30);

        buttonGroup1.add(rperempuan);
        rperempuan.setText("Perempuan");
        rperempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rperempuanActionPerformed(evt);
            }
        });
        getContentPane().add(rperempuan);
        rperempuan.setBounds(140, 170, 100, 30);

        buttonGroup1.add(rlakilaki);
        rlakilaki.setText("Laki-Laki");
        getContentPane().add(rlakilaki);
        rlakilaki.setBounds(270, 170, 100, 30);

        jLabel6.setText("Berat ideal anda adalah");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 260, 150, 30);
        getContentPane().add(bideal);
        bideal.setBounds(210, 260, 40, 30);

        jLabel7.setText("kg");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(260, 260, 20, 30);
        getContentPane().add(hasil2);
        hasil2.setBounds(30, 370, 330, 30);

        jLabel8.setText("Hasil Diagnosa Kesehatan");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 300, 150, 30);

        hasil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasil1ActionPerformed(evt);
            }
        });
        getContentPane().add(hasil1);
        hasil1.setBounds(30, 330, 330, 30);

        setBounds(0, 0, 416, 459);
    }// </editor-fold>//GEN-END:initComponents

    private void rperempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rperempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rperempuanActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void hasil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasil1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasil1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (berat.getText().equals("")||nama.getText().equals("")||tinggi.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Kotak isian belum diisi");
        } else if(rperempuan.isSelected()||rlakilaki.isSelected()){
            try{
                Proses();
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Inputan ada yang salah");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Jenis kelamin kosong");
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        nama.setText("");
        tinggi.setText("");
        berat.setText("");
        buttonGroup1.clearSelection();
        bideal.setText("");
        hasil1.setText("");
        hasil2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tugas().setVisible(true);
            }
        });
    }
    Double ti, bt, h1;
    String temp;
    private void Proses() {
        ti = Double.valueOf(tinggi.getText());
        bt = Double.valueOf(berat.getText());
        
        if(rperempuan.isSelected()){
            h1 = (ti - 100) * 1;
    } else if (rlakilaki.isSelected()){
        h1 = (ti - 104) * 1;
    }
        temp = Double.toString(h1.intValue());
        
        if(h1<bt) {
           bideal.setText(temp);
           hasil1.setText("Maaf " + nama.getText() + ", Sepertinya anda Overweight");
           hasil2.setText("Banyaklah berolahraga dan hindari makanan berkolesterol");
        } else if(h1>bt){
            bideal.setText(temp);
            hasil1.setText("Maaf " + nama.getText() + ", Sepertinya anda Underweight");
            hasil2.setText("Banyaklah mengkonsumsi makanan yang berkarbohidrat");
        } else {
            bideal.setText(temp);
            hasil1.setText("Hallo " + nama.getText() + ", Berat badan anda sudah ideal :* ");
            hasil2.setText("Lanjutkan pola makan teratur dan gaya hidupsehat");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField berat;
    private javax.swing.JTextField bideal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField hasil1;
    private javax.swing.JTextField hasil2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nama;
    private javax.swing.JRadioButton rlakilaki;
    private javax.swing.JRadioButton rperempuan;
    private javax.swing.JTextField tinggi;
    // End of variables declaration//GEN-END:variables
}
