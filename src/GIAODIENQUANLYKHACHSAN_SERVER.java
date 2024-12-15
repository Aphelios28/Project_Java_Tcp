
import doancanhan_phamvannhattruong.DANHSACHPHONG;
import doancanhan_phamvannhattruong.PHONG;
import doancanhan_phamvannhattruong.TCPSERVER;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class GIAODIENQUANLYKHACHSAN_SERVER extends javax.swing.JFrame {

    /**
     * Creates new form GIAODIENQUANLYKHACHSAN_SERVER
     */
    DefaultTableModel model;
    TCPSERVER server = new TCPSERVER();
    DANHSACHPHONG danhSachPhong;
    public GIAODIENQUANLYKHACHSAN_SERVER() {
        initComponents();
        Init();
    }

    public void Init() {
        model = (DefaultTableModel) tbDanhSachPhong.getModel();
        tbDanhSachPhong.setModel(model);
        danhSachPhong = new DANHSACHPHONG();
        docFile();
    }

    public void docFile() {
        danhSachPhong.docFile("DanhSachPhong.txt");
        for (PHONG phong : danhSachPhong.getDsp()) {
            Them1DongVaoTable(phong);
        }
    }

    public void Them1DongVaoTable(PHONG p) {
        model.addRow(new Object[]{p.getMaPhong(), p.getTenKhachHang(), p.getSoLuongKhach(), p.getNgayNhanPhong(), p.getLoaiPhong(), p.getThoiGianOLaiDuKien()});
    }

    public void XoaBang() {
        for (int i = tbDanhSachPhong.getRowCount(); i > 0; i--) {
            model.removeRow(i - 1);
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMaPhong = new javax.swing.JTextField();
        txtTenKhachHang = new javax.swing.JTextField();
        txtSoLuongKhach = new javax.swing.JTextField();
        txtNgayNhanPhong = new javax.swing.JTextField();
        txtLoaiPhong = new javax.swing.JTextField();
        txtThoiGianOLai = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDanhSachPhong = new javax.swing.JTable();
        btKetNoiClient = new javax.swing.JButton();
        btHuyKetNoi = new javax.swing.JButton();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btTim = new javax.swing.JButton();
        btInBang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Quản lý khách sạn");

        jLabel2.setText("Thông tin phòng");

        jLabel3.setText("Mã phòng");

        jLabel4.setText("Tên khách hàng");

        jLabel5.setText("Số lượng khách");

        jLabel6.setText("Ngày nhận phòng");

        jLabel7.setText("Loại phòng");

        jLabel8.setText("Thời gian ở lại");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(txtTenKhachHang)
                            .addComponent(txtSoLuongKhach)
                            .addComponent(txtNgayNhanPhong)
                            .addComponent(txtLoaiPhong)
                            .addComponent(txtThoiGianOLai))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4))
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSoLuongKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNgayNhanPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtThoiGianOLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        tbDanhSachPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã phòng", "Tên khách hàng", "Số lượng khách", "Ngày nhận phòng", "Loại phòng", "Thời gian ở lại"
            }
        ));
        jScrollPane1.setViewportView(tbDanhSachPhong);

        btKetNoiClient.setText("Kết nối với client");
        btKetNoiClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKetNoiClientActionPerformed(evt);
            }
        });

        btHuyKetNoi.setText("Hủy kết nối với client");
        btHuyKetNoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHuyKetNoiActionPerformed(evt);
            }
        });

        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btTim.setText("Tìm");
        btTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimActionPerformed(evt);
            }
        });

        btInBang.setText("In bảng ");
        btInBang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInBangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btKetNoiClient)
                .addGap(48, 48, 48)
                .addComponent(btHuyKetNoi)
                .addGap(54, 54, 54)
                .addComponent(btThem)
                .addGap(50, 50, 50)
                .addComponent(btSua)
                .addGap(52, 52, 52)
                .addComponent(btXoa)
                .addGap(42, 42, 42)
                .addComponent(btTim)
                .addGap(37, 37, 37)
                .addComponent(btInBang)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btKetNoiClient)
                    .addComponent(btHuyKetNoi)
                    .addComponent(btThem)
                    .addComponent(btSua)
                    .addComponent(btXoa)
                    .addComponent(btTim)
                    .addComponent(btInBang))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btKetNoiClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKetNoiClientActionPerformed
        try {
            // TODO add your handling code here:
            int port = 12345;
            server.ConnectServer(port);
            JOptionPane.showMessageDialog(null, "Đã kết nối thành công");
            btKetNoiClient.setEnabled(false);
            btHuyKetNoi.setEnabled(true);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btKetNoiClientActionPerformed
//    public PHONG layThongTinPhong(){
//        
//    }
    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        try {
        String response = "";
        String input = server.input_from_client();
        System.out.println("Input từ client: " + input);
        if (!input.trim().isEmpty()) {
            String[] data = input.split(" ");
            if (data.length != 6) {
                response += "Dữ liệu không đầy đủ, hãy kiểm tra lại định dạng";
                server.output_to_server(response);
                return;
            }
            String maPhong = data[0];
            String tenKhachHang = data[1];
            String soLuongKhach = data[2];
            String ngayNhanPhong = data[3];
            String loaiPhong = data[4];
            String thoiGianOLai = data[5];
            if (maPhong.trim().isEmpty() || tenKhachHang.trim().isEmpty() || soLuongKhach.trim().isEmpty() || ngayNhanPhong.trim().isEmpty() || loaiPhong.trim().isEmpty() || thoiGianOLai.trim().isEmpty()) {
                response += "Dữ liệu còn bị trống, hãy nhập đầy đủ";
            } else {
                try {
                    Date ngay = danhSachPhong.chuyenChuoiThanhNgay(ngayNhanPhong);
                    PHONG phong = new PHONG(maPhong, tenKhachHang, Integer.parseInt(soLuongKhach), ngay, loaiPhong, Integer.parseInt(thoiGianOLai));
                    System.out.println("Doi tuong phong da duoc tao: " + phong.getMaPhong() + " " + phong.getTenKhachHang() 
                            + " " + phong.getSoLuongKhach() + " " + phong.getNgayNhanPhong() + phong.getLoaiPhong() + " " + phong.getThoiGianOLaiDuKien());

                    if (danhSachPhong == null) {
                        response += "Danh sách chưa được khởi tạo";
                    } else {
                        danhSachPhong.themVaoDanhSach(phong);
                        response += "Đã thêm vào thành công";      
                    }
                } catch (Exception e) {
                    response += "Lỗi thêm vào danh sách: " + e.getMessage();
                    e.printStackTrace();
                }
            }
        } else {
            response += "Dữ liệu còn bị trống, hãy nhập đầy đủ";
        }

        server.output_to_server(response);
        System.out.println("Response đã gửi: " + response);
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Có lỗi xảy ra");
        ex.printStackTrace();
    }

    }//GEN-LAST:event_btThemActionPerformed

    private void btHuyKetNoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHuyKetNoiActionPerformed
        // TODO add your handling code here:
        try {
            server.Close();
            btHuyKetNoi.setEnabled(false);
            btKetNoiClient.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btHuyKetNoiActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        try{
            String maPhongCanXoa = server.input_from_client();
            if (danhSachPhong.xoaTheoMaPhong(maPhongCanXoa)){
                JOptionPane.showMessageDialog(null, "Xóa thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Xóa không thành công");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        try {
            // TODO add your handling code here:
            String response = "";
            String input = server.input_from_client();
            String[] data = input.split(" ");
            txtMaPhong.setText(data[0]);
            txtTenKhachHang.setText(data[1]);
            txtNgayNhanPhong.setText(data[3]);
            txtSoLuongKhach.setText(data[2]);
            txtLoaiPhong.setText(data[4]);
            txtThoiGianOLai.setText(data[5]);
            JOptionPane.showMessageDialog(null, "Moi chinh sua thong tin");
            if (danhSachPhong.suaThongTinPhong(txtMaPhong.getText(), txtTenKhachHang.getText(), txtSoLuongKhach.getText(), txtNgayNhanPhong.getText(), txtLoaiPhong.getText(), txtThoiGianOLai.getText())){
                response += "Chinh sua thanh cong"; 
            } else {
                response += "Chinh sua khong thanh cong";
            }
            JOptionPane.showMessageDialog(null, response);
            server.output_to_server(response);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }//GEN-LAST:event_btSuaActionPerformed

    private void btTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimActionPerformed
        try {
            String response = "";
            // TODO add your handling code here:
            String maPhong = server.input_from_client();
            for (PHONG phong : danhSachPhong.getDsp()){
                if (phong.getMaPhong().equalsIgnoreCase(maPhong)){
                    String data = phong.getMaPhong() + ";" + phong.getTenKhachHang() + ";" + phong.getSoLuongKhach() + ";" + phong.getNgayNhanPhong() + ";" + phong.getLoaiPhong() + ";" + phong.getThoiGianOLaiDuKien();
                    server.output_to_server(data);
                    response += "Da tim thay";
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, response);
            
        } catch (IOException ex) {
            Logger.getLogger(GIAODIENQUANLYKHACHSAN_SERVER.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btTimActionPerformed

    private void btInBangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInBangActionPerformed
        // TODO add your handling code here:
        XoaBang();
        for (PHONG phong : danhSachPhong.getDsp()) {
            Them1DongVaoTable(phong);
        }
    }//GEN-LAST:event_btInBangActionPerformed

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
            java.util.logging.Logger.getLogger(GIAODIENQUANLYKHACHSAN_SERVER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GIAODIENQUANLYKHACHSAN_SERVER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GIAODIENQUANLYKHACHSAN_SERVER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GIAODIENQUANLYKHACHSAN_SERVER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GIAODIENQUANLYKHACHSAN_SERVER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHuyKetNoi;
    private javax.swing.JButton btInBang;
    private javax.swing.JButton btKetNoiClient;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btTim;
    private javax.swing.JButton btXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDanhSachPhong;
    private javax.swing.JTextField txtLoaiPhong;
    private javax.swing.JTextField txtMaPhong;
    private javax.swing.JTextField txtNgayNhanPhong;
    private javax.swing.JTextField txtSoLuongKhach;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txtThoiGianOLai;
    // End of variables declaration//GEN-END:variables
}
