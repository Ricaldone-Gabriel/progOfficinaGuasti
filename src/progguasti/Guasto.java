/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progguasti;

/**
 *
 * @author gabriel.ricaldone
 */
public class Guasto {
    private String problema;

    Guasto(String problema) {
        this.problema = problema;
    }
    
    public void setProblema(String problema) {
        this.problema = problema;
    }
    
    public String getProblema() {
        return problema;
    }

    @Override
    public String toString() {
        return "Guasto{" + "problema=" + problema + '}';
    }

    
}
