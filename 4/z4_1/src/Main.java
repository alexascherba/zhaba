public class Main {
    public static void main(String[] args) {
        Num<Integer, Integer> numerics = new Num<Integer, Integer>(5, 10);
        numerics.sum(numerics.getOb1(), numerics.getOb2());
        Num<Double, Double> numerics2 = new Num<Double, Double>(6.7, 9.8);
        numerics2.sum(numerics2.getOb1(), numerics2.getOb2());
        Integer[] array1 = {1, 2, 3};
        Double[] array2 = {1.0, 2.0, 3.0};
        boolean comparison = numerics.compare(array1, array2);
        Double[] array3 = {1.5, 2.0, 3.5};
        Double max = numerics.findMax(array3);
        System.out.println(max);
        Double min = numerics.findMin(array2);
        System.out.println(min);
    }
}