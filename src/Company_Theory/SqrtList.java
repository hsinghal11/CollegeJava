package Company_Theory;
import java.util.*;

class SqrtList {
    private List<List<Integer>> blocks;
    private int blockSize;

    public SqrtList() {
        blocks = new ArrayList<>();
        blockSize = 1;
    }

    private void rebuild() {
        List<Integer> all = new ArrayList<>();
        for (List<Integer> block : blocks) all.addAll(block);

        int n = all.size();
        blockSize = (int) Math.sqrt(n) + 1;
        blocks.clear();

        for (int i = 0; i < n; i += blockSize) {
            int end = Math.min(i + blockSize, n);
            blocks.add(new ArrayList<>(all.subList(i, end)));
        }
    }

    public void insert(int index, int value) {
        int count = 0;
        for (List<Integer> block : blocks) {
            if (count + block.size() >= index) {
                block.add(index - count, value);
                if (block.size() > 2 * blockSize) rebuild();
                return;
            }
            count += block.size();
        }
        // if inserting at end or list empty
        if (blocks.isEmpty()) {
            blocks.add(new ArrayList<>(List.of(value)));
        } else {
            blocks.get(blocks.size() - 1).add(value);
        }
        rebuild();
    }

    public void delete(int index) {
        int count = 0;
        for (List<Integer> block : blocks) {
            if (count + block.size() > index) {
                block.remove(index - count);
                if (block.isEmpty() || block.size() < blockSize / 2) rebuild();
                return;
            }
            count += block.size();
        }
    }

    public int get(int index) {
        int count = 0;
        for (List<Integer> block : blocks) {
            if (count + block.size() > index)
                return block.get(index - count);
            count += block.size();
        }
        throw new IndexOutOfBoundsException("Index out of range");
    }

    public void print() {
        List<Integer> all = new ArrayList<>();
        for (List<Integer> block : blocks) all.addAll(block);
        System.out.println(all);
    }

    public static void main(String[] args) {
        SqrtList list = new SqrtList();

        for (int i = 0; i < 9; i++) list.insert(i, i + 1);
        System.out.println("Initial:");
        list.print();

        list.insert(5, 100);
        System.out.println("\nAfter insert(5, 100):");
        list.print();

        list.delete(3);
        System.out.println("\nAfter delete(3):");
        list.print();

        System.out.println("\nElement at index 5: " + list.get(5));
    }
}

