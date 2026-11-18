// public class constructorChaining_overloading_this {
//  public static void  main(String[] args)   
//  {
//     Student s1= new Student();
//   //int age=14 -->local variable-->stored in stack,does not hasve default values
    //default constructor
  
//   //default value 

//    System.out.println(s1.name);//null
//    System.out.println(s1.age);//0
//    System.out.println(s1.rollNo);//0


//    // for every time whenever i need the value from roll no and all i have to create the object and assign the value by .(s1.rollNo)
//    //so for this the constructor has been introduced



//  }
// }
// /*
// for Default vlaues-->has default values
// Integer-->0
// floating-->0.0
// Boolean-->false
// String-->null(nothing)
//  */



// class Student{
//     String name;//info/data/characteristics-->instance variable
//     int age;
//     int rollNo;

//     void print()//behaviour-->instance method
//     {
//         System.out.println();
//     }
    
// }
//Rules of constructor
//1. same name as class
//2.no return type not even void
//3.automatically called during object creation 
//4. used to intilalised an object
//5. it can also be overlaoded


public  class constructorChaining_overloading_this{
    public static void main(String[] args) {
       // Student s1= new Student("supriya",22,22,"IIT");//parameters
          

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNo);
        System.out.println(s1.college);
        
    }
}

// class Student{
//     String name;
//     int age;
//     int rollNo;
//     String college;

    // Student(){
    //     name="supriya";
    //     age=22;
    //     rollNo=22;
    //     college="IIT";


    // }


    // Student(String s,int a, int r, String c){
    //     name= s;
    //     age=a;
    //     rollNo=r;
    //     college=c;




    // }
//}

   

