public class Pen {

    String type = "gel";
    String color = "black";
    int point = 10;

    static boolean opened = false;

    public static void open(){
        opened = true;
    }
    public static void close(){
        opened = false;

    }

}
