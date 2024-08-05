package Non_primitive_typecasting.upcasting;

public class User {
    
    public static void main(String[] args) {

        //Implicitly typecasting

       // One type
        Student s=new Student();
        Employee e=new Employee();
        //System.out.println(s);
        //System.out.println(e);
        s=e;
        System.out.println(s);
        

        /*Second type
        Student s=new Student();
        s=new Employee();
        System.out.println(s);
        */

        /*Third type
        Employee e=new Employee();
        Student s=e;
        System.out.println(s);
        */


        //Explicitly typecasting
        /*Student s=new Student();
        Employee e=new Employee();
        s=(Student)e;
        System.out.println(s);
        //System.out.println(s instanceof Employee);
        
        //Here child class access the properties of parrent class.
        System.out.println(e.name);

        /*Here parent class can not access the properties of child class
        even we store the address of child into parent , this is the disadvantage of upcasting.*/
        //System.out.println(s.name1);*/



    }
}
