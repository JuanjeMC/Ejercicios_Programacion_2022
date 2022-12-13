/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.cajaFuerteMAin;

/**
 *
 * @author juanjemc
 */
public class CajaFuerte {

//Atributos  //prigate + tipo + (loquesea)
    private String pin;

//Métodos //contructor, lista
    public CajaFuerte() {
        this.pin = "0000";
        //ChangePassword Me dan la antigua, la comparo y si va bien la cambio 
        //por la nueva.
    }
        //static es solo para el main.
        //public tipodevueltoenelreturn nombreMetodo(tipoParametro1 par1, tipoParametro2, par2, tipoPara
    public boolean changePassword(String oldKey, String newKey){
        if (oldKey.equals(pin) && pin.length() == 4) {
            pin = newKey;
            return true;
        } else {
            return false;
        }
    }
    

    public boolean open(String clave) {
        if (clave.equals(pin)) {
            return true;
        }
        return false;
    }
}
