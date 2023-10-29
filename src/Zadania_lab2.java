import java.awt.*;
import java.util.*;
import java.util.Scanner;
public class Zadania_lab2 {

    public static void wywolanie(){
        while(true) {
            System.out.println("Podaj numer zadania: ");
            System.out.println("[1] - zad 2");
            System.out.println("[2] - zad 7");
            System.out.println("[3] - zad 6");
            System.out.println("[4] - zad 5");
            System.out.println("[5] - koniec programu");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if(choice == 1) {
                //------zadanie2-----
                ArrayList<Obiekt_zad_2> items_0 = new ArrayList<>();
                LinkedList<Obiekt_zad_2> items_1 = new LinkedList<>();
                ArrayList<Long> czasy_ArrayList = new ArrayList<>();
                LinkedList<Long> czasy_LinkedList = new LinkedList<>();
                int ile_obiektow = 4;
                int ile_usunietych = 1;
                int ile_modyfikowanych = 1;

                Obiekt_zad_2 obiekt1 = new Obiekt_zad_2("Piotr", "Strycharczyk");
                Obiekt_zad_2 obiekt2 = new Obiekt_zad_2("Marek", "Nowak");
                Obiekt_zad_2 obiekt3 = new Obiekt_zad_2("Agata", "Pieprz");
                Obiekt_zad_2 obiekt4 = new Obiekt_zad_2("Maks", "Owczarek");

                czasy_ArrayList.add(Obiekt_zad_2.pomiar_czasu_array(items_0, obiekt1));
                czasy_ArrayList.add(Obiekt_zad_2.pomiar_czasu_array(items_0, obiekt2));
                czasy_ArrayList.add(Obiekt_zad_2.pomiar_czasu_array(items_0, obiekt3));
                czasy_ArrayList.add(Obiekt_zad_2.pomiar_czasu_array(items_0, obiekt4));

                czasy_LinkedList.add(Obiekt_zad_2.pomiar_czasu_linked(items_1, obiekt1));
                czasy_LinkedList.add(Obiekt_zad_2.pomiar_czasu_linked(items_1, obiekt2));
                czasy_LinkedList.add(Obiekt_zad_2.pomiar_czasu_linked(items_1, obiekt3));
                czasy_LinkedList.add(Obiekt_zad_2.pomiar_czasu_linked(items_1, obiekt4));

                czasy_ArrayList.add(Obiekt_zad_2.pub_zmiana_pomiar_czasu_array(items_0));//modyfikacja obiektu
                czasy_LinkedList.add(Obiekt_zad_2.pub_zmiana_pomiar_czasu_linked(items_1));//modyfikacja obiektu

                czasy_ArrayList.add(Obiekt_zad_2.pub_pomiar_usuwania_array(items_0, 3));
                czasy_LinkedList.add(Obiekt_zad_2.pub_pomiar_usuwania_linked(items_1, 3));

                System.out.println("Porownanie dodawania elementow: ");
                for (int i = 0; i < ile_obiektow; i++) {
                    if (czasy_ArrayList.get(i) > czasy_LinkedList.get(i))
                        System.out.println("Czas dodania dla " + i + " obiektu do arrayliscie jest wiekszy");
                    else if (czasy_ArrayList.get(i).equals(czasy_LinkedList.get(i)))
                        System.out.println("Czasy dodawania dla " + i + " elementu jest rowny");
                    else System.out.println("Czas dodania dla " + i + " obiektu do linked listy jest wiekszy");
                }
                System.out.println("Porownanie edytowania elementow: ");
                for (int i = ile_obiektow; i < 5; i++) {
                    if (czasy_ArrayList.get(i) > czasy_LinkedList.get(i))
                        System.out.println("Czas modyfikacji dla " + i + " obiektu do arrayliscie jest wiekszy");
                    else if (czasy_ArrayList.get(i).equals(czasy_LinkedList.get(i)))
                        System.out.println("Czasy modyfikacji dla " + i + " elementu jest rowny");
                    else System.out.println("Czas modyfikacji dla " + i + " obiektu do linked listy jest wiekszy");
                }
                System.out.println("Porownanie usuwania elementow: ");
                for (int i = ile_obiektow + 1; i < czasy_ArrayList.size(); i++) {
                    if (czasy_ArrayList.get(i) > czasy_LinkedList.get(i))
                        System.out.println("Czas usuniecia dla " + i + " obiektu w arrayliscie jest wiekszy");
                    else if (czasy_ArrayList.get(i).equals(czasy_LinkedList.get(i)))
                        System.out.println("Czasy usuniecia dla " + i + " elementu jest rowny");
                    else System.out.println("Czas usuniecia dla " + i + " obiektu w linked liscie jest wiekszy");
                }
                System.out.println("array lista czasy: " + czasy_ArrayList);
                System.out.println("linked lista czasy: " + czasy_LinkedList);
            }
            else if(choice == 2) {

                //-----zadanie7-----
                ArrayList<Obiekt_zad_7> listaobiektow = new ArrayList<>();
                int ilosc_ksiazek = 5;
                Obiekt_zad_7 ksiazka1 = new Obiekt_zad_7("Wielki Marsz", "Stephen King", 1234);
                Obiekt_zad_7 ksiazka2 = new Obiekt_zad_7("Lalka", "Boleslaw Prus", 1211);
                Obiekt_zad_7 ksiazka3 = new Obiekt_zad_7("Dziady", "Adam Mickiewicz", 1864);
                Obiekt_zad_7 ksiazka4 = new Obiekt_zad_7("Wielki Marsz", "Stephen King", 1234);
                Obiekt_zad_7 ksiazka5 = new Obiekt_zad_7("Wielki Marsz", "Stephen", 1234);
                listaobiektow.add(ksiazka1);
                listaobiektow.add(ksiazka2);
                listaobiektow.add(ksiazka3);
                listaobiektow.add(ksiazka4);
                listaobiektow.add(ksiazka5);
                System.out.println();
                System.out.println("Metoda euqals()---Metoda hashcode()");
                for (int i = 0; i < ilosc_ksiazek; i++) {
                    for (int j = 0; j < ilosc_ksiazek; j++) {
                        System.out.println("Ksia: " + (i + 1) + " z ksia: " + (j + 1) + " " + listaobiektow.get(i).equals(listaobiektow.get(j)) + " " + (listaobiektow.get(i).hashCode() == listaobiektow.get(j).hashCode()));
                    }

                }//hashCode jest rozny, to equals zawsze zwróci false
                //Kontrakt mówi o tym, że jeżeli wartość hashCode dla 2 obiektów jest taka sama, to equals może zwrócić true lub false)
                HashSet<Obiekt_zad_7> ksiazki = new HashSet<Obiekt_zad_7>();
                ksiazki.addAll(listaobiektow);
                System.out.println("Zawartosc Hashseta po dodaniu " + ksiazki);
            } else if (choice == 3) {
                //-----zadanie6------
                TreeMap<String, Integer> cityPopulationMap = new TreeMap<>();
                cityPopulationMap.put("Warszawa", 1700000);
                cityPopulationMap.put("Kraków", 760000);
                cityPopulationMap.put("Wrocław", 640000);
                cityPopulationMap.put("Poznań", 540000);
                cityPopulationMap.put("Gdańsk", 470000);

                KomparatorMiast populationComparator = new KomparatorMiast(cityPopulationMap);

                TreeMap<String, Integer> sortedCityPopulationMap = new TreeMap<>(populationComparator);
                sortedCityPopulationMap.putAll(cityPopulationMap);

                for (Map.Entry<String, Integer> entry : sortedCityPopulationMap.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }
            else if(choice == 4){
                ArrayList<Osoba_zad_5> lista_zad_5 = new ArrayList<>();

                Osoba_zad_5 osoba1 = new Osoba_zad_5("Piotr", 11);
                Osoba_zad_5 osoba2 = new Osoba_zad_5("Marek", 24);
                Osoba_zad_5 osoba3 = new Osoba_zad_5("Adam", 91);
                Osoba_zad_5 osoba4 = new Osoba_zad_5("Jan", 90);
                lista_zad_5.add(osoba1);
                lista_zad_5.add(osoba2);
                lista_zad_5.add(osoba3);
                lista_zad_5.add(osoba4);
                Comparator<Osoba_zad_5> wiekComparator = new KomparatorOsob_zad5();
                Collections.sort(lista_zad_5, wiekComparator);

                for(int i =0;i<lista_zad_5.size();i++){
                    System.out.println("imie: "+lista_zad_5.get(i).getImie()+" wiek: "+lista_zad_5.get(i).getWiek());
                }

            }
            else
                break;
        }
    }
}

