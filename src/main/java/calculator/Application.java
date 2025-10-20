package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        String input = Console.readLine();
        String delimiter = ",|:"; // 기본 구문자

        if(input.startsWith("//")){
            String[] splitInput = input.split("\\\\n"); // 커스텀구분자를 \n기준으로 나뉘어 구분자와 숫자입력을 분리
            String delimiterSection = splitInput[0].substring(2);
            String numberSection = splitInput[1];

            for(int i=0; i<delimiterSection.length(); i++){
                delimiter += "|"+delimiterSection.charAt(i);
            }
            System.out.println("커스텀구분자 형식, 구분자 목록 : " + delimiter);
            System.out.println(numberSection);
        } else {
            System.out.println("기본 구분자 형식, 구분자 목록 : " + delimiter);
        }
    }
}
