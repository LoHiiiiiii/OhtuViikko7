/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;

import java.util.Scanner;

/**
 *
 * @author Vertti
 */
public abstract class KPS {
    
    protected Scanner scanner = new Scanner(System.in);
    protected Tuomari tuomari = new Tuomari();
    
    public abstract void pelaa();
    
    public static KPS pelaajaaVastaan(){
        return new KPSPelaajaVsPelaaja();
    }
    
    public static KPS helppoaTekoalyaVastaan(){
       Tekoaly t = new TekoalyHelppo();
       return new KPSTekoaly(t);
    }
    
    public static KPS vaikeaaTekoalyaVastaan(){
       Tekoaly t = new TekoalyVaikea(20);
       return new KPSTekoaly(t);
    }
    
    protected void kirjaaSiirrot(String ekanSiirto, String tokanSiirto){
        tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
        System.out.println(tuomari);
        System.out.println();
    }
    
    protected String pelaajanYksiSiirto(){
        System.out.print("Ensimmäisen pelaajan siirto: ");
        return scanner.nextLine();
    }
    
    protected abstract String pelaajanKaksiSiirto();
    
    protected void lopetaPeli(){
        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }
    
    protected static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
    
}
