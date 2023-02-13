/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progguasti;

import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author gabriel.ricaldone
 */
public class ProgGuasti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean running = true;
        int risposta;
        String rispostaString;
        Scanner input = new Scanner(System.in);
        Coda codaGuasti = new Coda();
        
        while(running) {
            System.out.println("Cosa vorrebbe fare?");
            System.out.println("1-Aggiungere un guasto");
            System.out.println("2-Risolvere un guasto");
            System.out.println("3-Visualizzare i guasti");
            System.out.println("4-Esciti");
            risposta = input.nextInt();
            input.nextLine();
            
            switch(risposta) {
                case 1:
                    System.out.println("Che guasto ha?");
                    rispostaString = input.nextLine();
                    codaGuasti.push(new Guasto(rispostaString));
                    break;
                case 2:
                    System.out.println("Hai risolto il seguento guasto: " + codaGuasti.pop() + "\n");
                    break;
                case 3:
                    System.out.println(codaGuasti.toString());
                    break;
                case 4:
                    running = false;
                    System.out.println("Arrivederci");
                    break;
                default:
                    System.out.println("Errore, valore incorretto");
                    break;
            }
        }
    }
    
}
