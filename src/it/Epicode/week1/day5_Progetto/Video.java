package it.Epicode.week1.day5_Progetto;

public class Video extends ElementoMultimediale implements Riproducibile {

    private int volume;
    private int luminosità;

    public Video(String titolo, int volume, int luminosità){
        super(titolo);
        this.volume = volume;
        this.luminosità = luminosità;
    }

    @Override
    public void play(){
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume) + "*".repeat(luminosità));
        }
    }
    public void aumentaLuminosità(){
        luminosità++;
    }
    public void diminuisciLuminosità(){
        luminosità--;
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
