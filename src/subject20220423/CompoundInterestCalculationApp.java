package subject20220423;

public class CompoundInterestCalculationApp {
    public static void main(String[] args) {
        // ValueCheck 引数確認
        ValueCheck.numberOfArguments(args);

        // stringをintにキャスト
        int[] intArgs = ValueCheck.castToInt(args);

        // ValueCheck 範囲確認
        ValueCheck.range(intArgs);

        // 福利計算
        int[] calculatedList = Calculation.compoundInterest(intArgs[0], intArgs[1], intArgs[2]);

        // コンソールに出力
        Output.cli(calculatedList);

        // テキストファイルに出力
        Output.textFile(calculatedList);
    }
}
