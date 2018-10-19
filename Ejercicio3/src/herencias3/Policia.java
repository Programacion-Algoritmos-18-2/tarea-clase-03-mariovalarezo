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
public class Policia extends Persona {
    private String cargo; 
     public Policia(String n, String a, int e, String car){
        super(n, a, e);
        setCargo(car);
    }
    
    public void setCargo(String car){
        cargo = car;
    }
    
    public String getCargo(){
        return cargo;
    }
    
    @Override
    public String toString(){
    
        return String.format("%s - %s", super.toString(), getCargo());
    }
    
    
    
    
    
    
}
