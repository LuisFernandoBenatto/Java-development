package forkjoin.roboparalelo;

public class Robo {
    public static long contar(int x, int y) {
        if (x == 0 || y == 0) {
            return 1;
        }
        return (contar(x - 1, y) + contar(x, y - 1));
    }
}
