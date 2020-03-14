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
public class OLXServices implements CheckAdvertiseRules{
    private String nameOfTheService;
    private double priceOfTheService;
    
    public OLXServices(String nameOfTheService, double priceOfTheService){
        this.nameOfTheService = nameOfTheService;
        this.priceOfTheService = priceOfTheService;
    }

    @Override
    public boolean isChecked() {
        return this.priceOfTheService < 200000;
    }

    @Override
    public String getAdvertiseInfo() {
        return "The name of the service is: " + this.nameOfTheService + " and the price is: " + this.priceOfTheService;
    }
    
    
}
