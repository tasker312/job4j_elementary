package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        if (!(isOnBoard(x1) && isOnBoard(x2) && isOnBoard(y1) && isOnBoard(y2))) {
            return 0;
        }
        return Math.abs(x1 - x2) == Math.abs(y1 - y2) ? Math.abs(x1 - x2) : 0;
    }

    private static boolean isOnBoard(int coord) {
        return coord >= 0 && coord <= 7;
    }
}
