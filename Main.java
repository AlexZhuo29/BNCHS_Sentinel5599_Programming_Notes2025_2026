public class Main
{
    public static void main(String[] args) {
        // the constructor is used in order to create objects 
        Student person1 = new Student("Tasnim", 4.0, 11);
        System.out.println(person1.getName());
        
        Student person2 = new Student("Alex", 1.0, 12);
        System.out.println(person2.getName());
        
        // get method to return the value because the fields are priate, so it can't be accessed directy
        System.out.println(person2.getGpa());
        
        // the doubleGPA always the field to be updated 
        person2.doubleGPA();
        System.out.println(person2.getGpa());

        // Have the same guidance consoler even though the method is ran on different objects
        System.out.println(person1.getGC());
        System.out.println(person2.getGC());
    }
}
