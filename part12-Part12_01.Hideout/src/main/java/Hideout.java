/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toddd
 */
public class Hideout<T> {
    
    private T t;
    
    public void putIntoHideout(T t) {
        this.t = t;
    }
    
    public T takeFromHideout() {
        T returnValue = this.t;
        this.t = null;
        return returnValue;
    }
    
    public boolean isInHideout() {
        if(this.t == null) {
            return false;
        }
        return true;
    }
}
