
package com.mycompany.invernadero.PlantasTerrestres.Spermatophyta;

public class Gimnospermas extends Spermatophyta {
    public Gimnospermas(String name, String order, String family, String genus, int quantity){
        super(name, order, family, genus, quantity);
    }
    
    public Gimnospermas(String name, String order, String family, int quantity){
        super(name, order, family, quantity);
    }
    
    public Gimnospermas(String name, String order, int quantity){
        super(name, order, quantity);
    }
    
    public Gimnospermas(String name, int quantity){
        super(name, quantity);
    }    
}
