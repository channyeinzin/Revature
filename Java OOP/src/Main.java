public class Main {
    public static void main(String[] args) {
        Pen p = new Pen();

        System.out.println(p.color);
        System.out.println(p.point);
        System.out.println(p.type);

        System.out.println(p.opened);
        p.open();
        p.close();
        p.open();
        p.close();
        p.open();
        p.close();


        System.out.println(p.opened);
    }
}
