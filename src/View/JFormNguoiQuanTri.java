
package View;


import Controller.QuanlybactiendienController;
import Controller.QuanlychisodienController;
import Controller.QuanlykhachhangController;
import Controller.QuanlymuadienController;
import Controller.QuanlynoController;
import Model.BacTienDien;
import Model.CustomException;
import Model.HoaDon;
import Model.NCC;
import Model.NguoiDung;
import Model.Thang;
import SetTable.CustomTable_Quanlybactiendien;
import SetTable.CustomTable_Quanlychisodien;
import SetTable.CustomTable_Quanlykhachhang;
import SetTable.CustomTable_Quanlymuadien;
import SetTable.CustomTable_Quanlyno;
import java.sql.Date;
import java.util.ArrayList;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class JFormNguoiQuanTri extends javax.swing.JFrame {
    
    ArrayList<NguoiDung> listKhachhang = new ArrayList<>();
    ArrayList<HoaDon> listHD_qlcsd = new ArrayList<>();
    ArrayList<NCC> listNCC = new ArrayList<>();
    ArrayList<NguoiDung> listKhachhang_No = new ArrayList<>();
    ArrayList<BacTienDien> listBacTienDien = new ArrayList();
    QuanlychisodienController qlcsdC = new QuanlychisodienController();
    QuanlybactiendienController qlbtdC = new QuanlybactiendienController();
    QuanlykhachhangController qlkhC = new QuanlykhachhangController();
    QuanlymuadienController qlmdC = new QuanlymuadienController();
    QuanlynoController qlnC = new QuanlynoController();
    
    public JFormNguoiQuanTri() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        loadTableQuanlychisodien();
        loadTableQuanlybactiendien();
        loadTableQuanlyKH();
        loadTableNhaCCD();
        loadTableQuanlyno();
    }

    // function loadtable
    private void loadTableQuanlyKH(){
        try{
            listKhachhang = qlkhC.getList_qlkh();
            tableQuanLyKH.setModel(new CustomTable_Quanlykhachhang(listKhachhang));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi: "+ ex.getMessage());
        }
    }
  
    //hết function load dữ liệu vào tableQuanLyKH
    private void loadTableQuanlychisodien(){
        try{
            listHD_qlcsd = qlcsdC.getList_Chisodien();
            tableQuanlychisodien.setModel(new CustomTable_Quanlychisodien(listHD_qlcsd));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
        }
    }
    private  void loadTableNhaCCD() throws SQLException{
        listNCC = qlmdC.getlist_ncc();
        tableNhaCCD.setModel(new CustomTable_Quanlymuadien(listNCC));
    }
    private void loadTableQuanlyno(){
        tableQuanlyno.setModel(new CustomTable_Quanlyno(listKhachhang_No));
    }
    private void loadTableQuanlybactiendien(){
        try{
            listBacTienDien = qlbtdC.getListBacTienDien();
            tableDongiabactiendien.setModel(new CustomTable_Quanlybactiendien(listBacTienDien));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgChonNCC = new javax.swing.JDialog();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        lblMaNCC_qlmd = new javax.swing.JLabel();
        lblTenNCC_qlmd = new javax.swing.JLabel();
        lblDiaChiNCC_qlmd = new javax.swing.JLabel();
        lblDongia_qlmd = new javax.swing.JLabel();
        btnOK_qlmd = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaKH_qlkh = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenKH_qlkh = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSoCMND_qlkh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDiachi_qlkh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSoDienThoai_qlkh = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTenDangNhap_qlkh = new javax.swing.JTextField();
        txtMatKhau_qlkh = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnThemKH_qlkh = new javax.swing.JButton();
        btnSuaKH_qlkh = new javax.swing.JButton();
        btnXoaKh_qlkh = new javax.swing.JButton();
        btnTimKh_qlkh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableQuanLyKH = new javax.swing.JTable();
        txtNgayDky_qlkh = new javax.swing.JTextField();
        cbbThanhToan_qlkh = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        cbbLoaiDien_qlkh = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtNgaySinh_qlkh = new javax.swing.JTextField();
        txtLoaiTK_qlkh = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtMaNCC_qlmd = new javax.swing.JTextField();
        txtTenNCC_qlmd = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtDiachiNCC_qlmd = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        btnThem_qlmd = new javax.swing.JButton();
        btnSua_qlmd = new javax.swing.JButton();
        btnXoa_qlmd = new javax.swing.JButton();
        btnMuaDien_qlmd = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableNhaCCD = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        txtgia_qlmd = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtThang_qln = new javax.swing.JTextField();
        btnXem_qln = new javax.swing.JButton();
        btnThanhtoan_qln = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableQuanlyno = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDongiabactiendien = new javax.swing.JTable();
        cbbDoituong_qlcsd = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        txtSodientoithieu_dgbtd = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtSodientoida_dgbtd = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtGiaban_dgbtd = new javax.swing.JTextField();
        btnThem_dgbtd = new javax.swing.JButton();
        btnSua_dgbtd = new javax.swing.JButton();
        btnXoa_dgbtd = new javax.swing.JButton();
        btnTim_dgbtd = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        txtMabac_qlbtd = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtMakh_qltb = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtMacongto_qltb = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtTinhtrang_qltb = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableQuanlytb = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        txtNgaylap_qltb = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtMaKH_qlcsd = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtChisomoi_qlcsd = new javax.swing.JTextField();
        btnThem_qlcsd = new javax.swing.JButton();
        btnSua_qlcsd = new javax.swing.JButton();
        btnXoachu_qlcsd = new javax.swing.JButton();
        btnThoat_qlcsd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableQuanlychisodien = new javax.swing.JTable();
        txtMathang_qlcsd = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtChisocu_qlcsd = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtMaHD_qlcsd = new javax.swing.JTextField();
        btnXoa_qlcsd = new javax.swing.JButton();

        dlgChonNCC.setTitle("Chọn nhà cung cấp điện thành công");
        dlgChonNCC.setMinimumSize(new java.awt.Dimension(500, 300));
        dlgChonNCC.setModal(true);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("Thông tin chi tiết nhà cung cấp điện");

        jLabel39.setText("Mã nhà cung cấp:");

        jLabel40.setText("Tên nhà cung cấp:");

        jLabel41.setText("Địa chỉ nhà cung cấp:");

        jLabel42.setText("Đơn giá:");

        lblMaNCC_qlmd.setText("jLabel38");

        lblTenNCC_qlmd.setText("jLabel38");

        lblDiaChiNCC_qlmd.setText("jLabel38");

        lblDongia_qlmd.setText("jLabel38");

        btnOK_qlmd.setText("OK");
        btnOK_qlmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOK_qlmdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgChonNCCLayout = new javax.swing.GroupLayout(dlgChonNCC.getContentPane());
        dlgChonNCC.getContentPane().setLayout(dlgChonNCCLayout);
        dlgChonNCCLayout.setHorizontalGroup(
            dlgChonNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgChonNCCLayout.createSequentialGroup()
                .addGroup(dlgChonNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgChonNCCLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel38))
                    .addGroup(dlgChonNCCLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(dlgChonNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnOK_qlmd)
                            .addGroup(dlgChonNCCLayout.createSequentialGroup()
                                .addGroup(dlgChonNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel42))
                                .addGap(31, 31, 31)
                                .addGroup(dlgChonNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDongia_qlmd)
                                    .addComponent(lblDiaChiNCC_qlmd)
                                    .addComponent(lblTenNCC_qlmd)
                                    .addComponent(lblMaNCC_qlmd))))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        dlgChonNCCLayout.setVerticalGroup(
            dlgChonNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgChonNCCLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel38)
                .addGap(18, 18, 18)
                .addGroup(dlgChonNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(lblMaNCC_qlmd))
                .addGap(18, 18, 18)
                .addGroup(dlgChonNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(lblTenNCC_qlmd))
                .addGap(18, 18, 18)
                .addGroup(dlgChonNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(lblDiaChiNCC_qlmd))
                .addGap(18, 18, 18)
                .addGroup(dlgChonNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(lblDongia_qlmd))
                .addGap(27, 27, 27)
                .addComponent(btnOK_qlmd)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Quản lý thông tin của khách hàng mua điện");

        jLabel2.setText("Mã KH:");

        jLabel3.setText("Tên KH:");

        jLabel4.setText("Số CMND:");

        txtSoCMND_qlkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoCMND_qlkhActionPerformed(evt);
            }
        });

        jLabel5.setText("Địa chỉ:");

        jLabel6.setText("Số điện thoại:");

        jLabel7.setText("Ngày đăng ký:");

        jLabel8.setText("Tình trạng TT:");

        jLabel9.setText("Tên đăng nhập:");

        jLabel11.setText("Mât khẩu:");

        btnThemKH_qlkh.setText("Thêm KH");
        btnThemKH_qlkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemKH_qlkhActionPerformed(evt);
            }
        });

        btnSuaKH_qlkh.setText("Sửa KH");
        btnSuaKH_qlkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaKH_qlkhActionPerformed(evt);
            }
        });

        btnXoaKh_qlkh.setText("Xoá KH");
        btnXoaKh_qlkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaKh_qlkhActionPerformed(evt);
            }
        });

        btnTimKh_qlkh.setText("Tìm KH");
        btnTimKh_qlkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKh_qlkhActionPerformed(evt);
            }
        });

        tableQuanLyKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableQuanLyKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableQuanLyKHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableQuanLyKH);

        cbbThanhToan_qlkh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Da thanh toan", "Chua thanh toan" }));

        jLabel18.setText("Đối tượng:");

        cbbLoaiDien_qlkh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sinh hoat", "Kinh doanh" }));

        jLabel15.setText("Ngày sinh:");

        jLabel37.setText("Loại TK:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDiachi_qlkh)
                                    .addComponent(cbbThanhToan_qlkh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel18))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSoDienThoai_qlkh)
                                    .addComponent(cbbLoaiDien_qlkh, 0, 141, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtMaKH_qlkh, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTenKH_qlkh, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtNgayDky_qlkh, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSoCMND_qlkh, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTenDangNhap_qlkh, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel15)
                                .addComponent(jLabel37))
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtMatKhau_qlkh, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTimKh_qlkh, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNgaySinh_qlkh)
                                    .addComponent(txtLoaiTK_qlkh, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnXoaKh_qlkh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnThemKH_qlkh, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSuaKH_qlkh, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(159, 159, 159))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnThemKH_qlkh)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(btnSuaKH_qlkh)
                        .addComponent(txtTenKH_qlkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSoCMND_qlkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(txtNgaySinh_qlkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaKH_qlkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDiachi_qlkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7)
                        .addComponent(txtNgayDky_qlkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel37)
                        .addComponent(txtLoaiTK_qlkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnXoaKh_qlkh)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSoDienThoai_qlkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMatKhau_qlkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(txtTenDangNhap_qlkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbThanhToan_qlkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnTimKh_qlkh)
                            .addGap(6, 6, 6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbLoaiDien_qlkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Quản lý khách hàng", jPanel1);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Chọn nhà cung cấp điện");

        jLabel24.setText("Mã NCC");

        jLabel25.setText("Tên NCC");

        jLabel26.setText("Địa chỉ NCC");

        btnThem_qlmd.setText("Thêm");
        btnThem_qlmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_qlmdActionPerformed(evt);
            }
        });

        btnSua_qlmd.setText("Sửa");
        btnSua_qlmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_qlmdActionPerformed(evt);
            }
        });

        btnXoa_qlmd.setText("Xoá");
        btnXoa_qlmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_qlmdActionPerformed(evt);
            }
        });

        btnMuaDien_qlmd.setText("Mua điện");
        btnMuaDien_qlmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuaDien_qlmdActionPerformed(evt);
            }
        });

        tableNhaCCD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableNhaCCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableNhaCCDMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableNhaCCD);

        jLabel30.setText("Giá");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel23))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addGap(79, 79, 79)
                                        .addComponent(txtMaNCC_qlmd, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addGap(75, 75, 75)
                                        .addComponent(txtTenNCC_qlmd, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDiachiNCC_qlmd, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtgia_qlmd, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnThem_qlmd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSua_qlmd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnXoa_qlmd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMuaDien_qlmd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(667, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtMaNCC_qlmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem_qlmd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenNCC_qlmd)
                            .addComponent(jLabel25)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSua_qlmd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa_qlmd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiachiNCC_qlmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMuaDien_qlmd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
                        .addComponent(txtgia_qlmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(346, 346, 346))
        );

        jTabbedPane1.addTab("Quản lý mua điện", jPanel5);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Quản lý nợ");

        jLabel27.setText("Tháng");

        btnXem_qln.setText("Xem");
        btnXem_qln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXem_qlnActionPerformed(evt);
            }
        });

        btnThanhtoan_qln.setText("Thanh Toán");
        btnThanhtoan_qln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhtoan_qlnActionPerformed(evt);
            }
        });

        tableQuanlyno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableQuanlyno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableQuanlynoMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tableQuanlyno);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(34, 34, 34)
                                .addComponent(txtThang_qln, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(btnXem_qln)
                                .addGap(18, 18, 18)
                                .addComponent(btnThanhtoan_qln, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(jLabel28)))
                .addContainerGap(515, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel28)
                .addGap(57, 57, 57)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtThang_qln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(btnXem_qln, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThanhtoan_qln, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý nợ", jPanel6);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Đơn giá bậc tiền điện");

        jLabel17.setText("Đối tượng");

        tableDongiabactiendien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableDongiabactiendien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDongiabactiendienMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableDongiabactiendien);

        cbbDoituong_qlcsd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sinh hoạt", "Kinh doanh" }));

        jLabel19.setText("Số điện tối thiểu");

        jLabel20.setText("Số điện tối đa");

        jLabel21.setText("Giá bán(VNĐ)");

        btnThem_dgbtd.setText("Thêm");
        btnThem_dgbtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_dgbtdActionPerformed(evt);
            }
        });

        btnSua_dgbtd.setText("Sửa");
        btnSua_dgbtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_dgbtdActionPerformed(evt);
            }
        });

        btnXoa_dgbtd.setText("Xoá");
        btnXoa_dgbtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_dgbtdActionPerformed(evt);
            }
        });

        btnTim_dgbtd.setText("Tìm kiếm");
        btnTim_dgbtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTim_dgbtdActionPerformed(evt);
            }
        });

        jLabel36.setText("Mã bậc");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel36))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMabac_qlbtd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbDoituong_qlcsd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGiaban_dgbtd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSodientoida_dgbtd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSodientoithieu_dgbtd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnSua_dgbtd, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnThem_dgbtd))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnTim_dgbtd))
                                    .addComponent(btnXoa_dgbtd, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel29))))
                .addContainerGap(495, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnThem_dgbtd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua_dgbtd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoa_dgbtd)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnTim_dgbtd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel36)
                                    .addComponent(txtMabac_qlbtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(txtSodientoithieu_dgbtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(txtSodientoida_dgbtd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(txtGiaban_dgbtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(cbbDoituong_qlcsd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Quản lý bậc tiền điện", jPanel4);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Quản lý thiết bị");

        jLabel22.setText("Mã kh");

        txtMakh_qltb.setText("jTextField2");

        jLabel31.setText("Mã công tơ");

        txtMacongto_qltb.setText("jTextField2");

        jLabel32.setText("Tình trạng");

        txtTinhtrang_qltb.setText("jTextField2");

        tableQuanlytb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tableQuanlytb);

        jLabel33.setText("Ngày lập");

        txtNgaylap_qltb.setText("jTextField2");

        jButton1.setText("Thêm");

        jButton2.setText("Sửa");

        jButton3.setText("Xoá");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel31))
                                .addComponent(jLabel32))
                            .addComponent(jLabel33))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMakh_qltb)
                            .addComponent(txtMacongto_qltb)
                            .addComponent(txtTinhtrang_qltb, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgaylap_qltb))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(552, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel10)
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtMakh_qltb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtMacongto_qltb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(txtTinhtrang_qltb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgaylap_qltb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý thiết bị", jPanel3);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Quản lý chỉ bán điện");

        jLabel13.setText("Mã khách hàng");

        jLabel14.setText("Mã tháng");

        jLabel16.setText("Chỉ số mới");

        btnThem_qlcsd.setText("Thêm");
        btnThem_qlcsd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_qlcsdActionPerformed(evt);
            }
        });

        btnSua_qlcsd.setText("Sửa");
        btnSua_qlcsd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_qlcsdActionPerformed(evt);
            }
        });

        btnXoachu_qlcsd.setText("Xoá chữ");
        btnXoachu_qlcsd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoachu_qlcsdActionPerformed(evt);
            }
        });

        btnThoat_qlcsd.setText("Thoát");

        tableQuanlychisodien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableQuanlychisodien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableQuanlychisodienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableQuanlychisodien);

        jLabel34.setText("Chỉ số cũ");

        jLabel35.setText("Mã hoá đơn");

        btnXoa_qlcsd.setText("Xoá");
        btnXoa_qlcsd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_qlcsdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaHD_qlcsd, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel16))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaKH_qlcsd, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtChisomoi_qlcsd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                        .addComponent(txtChisocu_qlcsd, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMathang_qlcsd, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addGap(104, 104, 104)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem_qlcsd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThoat_qlcsd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua_qlcsd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa_qlcsd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoachu_qlcsd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(317, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaHD_qlcsd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnThem_qlcsd)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnSua_qlcsd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa_qlcsd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoachu_qlcsd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThoat_qlcsd))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txtMaKH_qlcsd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMathang_qlcsd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtChisocu_qlcsd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel34))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtChisomoi_qlcsd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))))))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Quản lý chỉ số điện", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKh_qlkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKh_qlkhActionPerformed
        // TODO add your handling code here:
        ArrayList<NguoiDung> searchKH = new ArrayList<>();
        try{
             if(txtMaKH_qlkh.getText().isEmpty() )
               throw new CustomException("Bạn cần nhập mã KH muốn tìm!");
             listKhachhang = qlkhC.getList_qlkh();
             int dem = 0;
             for(NguoiDung nd : listKhachhang){
                 if(txtMaKH_qlkh.getText().compareTo(nd.getMaNguoiDung()) == 0)
                     dem++;
             }
             if(dem == 0)
                 throw new CustomException("Không có khách hàng bạn muốn tìm!");
             else{
                    for(NguoiDung nd : listKhachhang){
                       if(txtMaKH_qlkh.getText().compareTo(nd.getMaNguoiDung()) == 0)
                       {
                           searchKH.add(nd);
                           break;
                       }
                    tableQuanLyKH.setModel(new CustomTable_Quanlykhachhang(searchKH));
                }
             }
        }catch(CustomException ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex);
       }
       catch(SQLException ex){

           JOptionPane.showMessageDialog(null, "Lỗi: " + ex);
       }
       catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex);
       }
    }//GEN-LAST:event_btnTimKh_qlkhActionPerformed

    private void tableQuanLyKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableQuanLyKHMouseClicked
        int r = tableQuanLyKH.getSelectedRow();
        txtMaKH_qlkh.setText(tableQuanLyKH.getValueAt(r, 0).toString());
        txtTenKH_qlkh.setText(tableQuanLyKH.getValueAt(r,1).toString());
        txtSoCMND_qlkh.setText(tableQuanLyKH.getValueAt(r,2).toString());
        txtNgaySinh_qlkh.setText(tableQuanLyKH.getValueAt(r,3).toString());
        txtDiachi_qlkh.setText(tableQuanLyKH.getValueAt(r,4).toString());
        txtSoDienThoai_qlkh.setText(tableQuanLyKH.getValueAt(r,5).toString());
        txtNgayDky_qlkh.setText(tableQuanLyKH.getValueAt(r,6).toString());
        if(tableQuanLyKH.getValueAt(r,9).toString().compareTo("0") == 0){
            txtLoaiTK_qlkh.setText("Khach Hang");
        }
        txtTenDangNhap_qlkh.setText(tableQuanLyKH.getValueAt(r,10).toString());
        txtMatKhau_qlkh.setText(tableQuanLyKH.getValueAt(r,11).toString());
        if(tableQuanLyKH.getValueAt(r,7).toString().compareTo("1") == 0){
            cbbThanhToan_qlkh.setSelectedIndex(0);
        }else cbbThanhToan_qlkh.setSelectedIndex(1);
        
        if(tableQuanLyKH.getValueAt(r,8).toString().compareTo("SH") == 0){
            cbbLoaiDien_qlkh.setSelectedIndex(0);
        }else {
            if(tableQuanLyKH.getValueAt(r,8).toString().compareTo("KD") == 0){
                cbbLoaiDien_qlkh.setSelectedIndex(1);
            }
        }
    }//GEN-LAST:event_tableQuanLyKHMouseClicked

    private void txtSoCMND_qlkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoCMND_qlkhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoCMND_qlkhActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnThem_qlcsdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_qlcsdActionPerformed
        // TODO add your handling code here:
       try{
           if(txtMaHD_qlcsd.getText().isEmpty() || txtMaKH_qlcsd.getText().isEmpty() || txtMathang_qlcsd.getText().isEmpty() || txtChisocu_qlcsd.getText().isEmpty() || txtChisomoi_qlcsd.getText().isEmpty())
               throw new CustomException("Bạn cần phải nhập đủ dữ liệu");
           qlcsdC.themHoadon(txtMaHD_qlcsd.getText(), txtMaKH_qlcsd.getText(), Integer.parseInt(txtMathang_qlcsd.getText()), Integer.parseInt(txtChisocu_qlcsd.getText()), Integer.parseInt(txtChisomoi_qlcsd.getText()));
           loadTableQuanlychisodien();
       
       }catch(CustomException ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex);
       }
       catch(SQLException ex){
           if(ex.getMessage().contains("FK_HD_NGUOIDUNG")){
               JOptionPane.showMessageDialog(null, "Mã khách hàng không tồn tại trong dữ liệu! Mời bạn kiểm tra lại!");
           }
           else if(ex.getMessage().contains("FK_HD_THANG")){
               JOptionPane.showMessageDialog(null, "Mã tháng không tồn tại trong dữ liệu! Mời bạn kiểm tra lại!");
           }
           else if(ex.getMessage().contains("a unique or primary key constraint")){
               JOptionPane.showMessageDialog(null, "Mã hoá đơn đã tồn tại");
           }
           else{
                JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
           }
       }
       catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex);
       }
    }//GEN-LAST:event_btnThem_qlcsdActionPerformed

    private void btnSua_qlcsdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_qlcsdActionPerformed
        // TODO add your handling code here:
        
        try{
             if(txtMaHD_qlcsd.getText().isEmpty() || txtMaKH_qlcsd.getText().isEmpty() || txtMathang_qlcsd.getText().isEmpty() || txtChisocu_qlcsd.getText().isEmpty() || txtChisomoi_qlcsd.getText().isEmpty())
               throw new CustomException("Bạn cần phải nhập đủ dữ liệu");
             qlcsdC.suaHoaDon(txtMaHD_qlcsd.getText(), txtMaKH_qlcsd.getText(), Integer.parseInt(txtMathang_qlcsd.getText()), Integer.parseInt(txtChisocu_qlcsd.getText()), Integer.parseInt(txtChisomoi_qlcsd.getText()));
             loadTableQuanlychisodien();
        }catch(CustomException ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex);
       }
       catch(SQLException ex){

           JOptionPane.showMessageDialog(null, "Lỗi: " + ex);
       }
       catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex);
       }
    }//GEN-LAST:event_btnSua_qlcsdActionPerformed

    private void tableQuanlychisodienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableQuanlychisodienMouseClicked
        // TODO add your handling code here:
        int selectedRow = tableQuanlychisodien.getSelectedRow();
        txtMaHD_qlcsd.setText(tableQuanlychisodien.getValueAt(selectedRow, 0).toString());
        txtMaKH_qlcsd.setText(tableQuanlychisodien.getValueAt(selectedRow, 1).toString());
        txtMathang_qlcsd.setText(tableQuanlychisodien.getValueAt(selectedRow, 4).toString());
        txtChisocu_qlcsd.setText(tableQuanlychisodien.getValueAt(selectedRow, 5).toString());
        txtChisomoi_qlcsd.setText(tableQuanlychisodien.getValueAt(selectedRow, 6).toString());
    }//GEN-LAST:event_tableQuanlychisodienMouseClicked

    private void btnXoachu_qlcsdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoachu_qlcsdActionPerformed
        // TODO add your handling code here:
        txtMaHD_qlcsd.setText("");
        txtMaKH_qlcsd.setText("");
        txtMathang_qlcsd.setText("");
        txtChisocu_qlcsd.setText("");
        txtChisomoi_qlcsd.setText("");
    }//GEN-LAST:event_btnXoachu_qlcsdActionPerformed

    private void btnXoa_qlcsdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_qlcsdActionPerformed
        // TODO add your handling code here:
        try{
            if(txtMaHD_qlcsd.getText().isEmpty())
                throw new CustomException("Bạn cần nhập mã hd để xoá");
            qlcsdC.xoaHoaDon(txtMaHD_qlcsd.getText());
            loadTableQuanlychisodien();
        }catch(CustomException ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
       }
       catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
       }
       catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
       }
    }//GEN-LAST:event_btnXoa_qlcsdActionPerformed

    private void btnThem_dgbtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_dgbtdActionPerformed
        // TODO add your handling code here:
        try{
            if(txtSodientoithieu_dgbtd.getText().isEmpty() | txtSodientoida_dgbtd.getText().isEmpty() || txtGiaban_dgbtd.getText().isEmpty())
                throw new CustomException("Bạn cần nhập đủ dữ liệu để có thể thêm bậc tiền điện");
            qlbtdC.themBacTienDien(txtMabac_qlbtd.getText(), Integer.parseInt(txtSodientoithieu_dgbtd.getText()), Integer.parseInt(txtSodientoida_dgbtd.getText()), Float.parseFloat(txtGiaban_dgbtd.getText()), cbbDoituong_qlcsd.getSelectedItem().toString());
            loadTableQuanlybactiendien();
        }catch(CustomException ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
       }
       catch(SQLException ex){
           if(ex.getMessage().contains("a unique or primary key constraint")){
               JOptionPane.showMessageDialog(null, "Mã hoá đơn đã tồn tại");
           }
           else{
               
                JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
           }
       }
       catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
       }
    }//GEN-LAST:event_btnThem_dgbtdActionPerformed

    private void btnXoa_dgbtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_dgbtdActionPerformed
        // TODO add your handling code here:
        try{
            if(txtSodientoithieu_dgbtd.getText().isEmpty() | txtSodientoida_dgbtd.getText().isEmpty() || txtGiaban_dgbtd.getText().isEmpty())
                throw new CustomException("Bạn cần nhập đủ dữ liệu để có thể thêm bậc tiền điện");
            qlbtdC.xoaBacTienDien(txtMabac_qlbtd.getText(), cbbDoituong_qlcsd.getSelectedItem().toString());
            
            loadTableQuanlybactiendien();
        }catch(CustomException ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
       }
       catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
       }
       catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
       }
    }//GEN-LAST:event_btnXoa_dgbtdActionPerformed

    private void btnSua_dgbtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_dgbtdActionPerformed
        // TODO add your handling code here:
        try{
            if(txtSodientoithieu_dgbtd.getText().isEmpty() | txtSodientoida_dgbtd.getText().isEmpty() || txtGiaban_dgbtd.getText().isEmpty())
                throw new CustomException("Bạn cần nhập đủ dữ liệu để có thể thêm bậc tiền điện");
            qlbtdC.suaBacTienDien(txtMabac_qlbtd.getText(), Integer.parseInt(txtSodientoithieu_dgbtd.getText()), Integer.parseInt(txtSodientoida_dgbtd.getText()), Float.parseFloat(txtGiaban_dgbtd.getText()), cbbDoituong_qlcsd.getSelectedItem().toString());
            
            loadTableQuanlybactiendien();
        }catch(CustomException ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
       }
       catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
       }
       catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
       }
    }//GEN-LAST:event_btnSua_dgbtdActionPerformed

    private void tableDongiabactiendienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDongiabactiendienMouseClicked
        // TODO add your handling code here:
        int selectedRow = tableDongiabactiendien.getSelectedRow();
        txtMabac_qlbtd.setText(tableDongiabactiendien.getValueAt(selectedRow, 0).toString());
        txtSodientoithieu_dgbtd.setText(tableDongiabactiendien.getValueAt(selectedRow, 1).toString());
        txtSodientoida_dgbtd.setText(tableDongiabactiendien.getValueAt(selectedRow, 2).toString());
        txtGiaban_dgbtd.setText(tableDongiabactiendien.getValueAt(selectedRow, 3).toString());
        
    }//GEN-LAST:event_tableDongiabactiendienMouseClicked
    // nút thêm khách hàng - hoàng đình an
    private void btnThemKH_qlkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemKH_qlkhActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String ns = txtNgaySinh_qlkh.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date txtNSAsDate = null;
        String ngaydk = txtNgayDky_qlkh.getText();
        java.util.Date txtNDKAsDate = null;
        int tt;
        String doituong;
        if(cbbThanhToan_qlkh.getSelectedIndex() == 0){
            tt = 1;
        }else tt = 0;
        if(cbbLoaiDien_qlkh.getSelectedIndex() == 0){
            doituong = "SH";
        }else doituong = "KD";
        
        try{
           if(txtMaKH_qlkh.getText().isEmpty() || txtTenKH_qlkh.getText().isEmpty() || txtSoCMND_qlkh.getText().isEmpty() || txtNgaySinh_qlkh.getText().isEmpty() || txtSoDienThoai_qlkh.getText().isEmpty() || txtNgayDky_qlkh.getText().isEmpty() || txtTenDangNhap_qlkh.getText().isEmpty()|| txtMatKhau_qlkh.getText().isEmpty()|| txtLoaiTK_qlkh.getText().isEmpty()|| txtDiachi_qlkh.getText().isEmpty())
               throw new CustomException("Bạn cần phải nhập đủ dữ liệu");
           listKhachhang = qlkhC.getList_qlkh();
           for(NguoiDung nd : listKhachhang){
               if(txtTenDangNhap_qlkh.getText().compareTo(nd.getTaiKhoan().getUserName()) == 0 || txtSoCMND_qlkh.getText().compareTo(nd.getSoCMT()) == 0 || txtSoDienThoai_qlkh.getText().compareTo(nd.getSoDienThoai())==0)
                   throw new CustomException("Tên đăng nhập, số CMND hoặc số ĐT bị trùng!");
           }
               txtNDKAsDate = sdf.parse(ngaydk);
               txtNSAsDate = sdf.parse(ns);
               sdf = new SimpleDateFormat("yyyy-MM-dd");
               java.sql.Date dateNS = java.sql.Date.valueOf(sdf.format(txtNSAsDate));
               java.sql.Date dateNDK = java.sql.Date.valueOf(sdf.format(txtNDKAsDate));
           qlkhC.themKH(txtMaKH_qlkh.getText(), txtTenKH_qlkh.getText(), txtSoCMND_qlkh.getText(), dateNS, txtSoDienThoai_qlkh.getText(), dateNDK, tt, doituong, txtTenDangNhap_qlkh.getText(), txtMatKhau_qlkh.getText(), 0,txtDiachi_qlkh.getText() );
           loadTableQuanlyKH();
       
       }catch(ParseException ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex +"Bạn cần nhập đúng định dạng yyyy-MM-dd");
       }
        catch(CustomException ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex);
       }
       catch(SQLException ex){
           if(ex.getMessage().contains("FK_HD_NGUOIDUNG")){
               JOptionPane.showMessageDialog(null, "Mã khách hàng không tồn tại trong dữ liệu! Mời bạn kiểm tra lại!");
           }
           else if(ex.getMessage().contains("FK_HD_THANG")){
               JOptionPane.showMessageDialog(null, "Mã tháng không tồn tại trong dữ liệu! Mời bạn kiểm tra lại!");
           }
           else if(ex.getMessage().contains("a unique or primary key constraint")){
               JOptionPane.showMessageDialog(null, "Mã khách hàng đã tồn tại");
           }
           else{
                JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
           }
       }
       catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex);
       }
    }//GEN-LAST:event_btnThemKH_qlkhActionPerformed
    // hết nút thêm khách hàng - hoàng đình an
    //nút xóa khách hàng - hoàng đình an
    private void btnXoaKh_qlkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaKh_qlkhActionPerformed
        // TODO add your handling code here:
        try{
            if(txtMaKH_qlkh.getText().isEmpty())
                throw new CustomException("Bạn cần nhập mã KH hoặc chọn một KH để xoá");
            qlkhC.xoaKH(txtMaKH_qlkh.getText());
            loadTableQuanlyKH();
        }catch(CustomException ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
       }
       catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
       }
       catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
       }
    }//GEN-LAST:event_btnXoaKh_qlkhActionPerformed
    //hết nút xóa khách hàng - hoàng đình an
    private void btnSuaKH_qlkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaKH_qlkhActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String ns = txtNgaySinh_qlkh.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date txtNSAsDate = null;
        String ngaydk = txtNgayDky_qlkh.getText();
        java.util.Date txtNDKAsDate = null;
        int tt;
        String doituong;
        if(cbbThanhToan_qlkh.getSelectedIndex() == 0){
            tt = 1;
        }else tt = 0;
        if(cbbLoaiDien_qlkh.getSelectedIndex() == 0){
            doituong = "SH";
        }else doituong = "KD";
        try{
             if(txtMaKH_qlkh.getText().isEmpty() )
               throw new CustomException("Bạn cần chọn một KH để sửa!");
             txtNDKAsDate = sdf.parse(ngaydk);
               txtNSAsDate = sdf.parse(ns);
               sdf = new SimpleDateFormat("yyyy-MM-dd");
               java.sql.Date dateNS = java.sql.Date.valueOf(sdf.format(txtNSAsDate));
               java.sql.Date dateNDK = java.sql.Date.valueOf(sdf.format(txtNDKAsDate));
             qlkhC.suaKH(txtMaKH_qlkh.getText(), txtTenKH_qlkh.getText(), txtSoCMND_qlkh.getText(), dateNS, txtSoDienThoai_qlkh.getText(), dateNDK, tt, doituong, txtTenDangNhap_qlkh.getText(), txtMatKhau_qlkh.getText(), 0,txtDiachi_qlkh.getText());
             loadTableQuanlyKH();
        }catch(CustomException ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex);
       }
       catch(SQLException ex){

           JOptionPane.showMessageDialog(null, "Lỗi: " + ex);
       }
       catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex);
       }
    }//GEN-LAST:event_btnSuaKH_qlkhActionPerformed

    private void btnTim_dgbtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTim_dgbtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTim_dgbtdActionPerformed

    private void btnThem_qlmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_qlmdActionPerformed
        // TODO add your handling code here:
        try{
            if(txtMaNCC_qlmd.getText().isEmpty() || txtTenNCC_qlmd.getText().isEmpty() || txtDiachiNCC_qlmd.getText().isEmpty() || txtgia_qlmd.getText().isEmpty() )
               throw new CustomException("Bạn cần phải nhập đủ dữ liệu");
            listNCC = qlmdC.getlist_ncc();
            for(NCC ncc : listNCC){
                if(txtTenNCC_qlmd.getText().compareTo(ncc.getTenNCC()) == 0){
                    throw new CustomException("Tên nhà cung cấp bị trùng !");
                }
            }
            qlmdC.themNCC(txtMaNCC_qlmd.getText(), txtTenNCC_qlmd.getText(), txtDiachiNCC_qlmd.getText(), Integer.parseInt(txtgia_qlmd.getText()));
            loadTableNhaCCD();
       }catch(ParseException ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex +"Bạn cần nhập đúng định dạng yyyy-MM-dd");
       }
        catch(CustomException ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex);
       }
       catch(SQLException ex){
           if(ex.getMessage().contains("FK_HD_NGUOIDUNG")){
               JOptionPane.showMessageDialog(null, "Mã khách hàng không tồn tại trong dữ liệu! Mời bạn kiểm tra lại!");
           }
           else if(ex.getMessage().contains("FK_HD_THANG")){
               JOptionPane.showMessageDialog(null, "Mã tháng không tồn tại trong dữ liệu! Mời bạn kiểm tra lại!");
           }
           else if(ex.getMessage().contains("a unique or primary key constraint")){
               JOptionPane.showMessageDialog(null, "Mã NCC đã tồn tại");
           }
           else{
                JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
           }
       }
       catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex+" Bạn cần nhập đơn giá kiểu số nguyên");
       }
    }//GEN-LAST:event_btnThem_qlmdActionPerformed

    private void btnSua_qlmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_qlmdActionPerformed
        // TODO add your handling code here:
        try{
            if(txtMaNCC_qlmd.getText().isEmpty() )
               throw new CustomException("Bạn cần chọn một NCC để sửa!");
            qlmdC.suaNCC(txtMaNCC_qlmd.getText(), txtTenNCC_qlmd.getText(), txtDiachiNCC_qlmd.getText(), Integer.parseInt(txtgia_qlmd.getText()));
            loadTableNhaCCD();
        }catch(CustomException ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex);
       }
       catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex);
       }
       catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex +" Bạn cần nhập đơn giá kiểu số nguyên");
       }
    }//GEN-LAST:event_btnSua_qlmdActionPerformed

    private void btnXoa_qlmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_qlmdActionPerformed
        // TODO add your handling code here:
        try{
            if(txtMaNCC_qlmd.getText().isEmpty() )
               throw new CustomException("Vui lòng chọn NCC muốn xóa!");
            qlmdC.xoaNCC(txtMaNCC_qlmd.getText());
            loadTableNhaCCD();
        }catch(CustomException ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex);
       }
       catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex);
       }
       catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Lỗi: " + ex);
       }
    }//GEN-LAST:event_btnXoa_qlmdActionPerformed

    private void btnMuaDien_qlmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuaDien_qlmdActionPerformed
        // TODO add your handling code here:
        int r = tableNhaCCD.getSelectedRow();
        try{
            if(txtMaNCC_qlmd.getText().isEmpty())
                throw new CustomException("Bạn cần chọn một nhà cung cấp!");
            lblMaNCC_qlmd.setText(tableNhaCCD.getValueAt(r, 0).toString());
            lblTenNCC_qlmd.setText(tableNhaCCD.getValueAt(r, 1).toString());
            lblDiaChiNCC_qlmd.setText(tableNhaCCD.getValueAt(r, 2).toString());
            lblDongia_qlmd.setText(tableNhaCCD.getValueAt(r, 3).toString());
            dlgChonNCC.setLocationRelativeTo(null);
            dlgChonNCC.setVisible(true);
        }catch(CustomException ex){
            JOptionPane.showMessageDialog(null,"Lỗi: " + ex);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Lỗi: " + ex);
        }
    }//GEN-LAST:event_btnMuaDien_qlmdActionPerformed

    private void tableNhaCCDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNhaCCDMouseClicked
        // TODO add your handling code here:
        int r = tableNhaCCD.getSelectedRow();
        txtMaNCC_qlmd.setText(tableNhaCCD.getValueAt(r, 0).toString());
        txtTenNCC_qlmd.setText(tableNhaCCD.getValueAt(r, 1).toString());
        txtDiachiNCC_qlmd.setText(tableNhaCCD.getValueAt(r, 2).toString());
        txtgia_qlmd.setText(tableNhaCCD.getValueAt(r, 3).toString());
    }//GEN-LAST:event_tableNhaCCDMouseClicked

    private void btnOK_qlmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOK_qlmdActionPerformed
        // TODO add your handling code here:
        dlgChonNCC.setVisible(false);
    }//GEN-LAST:event_btnOK_qlmdActionPerformed

    private void btnXem_qlnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXem_qlnActionPerformed
        // TODO add your handling code here:
        try{
            if(txtThang_qln.getText().isEmpty())
                throw new CustomException("Bạn cần nhập mã tháng!");
            if(qlnC.soSanh_mathang(Integer.parseInt(txtThang_qln.getText())) == 0)
                throw new CustomException("Không có thông tin tương ứng với mã tháng trên! \n"
                        + "Cú pháp tra mã tháng: năm+tháng. Ví dụ: 202102");
            listKhachhang_No  = qlnC.getlist_qlno(Integer.parseInt(txtThang_qln.getText()));
            loadTableQuanlyno();
        }catch(CustomException ex){
            JOptionPane.showMessageDialog(null,"Lỗi: "+ ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Lỗi: "+ ex);
        }
    }//GEN-LAST:event_btnXem_qlnActionPerformed

    private void btnThanhtoan_qlnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhtoan_qlnActionPerformed
        // TODO add your handling code here:
        try{
            int r = tableQuanlyno.getSelectedRow();
            String mand;
            int tt;
            mand = tableQuanlyno.getValueAt(r, 0).toString();
            tt = Integer.parseInt(tableQuanlyno.getValueAt(r, 3).toString());
            if(tt == 1)
                throw new CustomException("Khách hàng đã thanh toán hóa đơn rồi!");
            qlnC.updateTT(mand);
            listKhachhang_No  = qlnC.getlist_qlno(Integer.parseInt(txtThang_qln.getText()));
            loadTableQuanlyno();
        }catch(CustomException ex){
            JOptionPane.showMessageDialog(null,"Lỗi: "+ ex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Lỗi: "+ ex);
        }
    }//GEN-LAST:event_btnThanhtoan_qlnActionPerformed

    private void tableQuanlynoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableQuanlynoMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tableQuanlynoMouseClicked
        
     
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
            java.util.logging.Logger.getLogger(JFormNguoiQuanTri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFormNguoiQuanTri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFormNguoiQuanTri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFormNguoiQuanTri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFormNguoiQuanTri().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JFormNguoiQuanTri.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMuaDien_qlmd;
    private javax.swing.JButton btnOK_qlmd;
    private javax.swing.JButton btnSuaKH_qlkh;
    private javax.swing.JButton btnSua_dgbtd;
    private javax.swing.JButton btnSua_qlcsd;
    private javax.swing.JButton btnSua_qlmd;
    private javax.swing.JButton btnThanhtoan_qln;
    private javax.swing.JButton btnThemKH_qlkh;
    private javax.swing.JButton btnThem_dgbtd;
    private javax.swing.JButton btnThem_qlcsd;
    private javax.swing.JButton btnThem_qlmd;
    private javax.swing.JButton btnThoat_qlcsd;
    private javax.swing.JButton btnTimKh_qlkh;
    private javax.swing.JButton btnTim_dgbtd;
    private javax.swing.JButton btnXem_qln;
    private javax.swing.JButton btnXoaKh_qlkh;
    private javax.swing.JButton btnXoa_dgbtd;
    private javax.swing.JButton btnXoa_qlcsd;
    private javax.swing.JButton btnXoa_qlmd;
    private javax.swing.JButton btnXoachu_qlcsd;
    private javax.swing.JComboBox<String> cbbDoituong_qlcsd;
    private javax.swing.JComboBox<String> cbbLoaiDien_qlkh;
    private javax.swing.JComboBox<String> cbbThanhToan_qlkh;
    private javax.swing.JDialog dlgChonNCC;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblDiaChiNCC_qlmd;
    private javax.swing.JLabel lblDongia_qlmd;
    private javax.swing.JLabel lblMaNCC_qlmd;
    private javax.swing.JLabel lblTenNCC_qlmd;
    private javax.swing.JTable tableDongiabactiendien;
    private javax.swing.JTable tableNhaCCD;
    private javax.swing.JTable tableQuanLyKH;
    private javax.swing.JTable tableQuanlychisodien;
    private javax.swing.JTable tableQuanlyno;
    private javax.swing.JTable tableQuanlytb;
    private javax.swing.JTextField txtChisocu_qlcsd;
    private javax.swing.JTextField txtChisomoi_qlcsd;
    private javax.swing.JTextField txtDiachiNCC_qlmd;
    private javax.swing.JTextField txtDiachi_qlkh;
    private javax.swing.JTextField txtGiaban_dgbtd;
    private javax.swing.JTextField txtLoaiTK_qlkh;
    private javax.swing.JTextField txtMaHD_qlcsd;
    private javax.swing.JTextField txtMaKH_qlcsd;
    private javax.swing.JTextField txtMaKH_qlkh;
    private javax.swing.JTextField txtMaNCC_qlmd;
    private javax.swing.JTextField txtMabac_qlbtd;
    private javax.swing.JTextField txtMacongto_qltb;
    private javax.swing.JTextField txtMakh_qltb;
    private javax.swing.JTextField txtMatKhau_qlkh;
    private javax.swing.JTextField txtMathang_qlcsd;
    private javax.swing.JTextField txtNgayDky_qlkh;
    private javax.swing.JTextField txtNgaySinh_qlkh;
    private javax.swing.JTextField txtNgaylap_qltb;
    private javax.swing.JTextField txtSoCMND_qlkh;
    private javax.swing.JTextField txtSoDienThoai_qlkh;
    private javax.swing.JTextField txtSodientoida_dgbtd;
    private javax.swing.JTextField txtSodientoithieu_dgbtd;
    private javax.swing.JTextField txtTenDangNhap_qlkh;
    private javax.swing.JTextField txtTenKH_qlkh;
    private javax.swing.JTextField txtTenNCC_qlmd;
    private javax.swing.JTextField txtThang_qln;
    private javax.swing.JTextField txtTinhtrang_qltb;
    private javax.swing.JTextField txtgia_qlmd;
    // End of variables declaration//GEN-END:variables
}
