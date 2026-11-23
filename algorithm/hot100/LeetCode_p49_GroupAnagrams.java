import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode_p49_GroupAnagrams {

    // 方法一：排序分组
    public List<List<String>> groupAnagramsBySorting(String[] strs) {
        // key 是排序后的字符串，value 是这一组的原字符串列表
        Map<String, List<String>> groups = new HashMap<>();

        for (String word : strs) {
            // 转成字符数组再排序，原字符串 word 不会改变
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // 第一次遇到这个 key 时，先给它创建一个列表
            if (!groups.containsKey(key)) {
                groups.put(key, new ArrayList<>());
            }

            // 加入原字符串。比如 "tea" 应当存成 "tea"，而不是 "aet"
            groups.get(key).add(word);
        }

        // 取出所有分组，组成外层列表
        return new ArrayList<>(groups.values());
    }

    // 方法二：计数分组法
    public List<List<String>> groupAnagrams(String[] strs) {
        // key 是按 a 到 z 编码的字母次数，value 是这一组的原字符串列表
        Map<String, List<String>> groups = new HashMap<>();

        for (String word : strs) {
            // 每个单词都从 0 开始计数，避免沿用上一个单词的数据
            int[] counts = new int[26];
            for (int i = 0; i < word.length(); i++) {
                // 'a' 对应下标 0，'z' 对应下标 25
                int index = word.charAt(i) - 'a';
                counts[index]++;
            }

            // 固定按 a 到 z 的顺序拼接，保留出现次数为 0 的位置
            // 用 # 隔开数字，区分 [1, 11] 和 [11, 1]
            StringBuilder keyBuilder = new StringBuilder();
            for (int count : counts) {
                keyBuilder.append('#').append(count);
            }
            String key = keyBuilder.toString();

            // 没有这个分组就创建，有的话直接取出已有列表
            List<String> group = groups.computeIfAbsent(key, ignored -> new ArrayList<>());
            group.add(word);
        }

        return new ArrayList<>(groups.values());
    }
}