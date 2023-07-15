package Cycles;

import Cycles.cycle;
import Cycles.cycle_DoWhile;
import Cycles.cycle_while;

import java.util.Scanner;

public class Main_Cycles {
    public static void main(String[] args) {
        cycle one= new cycle();
        one.to_start=5;
        one.to_end=10;
        one.Show_cycle();


        cycle_while two= new cycle_while();
        two.to_star=2;
        two.to_end=16;
        two.Show_cycle();

        cycle_DoWhile three= new cycle_DoWhile();
        three.to_star=7;
        three.to_end=21;
        three.Show_cycle();

        Ternary_operator operator= new Ternary_operator();
        operator.to_start=1;
        operator.to_start2=true;
        System.out.println(operator.Show_message());

        Switch_Case switchCase= new Switch_Case();

        Scanner reader= new Scanner(System.in);
        System.out.println("please enter an option");
        switchCase.option=reader.nextInt();
        System.out.println(switchCase.Show_Option());
    }
}
