/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segitiga;
import javax.swing.JOptionPane;
/**
 *
 * @author Laila
 * tgl: 30-Mar-2024
 */
public class Segitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //deklarasi
        double r=1d/2; //uses double?
        String alas="";
        String tinggi="";
        alas= JOptionPane.showInputDialog("Masukkan Alas Segitiga: ");
        tinggi= JOptionPane.showInputDialog("Masukkan Tinggi Segitiga: ");
        int a=Integer.parseInt(alas); //needs data type?
        int b=Integer.parseInt(tinggi); //needs data type?
        System.out.println("Hasil Luas: "+r*a*b);
        
        
    }
    
}
