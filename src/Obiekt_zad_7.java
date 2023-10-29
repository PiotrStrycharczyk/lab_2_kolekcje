import java.util.Objects;
public class Obiekt_zad_7 {
    public Obiekt_zad_7(String tytul, String autor, int numerISBN) {
        this.Tytul = tytul;
        this.Autor = autor;
        this.numerISBN = numerISBN;
    }

    private String Tytul;
    private String Autor;
    private int numerISBN;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obiekt_zad_7 that = (Obiekt_zad_7) o;
        return numerISBN == that.numerISBN;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerISBN);
    }
}
