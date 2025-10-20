package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        String input = Console.readLine();

        if(input.startsWith("//")){
            System.out.println("커스텀 구분자 형식");
        } else {
            System.out.println("기본 구분자 형식");
        }
    }
}
