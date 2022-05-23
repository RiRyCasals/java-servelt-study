package subject20220507;

import java.util.Scanner;

public class Input {
    public static String[] console() {
        Scanner scanner = new Scanner(System.in);
        String[] args = new String[3];

        System.out.print("元本を入力してください（単位円）> ");
        args[0] = scanner.next();

        System.out.print("金利(年利)を入力してください（単位％）> ");
        args[1] = scanner.next();

        System.out.print("年数を入力してください（単位年）> ");
        args[2] = scanner.next();

        return args;
    }
}
