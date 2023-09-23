public class Main {
    public static void main(String[] args) {

        Kitten dog = new Kitten(2, "Cat", 3.5, 2, 2.3);
        Kitten cat1 = new Kitten(dog);
        dog.show();
    }
}