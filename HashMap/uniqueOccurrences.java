import java.util.HashMap;

class uniqueOccurrences {
    public static boolean unique(int[] arr) {
        HashMap<Integer, Integer> nums = new HashMap<>();

        for (int i : arr) {
            if (nums.containsValue(i))
                continue;

            int count = 0;
            for (int c : arr) {
                if (i == c)
                    count++;
            }
            if (nums.containsKey(count))
                return false;
            else
                nums.put(count, i);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] test = { 1, 2, 2, 1, 1, 3 };
        System.out.println(unique(test));
    }
}