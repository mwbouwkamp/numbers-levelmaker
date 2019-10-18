package nl.limakajo.numberslevelmaker;

import nl.limakajo.numberslib.numbersGame.Level;
import nl.limakajo.numberslib.utils.GameConstants;

import static nl.limakajo.numberslib.utils.GameConstants.NUMTILES;


class LevelGenerator {

    private final static int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 25, 50, 75, 100};

    /**
     * Generates a random level
     *
     * @return      random level
     */
    static Level generateLevel() {
        int[] hand = new int[NUMTILES];
        for (int i = 0; i < NUMTILES; i++) {
            hand[i] = NUMBERS[(int) (14 * Math.random())];
        }
        int goal = 100 + (int) (900 * Math.random());
        return new Level.LevelBuilder(hand, goal).build();
    }

}
