/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progguasti;

import java.util.Vector;

/**
 *
 * @author gabriel.ricaldone
 */
public class Coda {

    private Vector elementi;

    Coda() {
        elementi = new Vector();
    }

    public void push(Object obj) {
        elementi.addElement(obj);
    }
    
    public Object pop() {
        Object temp = null;
        if (elementi.isEmpty()) {
            return temp;
        }
        temp = elementi.elementAt(0);
        elementi.removeElementAt(0);
        return temp;
        
    }

    public boolean isEmpty() {
        return elementi.isEmpty();
    }

    public int size() {
        return elementi.size();
    }

    @Override
    public String toString() {
        String temp = "Nulla";
        
        if(elementi.isEmpty()) {    
            return temp;
        }
        temp = "";
        for(int i = 0; i < elementi.size(); i++) {
            temp += elementi.elementAt(i).toString() + "\n";
        }
        return temp;
    }
    
    
}
