package it.Epicode.week1.day5_Progetto;

public class Audio extends ElementoMultimediale implements Riproducibile {
    private int volume;
    public Audio(String titolo, int volume){
        super(titolo);
        this.volume = volume;
    }
    @Override
    public void play(){
        for (int i = 0; i < durata; i++){
            System.out.println(titolo + " !".repeat(volume));
        }
    }
    public void abbassaVolume(){
        if(volume > 0){
            volume--;
        }
    }
    public void alzaVolume(){
        volume++;
    }

}
