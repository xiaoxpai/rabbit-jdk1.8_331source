import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author F1686352
 */
public class MainTest {
    public static void main(String[] args) {
        // 对list进行流操作
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("R");
        list.add("Go");
        list.add("Python");
        list.add("TypeScript");
        // 这里的s -> s.length() > 3是一个lambda表达式，它的意思是：对于每一个s，如果s的长度大于3，就返回true，否则返回false。
        list.stream().filter(s -> s.length() > 3).forEach(System.out::println);

    }
}
