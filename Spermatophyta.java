package com.mycompany.invernadero.PlantasTerrestres.Spermatophyta;
import com.mycompany.invernadero.PlantasTerrestres.PlantasTerrestres;
import com.mycompany.invernadero.Semilla;
import com.mycompany.invernadero.Vascular;

public class Spermatophyta extends PlantasTerrestres implements Vascular, Semilla{
    public Spermatophyta(String name, String order, String family, String genus, int quantity){
        super(name, order, family, genus, quantity);
    }
    
    public Spermatophyta(String name, String order, String family, int quantity){
        super(name, order, family, quantity);
    }
    
    
    public Spermatophyta(String name, String order, int quantity){
        super(name, order, quantity);
    }
    
    public Spermatophyta(String name, int quantity){
        super(name, quantity);
    }
    
    public String mostrarInfoSemilla(){
        return this.semillaInfo;
    }
    
    public String mostrarProcesoVascular(){
        return this.procesoVascularInfo;
    }
}
