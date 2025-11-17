class Pair<K, V> {
    K key;
    V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    void show() {
        System.out.println(key + " : " + value);
    }
}

public class PairDemo {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Age", 25);
        Pair<String, String> p2 = new Pair<>("Country", "Japan");

        p1.show();
        p2.show();
    }
}
