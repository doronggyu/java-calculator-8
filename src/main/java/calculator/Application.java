package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        System.out.println("덧셈할 문자열을 입력해 주세요.");

        String input = Console.readLine();
        String delimiter = ",|:"; // 기본 구문자
        String numberSection = input;

        if(input.startsWith("//")){
            String[] splitInput = input.split("\\\\n"); // 커스텀구분자를 \n기준으로 나뉘어 구분자와 숫자입력을 분리
            String delimiterSection = splitInput[0].substring(2);
            numberSection = splitInput[1];

            for(int i=0; i<delimiterSection.length(); i++){
                delimiter += "|"+delimiterSection.charAt(i);
            }

        }

        String[] numbers = numberSection.split(delimiter);
        int sum = 0;

        for(String numList : numbers){
            int num = Integer.parseInt(numList);
            sum += num;
        }

        System.out.println("결과 : " + sum);
    }
}
