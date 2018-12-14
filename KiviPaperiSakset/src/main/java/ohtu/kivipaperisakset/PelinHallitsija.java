/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;

/**
 *
 * @author Vertti
 */
public  class PelinHallitsija {
    
    private KPS peli;
    
    public  void pelaa(){
       peli.pelaa();
    }
    
    public boolean voiPelata(){
        return peli != null;
    }
    
    public void asetaPeli(String vastaus){
        switch(vastaus){
            case "a": peli = KPS.pelaajaaVastaan(); break;
            case "b": peli =  KPS.helppoaTekoalyaVastaan(); break;
            case "c": peli = KPS.vaikeaaTekoalyaVastaan();  break;
            default: peli = null;
        }
    }
}
