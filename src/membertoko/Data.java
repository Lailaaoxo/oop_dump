/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package membertoko;

import java.util.Scanner;

/**
 *
 * @author Laila Nur Azizah (2201010652)
 */
public class Data {
    protected int jml=10;
    protected String thn,mon;
    protected String [] member = new String [jml];
    protected Scanner dIN=new Scanner(System.in);

    public Data(String thn, String mon) {
        this.thn = thn;
        this.mon = mon;
    }

    
    public void StoreData(){
        System.out.println("Isikan Data Member");
        System.out.println(" ~~~ ");
        int no=0;
        for (int i = 0; i < member.length; i++) {
            no++;
            System.out.print("Member ke-"+no+" ");
            member[i]=dIN.nextLine();
        }
    }
    public void viewdata(){
        System.out.println("Daftar Member Toko Beserta ID");
        System.out.println(" ~~~ ");
        int no=0;
        System.out.println("Tahun: "+thn);
        System.out.println("Bulan: "+mon);
        for (int i = 0; i < member.length; i++) {
            no++;
            if (member[i] != null && member[i].length()>=2) {
                System.out.println(no+". "+member[i]
                    + "("+thn.substring(thn.length()-2,thn.length())+mon+member[i].substring(0, 2)+i+")");
            } else {
                System.out.println(no+". "+member[i]);
            }
        }  
    }
    public void editdata(){
        //edit index
        System.out.println("Ubah Data Member");
        System.out.println(" ~~~ ");
        System.out.print("Index data member yang ingin diubah: ");
        String id=dIN.nextLine();
        int idx = Integer.parseInt(id);
        System.out.println("Data member yang diubah: "+member[idx]);
        System.out.print("Diubah Menjadi: ");
        member[idx]=dIN.nextLine();
        System.out.println(" ~~Data telah diubah~~ ");
    }
    public void hapus(int idx){
        System.out.println("Menghapus Member");
        System.out.println(" ~~~ ");
        System.out.println("Index data member yang dihapus: "+idx);
        System.out.println("Data member yang ingin dihapus: "+member[idx]);
        member[idx]=null;
        System.out.println(" ~~Data telah dihapus~~ ");
    }
    public void hapus(){
        System.out.println("Mengosongkan Daftar Member");
        System.out.println("Anda Akan Mengosongkan Daftar Member");
        System.out.print("Silahkan Konfirmasi dengan menekan Y, tekan huruf lain untuk kembali: ");
        String conf=dIN.nextLine();
        if (conf.equals("Y")|| conf.equals("y")) {
            for (int i = 0; i < member.length; i++) {
                member[i]=null;
            }
        System.out.println(" ~~Daftar Member Telah Dikosongkan~~"); 
        }
    }
}
