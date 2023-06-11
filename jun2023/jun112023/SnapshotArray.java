package jun2023.jun112023;

public class SnapshotArray {

    private int[] array;
    private int[] snapshot;
    private int snapId;

    public SnapshotArray(int length) {
        array = new int[length];
        snapshot = new int[length];
        snapId = 0;
    }

    public void set(int index, int val) {
        array[index] = val;
    }

    public int snap() {
        for (int i = 0; i < array.length; i++)
            snapshot[i] = array[i];
        return snapId++;
    }

    public int get(int index, int snap_id) {
        return snapshot[index];
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */