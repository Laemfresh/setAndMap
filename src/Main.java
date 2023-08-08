import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        HashSet<Integer> hashSet = new HashSet<>();
        int sum = 0;
        int hashSum = 0;

        for (int i = 0; i < 400; i++) {
            int randomNum = random.nextInt(1, 100);
            arrayList.add(randomNum);
            hashSet.add(randomNum);
            sum += randomNum;
            hashSum += randomNum;

        }
        System.out.println("Jonokoy " + sum);
        System.out.println(arrayList);
        System.out.println("hashSet " + hashSum);
        System.out.println(hashSet);
        System.out.println(hashSet.size());

    }
}