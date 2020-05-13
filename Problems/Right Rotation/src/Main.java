import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int amount;

        while (sc.hasNext()) {
            array.add(sc.nextInt());
        }
        amount = array.get(array.size() - 1);
        array.remove(array.size() - 1);

        for (int i = 0; i < amount; i++) {
            Collections.swap(array, 0, array.size() - 1);
            for (int k = array.size() - 1; k > 1; k++) {
                Collections.swap(array, k, k - 1);
            }
        }

        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}