public class Practice {
    public static void main(String[] args) {
        System.out.println(hideEmail("thisisawesome@comerica.com"));
        System.out.println(hideEmail("captainAmerica@gmail.com"));
        System.out.println(makeBricks(5));
        processNumbers("10\n  32  \n 8");
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

    static void processNumbers(String input) {
        String[] lines = input.split("\n");
        double count = 0;
        double sum = 0;
        int countEven = 0;
        int countOdd = 0;
        double average = 0.0;
        for (int i = 0; i < lines.length; i++) {
            String trimmed = lines[i].trim();
            if (trimmed.isEmpty()) {
                continue;
            }

            double number = Integer.parseInt(trimmed);
            if (number % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
            count++;
            sum += number;
        }

        average = Math.round(sum / count * 10.0) / 10.0;
        String report = "Count: " + (int) count
                + "\nSum: " + (int) sum
                + "\nCount Even: " + countEven
                + "\nCount Odd: " + countOdd
                + "\nAverage: " + average;
        System.out.println(report);
    }

    static String hideEmail(String email) {
        String[] splitEmail = email.split("@");
        String hiddenName = splitEmail[0].substring(0, 4);
        String website = splitEmail[1];
        String maskingText = "***";

        return hiddenName + maskingText + "@" + website;
    }
}
