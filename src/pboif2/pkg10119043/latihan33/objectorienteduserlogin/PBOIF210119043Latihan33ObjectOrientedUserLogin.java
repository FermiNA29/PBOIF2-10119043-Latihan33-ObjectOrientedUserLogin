/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan33.objectorienteduserlogin;
import java.util.Scanner;
/**
 *
 * @author FERMI
 */
public class PBOIF210119043Latihan33ObjectOrientedUserLogin {

    /**
     * @param args the command line arguments
     */
    private static String username, password;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Username = ");
        username = scanner.nextLine();
        System.out.print("Masukan Password = ");
        password = scanner.nextLine();
        
        User login = new User();
        login.pengecekkanLogin(username, password);
    }
    
}
