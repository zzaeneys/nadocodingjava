package chap_03;
// "901231-1234567" 인 경우 901231-1 까지 출력
// "030708-4567890" 인 경우 030708-4 까지 출력
public class _Quiz_03 {
    public static void main(String[] args) {
        String residentNum = "901231-1234567"; // 주민등록번호 13자리
        String residentNum2 = "030708-4567890"; // 0 위치부터 8 위치 직전까지
        System.out.println(residentNum.substring(0, 8));
        System.out.println(residentNum.substring(0, residentNum.indexOf("-") + 2)); // 0 위치부터 하이픈 위치 + 2 직전까지
        System.out.println(residentNum2.substring(0, 8));
    }
}
