/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import object.DocGhi;
import object.DonKBYTGiaoVien;
import object.DonKBYTSinhVien;
import object.Khoa;
import object.LopHoc;

/**
 *
 * @author duongv
 */
public class TableGV extends AbstractTableModel{
    private String Name[] = {"Ma GV","Ten GV","Lop phu trach" ,"Khoa","Ngay gui",};
    
    private Class classess[]  = {String.class,String.class,String.class,String.class,String.class};
    
    ArrayList<DonKBYTGiaoVien> dsKBYT = new ArrayList<DonKBYTGiaoVien>();

    public TableGV(ArrayList<DonKBYTGiaoVien> dsKBYT) {
        this.dsKBYT = dsKBYT;
    }
    
        public String getTenLop_byMaGV(String maGV){
        try {
            DocGhi rw = new DocGhi();
            ArrayList<DonKBYTGiaoVien> lstKBYT;
            lstKBYT = (ArrayList<DonKBYTGiaoVien>) rw.ReadObject("./src/data/KBYTGV.txt");
            
            ArrayList<LopHoc> lstLH = new ArrayList<>();
            ArrayList<Khoa> lstKhoa = new ArrayList<>();
            lstLH = (ArrayList<LopHoc>) rw.ReadObject("./src/data/Lop.txt");
            lstKhoa = (ArrayList<Khoa>) rw.ReadObject("./src/data/Khoa.txt");
            for(DonKBYTGiaoVien item : lstKBYT){
                if(maGV.equals(item.getMaGV())){
                    for(LopHoc lh : lstLH){
                        if(lh.getMaGV().equals(item.getMaGV())){
                            return lh.getTenLop();
                        }
                    }
                }
            }
            return "";
        } catch (IOException ex) {
            Logger.getLogger(TableGV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TableGV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    @Override
    public int getRowCount() {
        return dsKBYT.size();
    }

    @Override
    public int getColumnCount() {
        return Name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dsKBYT.get(rowIndex).getMaGV();
            
            case 1: return dsKBYT.get(rowIndex).getTenGV();
            
            case 2: return getTenLop_byMaGV(dsKBYT.get(rowIndex).getMaGV());
             
            case 3: return dsKBYT.get(rowIndex).getKhoa();
            
            case 4: return dsKBYT.get(rowIndex).getNgayKhaiBao();
            
            
            default : return null;
        }
    }
    
    public Class getColumnClass(int columnIndex){
        return classess[columnIndex];
    }
    
    public String getColumnName(int column){
        return Name[column];
    }
    
}
