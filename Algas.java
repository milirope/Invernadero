
package com.mycompany.invernadero.Algas;

import com.mycompany.invernadero.Planta;
import com.mycompany.invernadero.NoVascular;

public class Algas extends Planta implements NoVascular{
    
    public Algas(String name, String order, String family, String genus, int quantity){
        super(name, order, family, genus, quantity);
    }
    
    public Algas(String name, String order, String family, int quantity){
        super(name, order, family, quantity);
    }
    
    
    public Algas(String name, String order, int quantity){
        super(name, order, quantity);
    }
    
    public Algas(String name, int quantity){
        super(name, quantity);
    }

    public String mostrarProcesoNoVascular() {
        return this.procesoNoVascularInfo;
    }
    
}
