/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab25_excersisecomplete;

import ec.edu.espe.utils.FileManager;

/**
 *
 * @author Edwin Caiza
 */
public class Product {
        private String id;
        private String name;
        private float precio;
        private float porcenta;
        private float pvp;
        
    public void calculateSalary(){
        this.pvp=this.precio*this.porcenta;
    }

    public Product(){
    }

    public Product(String id, String name, float precio, float porcenta, float pvp) {
        this.id = id;
        this.name = name;
        this.precio = precio;
        this.porcenta = porcenta;
        this.pvp = pvp;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPorcenta() {
        return porcenta;
    }

    public void setPorcenta(float porcenta) {
        this.porcenta = porcenta;
    }

    public float getPvp() {
        pvp=getPrecio()+(getPrecio()*(getPorcenta()/100));
        return pvp;
    }

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }
    
    

}

