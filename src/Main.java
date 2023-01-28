import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("проверить наличие строки 2 в сроке 1");
        String line = scanner.nextLine();
        String line2=scanner.nextLine();
        if (line.contains(line2)){
            System.out.println("строка 2 содержитя в строке 1");
        }
        System.out.println(line2);

        System.out.println("проверить являются ли 2 строки вращеием друг друга");
        String line3 = scanner.nextLine();
        String line4=scanner.nextLine();
        String revLine=reverse(line3);
        System.out.println("-"+revLine);
        System.out.println("-"+line4);
        if (revLine.equals(line4)){
            System.out.println("строки являются вращеием друг друга");
        }
        else System.out.println("строки не являются вращеием друг друга");

        System.out.println("реверс строки через рекурсию");

        StringRecurtion r=new StringRecurtion();
        String for_reverse=scanner.nextLine();
        System.out.println(r.rev(for_reverse));


        System.out.println("Дано два числа, например 3 и 56, необходимо составить следующие строки:" +
                " 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().");


        String num_1 = scanner.nextLine();
        StringBuilder bild_num1=new StringBuilder(num_1);
        String num_2=scanner.nextLine();
        Integer in_num1=Integer.parseInt(num_1);
        Integer in_num2=Integer.parseInt(num_2);
        StringBuilder bild_num2=new StringBuilder(num_2);
        System.out.println(bild_num1.append("+").append(bild_num2).append("=")
                .append(in_num1+in_num2).append(in_num1).append("-").append(in_num1).append("=")
                .append(in_num2-in_num1).append(in_num1).append("*").append(in_num2).append("=")
                .append(in_num2*in_num1));
        bild_num1.append("+");
        System.out.println();

        System.out.println("Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().");

        String repa = scanner.nextLine();
        StringBuilder bild_repa=new StringBuilder(repa);
        char ch ;
        char replased='=';
        for (int i=0;i<bild_repa.length();i++){

            ch = bild_repa.charAt(i);
            if (ch==replased){
                bild_repa.deleteCharAt(i);
                bild_repa.insert(i,"равно");
            }
            System.out.print(bild_repa.charAt(i));
        }

        String replesic = scanner.nextLine();
        StringBuilder bild_replesic = new StringBuilder(replesic);




        char che;
        String new_rep;
        for (int i = 0; i < bild_replesic.length(); i++) {

            che = bild_replesic.charAt(i);

            if (che == replased) {
//                bild_replesic.replace(i, i+1, "равно");
                replesic.replaceFirst(String.valueOf(replesic.charAt(i)), "равно");


            }
//            System.out.print("стринг билд"+bild_replesic.charAt(i));
            System.out.print(bild_replesic.charAt(i));


        }
        String test_string = "";
        long time = System.currentTimeMillis();
        char che_test;
        char eqw='=';

        StringBuilder bild_test_string = new StringBuilder(test_string);
        for (int i = 0; i < 10000; i++) {
            bild_test_string.append("=");


        }
        for (int i = 0; i < 10000; i++) {

            che_test = bild_test_string.charAt(i);

            if (che_test == eqw) {
//                bild_test_string.replace(i, i+1, "равно");
                test_string.replaceFirst(String.valueOf(bild_test_string.charAt(i)), "равно");


            }
//            System.out.print("стринг билд"+bild_replesic.charAt(i));






        }
        System.out.println("      время в ms");
        System.out.println(System.currentTimeMillis() - time);
    }

    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }



}

