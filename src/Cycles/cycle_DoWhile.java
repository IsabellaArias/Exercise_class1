package Cycles;

public class cycle_DoWhile {
    public int to_star;
    public int to_end;

    public void Show_cycle(){
    do{
        System.out.println(to_star);
        to_star ++;
    }while (to_star <= to_end);
    }
}

