
package com.mycompany.invernadero;

public class Planta{

    String name;
    String order;
    String family;
    String genus;
    int quantity;
    
    public Planta(String name, String order, String family, String genus, int quantity){
        this.name = name;
        this.order = order;
        this.family = family;
        this.genus = genus;
        this.quantity = quantity;
    }
    
    public Planta(String name, String order, String family, int quantity){
        this.name = name;
        this.order = order;
        this.family = family;
        this.quantity = quantity;
    }
    
    
    public Planta(String name, String order, int quantity){
        this.name = name;
        this.order = order;
        this.quantity = quantity;
    }
    
    public Planta(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }
        
    public String getAtributtes(){
        return  "Nombre:" + this.name + "\n" +
                "Familia:" + this.family + "\n" +
                "Genero:" + this.genus + "\n" +
                "Orden:" + this.order + "\n" +
                "Cantidad:" + this.quantity;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
