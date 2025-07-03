









public class Yasha{
    // public static void main(String[] args) {
     //arrays
    //  int age = 30 ;
    //  int phyics = 97;
    //  int chem = 98; 
    //  int eng = 95;
     
    // int[] marks = new int[3];
    // marks[0] = 97;
    // marks[1] = 98;
    // marks[2] = 95;
    // System.out.println(marks[2]);
    // System.out.println(marks.length);
    //sort
    //[][]
    // int[]marks1 ={97,98,95};

    // int [][]Finalmarks = {{97,98,95,},{95,95,98}};
    // System.out.println(Finalmarks[1][1]);
    

    //casting (converting)
    // double price = 100.00;
    // double finalprice = price + 10 ;
    // System.out.println(finalprice);
    // //Explict casting
    // int p = 100;
    // int fp = p + (int)18.18;
    // System.out.println(fp);

    //constant
    // int age = 30;
    // age = 31;
    // age = 32;
    // final float PI = 3.14F;
  
    //Arithmetic operators
    // int a= 1;
    // int b=2;
    // int sum = a+b;
    // System.out.println(sum);
    // int diff = a-b;
    // System.out.println(diff);
    // double c =1;
    // double d =2;  
    // double div = c/d;
    // System.out.println(div);
    // double modulo= c%d;
    //System.out.println(modulo);
    
    // int numb =1;
    // // numb++;
    // System.out.println(++numb);
    // System.out.println(numb);

    //maths
    // System.out.println(Math.max(14,7));
    // System.out.println(Math.min(14,7));
    // //random
    // System.out.println(Math.random()*100);
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter you age");
    // int age = sc.nextInt();
    // System.out.println(age); 
    //comparison operators   
    // a==b;
    // a<b;
    // a>b;
    // a>=b;
    //conditional statement
    // boolean issunup = false;
    // if(issunup == true)
    // System.out.println("Day");
    // else
    // System.out.println("Night");

    // int age=30;
    // if(age>18)
    // System.out.println("Can Vote");
    // else
    // System.out.println("Cant vote");
    

    //logical Operators
    //&&
    // int a = 60;
    // int b= 40;
    // if(a < 50 && b < 50 )
    // System.out.println("Both are less than 50");

    //
    // if(a <  50 || b < 50)
    // System.out.println(" Atleast one less than 50");
    
    // boolean isadult = false;
    // if(isadult ==true)
    // System.out.println("is adult");
    // else
    // System.out.println("not adult");

    // conditional statements
//     Scanner sc=new Scanner(System.in);
//     int cash = sc.nextInt();
//     if(cash <10){
//     System.out.println("cannot buy anything");
//     System.out.println("Get more Cash");

// }else if (cash <10){
//     System.out.println("can get 1 thing");
// }
// else{
//     System.out.println("can get both");

//Switch
 
// int day = 1;
// switch(day){
//     case 1 : 
//     System.out.println("monday");
//     break;
//     case 2:
//     System.out.println("tuesday");
//     break; 
//     default :
//     System.out.println("Wed = Sunday");
 

 //Loops

//    for(int i = 1; i <= 100 ; i = i+1){
//     System.out.println(i);
//    }



// While loop
// for(int i = 100; i >= 100 ; i = i-1){
//      System.out.println(i);
//     }
    // int j=100;
    // while(j >= 1){
    // System.out.println(j);
    // j = j-1;
    // }
    
    //Do While Loop

    // int k = 100;
    // do { 
    //  System.out.println(k);   
    // k = k -1 ;
    // } while(k>=1);
 
// Scanner sc = new Scanner(System.in);
// int number =0;
// do { 
// System.out.println("input a number");
// number = sc.nextInt();
// System.out.println("here is your number :");
// System.out.println(number);
// } while(number >= 0);
// System.out.println("the end");

//Break & Continue
// int i=0;
// while (true) { 
//     if(i== 3){
//         i = i +1;
//         continue;
//     }
//     System.out.println(i);
//     i = i+1;
//     if(i>5){
//         break;
//     }
// }

// Try - Catch in Exception Handling

// int[] marks = {97,98,95};
// try {
//     System.out.println(marks[5]);
// } catch (Exception exception) {
//     //do something after catching
// }

// System.out.println("The name is Batman");
//Example remote it does give additional or futher output

// Methods
// System.out.println("Hello Batman");
// System.out.println("Hello Batman");
// System.out.println("Hello Batman");
// System.out.println("Hello Batman");
//if want to do something again and again
public static void printJava(){
System.out.println("Hello Batman");
}
public static void printName(String name){
    System.out.println(name);
}
public static void printsum(int a , int b){
    int sum = a+b;
    System.out.println(sum);
}
    public static void main(String[] args) {
        printJava();
        printJava();
        printJava();
        printName("Batman");
        printName("Superman");
        printsum(7,10);
    }
}
