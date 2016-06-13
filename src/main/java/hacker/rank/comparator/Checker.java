package hacker.rank.comparator;

import java.util.Comparator;

/**
 * Created by Shehan on 6/7/16.
 */
class Checker implements Comparator<Player> {

    public int compare(Player a, Player b) {
        // If 2 Players have the same score
        if (a.score == b.score) {
            // Order alphabetically by name
            if (a.name.compareTo(b.name) < 0) {
                return -1;
            } else if (a.name.compareTo(b.name) > 0) {
                return 1;
            }
            return 0;
        }

        // Otherwise, order higher score first
        else if (a.score > b.score) {
            return -1;
        } else if (a.score < b.score) {
            return 1;
        }

        return 0;
    }
}