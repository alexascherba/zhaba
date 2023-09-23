package Task3;

public class App
{
    public static void main( String[] args )
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('a');
        NewThread newThread1 = new NewThread(stringBuilder);
        newThread1.start();
        NewThread newThread2 = new NewThread(stringBuilder);
        newThread2.start();
        NewThread newThread3 = new NewThread(stringBuilder);
        newThread3.start();
    }
}

