/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan55handphone;

/**
 *
 * @author
 *  Nama              : Muhammad Ilham Apriyadi
 *  Kelas             : IF2
 *  NIM               : 10118045
 *  Deskripsi Program : HandPhone
 */
public class PBO10118045Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android android = new Android("Samsung", "Android", "Grand", 3000000);
        android.setKeyStore("234ibfd3840fo");
        BlackBerry blackberry = new BlackBerry("BlackBB", "RIM", "Curve", 2000000);
        blackberry.setPinBB("BHS249");
        WindowsPhone wp = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        wp.setWpKeyStore("UUQIJWORJ");
        
        android.displayProdduct();
        System.out.println("Android Key Store : "+android.getKeyStore());
        System.out.println("");
        blackberry.displayProdduct();
        System.out.println("PIN : "+blackberry.getPinBB());
        System.out.println("");
        wp.displayProdduct();
        System.out.println("Wp Key Store : "+wp.getWpKeyStore());
        
        
    }
    
}
