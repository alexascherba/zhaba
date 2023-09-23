import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Создадим 2 переменные, в первой будет храниться значение размера первого массива, введенного пользователем.
        // Во второй, размер второго массива - количесво четных элементов первого массива
        int n1=0, n2=0;
        //С помощиью операторов do-while мы запрашиваем пользователя ввести число большее 3, пока он с этим задание не справится
        do{
            Scanner scn = new Scanner(System.in);
            System.out.println("Введите число большее 3");
            if(scn.hasNextInt()){
                n1=scn.nextInt();
            }
        }
        while (n1<4);
        //Создадим и заполним первый массив
        int[] Mas1 = new int[n1];
        for(int i=0;i<Mas1.length;i++){
            Mas1[i]=(int)(Math.random()*(n1+1));
            System.out.print(+ Mas1[i]);
            //Каждый раз, когда значение элемента массива четное - увеличиваем счетчик
            if(Mas1[i]%2 == 0 & Mas1[i]!=0)n2++;
        }
        System.out.println("");
        //Если в первом массиве были четные элементы - создаем и заполняем второй массив
        if(n2>0){
            int[] Mas2 = new int[n2];
            for(int i=0,b=0;i<Mas1.length;i++){
                if (Mas1[i]%2==0&Mas1[i]!=0){
                    Mas2[b]=Mas1[i];
                    System.out.print(+ Mas2[b]);
                }
            }
        }
    }
}



