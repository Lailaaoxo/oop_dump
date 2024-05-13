/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package membertoko;

import java.util.Scanner;

/**
 *
 * @author Laila Nur Azizah (2201010652)
 */
public class MemberToko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Scanner st=new Scanner(System.in);
        System.out.println("Pencatatan 10 Member Toko");
        System.out.println(" ~~~ ");
        System.out.print("Masukkan Tahun: ");
        String tahun=st.nextLine();
        System.out.print("Masukkan Bulan Dalam Angka: ");
        String bulan=st.nextLine();
        System.out.println("");
        while (tahun.length()<4) {            
            System.out.print("Silahkan Masukkan Tahun yang Benar: ");
            tahun=st.nextLine();
        }
        Data dt=new Data(tahun, bulan);
        code cd=new code(tahun, bulan); 
        
        String close="tidak";
        do { 
            System.out.println("Menu");
            System.out.println(" ~~~ ");
            System.out.println("A. Isi Daftar Nama Member");
            System.out.println("B. Tampilkan Daftar Member Beserta ID");
            System.out.println("C. Tampilkan Daftar Member");
            System.out.println("D. Ubah Nama Member");
            System.out.println("E. Hapus Member");
            System.out.println("F. Kosongkan Daftar Member");
            System.out.println("X. Tutup");
            System.out.print("Masukkan Menu Yang Ingin Dipilih: ");
            String menu=in.nextLine();
            System.out.println("");
            switch (menu) {
                case "A":
                case "a":
                    dt.StoreData();
                    System.out.println("");
                    break;
                case "B":
                case "b":
                    dt.viewdata();
                    System.out.println("");
                    break;
                case "C":
                case "c":
                    cd.viewdata();
                    System.out.println("");
                    break;
                case "D":
                case "d":
                    dt.editdata();
                    System.out.println("");
                    break;
                case "E":
                case "e":
                    Scanner cb=new Scanner(System.in);
                    System.out.print("Masukkan index data yang ingin dihapus: ");
                    String id=cb.nextLine();
                    int idx = Integer.parseInt(id);
                    dt.hapus(idx);
                    System.out.println("");
                    break;
                case "F":
                case "f":
                    dt.hapus();
                    System.out.println("");
                    break;
                case "X":
                case "x":
                    close="ya";
                    in.close();
                    st.close();
                    break;
                default:
                    System.out.println("Tidak Ada Menu");
                    break;
            }    
        } while (close.equals("tidak"));
    }
}
