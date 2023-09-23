package Task4;

public class Book implements Printable{
    private String name;
    public Book(String name) {
        this.name = name;
    }
    public static void printBooks(Printable[] printable){
        for(Printable mas : printable){
            if(mas instanceof Book){ // используется для определения типа объекта во время выполнения программы (проверяет ссылку на объект)
                mas.print();
            }
        }
    }
    public void print() {
        System.out.println(name);
    }
}
