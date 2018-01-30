import java.util.LinkedHashMap;

/**
 * https://codefights.com/interview-practice/task/uX5iLwhc6L5ckSyNC/description
 */
public class R1D1_CodeFights_firstNotRepeatingCharacter {

    public char firstNotRepeatingCharacter(String s) {
        LinkedHashMap<String, Integer> charMap = new LinkedHashMap<>();

        String[] split = s.split("");
        for (int i = 0; i < split.length; i++) {
            String c = split[i];

            if (charMap.get(c) == null) {
                charMap.put(c, 1);
            } else {
                charMap.put(c, charMap.get(c) + 1);
            }
        }

        for (String c : charMap.keySet()) {
            if (charMap.get(c) == 1) {
                return c.charAt(0);
            }
        }

        return '_';
    }

}
