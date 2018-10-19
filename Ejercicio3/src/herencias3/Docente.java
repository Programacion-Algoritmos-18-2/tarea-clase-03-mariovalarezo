/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

/**
 *
 * @author Mario
 */
public class Docente extends Persona {
    private double sueldo; 
    
     public Docente(String n, String a, int e, double suel){
        super(n, a, e);
        setSueldo(suel);
    }
    
    public void setSueldo(double suel){
        sueldo = suel;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    @Override
    public String toString(){
    
        return String.format("%s - %f", super.toString(), getSueldo());
    }
    
    
    
    
    
    
}