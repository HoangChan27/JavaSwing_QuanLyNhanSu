/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;

import Model.HoSo;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Hoang
 */
public class SuaHoSoForm extends javax.swing.JDialog {

    /**
     * Creates new form SuaHoSoForm
     */
    
    private TrangChuView trangChu;
    private final int NOW_YEAR = LocalDate.now().getYear();
    
    public SuaHoSoForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        trangChu = (TrangChuView) parent;
        this.setLocationRelativeTo(null);
        this.setTitle("Sửa hồ sơ");
        txtMaHS.setEnabled(false);
        labelErrorHoTen.setVisible(false);
        labelErrorDiaChi.setVisible(false);
        labelErrorNamSinh.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGioiTinh = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        labelErrorHoTen = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        radGioiTinhNu = new javax.swing.JRadioButton();
        radGioiTinhNam = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        labelErrorDiaChi = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        labelErrorNamSinh = new javax.swing.JLabel();
        txtNamSinh = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboTrinhDo = new javax.swing.JComboBox<>();
        cboViTriUngTuyen = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cboTrangThai = new javax.swing.JComboBox<>();
        btnCapNhat = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtMaHS = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel1.setText("Sửa hồ sơ");

        labelErrorHoTen.setForeground(new java.awt.Color(255, 0, 51));
        labelErrorHoTen.setText("Họ tên chỉ được chứa chữ cái!");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Họ tên:");

        txtHoTen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        buttonGroupGioiTinh.add(radGioiTinhNu);
        radGioiTinhNu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radGioiTinhNu.setText("Nữ");

        buttonGroupGioiTinh.add(radGioiTinhNam);
        radGioiTinhNam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radGioiTinhNam.setText("Nam");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Giới tính:");

        labelErrorDiaChi.setForeground(new java.awt.Color(255, 0, 51));
        labelErrorDiaChi.setText("Vui lòng nhập địa chỉ!");

        txtDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Địa chỉ:");

        labelErrorNamSinh.setForeground(new java.awt.Color(255, 0, 51));
        labelErrorNamSinh.setText("Năm sinh chỉ được chứa số (sao cho tuổi >= 24)!");

        txtNamSinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNamSinh.setText("1996");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Năm sinh:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Trình độ:");

        cboTrinhDo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboTrinhDo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cao đẳng", "Đại học", "Thạc sĩ", "Tiến sĩ", "Phó Giao sư", "Giáo sư" }));
        cboTrinhDo.setSelectedIndex(1);

        cboViTriUngTuyen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboViTriUngTuyen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giảng viên", "Chuyên viên" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Vị trí ứng tuyển:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Trạng thái:");

        cboTrangThai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chờ duyệt", "Đã duyệt", "Loại" }));

        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Mã HS:");

        txtMaHS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(btnCapNhat)
                .addGap(48, 48, 48)
                .addComponent(btnLamMoi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNamSinh, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cboTrinhDo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboViTriUngTuyen, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radGioiTinhNu)
                                        .addGap(50, 50, 50)
                                        .addComponent(radGioiTinhNam))
                                    .addComponent(labelErrorHoTen)
                                    .addComponent(labelErrorDiaChi)
                                    .addComponent(labelErrorNamSinh)
                                    .addComponent(txtDiaChi)
                                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMaHS, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtMaHS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelErrorHoTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(radGioiTinhNam)
                    .addComponent(radGioiTinhNu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelErrorDiaChi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelErrorNamSinh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboTrinhDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboViTriUngTuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhat)
                    .addComponent(btnLamMoi))
                .addGap(170, 170, 170))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        boolean isOk = true;

        String hoTen = txtHoTen.getText();
        if (hoTen.trim().isEmpty()) {
            labelErrorHoTen.setVisible(true);
            isOk = false;
        } else {
            if (!hoTen.matches("^[a-zA-Z\\sÀ-ỹ]+$")) {
                labelErrorHoTen.setVisible(true);
                isOk = false;
            } else {
                labelErrorHoTen.setVisible(false);
            }
        }

        String gioiTinh = "";
        if (radGioiTinhNu.isSelected()) {
            gioiTinh = "Nữ";
        } else if (radGioiTinhNam.isSelected()) {
            gioiTinh = "Nam";
        }

        String diaChi = txtDiaChi.getText();
        if (diaChi.trim().isEmpty()) {
            labelErrorDiaChi.setVisible(true);
            isOk = false;
        } else {
            labelErrorDiaChi.setVisible(false);
        }

        String namSinh = txtNamSinh.getText();
        if (namSinh.trim().isEmpty() || !namSinh.matches("\\d+")
            || (NOW_YEAR - Integer.parseInt(namSinh)) < 24) {
            labelErrorNamSinh.setVisible(true);
            isOk = false;
        } else {
            labelErrorNamSinh.setVisible(false);
        }

        String trinhDo = cboTrinhDo.getSelectedItem().toString();
        String viTriUngTuyen = cboViTriUngTuyen.getSelectedItem().toString();
        String trangThai = cboTrangThai.getSelectedItem().toString();

        if (isOk) {
            HoSo hoSo = new HoSo(hoTen, gioiTinh, diaChi, Integer.parseInt(namSinh),
                trinhDo, viTriUngTuyen, trangThai);
            hoSo.setMaHoSo(Integer.parseInt(txtMaHS.getText()));
            trangChu.suaHoSo(hoSo);
            JOptionPane.showMessageDialog(rootPane, "Sửa thành công!",
                "Thông báo sửa thành công", JOptionPane.INFORMATION_MESSAGE);
            trangChu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        txtHoTen.setText("");
        radGioiTinhNu.setSelected(true);
        radGioiTinhNam.setSelected(false);
        txtDiaChi.setText("");
        txtNamSinh.setText("");
        cboTrinhDo.setSelectedIndex(1);
        cboViTriUngTuyen.setSelectedIndex(0);
        cboTrangThai.setSelectedIndex(0);
        labelErrorHoTen.setText("");
        labelErrorDiaChi.setText("");
        labelErrorNamSinh.setText("");
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
            java.util.logging.Logger.getLogger(SuaHoSoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaHoSoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaHoSoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaHoSoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SuaHoSoForm dialog = new SuaHoSoForm(new javax.swing.JFrame(), true);
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

    // lấy dữ liệu của bản ghi được chọn từ modelHoSo
    void setEditData(HoSo h) {
        txtMaHS.setText(h.getMaHoSo() + "");
        txtHoTen.setText(h.getHoTen());
        if (h.getGioiTinh().equals("Nữ")) {
            radGioiTinhNu.setSelected(true);
        } else {
            radGioiTinhNam.setSelected(true);
        }
        txtDiaChi.setText(h.getDiaChi());
        txtNamSinh.setText(h.getNamSinh() + "");
        cboTrinhDo.setSelectedItem(h.getTrinhDo());
        cboViTriUngTuyen.setSelectedItem(h.getViTriUngTuyen());
        cboTrangThai.setSelectedItem(h.getTrangThai());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.ButtonGroup buttonGroupGioiTinh;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JComboBox<String> cboTrinhDo;
    private javax.swing.JComboBox<String> cboViTriUngTuyen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelErrorDiaChi;
    private javax.swing.JLabel labelErrorHoTen;
    private javax.swing.JLabel labelErrorNamSinh;
    private javax.swing.JRadioButton radGioiTinhNam;
    private javax.swing.JRadioButton radGioiTinhNu;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaHS;
    private javax.swing.JTextField txtNamSinh;
    // End of variables declaration//GEN-END:variables
}