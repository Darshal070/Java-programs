import java.util.Scanner;
class pr4_Controlstmt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1.Finding largest of 2 numbers using ternary operator
        // System.out.print("Enter the first number: ");
        // int a = scanner.nextInt();
        // System.out.print("Enter the second number: ");
        // int b = scanner.nextInt();
        // int max=(a>b)?a:b;
        // System.out.println("large num is: " + max);

        // //Swapping two nums without using a third variable
        // a=a*b;
        // b=a/b;
        // a=a/b;
        // System.out.println("After swapping: a="+a);
        // System.out.println("After swapping: b="+b);
        
        // //Calculate simple interest
        // System.out.print("Enter the principal amount: ");
        // double principal = scanner.nextDouble();
        // System.out.print("Enter the rate of interest: ");
        // double rate = scanner.nextDouble();
        // System.out.print("Enter the time in years: ");
        // double time = scanner.nextDouble();
        // double simpleInterest = (principal * rate * time) / 100;
        // System.out.println("Simple Interest: " + simpleInterest);

        //Calculating area of perimeter of circle
        // final double PI = 3.14;
        // System.out.println("Enter the radius of circle:");
        // double rad=scanner.nextDouble();
        // double area=PI*rad*rad;
        // double peri=2*PI*rad;
        // System.out.println("Area is:"+area);
        // System.out.println("Perimeter is:"+peri);

        //Avg of 3 numbers
        // System.out.print("Enter the first number: ");
        // int num1=scanner.nextInt();
        // System.out.print("Enter the second number: ");
        // int num2=scanner.nextInt();
        // System.out.print("Enter the third number: ");
        // int num3=scanner.nextInt();
        // double avg=(num1+num2+num3)/3;
        // System.out.println("Avg is:"+avg);

        //Calculating Square of number
        // System.out.println("Enter the num:");
        // int num=scanner.nextInt();
        // int sq=num*num;
        // System.out.println("Square is:"+sq);


        //2.if,if-else,if-else-if Ladder & Nested if
        //A.if statement

    //     System.out.println("Enter the num:");
    //     int d=scanner.nextInt();
    //     if(d>0){
    //         System.out.println("num is pos:"+d);
    //     }

    //     if(d%5==0){
    //         System.out.println("num is divisible by 5:"+d);
    //     }

    //     if(d%2==0){
    //         System.out.println("num is even:"+d);
    //     }

    //     System.out.println("Enter the age:");
    //     int age=scanner.nextInt();
    //     if(age>=18){
    //         System.out.println("person is eligible to vote");
    //     }

    //     System.out.println("Enter the marks:");
    //     int marks=scanner.nextInt();
    //     if(marks>=35){
    //         System.out.println("student is pass");
    //     }

    //     System.out.println("Enter the num:");
    //     int gb=scanner.nextInt();
    //     if(gb>100){
    //         System.out.println("num is greater than 100");
    //     }

    //     System.out.println("Enter the character:");
    //     char ch=scanner.next().charAt(0);
    //     if(ch>='A' && ch<='Z'){
    //         System.out.println("character is uppercase");
    //     }else{
    //         System.out.println("Character is in Lowercase");
    //     }

    //   System.out.println("enter the year:");
    //   int year=scanner.nextInt();
    //   if(year%4==0 && year/1000>=1){
    //     System.out.println("year is leap year");
    //   }

    // System.out.println("Enter the num:");
    // int num=scanner.nextInt();
    // if(num%10==0){
    //     System.out.println("num is multiple of 10");
    // }


    //B.if-else statement
    // System.out.println("Enter the num:");
    // int num=scanner.nextInt();
    // if(num%2==0){
    //     System.out.println("num is even");
    // }
    // else{
    //     System.out.println("number is odd");
    // }

    // if(num>0){
    //     System.out.println("num is positive");
    // }
    // else{
    //     System.out.println("num is negative");
    // }

    // System.out.println("Enter the 1st num:");
    // int num1=scanner.nextInt();

    // System.out.println("Enter the 2nd num:");
    // int num2=scanner.nextInt();

    // if(num1>num2){
    //     System.out.println("num1 is large");
    // }
    // else{
    //     System.out.println("num2 is large");
    // }

    // System.out.println("Enter the character:");
    //     char ch1=scanner.next().charAt(0);
    //   if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'){
    //      System.out.println("character is vowel");
    //   }else{
    //        System.out.println("Character is consonant");
    // }

    // System.out.println("Enter the num:");
    // int num=scanner.nextInt();
    //   if(num%3==0){
    //     System.out.println("num is divisible by 3");
    //   }else{
    //     System.out.println("num is not divisible by 3");
    //   }    

    //   System.out.println("Enter the character:");
    //     char ch=scanner.next().charAt(0);
    //      if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
    //          System.out.println("character is alphabate");
    //      }else{
    //          System.out.println("Character is not an alphabet");
    // }



    //C.if-else-if Ladder
    //Finding largest of 3 numbers
    // System.out.println("Enter the 1st num:");
    // int num1=scanner.nextInt();

    //     System.out.println("Enter the 2nd num:");
    //     int num2=scanner.nextInt();

    //     System.out.println("Enter the 3rd num:");
    //     int num3=scanner.nextInt();

    //     if(num1>num2 && num1>num3){
    //         System.out.println("num1 is large");
    //     }
    //     else if(num2>num1 && num2>num3){
    //         System.out.println("num2 is large");
    //     }
    //     else{
    //         System.out.println("num3 is large");
    //     }

    //     //Assign grades based on marks
    //     System.out.println("Enter the marks:");
    //     int marks=scanner.nextInt();
    //     if(marks>=90){
    //         System.out.println("Grade is A");
    //     }
    //     else if(marks>80 && marks<89){
    //         System.out.println("Grade is B");
    //     }
    //     else if(marks>70 && marks<79){
    //         System.out.println("Grade is C");
    //     }
    //     else if(marks>60 && marks<69){
    //         System.out.println("Grade is D");
    //     }
    //     else{
    //         System.out.println("Grade is F");
    //     }

    //     //Displaying the month name based on month number
    //     System.out.println("Enter the month number:");
    //     int month=scanner.nextInt();
    //     if(month==1){
    //         System.out.println("January");
    //     }
    //     else if(month==2){
    //         System.out.println("February");
    //     }
    //     else if(month==3){
    //         System.out.println("March");
    //     }
    //     else if(month==4){
    //         System.out.println("April");
    //     }
    //     else if(month==5){
    //         System.out.println("May");
    //     }
    //     else if(month==6){
    //         System.out.println("June");
    //     }
    //     else if(month==7){
    //         System.out.println("July");
    //     }
    //     else if(month==8){
    //         System.out.println("August");
    //     }
    //     else if(month==9){
    //         System.out.println("September");
    //     }
    //     else if(month==10){
    //         System.out.println("October");
    //     }
    //     else if(month==11){
    //         System.out.println("November");
    //     }
    //     else if(month==12){
    //         System.out.println("December");
    //     }

    //     //Displaying the day name based on day number
    //     System.out.println("Enter the day number:");
    //     int day=scanner.nextInt();
    //     if(day==1){
    //         System.out.println("Monday");
    //     }
    //     else if(day==2){
    //         System.out.println("Tuesday");
    //     }
    //     else if(day==3){
    //         System.out.println("Wednesday");
    //     }
    //     else if(day==4){
    //         System.out.println("Thursday");
    //     }
    //     else if(day==5){
    //         System.out.println("Friday");
    //     }
    //     else if(day==6){
    //         System.out.println("Saturday");
    //     }
    //     else if(day==7){
    //         System.out.println("Sunday");
    //     }

    //     //Calculating electricity bill based on units consumed
    //     System.out.println("Enter the units consumed:");
    //     int units=scanner.nextInt();
    //     double billAmount;
    //     if(units<=100){
    //         billAmount=units*5;
    //     }
    //     else if(units>100 && units<=200){
    //         billAmount=100*5+(units-100)*7;
    //     }
    //     else{
    //         billAmount=100*5+100*7+(units-200)*10;
    //     }
    //     System.out.println("The electricity bill amount is: " + billAmount);

        // //Calculating income tax based on salary
        //  System.out.print("Enter salary: ");
        // double salary = scanner.nextDouble();
        // double tax;

        // if (salary <= 250000) {
        //     tax = 0;
        // } else if (salary <= 500000) {
        //     tax = (salary - 250000) * 0.05;
        // } else if (salary <= 1000000) {
        //     tax = (250000 * 0.05) + (salary - 500000) * 0.2;
        // } else {
        //     tax = (250000 * 0.05) + (500000 * 0.2) + (salary - 1000000) * 0.3;
        // }

        // System.out.println("Income Tax = " + tax);

        // //catagorize a person by age
        //  System.out.print("Enter age: ");
        // int age = scanner.nextInt();

        // if (age < 13) {
        //     System.out.println("Child");
        // } else if (age < 20) {
        //     System.out.println("Teenager");
        // } else if (age < 60) {
        //     System.out.println("Adult");
        // } else {
        //     System.out.println("Senior Citizen");
        // }

        // //Calculating discount
        //  System.out.print("Enter purchase amount: ");
        // double amount = scanner.nextDouble();
        // double discount;

        // if (amount >= 5000) {
        //     discount = amount * 0.2; // 20%
        // } else if (amount >= 2000) {
        //     discount = amount * 0.1; // 10%
        // } else {
        //     discount = amount * 0.05; // 5%
        // }

        // System.out.println("Discount = " + discount);
        // System.out.println("Final Price = " + (amount - discount));


        //Nested if statement

         // 1. Find the Largest of Three Numbers using Nested if
        int a = 10, b = 20, c = 15;
        if (a > b) {
            if (a > c)
                System.out.println("Largest = " + a);
            else
                System.out.println("Largest = " + c);
        } else {
            if (b > c)
                System.out.println("Largest = " + b);
            else
                System.out.println("Largest = " + c);
        }

        // 2. Find the Smallest of Three Numbers using Nested if
        if (a < b) {
            if (a < c)
                System.out.println("Smallest = " + a);
            else
                System.out.println("Smallest = " + c);
        } else {
            if (b < c)
                System.out.println("Smallest = " + b);
            else
                System.out.println("Smallest = " + c);
        }

        // 3. Check Leap Year using Nested if
        int year = 2024;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    System.out.println("Leap Year");
                else
                    System.out.println("Not Leap Year");
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not Leap Year");
        }

        // 4. Check Valid Triangle using Nested if
        int x = 3, y = 4, z = 5;
        if (x + y > z) {
            if (x + z > y) {
                if (y + z > x)
                    System.out.println("Valid Triangle");
                else
                    System.out.println("Not Valid Triangle");
            } else {
                System.out.println("Not Valid Triangle");
            }
        } else {
            System.out.println("Not Valid Triangle");
        }

        // 5. Check Login Credentials using Nested if
        String username = "admin";
        String password = "1234";

        if (username.equals("admin")) {
            if (password.equals("1234"))
                System.out.println("Login Successful");
            else
                System.out.println("Wrong Password");
        } else {
            System.out.println("Invalid Username");
        }

        // 6. Check Eligibility for Loan using Nested if
        int age1 = 30;
        double income = 50000;
        if (age1 >= 21) {
            if (income >= 25000)
                System.out.println("Eligible for Loan");
            else
                System.out.println("Not Eligible (Low Salary)");
        } else {
            System.out.println("Not Eligible (Age Less Than 21)");
        }   
    }
}