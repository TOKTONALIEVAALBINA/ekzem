import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int array[] = new int[100];
//            met(array);

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println(method(a));


        String [] arr = {"Alena", "Marina"  ,"Mariya"};
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(isString(arr,name));


    }

    static String isString (String []arr,String name){
        for (String a :arr){
            if(a.equals(name)){
                return a.toUpperCase();
            }

        }return "have not";
    }





    static int method (int a){
        if (a%2==0){
            return 1;
        }else {
            return 0;
        }
    }




    static void met (int []array){
        for (int i = 0; i < array.length; i++) {
            Random ran = new Random();
            array[i] = ran.nextInt(10, 100);
            if (array[i] % 10 == 5) {
                System.out.println(array[i]);
            }
        }
    }


}