package Semafore;

public class traffic_light {
    public String color;
    public boolean status;
    public String Show_status(){
        if(status){
            return "Traffic light on";
        }else{
            return "Traffic light off";
        }
    }
        public String Show_message(){
            if (color.equals("Green")){
                return "to follow";
            }else if(color.equals("Red")){
                return "to stop";
            }else if(color.equals("Yellow")){
                return "to decelerate";
            }else {
                return "damaged semafore";
            }
        }
}
