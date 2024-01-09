import java.util.Arrays;

public class CloseWord {
    public static int co(char arr[], int key) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                c++;
                arr[i] = '-';
            }
        }
        return c;
    }

    public static int[] count(char arr[]) {
        int n = arr.length;
        int[] arrN = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] == '-') {
                continue;
            }
            arrN[i] = co(arr, arr[i]);
        }

        Arrays.sort(arrN);

        return arrN;
    }

    public static boolean closeStrings(String w1, String w2) {
        char[] c1 = w1.toCharArray();
        char[] c2 = w2.toCharArray();
        if (w1.length() != w2.length())
            return false;
        for (int i = 0; i < c1.length && i < c2.length; i++) {
            if (w1.indexOf(c2[i]) == -1) {
                return false;
            }
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (Arrays.equals(c1, c2)) {
            return true;
        }

        int arr1[] = count(c1);
        int arr2[] = count(c2);
        System.out.println(arr1);
        System.out.println(arr2);
        if (Arrays.equals(arr1, arr2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(closeStrings("abc", "bca"));
        closeStrings("a", "null");
        closeStrings("cabbba", "abbccc");
    }
}