import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] used = new int[15];
        int count = 0;
        Random random = new Random();
        while (count < 15) {
            int i = random.nextInt(8) + 2;
            int j = random.nextInt(8) + 2;
            if (!isUsed(i, j, used, count)) {
                System.out.println(i + " * " + j + " =");
                used[count] = i*10 + j;
                count++;
            }
        }
    }
    private static boolean isUsed(int i, int j, int[] used, int count) {
        int index = i*10 + j;
        int index1 = j*10 + i;
        for (int k = 0; k < count; k++) {
            if (used[k] == index || used[k] == index1) {
                return true;
            }
        }
        return false;
    }
}