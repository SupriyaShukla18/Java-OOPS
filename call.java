// //call by value
 import java.util.*;
// public class call {
//     public static void main(String[] args)
//     {
//         int a= 10;
//         int b=23;
//       System.out.println(a +" "+b);
//         add(a,b);
// System.out.println(a+" "+b);

//     }

//     public static void add(int a,int b){
//         a=a+10;
//         b=b+10;
       
    


//     }
    
//}

//call by refernce

public class call{
    public static void main(String[] args)
    {
        Random r1= new Random(10,20);
        System.out.println(r1.a+" "+r1.b);

        add(r1);
        System.out.println(r1.a+" "+r1.b);
    }
    public static void add(Random r)
    {
    r.a+=10;
    r.b+=10;
    }
}

class Random{
    int a;
    int b;
 Random(int a,int b)
 {
    this.a=a;
    this.b=b;
 }


}
