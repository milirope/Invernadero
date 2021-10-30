package com.mycompany.invernadero.Algas;

public class AlgasRojas extends Algas{
    
    public AlgasRojas(String name, String order, String family, String genus, int quantity){
        super(name, order, family, genus, quantity);
    }
    
    public AlgasRojas(String name, String order, String family, int quantity){
        super(name, order, family, quantity);
    }
    
    
    public AlgasRojas(String name, String order, int quantity){
        super(name, order, quantity);
    }
    
    public AlgasRojas(String name, int quantity){
        super(name, quantity);
    }
    
}
