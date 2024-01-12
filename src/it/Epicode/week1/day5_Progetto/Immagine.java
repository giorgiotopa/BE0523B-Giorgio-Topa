package it.Epicode.week1.day5_Progetto;

public class Immagine extends ElementoMultimediale{
    private int luminosità;
    public Immagine(String titolo, int luminosità){
        super(titolo);
        this.luminosità = luminosità;
    }
    public void show(){
        System.out.println(titolo + " " + "*".repeat(luminosità));
    }
    public void aumentaLuminosità(){
        luminosità++;
    }
    public void diminuisciLuminosità(){
        luminosità--;
    }
}
