package com.mycompany.invernadero;

import com.mycompany.invernadero.PlantasTerrestres.Spermatophyta.Angiospermas;
import com.mycompany.invernadero.PlantasTerrestres.Spermatophyta.Gimnospermas;
import java.util.ArrayList;

public class Main {

    //Creamos un arreglo de Plantas
    public static ArrayList<Planta> Plantas = new ArrayList<>();
    
    public static void main(String[] args){


        //Agremamos dos Rosa y le agregamos los atributos luego:
        Angiospermas Rosa = new Angiospermas("Rosa", 2);
        
        Rosa.setFamily("Rosaceae");
        Rosa.setGenus("Blanda");
        Rosa.setOrder("Rosales");
        
        Plantas.add(Rosa);
        
        //Agremamos un Cipres directo del constructor:
        Gimnospermas Cipres = new Gimnospermas("Cipres", "Pinales", "Cipreses","Cedro", 1);
        
        Plantas.add(Cipres);
        
        mostrarPlantas();
        
    }
    
    public static void mostrarPlantas(){
        System.out.println("Tienes todas estas plantas en el hibernadero:");
        System.out.println("-----------------------------");
        for(int i = 0; i < Plantas.size(); i++){
            System.out.println(Plantas.get(i).getAtributtes());
            System.out.println("-----------------------------");
        }
    }
        
}
