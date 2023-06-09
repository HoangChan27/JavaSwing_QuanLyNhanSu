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
public class SuaTinForm extends javax.swing.JDialog {

    /**
     * Creates new form SuaTin
     */
    
    private TrangChuView trangChu;
    
    public SuaTinForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        trangChu = (TrangChuView) parent;
        this.setLocationRelativeTo(null);
        this.setTitle("Sửa tin tuyển dụng");
        txtMaTin.setEnabled(false);
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

        jLabel1 = new javax.swing.JLabel();
        labelErrorViTri = new javax.swing.JLabel();
        txtViTri = new javax.swing.JTextField();
        labelViTri = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelErrorYeuCau = new javax.swing.JLabel();
        txtYeuCau = new javax.swing.JTextField();
        labelErrorSoLuong = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHanNop = new javax.swing.JTextField();
        labelErrorHanNop = new javax.swing.JLabel();
        btnCapNhat = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtMaTin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel1.setText("Sửa tin tuyển dụng");

        labelErrorViTri.setForeground(new java.awt.Color(255, 0, 51));
        labelErrorViTri.setText("Vị trí tuyển dụng không được trống!");

        txtViTri.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        labelViTri.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelViTri.setText("Vị trí tuyển dụng:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Yêu cầu tuyển dụng:");

        labelErrorYeuCau.setForeground(new java.awt.Color(255, 0, 51));
        labelErrorYeuCau.setText("Yêu cầu tuyển dụng không được trống!");

        txtYeuCau.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        labelErrorSoLuong.setForeground(new java.awt.Color(255, 0, 51));
        labelErrorSoLuong.setText("Số lượng không được trống, chỉ chứa số và phải > 0!");

        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSoLuong.setText("1");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Số lượng tuyển dụng:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Hạn nộp hồ sơ:");

        txtHanNop.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtHanNop.setText("13/06/2023");

        labelErrorHanNop.setForeground(new java.awt.Color(255, 0, 51));
        labelErrorHanNop.setText("Hạn nộp hồ sơ không hợp lệ, vui lòng nhập ngày/tháng/năm! (VD: 13/06/2023)");

        btnCapNhat.setBackground(new java.awt.Color(102, 204, 0));
        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnCapNhat.setForeground(new java.awt.Color(255, 255, 255));
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Mã tin:");

        txtMaTin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtMaTin.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelErrorHanNop)
                    .addComponent(txtHanNop, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addComponent(txtSoLuong))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addComponent(btnCapNhat)
                                .addGap(63, 63, 63)
                                .addComponent(btnLamMoi))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(labelViTri)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelErrorSoLuong)
                                    .addComponent(labelErrorYeuCau)
                                    .addComponent(labelErrorViTri)
                                    .addComponent(txtYeuCau)
                                    .addComponent(txtViTri)
                                    .addComponent(txtMaTin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(242, 242, 242))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhat)
                    .addComponent(btnLamMoi))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        String maTin = txtMaTin.getText().trim();
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
            tin.setMaTin(Integer.parseInt(maTin));
            trangChu.suaTinTD(tin);
            JOptionPane.showMessageDialog(rootPane, "Sửa thành công!", 
                    "Thông báo sửa thành công", JOptionPane.INFORMATION_MESSAGE);
            trangChu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

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
            java.util.logging.Logger.getLogger(SuaTinForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaTinForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaTinForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaTinForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SuaTinForm dialog = new SuaTinForm(new javax.swing.JFrame(), true);
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

    // lấy dữ liệu của bản ghi được chọn từ modelTinTD
    public void setEditData(TinTuyenDung tin) {
        txtMaTin.setText(tin.getMaTin() + "");
        txtViTri.setText(tin.getViTri());
        txtYeuCau.setText(tin.getYeuCau());
        txtSoLuong.setText(tin.getSoLuong() + "");
        txtHanNop.setText(tin.getHanNopHoSo() + "");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelErrorHanNop;
    private javax.swing.JLabel labelErrorSoLuong;
    private javax.swing.JLabel labelErrorViTri;
    private javax.swing.JLabel labelErrorYeuCau;
    private javax.swing.JLabel labelViTri;
    private javax.swing.JTextField txtHanNop;
    private javax.swing.JTextField txtMaTin;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtViTri;
    private javax.swing.JTextField txtYeuCau;
    // End of variables declaration//GEN-END:variables
    
}
