package lesson1.xml;

public class HelloManOnceSay implements HelloMan {
    private String name;

    public HelloManOnceSay() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void helloSay() {
        System.out.println("Hello, " + this.name);
    }
}
