/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgit;

/**
 *
 * @author bogdann
 */
public class TestGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello Git! The name of the license project is \"Freelance platform\".");
        
        String info = "Auto-Moto";
        double price = 10000;
        
        OLXServices os = new OLXServices(info, price);
        
        System.out.println(os.getAdvertiseInfo());
        System.out.println(os.isChecked());
    }
    
}
