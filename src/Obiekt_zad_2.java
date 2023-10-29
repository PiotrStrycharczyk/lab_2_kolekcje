import java.util.ArrayList;
import java.util.LinkedList;

public class Obiekt_zad_2 {
    public Obiekt_zad_2(String imie, String nazwisko) {//konstruktor
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    private String imie;
    private String nazwisko;

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getImie() {
        return imie;
    }

    private static long priv_pomiar_czasu_array(ArrayList<Obiekt_zad_2> lista, Obiekt_zad_2 obiekt) {
        long startTime = System.nanoTime(); // Początkowy czas
        lista.add(obiekt);
        long endTime = System.nanoTime(); // Końcowy czas
        return endTime - startTime;
    }
    public static long pomiar_czasu_array(ArrayList<Obiekt_zad_2> lista, Obiekt_zad_2 obiekt) {
        return priv_pomiar_czasu_array(lista, obiekt);
    }
    private static long priv_pomiar_czasu_linked(LinkedList<Obiekt_zad_2> lista, Obiekt_zad_2 obiekt) {
        long startTime = System.nanoTime(); // Początkowy czas
        lista.add(obiekt);
        long endTime = System.nanoTime(); // Końcowy czas
        return endTime - startTime;
    }
    public static long pomiar_czasu_linked(LinkedList<Obiekt_zad_2> lista, Obiekt_zad_2 obiekt) {
    return priv_pomiar_czasu_linked(lista, obiekt);
    }
    private static long priv_zmiana_pomiar_czasu_array(ArrayList<Obiekt_zad_2> lista) {
        long startTime = System.nanoTime(); // Początkowy czas
        lista.get(0).setImie("Marcin");
        lista.get(0).setNazwisko("Grudzien");
        long endTime = System.nanoTime(); // Końcowy czas
        return endTime - startTime;
    }

    private static long priv_zmiana_pomiar_czasu_linked(LinkedList<Obiekt_zad_2> lista) {
        long startTime = System.nanoTime(); // Początkowy czas
        lista.get(0).setImie("Marcin");
        lista.get(0).setNazwisko("Grudzien");
        long endTime = System.nanoTime(); // Końcowy czas
        return endTime - startTime;
    }

    public static long pub_zmiana_pomiar_czasu_array(ArrayList<Obiekt_zad_2> lista) {
        return priv_zmiana_pomiar_czasu_array(lista);
    }
    public static long pub_zmiana_pomiar_czasu_linked(LinkedList<Obiekt_zad_2> lista) {
        return priv_zmiana_pomiar_czasu_linked(lista);
    }
    private static long pomiar_usuwania_array(ArrayList<Obiekt_zad_2> lista, int index){
        long startTime = System.nanoTime(); // Początkowy czas
        lista.remove(index);
        long endTime = System.nanoTime(); // Końcowy czas
        return endTime - startTime;
    }
    public static long pub_pomiar_usuwania_array(ArrayList<Obiekt_zad_2> lista, int index) {
        return pomiar_usuwania_array(lista, index);
    }
    private static long pomiar_usuwania_linked(LinkedList<Obiekt_zad_2> lista, int index){
        long startTime = System.nanoTime(); // Początkowy czas
        lista.remove(index);
        long endTime = System.nanoTime(); // Końcowy czas
        return endTime - startTime;
    }
    public static long pub_pomiar_usuwania_linked(LinkedList<Obiekt_zad_2> lista, int index) {
        return pomiar_usuwania_linked(lista, index);
    }

}
