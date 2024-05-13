/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package membertoko;

/**
 *
 * @author Laila Nur Azizah (2201010652)
 */
public class code extends Data{

    public code(String thn, String mon) {
        super(thn, mon);
    }
    @Override
    public void viewdata() {
        System.out.println("Daftar Member Toko");
        System.out.println(" ~~~ ");
        int no=0;
        System.out.println("Tahun: "+thn);
        System.out.println("Bulan: "+mon);
        //make code
        
        for (int i = 0; i < member.length; i++) {
            no++;
            System.out.println(no+". "+member[i]);
        }
    }
}
