package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2 {
    public static String predictPartyVictory(String senate) {
        // each char have 2 func
        // ban next char and announce victory
        // what we will do is detect existing char and detect who will win

        Queue<Integer> q1 = new LinkedList<>(),
                q2 = new LinkedList<>();

        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) != 'D')
                q1.add(i);
            else
                q2.add(i);
        }

        while (q1.size() != 0 && q2.size() != 0) {
            int r_index = q1.poll();
            int d_index = q2.poll();
            if (r_index < d_index)
                q1.add(r_index + senate.length());
            else
                q2.add(d_index + senate.length());
        }

        return (q1.size() > q2.size()) ? "Radiant" : "Dire";
    }

    public static void main(String[] args) {
        System.out.println(predictPartyVictory("DR")); // Dire
        System.out.println(predictPartyVictory("RD"));// Radiant
        System.out.println(predictPartyVictory("RRRD"));// Radiant
        System.out.println(predictPartyVictory("RRD"));// Dire
        System.out.println(predictPartyVictory("RRDDDDRRRRRRRRRR"));
    }
}
