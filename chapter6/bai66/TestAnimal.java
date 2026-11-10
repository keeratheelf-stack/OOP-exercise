public class TestAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat("Kitty");
        Dog dog = new Dog("Buddy");
        BigDog bigDog = new BigDog("Max");

        // Thử greets() của từng lớp
        Animal[] animals = {cat, dog, bigDog};

        for (Animal animal : animals) {
            animal.greets();
        }

        Dog anotherDog = new Dog("Rocky");
        BigDog anotherBigDog = new BigDog("Giant");

        // Gọi greets(Dog)
        dog.greets(anotherDog);
        dog.greets(anotherBigDog);

        // BigDog dùng greets(Dog) hoặc greets(BigDog)
        bigDog.greets(anotherDog);
        bigDog.greets(anotherBigDog);
    }
}