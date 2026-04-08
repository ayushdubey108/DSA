package OOPs;

public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bark-Bark");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("Meow-Meow");
        }

    }
    public static class Lion{
        void speak(){
            System.out.println("Roar");
        }

    }
    public static class Human{
        void speak(){
            System.out.println("Aur aise ho!");
        }

    }

    public static void main(String[] args) {
        Human a = new Human();// ye maine object bnaya hai
        Lion b = new Lion();
        Dog c = new Dog();
        Cat h = new Cat();

        a.speak();
        b.speak();
        c.speak();
        h.speak();
    }
}
