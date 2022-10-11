public class Practice {
    public static void main(String[] args) {
        //System.out.println(makeBricks(50));
        System.out.println(gameOver(new char[][] {new char[] {'O', 'O', 'O'}, new char[] {' ', ' ', ' '}, new char[] {' ', ' ', ' '}}));
    }

    static String makeBricks(int steps) {
        String result = "";
        for (int i = 1; i <= steps; i++) {
            String row = " ".repeat(steps - i);
            row += "#".repeat(i);
            row += "\n";
            result += row;
        }

        return result;
    }

    static char gameOver(char[][] board) {
        int xLength = 0;
        int oLength = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char currentChar = board[i][j];
                switch (currentChar) {
                    case 'X' -> {
                        xLength++;
                        oLength = 0;
                    }
                    case 'O' -> {
                        oLength++;
                        xLength = 0;
                    }
                    case ' ' -> {
                        xLength = 0;
                        oLength = 0;
                    }
                }

                if (xLength == 3) {
                    return 'X';
                }
                if (oLength == 3) {
                    return 'O';
                }
            }
        }

        return ' ';
    }
}
