package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //메소드, method
    //Main 클래스 안에 있는 main 메소드
    //main 메소드 (별표 5개), 프로그램 시작점
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!"); //"" 쌍따옴표는 문자열(문자배열) 표시
        System.out.print("Hello and welcome!");

        System.out.println("안녕하세요.");
        System.out.println("안녕하세요.");

        //반복문 (for문, while문)

        for (int i = 1; i <= 10; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}

