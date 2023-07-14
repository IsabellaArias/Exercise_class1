package Cycles;

public class cycle_while {
    public int to_star;
    public int to_end;

    public void Show_cycle(){
        while (to_star<=to_end){
            System.out.println(to_star);
            to_star+=2; //si se pone el menos retrocede de dos en dos ya que sería -=2
        }
    }

}
