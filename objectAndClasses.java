public class objectAndClasses{
    public static void main(String[] args)
    {
      Student st1= new Student();//st1 is not object it is the referral variable and this statement used to create object the heap memory
      Student st2=new Student();// new keyword is dynamic memory locator & create object it create the object while running(dynamic)
       st1.name="supriya";//.=>for fetching the data from object or for naming them 
       st1.roll_no=11;
       st1.age=22;
       st1.college="MDU";

       st2.name="sidhi";
       st2.roll_no=13;
       st2.age=24;
       st2.college="MDU";
       
       st1.markMyAttendence();
       st2.markMyAttendence();

       st1.print();
       st2.print();



    }
}

 class Student{
    //these all are the characters of the object
    String name;
     int roll_no;
     int age;
     String college;

// these are the behaviour of the object
      void markMyAttendence(){
        System.out.println("my attendence has been marked "+ name);
     }
     void print(){
        System.out.println(" name " +name+ " roll_no " +roll_no+ " age " +age+ " college "+ college );

     }

}