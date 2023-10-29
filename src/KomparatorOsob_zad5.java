import java.util.ArrayList;
import java.util.Comparator;

class KomparatorOsob_zad5 implements Comparator<Osoba_zad_5> {
    @Override
    public int compare(Osoba_zad_5 osoba1, Osoba_zad_5 osoba2) {
        return Integer.compare(osoba1.getWiek(), osoba2.getWiek());
    }
}
