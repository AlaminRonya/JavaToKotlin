package java_code;


import java.util.Scanner;

// TODO: Md. Al Amin (01750349979)
public class DecisionMaking {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        if (a > b){
            System.out.println("a is greater than b.");
        }else if(a < b){
            System.out.println("a is less than b.");
        }else{
            System.out.println("a is equal than b.");
        }
        String result = (a==b) ? "yes" : "no";
    }


    public static void switchCase(){
        int a = 12;
        int b = 8;
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.nextLine();
        String result = switch (operator) {
            case "+" -> "%d + %d = %d".formatted(a,b,(a+b));
            case "-" -> "%d - %d = %d".formatted(a,b,(a-b));
            case "*" -> "%d * %d = %d".formatted(a,b,(a*b));
            case "/" -> "%d / %d = %d".formatted(a,b,(a/b));
            default -> "%s is invalid".formatted(operator);
        };
        System.out.println(result);
    }

    public void loop(){

        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        for (int i = 0; i <= 10; i = i+2){
            System.out.println(i);
        }
        for (int i = 10; i >= 0; i = i -2){
            System.out.println(i);
        }



        int x = 10;
        while (x-- > 0){
            if (x==6){
                x--;
                //break
                continue;
            }
            System.out.println(x);
            x--;
        }

    }


    public void exception(){


        int m = 10;
        int n = 0;
        try {
            int t = m/n;
        } catch (ArithmeticException e) {
            // handler
        } finally {
            // optional finally block
        }


    }











}
