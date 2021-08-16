import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAndLists {
    public static void main(String[] args) {
        Integer[] arrayOfNumbers = {2, 4, 6, 8, 10};
        System.out.println(arrayOfNumbers[1]);
        System.out.println(arrayOfNumbers[arrayOfNumbers.length-1]);

        System.out.println("\n");

        arrayOfNumbers[2] = 7;
        for (int num : arrayOfNumbers) {
            System.out.println(num);
        }

        System.out.println("\n");

        Integer[] squaredNumbers = {4, 9, 16, 25, 36};
        List<Integer> listOfNumbers = Arrays.asList(squaredNumbers);
        listOfNumbers.set(0, 100);
        listOfNumbers.set(4, 200);
        System.out.println(listOfNumbers);
        for (int num : listOfNumbers) {
            System.out.println(num);
        }

        System.out.println("\n");

        String[] arrayOfMeals = {"pizza", "noodles", "burger", "chips", "cake"}; // an array
        List<String> listOfMeals = Arrays.asList(arrayOfMeals); // turning the array to a list
        ArrayList<String> arrayListOfMeals = new ArrayList<>(listOfMeals); // turning the list to an arrayList
        System.out.println(arrayListOfMeals);

        System.out.println("\n");

        arrayListOfMeals.set(4, "salad");
        arrayListOfMeals.add("rice");
        arrayListOfMeals.add("sandwiches");
        System.out.println(arrayListOfMeals);

        System.out.println("\n");

        int counter = 1;
        for (String meal : arrayListOfMeals) {
            System.out.println(counter++ + ") " + meal);
        }

        System.out.println("\n");

        System.out.println(arrayListOfMeals.clone());
        System.out.println(arrayListOfMeals.size());
        System.out.println(arrayListOfMeals.get(3));
        System.out.println(arrayListOfMeals.isEmpty());
        System.out.println(arrayListOfMeals.remove(6));
        System.out.println(arrayListOfMeals.contains("salad"));
        System.out.println(arrayListOfMeals.contains("eggs"));
    }
}
