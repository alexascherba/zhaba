public class Main {
    public static void main(String[] args) {
        Animals animal1 = new Animals("Cat", 15, 30, 125);
        Animals animal2 = new Animals("Dog", 6, 120, 160);
        Animals animal3 = new Animals();
        animal1.show();
        animal2.show();
        animal3.show();
        Animals.hasSameName(animal1.name, animal2.name);
        animal1.compare();
        animal2.compare();
    }
}