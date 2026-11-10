public class TestAnimals {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        Mammal mammal = new Mammal("Mammal");
        Cat cat = new Cat("Kitty");
        Dog dog1 = new Dog("Buddy");
        Dog dog2 = new Dog("Max");

        System.out.println(animal);
        System.out.println(mammal);
        System.out.println(cat);
        System.out.println(dog1);

        cat.greets();
        dog1.greets();
        dog1.greets(dog2);
    }
}