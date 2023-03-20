import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Map<Character, Integer> textList = new HashMap<>();
        String originText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String text = originText.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (Character.isLetter(letter)) {
                Integer count = textList.get(letter);
                if (count == null) {
                    textList.put(letter, 1);
                } else {
                    int x = textList.get(letter) + 1;
                    textList.put(letter, x);
                }
            }
        }
        int max = getMax(textList);
        int min = getMin(textList);

        for (Map.Entry<Character, Integer> list : textList.entrySet()) {
            if (list.getValue() == max) {
                System.out.println(list.getValue() + " : " + list.getKey());
            }
            if (list.getValue() == min) {
                System.out.println(list.getValue() + " : " + list.getKey());
            }
        }

    }
    public static Integer getMax (Map < Character, Integer > textList){
        int x = Integer.MIN_VALUE;
        for (Map.Entry<Character, Integer> min : textList.entrySet()) {
            if (min.getValue() > x) {
                x = min.getValue();
            }
        }
        return x;
    }

    public static Integer getMin (Map < Character, Integer > textList){
        int x = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> max : textList.entrySet()) {
            if (x > max.getValue()) {
                x = max.getValue();
            }
        }
        return x;
    }
}