package Cycles;

public class Switch_Case {
    public int option;
    public String Show_Option(){
        switch (option){
            case 1:{
                return "Your prize is a cap";
            }
            case 2:{
                return "Your prize is a candy";
            }
            default:{
                return "incorrect option";
            }
        }
    }
}
