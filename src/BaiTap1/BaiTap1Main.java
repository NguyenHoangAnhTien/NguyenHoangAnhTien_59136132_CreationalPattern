/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author tien
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDon hd = new HoaDon.HoaDonBuilder().addMaHD("MT0303")
                .addNgayBan("28/04/2020")
                .addTenKH("Nguyễn Hoàng Anh Tiến")
                .build();
        CTHD cthd1 = new CTHD.CTHDBuilder().addTenSP("Ipad mini")
                .addSoLuong(5)
                .addDonGia(14000000)
                .addChietKhau("15%")
                .build();
        CTHD cthd2 = new CTHD.CTHDBuilder().addTenSP("Iphone X")
                .addSoLuong(1)
                .addDonGia(150000)
                .addChietKhau("12%")
                .build();
        hd.addCTHD(cthd2);
        hd.addCTHD(cthd1);
        hd.xuatHoaDon();
    }
    
}
