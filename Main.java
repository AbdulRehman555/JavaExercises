import java.awt.*;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        /////////////////////////////////////////Date Class///////////////////////////////////
        /////////////////////////////////////////Point Class//////////////////////////////////
        /////////////////////////////////////////String functions/////////////////////////////
        /////////////////////////////////////////Escape sequences/////////////////////////////
        /* Date now=new Date();
        System.out.println(now);
        ///////////////////////////////////////////////////////////////////////////////////Point Class
        Point point1=new Point(1,2);
        Point point2=point1;
        point1.x=8;
        System.out.println(point2);
        ///////////////////////////////////////////////////////////////////////////////String functions
        String message="  Hello"+"!!";
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("A"));
        System.out.println(message.length());
        System.out.println(message.indexOf("l"));
        System.out.println(message.indexOf("M"));
        System.out.println(message.trim()); //removes extra wide spaces in the beginning or end
        System.out.println(message.replace("!","*"));
        //targe & replacement are parmeters while "!" & "*" re arguments.
        //replace & all other functions does not modify original string , it returns copy
        System.out.println(message);
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message);
        //////////////////////////////////////////////////////////////////////////////Escape sequences
        System.out.println("\tHello\n \"Raja\"");
        System.out.println("C:\\windows\\user\\raja");*/
        /////////////////////////////////////////1D Arrays////////////////////////////////////
        /*1.
        //int[] numbers=new int[5];
        numbers[0]=3;
        numbers[1]=1;
        numbers[2]=4;
        System.out.println(Arrays.toString(numbers));
                       //2.
        int[] numbers={3,2,1,5,4};
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
                      //Sorting
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));*/
        /////////////////////////////////////////multi-D Arrays///////////////////////////////
        /*int[][] numbers=new int[2][3];
        //numbers[0][0]=5;              OR
        int[][] numbers={{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(numbers));*/
        ////////////////////////////////////////CONSTANTS/////////////////////////////////////
        /*final float PI=3.14F;
        //final keyword used*/
        ///////////////////////////////////////CASTING////////////////////////////////////////
        /*double x=1.1;
        int y=(int)x+2;
        System.out.println(y);
        String str="1";
        int num=Integer.parseInt(str)+2;
        System.out.println(num);
        String str2="1.5";
        double num2=Double.parseDouble(str2)+2;
        System.out.println(num2);*/
        //////////////////////////////////////MATH Class//////////////////////////////////////
        /*int result=Math.round(1.5F);
        System.out.println(result);

        int result2=(int)Math.ceil(1.1F);
        System.out.println(result2);

        int result3=(int)Math.floor(1.1F);
        System.out.println(result3);

        int result4=Math.max(1,2);
        System.out.println(result4);

        int result5=Math.min(1,2);
        System.out.println(result5);

        int result6=(int)(Math.random()*100+1);
        System.out.println(result6);*/
        //////////////////////////////////////Number Formatting///////////////////////////////
        /*NumberFormat currency=NumberFormat.getCurrencyInstance();
        String result=currency.format(34353523);
        System.out.println(result);

        NumberFormat percent=NumberFormat.getPercentInstance();
        String result1=percent.format(0.1);
        System.out.println(result1);
                                    //OR
        System.out.println(NumberFormat.getPercentInstance().format(0.1));*/
        //////////////////////////////////////Reading Numbers/////////////////////////////////
        /*Scanner scanner=new Scanner(System.in);
        System.out.print("Age: ");
        int age=scanner.nextByte();
        System.out.println("You are "+age);

        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine().trim();
        System.out.println("You are "+name);*/
        //////////////////////////////////////Mortgage Payment Calculator/////////////////////
        final byte MONTHS_IN_YEAR=12;
        final byte PERCENT=100;
        int principal=0;
        float annualInterest=0;
        float monthlyInterest=0;
        byte years=0;
        int monthlyPayment=0;
        double mortgage=0;
        Scanner scanner=new Scanner(System.in);

        while(true){
            System.out.print("Principal[$1K-$1M]: ");
            principal = scanner.nextInt();
            if(principal>1000 && principal<=1000000)
                break;
            System.out.println("Enter a value between 1K to 1M");
        }


        while(true){
            System.out.print("Annual Interest Rate[1-30]: ");
            annualInterest = scanner.nextFloat();
            if(annualInterest>0 && annualInterest<=30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }


        while(true){
            System.out.print("Period[1-30]: ");
            years = scanner.nextByte();
            if(years>0 && years<=30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }
        monthlyPayment=years*MONTHS_IN_YEAR;

        mortgage=principal*(monthlyInterest*(Math.pow(1+monthlyInterest,monthlyPayment)))
                        /(Math.pow(1+monthlyInterest,monthlyPayment)-1);
        String mortgageFormatted=NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+mortgageFormatted);
        /////////////////////////////////////Ternary Op/IF st.(professional approach)/////////
        /*int income =120_000;
        boolean isEligible=(income>100_000);
        //avoiding 2 or 3 sts. of if/else, more simplified code.
        String className=(income>100_000)?"First":"Economy";
        System.out.println(className);*/
        ////////////////////////////////////FizzBuzz Exercise/////////////////////////////////
        /*Scanner scanner=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number=scanner.nextInt();
        if (number%5==0 && number%3==0)
            System.out.println("FizzBuzz");
        else if(number%3==0)
            System.out.println("Buzz");
        else if(number%5==0)
            System.out.println("Fizz");
        else
            System.out.println(number);
        //We cannot compare two strings like this
        //  name=="ALi"   or    name!="Ali" *because it compares different memory addresses instead of there value.*
        //  we use if(name.equals("Ali"))
        // while(!name.equals("Ali"))*/
        ///////////////////////////////////FOR EACh loop//////////////////////////////////////
        /*String[] fruits={"Apple","Mango","Orange"};
        for(int i=0;i<fruits.length;i++)
            System.out.println(fruits[i]);
                    //for each loop
        for(String fruit:fruits)
            System.out.println(fruit);
                    //Limitations
        //  1. we cannot run loop in backward direction in for eachloop
        //  * fruit is a loop variable
        //  2. we cannot access each index of an array.*/

    }
}
