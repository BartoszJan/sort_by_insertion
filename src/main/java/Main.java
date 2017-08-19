import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int [] numbers = new int[]{2, 4, 6, 1, 5, 3};
        ArrayList<Integer> sortNumbers = new ArrayList<Integer>();
        sortNumbers.add(numbers[0]);
        System.out.println("Elementy tablicy przed sortowaniem: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int j;
        for (int i = 1; i < numbers.length; i++) {
            j = 0;
            while (j < sortNumbers.size() && numbers[i] > sortNumbers.get(j)) {
                j++;
                }
                sortNumbers.add(j, numbers[i]);
            }

        System.out.println("Elementy tablicy po sortowaniu: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(sortNumbers.get(i));
        }
    }
}
