import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountStringLengthFromArray {
    public static void main(String[] args) {
       String words[] = {"vikram","rahul","brijendra","abhishek"};
       List<String> list = Arrays.asList(words);
        Map<String, Integer> map = list.stream().collect(Collectors.toMap(word -> word, word -> word.length()));
        System.out.println(map);

    }
}
