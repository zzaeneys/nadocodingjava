package chap_13;

import java.io.*;
import java.util.Scanner;

public class _Quiz_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (BufferedReader br = new BufferedReader(new FileReader("src/chap_13/saying.txt"))) {
            System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오. (주관식)");
            System.out.println("--------------------------------------------");
            String line;
            while(true) {
                line = br.readLine();
                if (line == null) {
                    System.out.println("--------------------------------------------");
                    System.out.println("모든 퀴즈가 완료되었습니다.");
                    System.out.println("수고하셨습니다. ^^");
                    break;
                }
                System.out.println("(문제) " + line);
                System.out.print(" 정답 입력 => ");
                String inputAns1 = sc.nextLine();
                String ans1 = br.readLine();
                if (inputAns1.equals(ans1)) {
                    System.out.println("정답입니다!!!\n");
                } else {
                    System.out.println("틀렸습니다. 정답은 " + ans1 + "입니다.\n");
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }





    }
}
