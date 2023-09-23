public class Num<T extends Number, V extends Number>{
    private T ob1;
    private V ob2;
    public Num(T o1, V o2){
        ob1 = o1;
        ob2 = o2;
    }
    public void showTypes(){
        System.out.println("Type of T is " + ob1.getClass().getName());
        System.out.println("Type of V is " + ob2.getClass().getName());
    }
    public T getOb1(){
        return ob1;
    }
    public V getOb2() {
        return ob2;
    }
    public void sum(T ob1, V ob2){
        double result = ob1.doubleValue() + ob2.doubleValue();
        System.out.println("sum is " + result);
    }
    public <U extends Number, W extends Number > boolean compare (U[] mas1, W[] mas2){
        if (mas1.length != mas2.length) {
            System.out.println("false");
            return false;
        }
        for (int i = 0; i < mas1.length; i++) {
            if (!mas1[i].equals(mas2[i])) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }
    public <U extends Number> U findMax(U array[]){
        U max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i].doubleValue() > max.doubleValue()){
                max = array[i];
            }
        }
        return max;
    }
    public <U extends Number> U findMin(U array[]){
        U min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i].doubleValue() < min.doubleValue()){
                min = array[i];
            }
        }
        return min;
    }
}
