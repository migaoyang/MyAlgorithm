package LeetCode.M692_TopKFrequentWords;

import java.util.*;

class Solution {

    private static String xiaomi;

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            if (wordsMap.containsKey(word)) {
                Integer frequent = wordsMap.get(word);
                wordsMap.put(word, ++frequent);
            } else {
                wordsMap.put(word, 1);
            }
        }
        Set<String> mapKeys = wordsMap.keySet();
        for (String key : mapKeys) {
            System.out.println("key: " + key + " frequent: " + wordsMap.get(key));
        }

        return null;
    }

    private List<String> sort(Map wordsMap) {
        List<String> sortWord = new ArrayList<>();
        return null;

    }

    public static void main(String[] args) {
        String[] words = {"the", "day", "is", "sssunny", "the", "the", "the", "sunny", "is", "is"};
        Solution solution = new Solution();
        solution.topKFrequent(words, 1);
        testCtrlAlterM();
        xiaomi = "xiaomi";
        System.out.println(xiaomi);
        System.out.println(xiaomi);
        System.out.println(xiaomi);
        System.out.println(xiaomi);
    }

    private static void testCtrlAlterM() {
        for (int i = 11; i > 0; i--) {
        }
    }

}