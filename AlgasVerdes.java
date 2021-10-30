package com.mycompany.invernadero.Algas;

public class AlgasVerdes extends Algas{
    
    public AlgasVerdes(String name, String order, String family, String genus, int quantity){
        super(name, order, family, genus, quantity);
    }
    
    public AlgasVerdes(String name, String order, String family, int quantity){
        super(name, order, family, quantity);
    }
    
    
    public AlgasVerdes(String name, String order, int quantity){
        super(name, order, quantity);
    }
    
    public AlgasVerdes(String name, int quantity){
        super(name, quantity);
    }
    
}
