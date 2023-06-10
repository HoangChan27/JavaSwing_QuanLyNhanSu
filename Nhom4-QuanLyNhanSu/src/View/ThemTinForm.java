/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;

import Model.TinTuyenDung;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Hoang
 */
public class ThemTinForm extends javax.swing.JDialog {

    /**
     * Creates new form ThemTinTuyenDung
     */
    private TrangChuView trangChu;

    public ThemTinForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        trangChu = (TrangChuView) parent;
        this.setLocationRelativeTo(null);
        this.setTitle("Thêm tin tuyển dụng mới");
        labelErrorViTri.setVisible(false);
        labelErrorYeuCau.setVisible(false);
        labelErrorSoLuong.setVisible(false);
        labelErrorHanNop.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelViTri = new javax.swing.JLabel();
        txtViTri = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHanNop = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnThemMoi = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        txtYeuCau = new javax.swing.JTextField();
        labelErrorViTri = new javax.swing.JLabel();
        labelErrorYeuCau = new javax.swing.JLabel();
        labelErrorSoLuong = new javax.swing.JLabel();
        labelErrorHanNop = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelViTri.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelViTri.setText("Vị trí tuyển dụng:");

        txtViTri.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setLabelFor(txtYeuCau);
        jLabel3.setText("Yêu cầu tuyển dụng:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Số lượng tuyển dụng:");

        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSoLuong.setText("1");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Hạn nộp hồ sơ:");

        txtHanNop.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtHanNop.setText("13/06/2023");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel1.setText("Thêm tin tuyển dụng mới");

        btnThemMoi.setBackground(new java.awt.Color(102, 204, 0));
        btnThemMoi.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnThemMoi.setForeground(new java.awt.Color(255, 255, 255));
        btnThemMoi.setText("Thêm mới");
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });

        btnLamMoi.setBackground(new java.awt.Color(153, 153, 153));
        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnLamMoi.setForeground(new java.awt.Color(255, 255, 255));
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        txtYeuCau.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        labelErrorViTri.setForeground(new java.awt.Color(255, 0, 51));
        labelErrorViTri.setText("Vị trí tuyển dụng không được trống!");

        labelErrorYeuCau.setForeground(new java.awt.Color(255, 0, 51));
        labelErrorYeuCau.setText("Yêu cầu tuyển dụng không được trống!");

        labelErrorSoLuong.setForeground(new java.awt.Color(255, 0, 51));
        labelErrorSoLuong.setText("Số lượng không được trống, chỉ chứa số và phải > 0!");

        labelErrorHanNop.setForeground(new java.awt.Color(255, 0, 51));
        labelErrorHanNop.setText("Hạn nộp hồ sơ không hợp lệ, vui lòng nhập ngày/tháng/năm! (VD: 13/06/2023)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(labelViTri))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelErrorViTri)
                            .addComponent(labelErrorYeuCau))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelErrorSoLuong)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtViTri, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                                .addComponent(txtYeuCau, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSoLuong)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelErrorHanNop)
                    .addComponent(txtHanNop, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 42, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(btnThemMoi)
                        .addGap(93, 93, 93)
                        .addComponent(btnLamMoi))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(labelErrorViTri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtViTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelViTri))
                .addGap(25, 25, 25)
                .addComponent(labelErrorYeuCau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtYeuCau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(labelErrorSoLuong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(labelErrorHanNop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHanNop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemMoi)
                    .addComponent(btnLamMoi))
                .addGap(103, 103, 103))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        String viTri = txtViTri.getText().trim();
        String yeuCau = txtYeuCau.getText().trim();
        String soLuongTuyenDung = txtSoLuong.getText().trim();
        String hanNopHoSo = txtHanNop.getText().trim();
        boolean isOk = true;

        if (viTri.isEmpty()) {
            labelErrorViTri.setVisible(true);
            isOk = false;
        } else {
            labelErrorViTri.setVisible(false);
        }

        if (yeuCau.isEmpty()) {
            labelErrorYeuCau.setVisible(true);
            isOk = false;
        } else {
            labelErrorYeuCau.setVisible(false);
        }

        if (soLuongTuyenDung.isEmpty() || !soLuongTuyenDung.matches("\\d+")) {
            labelErrorSoLuong.setVisible(true);
            isOk = false;
        } else {
            if (Integer.parseInt(soLuongTuyenDung) < 1) {
                labelErrorSoLuong.setVisible(true);
                isOk = false;
            } else {
                labelErrorSoLuong.setVisible(false);
            }
        }

        if (hanNopHoSo.isEmpty()) {
            labelErrorHanNop.setVisible(true);
            isOk = false;
        } else {
            try {
                Date hanNop = new SimpleDateFormat("dd/MM/yyyy").parse(hanNopHoSo);
                labelErrorHanNop.setVisible(false);
            } catch (ParseException e) {
                labelErrorHanNop.setVisible(true);
                isOk = false;
            }
        }

        if (isOk) {
            TinTuyenDung tin = new TinTuyenDung(viTri, yeuCau, Integer.parseInt(soLuongTuyenDung), hanNopHoSo);
            trangChu.themTinTD(tin);
            JOptionPane.showMessageDialog(rootPane, "Thêm thành công!", 
                    "Thông báo thêm thành công", JOptionPane.INFORMATION_MESSAGE);
            trangChu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        txtViTri.setText("");
        txtYeuCau.setText("");
        txtSoLuong.setText("");
        txtHanNop.setText("");
        labelErrorViTri.setVisible(false);
        labelErrorYeuCau.setVisible(false);
        labelErrorSoLuong.setVisible(false);
        labelErrorHanNop.setVisible(false);
    }//GEN-LAST:event_btnLamMoiActionPerformed

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
            java.util.logging.Logger.getLogger(ThemTinForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemTinForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemTinForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemTinForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThemTinForm dialog = new ThemTinForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelErrorHanNop;
    private javax.swing.JLabel labelErrorSoLuong;
    private javax.swing.JLabel labelErrorViTri;
    private javax.swing.JLabel labelErrorYeuCau;
    private javax.swing.JLabel labelViTri;
    private javax.swing.JTextField txtHanNop;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtViTri;
    private javax.swing.JTextField txtYeuCau;
    // End of variables declaration//GEN-END:variables
}
