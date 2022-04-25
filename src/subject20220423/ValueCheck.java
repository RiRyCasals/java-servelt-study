package subject20220423;

public class ValueCheck {
    private static int argumentsNum = 3;
    private static int principalRangeMin = 1;
    private static int principalRangeMax = 1_000_000_000;
    private static int rateRangeMin = 1;
    private static int rateRangeMax = 20;
    private static int yearRangeMin = 1;
    private static int yearRangeMax = 20;

    public static void numberOfArguments(String[] args) {
        if (args.length != 3) {
            System.out.println("[Error] 「元金 金利 年数」の3つのみを引数として入力してください");
            System.exit(1);
        }
    }

    public static int[] castToInt(String[] args) {
        int[] intArgs = new int[3];
        try {
            intArgs[0] = Integer.parseInt(args[0]);
            intArgs[1] = Integer.parseInt(args[1]);
            intArgs[2] = Integer.parseInt(args[2]);
        } catch (ClassCastException e) {
            System.out.println("[ERROR] 数字に変換できる文字を入力してください");
            System.exit(1);
        }
        return intArgs;
    }

    public static void range(int[] args) {
        if (!principalRangeIsOK(args[0])) {
            System.out.println("[ERROR] 元金は " + principalRangeMin + "~" + principalRangeMax + " の範囲で入力してください");
            System.exit(1);
        }
        if (!rateRangeIsOK(args[1])) {
            System.out.println("[ERROR] 金利は " + rateRangeMin + "~" + rateRangeMax + " の範囲で入力してください");
            System.exit(1);
        }
        if (!yearRangeIsOK(args[2])) {
            System.out.println("[ERROR] 年数は " + yearRangeMin + "~" + yearRangeMax + " の範囲で入力してください");
            System.exit(1);
        }
    }
    
    private static boolean principalRangeIsOK(int principal) {
        if (principal < principalRangeMin || principal > principalRangeMax) {
            return false;
        }
        return true;
    }
    
    private static boolean rateRangeIsOK(int rate) {
        if (rate < rateRangeMin || rate > rateRangeMax) {
            return false;
        }
        return true;
    }

    private static boolean yearRangeIsOK(int year) {
        if (year < yearRangeMin || year > yearRangeMax) {
            return false;
        }
        return true;
    }
}
