/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;

import Controller.ControllerImp;
import Model.Khoa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Hoang
 */
public class SuaKhoaForm extends javax.swing.JDialog {

    /**
     * Creates new form SuaKhoa
     */
    private TrangChuView trangChu;
    private ControllerImp controller = new ControllerImp();
    private List<Khoa> listKhoa = new ArrayList<>();
    private final String FILE_KHOA = "Khoa.txt";
    private String tenKhoaCanSua;
            
    public SuaKhoaForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        trangChu = (TrangChuView) parent;
        this.setLocationRelativeTo(null);
        this.setTitle("Sửa khoa");
        txtSoLuongGV.setEnabled(false);
        labelErrorTenKhoa.setVisible(false);
        listKhoa = controller.docFile(FILE_KHOA);
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
        btnCapNhat = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        txtTenKhoa = new javax.swing.JTextField();
        txtSoLuongGV = new javax.swing.JTextField();
        labelErrorTenKhoa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Tên khoa:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Sửa thông tin khoa");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Số lượng giảng viên:");

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

        txtTenKhoa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        txtSoLuongGV.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSoLuongGV.setEnabled(false);

        labelErrorTenKhoa.setForeground(new java.awt.Color(255, 0, 51));
        labelErrorTenKhoa.setText("Vui lòng nhập tên khoa!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnCapNhat)
                        .addGap(49, 49, 49)
                        .addComponent(btnLamMoi))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelErrorTenKhoa)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTenKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(txtSoLuongGV))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel2)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelErrorTenKhoa)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTenKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSoLuongGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhat)
                    .addComponent(btnLamMoi))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        if (txtTenKhoa.getText().trim().equalsIgnoreCase(tenKhoaCanSua)) {
            JOptionPane.showMessageDialog(rootPane, "Sửa thành công!",
                    "Thông báo sửa thành công", JOptionPane.INFORMATION_MESSAGE);
            trangChu.setVisible(true);
            this.dispose();
        } else {
            String tenKhoaMoi = txtTenKhoa.getText().trim();
            boolean isOk = true;
            if (tenKhoaMoi.isEmpty()) {
                labelErrorTenKhoa.setVisible(true);
                isOk = false;
            } else {
                for (Khoa k : listKhoa) {
                    if (k.getTenKhoa().equalsIgnoreCase(tenKhoaMoi)) {
                        JOptionPane.showMessageDialog(rootPane,
                                "Tên khoa đã tồn tại!");
                        txtTenKhoa.setText(tenKhoaCanSua);
                        isOk = false;
                        break;
                    }
                }
            }

            if (isOk) {
                trangChu.suaKhoa(tenKhoaMoi);
                JOptionPane.showMessageDialog(rootPane, "Sửa thành công!",
                        "Thông báo sửa thành công", JOptionPane.INFORMATION_MESSAGE);
                trangChu.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        txtTenKhoa.setText("");
        labelErrorTenKhoa.setVisible(false);
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
            java.util.logging.Logger.getLogger(SuaKhoaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaKhoaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaKhoaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaKhoaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SuaKhoaForm dialog = new SuaKhoaForm(new javax.swing.JFrame(), true);
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

    void setEditData(Khoa k) {
        tenKhoaCanSua = k.getTenKhoa().trim();
        txtTenKhoa.setText(k.getTenKhoa().trim());
        txtSoLuongGV.setText(k.getDanhSachGiangVien().size() + "");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelErrorTenKhoa;
    private javax.swing.JTextField txtSoLuongGV;
    private javax.swing.JTextField txtTenKhoa;
    // End of variables declaration//GEN-END:variables

}
