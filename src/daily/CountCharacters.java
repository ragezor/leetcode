package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/104919011
public class CountCharacters {
    public int countCharacters(String[] words, String chars) {
        int[] c = new int[26];
        int len = 0;
        for (char cc : chars.toCharArray()
        ) {
            c[cc - 'a']++;
        }
        a:
        for (String str : words
        ) {
            int[] w = new int[26];
            for (char cs : str.toCharArray()
            ) {
                w[cs - 'a']++;

            }
            for (int i = 0; i < 26; i++) {
                if (w[i] > c[i]) {
                    continue a;
                }
            }
            len += str.length();


        }

        return len;
    }

    public static void main(String[] args) {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        CountCharacters countCharacters = new CountCharacters();
        System.out.println(countCharacters.countCharacters(words, chars));
    }
}