/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan33.objectorienteduserlogin;

/**
 *
 * @author FERMI
 */
public class User {
    private static String username = "RizkiAdam";
    private static String password = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun(String UserName, String Password) {
        if(UserName.equals(username)){
            if(Password.equals(password)) {
                statusAkun = true;
                System.out.println(statusAkun);
            } else {
                statusAkun = false;
            } 
        } else {
                statusAkun = false;
        }
       
        return statusAkun;
    }
    
    private void hasilLogin(boolean status, String UserName) {
        if(status) {
            System.out.println("\n******HALO " + UserName.toUpperCase() + "******");
            System.out.println("Selamat Datang di aplikasi ini");
        } else {
            System.out.println("\nOoops, Username atau Password anda salah");
        }
    }
    
    public void pengecekkanLogin(String UserName, String Password) {
        hasilLogin(cekAkun(UserName, Password), UserName);
    }
}
