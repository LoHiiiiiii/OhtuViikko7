package ohtu.kivipaperisakset;

public class KPSPelaajaVsPelaaja extends KPS{
    
    @Override
    public void pelaa(){
        String ekanSiirto;
        String tokanSiirto;
        
        do{
            ekanSiirto = pelaajanYksiSiirto();
            tokanSiirto = pelaajanKaksiSiirto();
            if (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)){
                kirjaaSiirrot(ekanSiirto, tokanSiirto);
            } else
                break;
        }while (true);
        lopetaPeli();
    }
    @Override
    protected String pelaajanKaksiSiirto() {
        System.out.print("Toisen pelaajan siirto: ");
        return scanner.nextLine();
    }
}