import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0) {
            Game game = new Game();
            game.init(scanner);
            game.solve();
        }
    }


    static class Game {
        static final int ROW = 5;
        static final int COL = 9;
        static final int[] DY = {-1, 0, 1, 0};
        static final int[] DX = {0, 1, 0, -1};
        char mArr[][];
        int mTotal;

        void init(Scanner scanner) {
            scanner.nextLine();
            mArr = new char[ROW][];
            for (int i = 0; i < ROW; ++i) {
                mArr[i] = scanner.nextLine().toCharArray();
                for (int j = 0; j < COL; ++j) {
                    if (mArr[i][j] == 'o') {
                        mTotal++;
                    }
                }
            }
        }

        void solve() {
            int result = go();
            System.out.println((mTotal - result) + " " + result);
        }
        
        int go() {
            int ret = 0;
            for (int y = 0; y < ROW; ++y) {
                for (int x = 0; x < COL; ++x) {
                    if (mArr[y][x] == 'o') {
                        for (int d = 0; d < 4; ++d) {
                            int ny = y + DY[d];
                            int nx = x + DX[d];
                            int nny = y + DY[d] * 2;
                            int nnx = x + DX[d] * 2;
                            if (nny >= 0 && nny < ROW && nnx >= 0 && nnx < COL && mArr[nny][nnx] == '.' && mArr[ny][nx] == 'o') {
                                mArr[y][x] = '.';
                                mArr[ny][nx] = '.';
                                mArr[nny][nnx] = 'o';
                                ret = Math.max(ret, go() + 1);
                                mArr[y][x] = 'o';
                                mArr[ny][nx] = 'o';
                                mArr[nny][nnx] = '.';
                            }
                        }
                    }
                }
            }
            return ret;
        }
    }
}