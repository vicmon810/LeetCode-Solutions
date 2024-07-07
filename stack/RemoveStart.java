package stack;
//comment
public class RemoveStart {
    public static StringBuilder stripper(String row) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < row.length(); i++) {
            if (row.charAt(i) != '*') {
                ans.append(row.charAt(i));
            } else {
                ans.deleteCharAt(ans.length() - 1);
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(stripper("leet**cod*e"));
    }
}
