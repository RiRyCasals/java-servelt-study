package subject20220423;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Output{
    private static String outputFileName = "compoundInterestCalculationResult.txt";

    private static String progressFormat(int index, int value) {
        String string = String.format("%,3dヶ月目 : %,d" , index, value);
        return string;
    }

    private static String resultFormat(int value) {
        String string = String.format("元利合計 = ￥%,d", value);
        return string;
    }


    public static void cli(int[] calculatedList) {
        System.out.println("========================================");
        for (int i=0; i<calculatedList.length-1; i++) {
            System.out.println(progressFormat(i, calculatedList[i]));
        }
        System.out.println("========================================");
        System.out.println(resultFormat(calculatedList[calculatedList.length-1]));
        System.out.println("========================================");
    }

    public static void textFile(int[] calculatedList) {
        try {
            File file = new File(outputFileName);
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write("========================================");
            bw.newLine();
            for (int i=0; i<calculatedList.length-1; i++) {
                bw.write(progressFormat(i, calculatedList[i]));
                bw.newLine();
            }
            bw.write("========================================");
            bw.newLine();
            bw.write(resultFormat(calculatedList[calculatedList.length-1]));
            bw.newLine();
            bw.write("========================================");       
            bw.close();
        } catch (IOException e) {
            System.out.println("[ERROR] ファイルに書き込めませんでした");
            System.exit(1);
        }
    }
}
