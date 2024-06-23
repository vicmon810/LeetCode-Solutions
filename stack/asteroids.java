package stack;

import java.util.Stack;
#1212
public class asteroids {
    private static int[] collision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int val : asteroids) {
            if (st.isEmpty() || val > 0) {
                st.push(val);
            } else {
                while (true) {
                    int peek = st.peek();
                    if (peek < 0) {
                        st.push(val);
                        break;
                    } else if (peek == -val) {
                        st.pop();
                        break;
                    } else if (peek > -val) {
                        break;
                    } else {
                        st.pop();
                        if (st.isEmpty()) {
                            st.push(val);
                            break;
                        }
                    }
                }
            }
        }

        int i = st.size();
        int ans[] = new int[i];
        while (!st.isEmpty()) {
            if (i > 0)
                ans[i - 1] = st.pop();
            i--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] asteroids1 = { 5, 10, -5 };
        int[] asteroids2 = { 8, -8 };
        int[] asteroids3 = { 10, 2, -5 };
        System.out.println(collision(asteroids1));
        System.out.println(collision(asteroids2));
        System.out.println(collision(asteroids3));
    }
}
