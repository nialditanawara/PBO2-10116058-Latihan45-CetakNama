/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan45.cetaknama;

import java.util.Scanner;

public class PBO210116058Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Printer print = new Printer();
        
        System.out.println("======Aplikasi Pencetak Nama=======");
        System.out.print("Masukkan Nama Anda : ");
        print.setNama(scan.next());
        System.out.print("Mau Cetak Berapa Kali ? : ");
        print.setJmlCetak(scan.nextInt());
        
        print.cetak(print.getNama());
        print.cetak(print.getJmlCetak(), print.getNama());
    }
    
}