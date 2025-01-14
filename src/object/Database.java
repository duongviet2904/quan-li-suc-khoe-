/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ducth
 */
public class Database {
    
    static ArrayList<TaiKhoan> tk = new ArrayList<>();
    static ArrayList<GiaoVien> gv = new ArrayList<>();
    static ArrayList<Khoa> khoa = new ArrayList<>();
    static ArrayList<LopHoc> lop = new ArrayList<>();
    static ArrayList<DonKBYTSinhVien> khaibaosv = new ArrayList<>();
    static ArrayList<DonKBYTGiaoVien> khaibaogv = new ArrayList<>();
    static ArrayList<DonXinNghiGV> xinnghigv = new ArrayList<>();
    static ArrayList<DonXinNghiSV> xinnghisv = new ArrayList<>();
    static ArrayList<SinhVien> sinhvien = new ArrayList<>();
    static ArrayList<ThongBao> thongbao = new ArrayList<>();
    static ArrayList<LichSu> lichsu = new ArrayList<>();
    
    
    public static void taoTK() throws IOException
    {
        DocGhi rw = new DocGhi();
        tk.add(new TaiKhoan("TK00", "admin", "123", 2,"GV01"));
        tk.add(new TaiKhoan("TK01", "GV01", "123", 1, "GV01"));
        tk.add(new TaiKhoan("TK02", "GV02", "123", 1, "GV02"));
        tk.add(new TaiKhoan("TK03", "GV03", "123", 1, "GV03"));
        tk.add(new TaiKhoan("TK04", "GV04", "123", 1, "GV04"));
        tk.add(new TaiKhoan("TK05", "SV01", "123", 0, "SV01"));
        tk.add(new TaiKhoan("TK06", "SV02", "123", 0, "SV02"));
        tk.add(new TaiKhoan("TK07", "SV03", "123", 0, "SV03"));
        tk.add(new TaiKhoan("TK08", "SV04", "123", 0, "SV04"));
        tk.add(new TaiKhoan("TK09", "SV05", "123", 0, "SV05"));
        tk.add(new TaiKhoan("TK10", "SV06", "123", 0, "SV06"));
        tk.add(new TaiKhoan("TK11", "SV07", "123", 0, "SV07"));
        tk.add(new TaiKhoan("TK12", "SV08", "123", 0, "SV08"));
        tk.add(new TaiKhoan("TK13", "SV09", "123", 0, "SV09"));
        tk.add(new TaiKhoan("TK14", "SV10", "123", 0, "SV10"));
        tk.add(new TaiKhoan("TK15", "SV11", "123", 0, "SV11"));
        tk.add(new TaiKhoan("TK16", "SV12", "123", 0, "SV12"));
        
        rw.WriteObject("./src/data/TaiKhoan.txt", tk);
//        try {
//          ArrayList<TaiKhoan> tk1 = (ArrayList<TaiKhoan>) rw.ReadObject("./src/data/TaiKhoan.txt");
////          for(TaiKhoan t : tk1)
////            {
////                System.out.println(t.getMaTK()+t.getTenDangNhap()+t.getMatKhau()+t.getVaiTro());
////                
////            }
//        } catch (IOException | ClassNotFoundException ex) {
//            JOptionPane.showMessageDialog(null, "Danh sach hien tai rong");
//        }
        
    }
   
    
    public static void taoGV() throws IOException
    {
        DocGhi rw = new DocGhi();
        gv.add(new GiaoVien("GV01", "Nguyễn Văn Mạnh", "K01"));
        gv.add(new GiaoVien("GV02", "Phạm Thị Hạnh", "K01"));
        gv.add(new GiaoVien("GV03", "Nguyễn Văn Nam", "K02"));
        gv.add(new GiaoVien("GV04", "Nguyễn Minh Trung", "K02"));
        gv.add(new GiaoVien("GV05", "Nguyễn Minh Hiếu", "K02"));
        rw.WriteObject("./src/data/GiaoVien.txt", gv);
//        
//        
//        try {
//            
//            ArrayList<GiaoVien> gv1 = (ArrayList<GiaoVien>) rw.ReadObject("./src/data/GiaoVien.txt");
//            for(GiaoVien gv : gv1)
//            {
//                System.out.println(gv.getTenGV());
//                
//            }
//        } catch (IOException | ClassNotFoundException ex) {
//            JOptionPane.showMessageDialog(null, "Danh sach hien tai rong");
//        }
    }
    
    public static void taoKhoa() throws IOException
    {
        DocGhi rw = new DocGhi();
        khoa.add(new Khoa("K01", "CNTT", "GV01"));
        khoa.add(new Khoa("K02", "Du lịch", "GV02"));
        rw.WriteObject("./src/data/Khoa.txt", khoa);
//        try {
//            
//            ArrayList<Khoa> khoa1 = (ArrayList<Khoa>) rw.ReadObject("./src/data/Khoa.txt");
//            for(Khoa gv : khoa1)
//            {
//                System.out.println(gv.getTenKhoa());
//                
//            }
//            
//        } catch (IOException | ClassNotFoundException ex) {
//            JOptionPane.showMessageDialog(null, "Danh sach hien tai rong");
//        }
    }
    
    public static void taoLop() throws IOException
    {
        DocGhi rw = new DocGhi();
        lop.add(new LopHoc("L01", "IT01", 4, 14, "K01", "GV01"));
        lop.add(new LopHoc("L02", "IT02", 4, 14, "K01", "GV02"));
        lop.add(new LopHoc("L03", "DL01", 4, 14, "K02", "GV03"));
        lop.add(new LopHoc("L04", "DL01", 4, 14, "K02", "GV04"));
        rw.WriteObject("./src/data/Lop.txt", lop);
//        try {
//            
//            ArrayList<LopHoc> lop1 = (ArrayList<LopHoc>) rw.ReadObject("./src/data/Lop.txt");
//            for(LopHoc gv : lop1)
//            {
//                System.out.println(gv.getTenLop());
//                
//            }
//            
//        } catch (IOException | ClassNotFoundException ex) {
//            JOptionPane.showMessageDialog(null, "Danh sach hien tai rong");
//        }
    }
    
    public static void taoSinhVien() throws IOException
    {
        DocGhi rw = new DocGhi();
        sinhvien.add(new SinhVien("SV01", "Nguyễn Minh Anh", "Nữ", "012345678", "abc@gmail.com", "16/01/2001", "L01"));
        sinhvien.add(new SinhVien("SV02", "Nguyễn Văn Minh", "Nam", "012345678", "abc@gmail.com", "16/01/2001", "L02"));
        sinhvien.add(new SinhVien("SV03", "Nguyễn Văn Bá", "Nam", "012345678", "abc@gmail.com", "16/01/2001", "L03"));
        sinhvien.add(new SinhVien("SV04", "Nguyễn Văn Cao", "Nam", "012345678", "abc@gmail.com", "16/01/2001", "L04"));
        sinhvien.add(new SinhVien("SV05", "Nguyễn Minh Nguyệt", "Nữ", "012345678", "abc@gmail.com", "16/01/2001", "L01"));
        sinhvien.add(new SinhVien("SV06", "Nguyễn Minh Thảo", "Nữ", "012345678", "abc@gmail.com", "16/01/2001", "L02"));
        sinhvien.add(new SinhVien("SV07", "Nguyễn Văn Cường", "Nam", "012345678", "abc@gmail.com", "16/01/2001", "L03"));
        sinhvien.add(new SinhVien("SV08", "Nguyễn Văn Dương", "Nam", "012345678", "abc@gmail.com", "16/01/2001", "L04"));
        sinhvien.add(new SinhVien("SV09", "Nguyễn Minh Thảo", "Nữ", "012345678", "abc@gmail.com", "16/01/2001", "L01"));
        sinhvien.add(new SinhVien("SV10", "Nguyễn Minh Hiền", "Nữ", "012345678", "abc@gmail.com", "16/01/2001", "L04"));
        sinhvien.add(new SinhVien("SV11", "Nguyễn Văn Dũng", "Nam", "012345678", "abc@gmail.com", "16/01/2001", "L03"));
        sinhvien.add(new SinhVien("SV12", "Nguyễn Minh Nga", "Nữ", "012345678", "abc@gmail.com", "16/01/2001", "L02"));
        
        rw.WriteObject("./src/data/SinhVien.txt", sinhvien);
//        try {
//            
//            ArrayList<SinhVien> sv1 = (ArrayList<SinhVien>) rw.ReadObject("./src/data/SinhVien.txt");
//            for(SinhVien gv : sv1)
//            {
//                System.out.println(gv.getTenSV());
//                
//            }
//            
//        } catch (IOException | ClassNotFoundException ex) {
//            JOptionPane.showMessageDialog(null, "Danh sach hien tai rong");
//        }
    }
    public static void taoKBYTGV() throws IOException
    {
        DocGhi rw = new DocGhi();
        khaibaogv.add(new DonKBYTGiaoVien("GV01", "Nguyễn Văn Mạnh", "CNTT", "12/06/2022", false, false, false, false, false));
        khaibaogv.add(new DonKBYTGiaoVien("GV02", "Phạm Thị Hạnh", "CNTT", "12/06/2022", false, false, false, false, false));
        khaibaogv.add(new DonKBYTGiaoVien("GV01", "Nguyễn Văn Mạnh", "CNTT", "13/06/2022", false, false, true, false, false));
        khaibaogv.add(new DonKBYTGiaoVien("GV03", "Nguyễn Văn Nam", "Du lịch", "13/06/2022", false, false, false, false, false));
        khaibaogv.add(new DonKBYTGiaoVien("GV04", "Nguyễn Minh Trung", "Du lịch", "13/06/2022", false, false, false, false, false));
        khaibaogv.add(new DonKBYTGiaoVien("GV01", "Nguyễn Văn Mạnh", "CNTT", "14/06/2022", false, false, false, false, false));
        khaibaogv.add(new DonKBYTGiaoVien("GV02", "Phạm Thị Hạnh", "CNTT", "14/06/2022", false, false, false, false, false));
        khaibaogv.add(new DonKBYTGiaoVien("GV03", "Nguyễn Văn Nam", "Du lịch", "14/06/2022", false, false, false, false, false));
        khaibaogv.add(new DonKBYTGiaoVien("GV04", "Nguyễn Minh Trung", "Du lịch", "14/06/2022", false, false, false, false, false));
        khaibaogv.add(new DonKBYTGiaoVien("GV01", "Nguyễn Văn Mạnh", "CNTT", "15/06/2022", false, false, false, false, false));
        khaibaogv.add(new DonKBYTGiaoVien("GV02", "Phạm Thị Hạnh", "CNTT", "15/06/2022", false, true, false, false, false));
        khaibaogv.add(new DonKBYTGiaoVien("GV03", "Nguyễn Văn Nam", "Du lịch", "15/06/2022", false, false, false, false, false));
        khaibaogv.add(new DonKBYTGiaoVien("GV04", "Nguyễn Minh Trung", "Du lịch", "15/06/2022", true, false, false, false, false));
        
        rw.WriteObject("./src/data/KBYTGV.txt", khaibaogv);
//        try {
//            
//            ArrayList<DonKBYTGiaoVien> khoa1 = (ArrayList<DonKBYTGiaoVien>) rw.ReadObject("./src/data/KBYTGV.txt");
//            for(DonKBYTGiaoVien gv : khoa1)
//            {
//                System.out.println(gv.getNgayKhaiBao());
//                
//            }
//            
//        } catch (IOException | ClassNotFoundException ex) {
//            JOptionPane.showMessageDialog(null, "Danh sach hien tai rong");
//        }
    }
    public static void taoKBYTSV() throws IOException
    {
        DocGhi rw = new DocGhi();
        khaibaosv.add(new DonKBYTSinhVien("SV01", "Nguyễn Minh Anh","L01", "CNTT", "12/06/2022", false, false, false, false, false));
        khaibaosv.add(new DonKBYTSinhVien("SV01", "Nguyễn Minh Anh","L01", "CNTT", "13/06/2022", false, true, false, false, false));
        rw.WriteObject("./src/data/KBYTSV.txt", khaibaosv);
//        try {
//            
//            ArrayList<DonKBYTSinhVien> khoa1 = (ArrayList<DonKBYTSinhVien>) rw.ReadObject("./src/data/KBYTSV.txt");
//            for(DonKBYTSinhVien svtt : khoa1)
//            {
//                System.out.println(svtt.toString());
//                
//            }
//            
//        } catch (IOException | ClassNotFoundException ex) {
//            JOptionPane.showMessageDialog(null, "Danh sach hien tai rong");
//        }
    }
    public static void taoXinNghiGV() throws IOException
    {
        DocGhi rw = new DocGhi();
        xinnghigv.add(new DonXinNghiGV("DG01","GV01", "Nguyễn Văn Mạnh", "CNTT", "12/05/2022","12/05/2022","13/05/2022", "abc","abc","haui.png"));
        xinnghigv.add(new DonXinNghiGV("DG02","GV01", "Nguyễn Văn Mạnh", "CNTT", "12/05/2022","12/06/2022","13/06/2022", "abc","abc","haui.png"));
        xinnghigv.add(new DonXinNghiGV("DG03","GV01", "Nguyễn Văn Mạnh", "CNTT", "12/05/2022","12/05/2022","13/05/2022", "abc","abc","haui.png"));
        xinnghigv.add(new DonXinNghiGV("DG04","GV01", "Nguyễn Văn Mạnh", "CNTT", "12/05/2022","12/06/2022","13/06/2022", "abc","abc","haui.png"));
        xinnghigv.add(new DonXinNghiGV("DG05","GV01", "Nguyễn Văn Mạnh", "CNTT", "12/05/2022","12/05/2022","13/05/2022", "abc","abc","haui.png"));
        xinnghigv.add(new DonXinNghiGV("DG06","GV01", "Nguyễn Văn Mạnh", "CNTT", "12/05/2022","12/06/2022","13/06/2022", "abc","abc","haui.png"));
        xinnghigv.add(new DonXinNghiGV("DG07","GV01", "Nguyễn Văn Mạnh", "CNTT", "12/05/2022","12/05/2022","13/05/2022", "abc","abc","haui.png"));
        xinnghigv.add(new DonXinNghiGV("DG08","GV01", "Nguyễn Văn Mạnh", "CNTT", "12/05/2022","12/06/2022","13/06/2022", "abc","abc","haui.png"));
        xinnghigv.add(new DonXinNghiGV("DG09","GV01", "Nguyễn Văn Mạnh", "CNTT", "12/05/2022","12/05/2022","13/05/2022", "abc","abc","haui.png"));
        xinnghigv.add(new DonXinNghiGV("DG10","GV01", "Nguyễn Văn Mạnh", "CNTT", "12/05/2022","12/06/2022","13/06/2022", "abc","abc","haui.png"));
        
        
        
        rw.WriteObject("./src/data/DonXNGV.txt", xinnghigv);
        try {
            
            ArrayList<DonXinNghiGV> khoa1 = (ArrayList<DonXinNghiGV>) rw.ReadObject("./src/data/DonXNGV.txt");
            for(DonXinNghiGV gv : khoa1)
            {
                System.out.println(gv.toString());
                
            }
            
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Danh sach hien tai rong");
        }
    }
    public static void taoXinNghiSV() throws IOException
    {
        DocGhi rw = new DocGhi();
        xinnghisv.add(new DonXinNghiSV("DS01","SV01", "Nguyễn Minh Anh","IT01", "CNTT", "19/05/2022","12/05/2022","13/05/2022", "abc","abc","haui.png",false));
        xinnghisv.add(new DonXinNghiSV("DS02","SV02", "Nguyễn Văn Minh","IT02", "CNTT", "10/06/2022","12/06/2022","13/06/2022", "abc","abc","haui.png",false));
        xinnghisv.add(new DonXinNghiSV("DS03","SV01", "Nguyễn Minh Anh","IT01", "CNTT", "19/05/2022","12/05/2022","13/05/2022", "abc","abc","haui.png",false));
        xinnghisv.add(new DonXinNghiSV("DS04","SV02", "Nguyễn Văn Minh","IT02", "CNTT", "10/06/2022","12/06/2022","13/06/2022", "abc","abc","haui.png",false));
        xinnghisv.add(new DonXinNghiSV("DS05","SV01", "Nguyễn Minh Anh","IT01", "CNTT", "19/05/2022","12/05/2022","13/05/2022", "abc","abc","haui.png",true));
        xinnghisv.add(new DonXinNghiSV("DS06","SV02", "Nguyễn Văn Minh","IT02", "CNTT", "10/06/2022","12/06/2022","13/06/2022", "abc","abc","haui.png",true));
        xinnghisv.add(new DonXinNghiSV("DS07","SV01", "Nguyễn Minh Anh","IT01", "CNTT", "19/05/2022","12/05/2022","13/05/2022", "abc","abc","haui.png",true));
        xinnghisv.add(new DonXinNghiSV("DS08","SV02", "Nguyễn Văn Minh","IT02", "CNTT", "10/06/2022","12/06/2022","13/06/2022", "abc","abc","haui.png",false));
        xinnghisv.add(new DonXinNghiSV("DS09","SV01", "Nguyễn Minh Anh","IT01", "CNTT", "19/05/2022","12/05/2022","13/05/2022", "abc","abc","haui.png",false));
        xinnghisv.add(new DonXinNghiSV("DS10","SV02", "Nguyễn Văn Minh","IT02", "CNTT", "10/06/2022","12/06/2022","13/06/2022", "abc","abc","haui.png",false));
        xinnghisv.add(new DonXinNghiSV("DS11","SV01", "Nguyễn Minh Anh","IT01", "CNTT", "19/05/2022","12/05/2022","13/05/2022", "abc","abc","haui.png",false));
        xinnghisv.add(new DonXinNghiSV("DS12","SV02", "Nguyễn Văn Minh","IT02", "CNTT", "10/06/2022","12/06/2022","13/06/2022", "abc","abc","haui.png",false));
        xinnghisv.add(new DonXinNghiSV("DS13","SV01", "Nguyễn Minh Anh","IT01", "CNTT", "19/05/2022","12/05/2022","13/05/2022", "abc","abc","haui.png",false));
        xinnghisv.add(new DonXinNghiSV("DS14","SV02", "Nguyễn Văn Minh","IT02", "CNTT", "10/06/2022","12/06/2022","13/06/2022", "abc","abc","haui.png",false));
        
        
        
        
        rw.WriteObject("./src/data/DonXNSV.txt", xinnghisv);
        try {
            
            ArrayList<DonXinNghiSV> khoa10 = (ArrayList<DonXinNghiSV>) rw.ReadObject("./src/data/DonXNSV.txt");
            for(DonXinNghiSV gv1 : khoa10)
            {
                System.out.println(gv1.toString());
                
            }
            
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Danh sach hien tai rong");
        }
    }
    
    public static void taoLicSu() throws IOException
    {
        DocGhi rw = new DocGhi();
        lichsu.add(new LichSu("1","SV01","Khai báo y tế", "12/06/2022"));
        lichsu.add(new LichSu("2","SV01","Khai báo y tế", "12/06/2022"));
        lichsu.add(new LichSu("3","SV02","Khai báo y tế", "12/06/2022"));
        lichsu.add(new LichSu("4","SV01","Khai báo y tế", "12/06/2022"));
        lichsu.add(new LichSu("5","SV02","Khai báo y tế", "12/06/2022"));
        lichsu.add(new LichSu("6","SV01","Khai báo y tế", "12/06/2022"));
        lichsu.add(new LichSu("7","SV02","Khai báo y tế", "12/06/2022"));
        lichsu.add(new LichSu("8","SV01","Khai báo y tế", "12/06/2022"));
        lichsu.add(new LichSu("9","SV01","Khai báo y tế", "12/06/2022"));
        lichsu.add(new LichSu("10","SV02","Khai báo y tế", "12/06/2022"));
        lichsu.add(new LichSu("11","SV01","Xin nghỉ", "12/06/2022"));
        lichsu.add(new LichSu("12","SV02","Khai báo y tế", "12/06/2022"));
        lichsu.add(new LichSu("13","GV01","Khai báo y tế", "12/06/2022"));
        lichsu.add(new LichSu("14","GV02","Khai báo y tế", "12/06/2022"));
        lichsu.add(new LichSu("15","GV01","Khai báo y tế", "12/06/2022"));
        lichsu.add(new LichSu("16","GV01","Khai báo y tế", "12/06/2022"));
        rw.WriteObject("./src/data/LichSu.txt", lichsu);
//        try {
//            
//            ArrayList<LichSu> khoa10 = (ArrayList<LichSu>) rw.ReadObject("./src/data/LichSu.txt");
//            for(LichSu gv1 : khoa10)
//            {
//                System.out.println(gv1.toString());
//                
//            }
//            
//        } catch (IOException | ClassNotFoundException ex) {
//            JOptionPane.showMessageDialog(null, "Danh sach hien tai rong");
//        }
    }
    public static void taoThongBao() throws IOException
    {
        DocGhi rw = new DocGhi();
        
        
        rw.WriteObject("./src/data/ThongBao.txt", thongbao);
        try {
            
            ArrayList<ThongBao> khoa10 = (ArrayList<ThongBao>) rw.ReadObject("./src/data/ThongBao.txt");
            for(ThongBao gv1 : khoa10)
            {
                System.out.println(gv1.toString());
                
            }
            
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Danh sach hien tai rong");
        }
    }
    public static void main(String[] args) throws IOException {
        taoTK();
        taoGV();
        taoKhoa();
        taoLop();
        taoSinhVien();
        taoKBYTGV();
        taoKBYTSV();
        taoXinNghiGV();
        taoXinNghiSV();
        taoLicSu();
        taoThongBao();
        System.out.println("Đã tạo dữ liệu thành công!");
    }
}
