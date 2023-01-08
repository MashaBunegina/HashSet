
import java.util.*;

public class Main {
    private static final int MAX = 9;
    private static final int MIN = 2;

    public static void main(String[] args) {
        Set<Example> examples = new HashSet<>();
        while (examples.size() < 15) {
            int number1 = (int) (Math.random() * ((MAX + 1))) + MIN;
            int number2 = (int) (Math.random() * ((MAX + 1))) + MIN;
            Example example = new Example(number1, number2);
            examples.add(example);
        }
        Iterator<Example> i = examples.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());

        }
        Pasport pasport1 = new Pasport(Collections.singleton("4789562BHY"), "Анна", "Иванова", null, "10.04.1992");
        Pasport pasport2 = new Pasport(Collections.singleton("5632488HY"), "Сергей", "Кротов", null, "12.03.1998");
        Pasport pasport3 = new Pasport(Collections.singleton("5112345HY"), "Иван", "Зеленцов", null, "29.02.1994");

        Set<Pasport> pasportSet = new HashSet<>();
        pasportSet.add(pasport1);
        pasportSet.add(pasport2);
        pasportSet.add(pasport3);
        System.out.println(pasportSet);
        System.out.println("find (passportSet,\"4789562BHY\") = " + find(pasportSet, "4789562BHY"));
    }

    public static Pasport find (Set<Pasport> pasportSet, String number) {
        for (Pasport pasport : pasportSet) {
            if (pasport.contains(number)) {
                return pasport;
            }
        }
        return null;
    }
}