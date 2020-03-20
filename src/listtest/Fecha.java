/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listtest;

/**
 *
 * @author Josue
 */
public class Fecha {
    int dia;
    int mes;
    int anio;

    public Fecha() {
    }

    
    
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    @Override
    public String toString(){
        String ret;
        
        ret=(dia<10)?"0"+dia+"/":""+dia+"/";
        ret=(mes<10)?"0"+mes+"/":""+mes+"/";
        ret+=""+anio;            
        return ret;         
    }
}
