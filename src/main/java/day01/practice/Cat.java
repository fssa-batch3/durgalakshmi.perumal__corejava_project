package day01.practice;

public class Cat {
    private String color;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setColor("purple");
        cat1.setAge(3);
        
        Cat cat2 = new Cat();
        cat2.setColor("blue");
        cat2.setAge(5);

        System.out.println("Cat 1:");
        System.out.println("Age: " + cat1.getAge());
        System.out.println("Color: " + cat1.getColor());
        System.out.println("Speaks: Meow!");
        
        System.out.println("Cat 2:");
        System.out.println("Age: " + cat2.getAge());
        System.out.println("Color: " + cat2.getColor());
        System.out.println("Speaks: Meow!");
    }
}

