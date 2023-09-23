package Task4;

public class Magazine implements Printable{
    private String name;
    public Magazine(String name) {
        this.name = name;
    }
    public static void printMagazines(Printable[] printable){
        for(Printable mas : printable){
            if(mas instanceof Magazine){ // используется для определения типа объекта во время выполнения программы (проверяет ссылку на объект)
                mas.print();
            }
        }
    }
    public void print() {
        System.out.println(name);
    }
}
