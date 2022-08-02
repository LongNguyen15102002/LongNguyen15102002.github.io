public class Main {
    static int globalVar;

    public static void main(String[] args) {
        float temp;

        int globalVar = 2;
        System.out.println(globalVar);
        System.out.println("Hello, World");
        System.out.println("Hello, Java");
        System.out.println("Hello java again");
        System.out.println("hello nigga");
        System.out.println("");

        int intNumber = 4;
        long longNumber = 100L;

        System.out.println(intNumber);
        System.out.println(longNumber);

        float floatNumber = 0.45f;
        System.out.println(floatNumber);

        double doubleNumber = 0.95;
        System.out.println(doubleNumber);

        boolean booleanValue = true;
        System.out.println(booleanValue);

        temp = 13.0f;
        int temp1;

        temp1 = 14;
        System.out.println(temp1);
        System.out.println(temp);

        byte byteNumber = 5;
        short shortNumber = byteNumber;

        System.out.println(shortNumber);

        longNumber = byteNumber;
        System.out.println(longNumber);

        double height = 1.7;
        int heightInt = (int) height;
        System.out.println(heightInt);

        long weight = 100;
        int weightInt = (int) weight;
        System.out.println(weightInt);

        final float piNumber = 3.14f;

       boolean result = height == heightInt;
       System.out.println(result);

       System.out.println(height >= heightInt);

       weight++;
       System.out.println(weight);
       weight--;
       System.out.println(weight);

       boolean andResult = (100 > 40) && ((30>10) || (10<5));
       System.out.println(andResult);

       double randomNum = Math.random();
       System.out.println(randomNum);
    }
}