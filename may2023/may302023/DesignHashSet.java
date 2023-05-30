package may2023.may302023;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DesignHashSet {
    private int size;
    private List<List<Integer>> buckets;

    public DesignHashSet() {
        size = 1000;
        buckets = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            buckets.add(new LinkedList<>());
        }
    }

    public void add(int key) {
        int index = hash(key);
        List<Integer> bucket = buckets.get(index);
        if (!bucket.contains(key)) {
            bucket.add(key);
        }
    }

    public void remove(int key) {
        int index = hash(key);
        List<Integer> bucket = buckets.get(index);
        bucket.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        int index = hash(key);
        List<Integer> bucket = buckets.get(index);
        return bucket.contains(key);
    }

    private int hash(int key) {
        return key % size;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */