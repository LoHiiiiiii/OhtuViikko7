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
public class KPSTekoaly extends KPS {
    
    Tekoaly tekoaly;
    
    protected KPSTekoaly(Tekoaly tekoaly){
        this.tekoaly = tekoaly;
    }
    
    @Override
    public void pelaa(){
        String ekanSiirto;
        String tokanSiirto;
        
        do{
            ekanSiirto = pelaajanYksiSiirto();
            tokanSiirto = pelaajanKaksiSiirto();
            tekoaly.asetaSiirto(ekanSiirto);
            if (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)){
                kirjaaSiirrot(ekanSiirto, tokanSiirto);
            } else
                break;
        }while (true);
        lopetaPeli();
    }
    
    @Override
    protected String pelaajanKaksiSiirto() {
        String liike = tekoaly.annaSiirto();
        System.out.print("Toisen pelaajan siirto: " + liike);
        return liike;
    }
}
