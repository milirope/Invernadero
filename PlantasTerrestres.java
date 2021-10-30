
package com.mycompany.invernadero.PlantasTerrestres;
import com.mycompany.invernadero.Planta;

public class PlantasTerrestres extends Planta{
    
    public PlantasTerrestres(String name, String order, String family, String genus, int quantity){
        super(name, order, family, genus, quantity);
    }
    
    public PlantasTerrestres(String name, String order, String family, int quantity){
        super(name, order, family, quantity);
    }
    
    
    public PlantasTerrestres(String name, String order, int quantity){
        super(name, order, quantity);
    }
    
    public PlantasTerrestres(String name, int quantity){
        super(name, quantity);
    }

}
