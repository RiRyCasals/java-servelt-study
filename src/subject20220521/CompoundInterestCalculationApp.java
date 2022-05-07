package subject20220521;

public class CompoundInterestCalculationApp {
    public static void main(String[] args) {
        // 対話型入力
        String[] inputArgs = Input.console();

        // ValueCheck 入力値の確認
        ValueCheck.numberOfArguments(inputArgs);

        // stringをintにキャスト
        int[] intArgs = ValueCheck.castToInt(inputArgs);

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
