public class Thing {
    private String name;
    private int number;

    public Thing(String n, int num) {
        name = n;
        number = num;
    }

    public void doThing() {
        System.out.println("Name of thing is " + name);
        System.out.println("Number of thing is " + number);
    }
}
