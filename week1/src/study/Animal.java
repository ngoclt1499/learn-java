package study;

public class Animal {
    private String name;
    private String hometown;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public Animal() {
    }

    public Animal(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
    }

    void introduce() {
        System.out.println("My name is " + name + ", I live in " + hometown );
    }
}
