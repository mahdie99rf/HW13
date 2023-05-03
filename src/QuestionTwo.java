import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class QuestionTwo {
    public static void main(String[] args) {
        String[] names = {"Amir","Hatef","Mehran","Mojtaba",
                            "Mohammad","Ali","Davood","Reza","Mohsen"};
        Map<Integer, List<String>> lengthOfName = Arrays.stream(names)
                .collect(Collectors.groupingBy(name ->name.length()));
        lengthOfName.forEach((length, nameList) -> {
            System.out.println(String.valueOf(length));
            nameList.forEach(word -> System.out.println( word));
        });
    }
}
