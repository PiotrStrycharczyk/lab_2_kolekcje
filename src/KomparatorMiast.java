import java.util.*;
class KomparatorMiast implements Comparator<String> {
    private Map<String, Integer> baseMap;

    public KomparatorMiast(TreeMap<String, Integer> baseMap) {
        this.baseMap = baseMap;
    }

    @Override
    public int compare(String city1, String city2) {
        int population1 = baseMap.get(city1);
        int population2 = baseMap.get(city2);
        return Integer.compare(population1, population2);
    }
}

