
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a=0;
        int b=0;

        //계산기 만들기 코드
        System.out.println("숫자 a와 b를 입력하시오");
        Scanner scanner=new Scanner(System.in);
        a= scanner.nextInt();
        b=scanner.nextInt();

        String sign=""; //부호
        System.out.println("부호를 입력하세요");
        sign=scanner.next();

        if (sign.equals("+")){
            //더하기 만들기
        }else if(sign.equals("-")){
            //빼기
        }else if(sign.equals("*")){
            //곱하기
        }else if(sign.equals("/")){

        }
    }
    class Sub {}
}
