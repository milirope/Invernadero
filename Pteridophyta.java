package com.mycompany.invernadero.PlantasTerrestres;

import com.mycompany.invernadero.Vascular;
import com.mycompany.invernadero.Semilla;

public class Pteridophyta extends PlantasTerrestres implements Vascular, Semilla{
    public Pteridophyta(String name, String order, String family, String genus, int quantity){
        super(name, order, family, genus, quantity);
    }
    
    public Pteridophyta(String name, String order, String family, int quantity){
        super(name, order, family, quantity);
    }
    
    
    public Pteridophyta(String name, String order, int quantity){
        super(name, order, quantity);
    }
    
    public Pteridophyta(String name, int quantity){
        super(name, quantity);
    }
    
    public String mostrarInfoSemilla(){
        return this.semillaInfo;
    }
    
    public String mostrarProcesoVascular(){
        return this.procesoVascularInfo;
    }
}
