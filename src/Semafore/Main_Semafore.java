package Semafore;

public class Main_Semafore {
    public static void main(String[] args) {
        traffic_light semafore= new traffic_light();
        semafore.color="Green";
        semafore.status=true;
        if (semafore.status){
            System.out.println(semafore.Show_message());
        }
    }
}
