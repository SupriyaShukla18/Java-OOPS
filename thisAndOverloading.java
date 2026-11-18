public class thisAndOverloading {
    public static void main(String[] args) {

        Student s1=new Student("sid");
        Student s2= new Student("sam",19);
         Student s3= new Student("Supriya",22,78);

         System.out.println(s1.age);

           }
}

class Student{
    String name;
    int age;
    int rollNo;

    Student(){

    }

    Student(String name){
        this("unknown" ,0,0 );

    }
    Student(String name,int age)
    {
        this("unknown",0,0);
    }
    
    Student(String name, int age, int rollNo){
     this.name=name;
     this.age= age;//here 'this'  refers the current object
     this.rollNo=rollNo;
   
    }

}
