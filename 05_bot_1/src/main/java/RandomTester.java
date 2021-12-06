import java.util.ArrayList;
import java.util.Random;

public class RandomTester {
    Random random;
    public RandomTester() {
        random = new Random();
    }

    public void printOneRandom() {
        System.out.println(random.nextInt());
    }

    public void printMultiRandom(int howMany) {
        for (int i = 0; i < howMany; i++) {
            System.out.println(random.nextInt());
        }
    }

    public void throwDice() {
        System.out.println(random.nextInt(6) + 1);
    }

    public String getResponse() {
        ArrayList<String> responses = new ArrayList<>();
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");

        return responses.get(random.nextInt(responses.size()));
    }
}
