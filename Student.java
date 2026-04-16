public class Student {
    // classes are objects
    // objects are instances of a class

    // Attributes/fields - each object has their own versions of each instance variables and fields
    private String name;
    private double gpa;
    private int grade;

    // this is a static field, sp it belngs to the class and any objectcan call it
    private static String guidanceCon = "Allred";
    
    // constructor - used to create objects, it will initalize instance variables
    public Student(String Name, double Gpa, int Grade) {
        name = Name;
        gpa = Gpa;
        grade = Grade;
    }
    
    // Behaviors
    // these methods return the values to the instance variables of each object. 
    // object.field could be used when the instance variables are not private
    public String getName() {
        return name;
    }
    
    public double getGpa() {
        return gpa;    
    }
    
    // methods can also be used to update instance variables after initalizing them through the constructor 
    public void updateGPA(double g) {
        gpa = g;
    }

    // this keyword -  used within a method, it will represent the object that you are calling this method on
    public void doubleGPA() {
        this.updateGPA(getGpa()*2.0);
    }
    
    public String getGC() {
        return guidanceCon;
    }
}