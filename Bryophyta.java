
package com.mycompany.invernadero.PlantasTerrestres;

import com.mycompany.invernadero.NoVascular;

public class Bryophyta extends PlantasTerrestres implements NoVascular{
    public Bryophyta(String name, String order, String family, String genus, int quantity){
        super(name, order, family, genus, quantity);
    }
    
    public Bryophyta(String name, String order, String family, int quantity){
        super(name, order, family, quantity);
    }
    
    
    public Bryophyta(String name, String order, int quantity){
        super(name, order, quantity);
    }
    
    public Bryophyta(String name, int quantity){
        super(name, quantity);
    }
    
    public String mostrarProcesoNoVascular(){
        return this.procesoNoVascularInfo;
    }
}
