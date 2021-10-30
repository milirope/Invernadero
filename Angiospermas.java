
package com.mycompany.invernadero.PlantasTerrestres.Spermatophyta;


public class Angiospermas extends Spermatophyta {
    
    public Angiospermas(String name, String order, String family, String genus, int quantity){
        super(name, order, family, genus, quantity);
    }
    
    public Angiospermas(String name, String order, String family, int quantity){
        super(name, order, family, quantity);
    }
    
    
    public Angiospermas(String name, String order, int quantity){
        super(name, order, quantity);
    }
    
    public Angiospermas(String name, int quantity){
        super(name, quantity);
    }    
    
}
