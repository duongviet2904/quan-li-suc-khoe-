/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlisuckhoe;

import java.awt.Container;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import object.DocGhi;
import object.DonKBYTSinhVien;
import object.DonXinNghiSV;
import object.GiaoVien;
import object.Khoa;
import object.LopHoc;
import table.TableSVXN;

/**
 *
 * @author duongv
 */
public class TrangChuGiaoVien extends javax.swing.JFrame {

//   private GiaoVien gv = new GiaoVien("GV01", "Nguyễn Văn Mạnh", "K01");
//   
//    private LopHoc lh = new LopHoc("L01", "IT01", 4, 14, "K01", "GV01");
//        
//    private Khoa khoa = new Khoa("K01", "CNTT", "GV01");
    
    
    private GiaoVien gv;
    private Khoa khoa;
    private LopHoc lh;
    
    
    DocGhi rw = new DocGhi();
    private ArrayList<DonXinNghiSV> lstXN = new ArrayList<>();
    private ArrayList<DonXinNghiSV> chuaDuyet = new ArrayList<>();
    private ArrayList<DonXinNghiSV> daDuyet = new ArrayList<>();
    private ArrayList<DonKBYTSinhVien> lstKBYT = new ArrayList<>();
    /**
     * Creates new form TrangChuSinhVien
     */
    public TrangChuGiaoVien() throws IOException {
        initComponents();
        getAnh();
        getDanhSach();
        lstNoti.setModel(new TableSVXN(chuaDuyet));
    }

    public TrangChuGiaoVien(GiaoVien gv, Khoa khoa, LopHoc lh) throws IOException {
        this.gv = gv;
        this.khoa = khoa;
        this.lh = lh;
        initComponents();
        getAnh();
        getDanhSach();
        lstNoti.setModel(new TableSVXN(chuaDuyet));
    }
    public void getAnh() throws IOException
    {
        Image image = ImageIO.read(new File("./src/images/"+gv.getAnhGV()));
        Icon icon = new ImageIcon(image);
        text_anh.setIcon(icon);
    }
    public void getDanhSach()
    {
        try {
            
            lstXN = (ArrayList<DonXinNghiSV>) rw.ReadObject("./src/data/DonXNSV.txt");
            for(DonXinNghiSV sv : lstXN){
                if("Chờ".equals(sv.getTrangThai()) && sv.getLop().equalsIgnoreCase(lh.getTenLop()) && sv.getKhoa().equalsIgnoreCase(khoa.getTenKhoa())){
                    chuaDuyet.add(sv);
                }else if(!"Chờ".equals(sv.getTrangThai()) && sv.getLop().equalsIgnoreCase(lh.getTenLop()) && sv.getKhoa().equalsIgnoreCase(khoa.getTenKhoa())){
                    daDuyet.add(sv);
                }
            
            }
            lstKBYT = (ArrayList<DonKBYTSinhVien>) rw.ReadObject("./src/data/KBYTSV.txt");
                 
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Danh sach hien tai rong");
        }
    }
    /**
     * 
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
        text_anh = new javax.swing.JLabel();
        txtMaGV = new javax.swing.JLabel();
        txtTenGV = new javax.swing.JLabel();
        txtTenKhoa = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btn_kbyt = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenLop = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstNoti = new javax.swing.JTable();
        menu_gv = new javax.swing.JMenuBar();
        m_gvTrangChu = new javax.swing.JMenu();
        m_gvKhaiBao = new javax.swing.JMenu();
        m_gvXinNghi = new javax.swing.JMenu();
        m_gvThongKe = new javax.swing.JMenu();
        m_gvThongBao = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        m_gvTroGiup = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã giáo viên");

        jLabel2.setText("Khoa: ");

        jLabel3.setText("Tên giáo viên");

        txtMaGV.setText(gv.getMaGV());

        txtTenGV.setText(gv.getTenGV());

        txtTenKhoa.setText(khoa.getTenKhoa());

        jButton1.setText("Đăng kí nghỉ phép");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_kbyt.setText("Khai báo y tế");
        btn_kbyt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kbytActionPerformed(evt);
            }
        });

        jButton4.setText("Lịch sử");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Hỗ trợ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setText("Thống kê");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setText("Thông báo");

        jLabel4.setText("Lớp phụ trách:");

        txtTenLop.setText(lh.getTenLop());

        jScrollPane2.setViewportView(lstNoti);

        m_gvTrangChu.setText("Trang Chủ");
        m_gvTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_gvTrangChuMouseClicked(evt);
            }
        });
        menu_gv.add(m_gvTrangChu);

        m_gvKhaiBao.setText("Khai Báo Y Tế");
        m_gvKhaiBao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_gvKhaiBaoMouseClicked(evt);
            }
        });
        menu_gv.add(m_gvKhaiBao);

        m_gvXinNghi.setText("Xin Nghỉ");
        m_gvXinNghi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_gvXinNghiMouseClicked(evt);
            }
        });
        menu_gv.add(m_gvXinNghi);

        m_gvThongKe.setText("Thống Kê");
        m_gvThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_gvThongKeMouseClicked(evt);
            }
        });
        menu_gv.add(m_gvThongKe);

        m_gvThongBao.setText("Thông Báo");
        m_gvThongBao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_gvThongBaoMouseClicked(evt);
            }
        });
        menu_gv.add(m_gvThongBao);

        jMenu1.setText("Lịch sử");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        menu_gv.add(jMenu1);

        m_gvTroGiup.setText("Trợ Giúp");
        m_gvTroGiup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_gvTroGiupMouseClicked(evt);
            }
        });
        menu_gv.add(m_gvTroGiup);

        jMenu2.setText("Đăng Xuất");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        menu_gv.add(jMenu2);

        setJMenuBar(menu_gv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_anh, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_kbyt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTenLop))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaGV))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenKhoa)
                                    .addComponent(txtTenGV))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMaGV))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTenGV))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTenKhoa))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTenLop)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(text_anh, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kbyt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        txtMaGV.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void m_gvKhaiBaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_gvKhaiBaoMouseClicked
        // TODO add your handling code here:
        GVKhaiBao frame = new GVKhaiBao(gv, khoa);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        frame.setVisible(true);
    }//GEN-LAST:event_m_gvKhaiBaoMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void m_gvTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_gvTrangChuMouseClicked
        // TODO add your handling code here:
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_m_gvTrangChuMouseClicked

    private void m_gvXinNghiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_gvXinNghiMouseClicked
        // TODO add your handling code here:
        GVNghi frame = new GVNghi(gv, khoa);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        frame.setVisible(true);
    }//GEN-LAST:event_m_gvXinNghiMouseClicked

    private void m_gvTroGiupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_gvTroGiupMouseClicked
        // TODO add your handling code here:
        HoTro frame = new HoTro();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        frame.setVisible(true);
    }//GEN-LAST:event_m_gvTroGiupMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        XemLichSu frame = new XemLichSu(gv,1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        frame.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    //khai bao y te
    private void btn_kbytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kbytActionPerformed
        GVKhaiBao frame = new GVKhaiBao(gv, khoa);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        frame.setVisible(true);
    }//GEN-LAST:event_btn_kbytActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ThongKe frame = new ThongKe(gv, lh, khoa);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        GVNghi frame = new GVNghi(gv, khoa);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        DangNhap frame;
        try {
            frame = new DangNhap();
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            Container contentPane = frame.getContentPane();
            frame.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(TrangChuGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        XemLichSu frame = new XemLichSu(gv,1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void m_gvThongBaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_gvThongBaoMouseClicked
        // TODO add your handling code here:
        XemThongBao frame = new XemThongBao(gv, 1, lh, khoa);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        frame.setVisible(true);
    }//GEN-LAST:event_m_gvThongBaoMouseClicked

    private void m_gvThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_gvThongKeMouseClicked
        // TODO add your handling code here:
        ThongKe frame = new ThongKe(gv, lh, khoa);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        frame.setVisible(true);
    }//GEN-LAST:event_m_gvThongKeMouseClicked

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
            java.util.logging.Logger.getLogger(TrangChuGiaoVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuGiaoVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuGiaoVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuGiaoVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    new TrangChuGiaoVien().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(TrangChuGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_kbyt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable lstNoti;
    private javax.swing.JMenu m_gvKhaiBao;
    private javax.swing.JMenu m_gvThongBao;
    private javax.swing.JMenu m_gvThongKe;
    private javax.swing.JMenu m_gvTrangChu;
    private javax.swing.JMenu m_gvTroGiup;
    private javax.swing.JMenu m_gvXinNghi;
    private javax.swing.JMenuBar menu_gv;
    private javax.swing.JLabel text_anh;
    private javax.swing.JLabel txtMaGV;
    private javax.swing.JLabel txtTenGV;
    private javax.swing.JLabel txtTenKhoa;
    private javax.swing.JLabel txtTenLop;
    // End of variables declaration//GEN-END:variables
}
