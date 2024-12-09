/*Primitive data types: Assignment copies the value, creating two independent variables.
Reference data types: Assignment copies the reference, so both variables point to the same memory location (shared object).*/


class Solution{
    public static void main(String[] arg){
        Person p1 = new Person();
        p1.name = "Alice";

        Person p2 = p1;  // `p2` references the same object as `p1`
        p2.name = "Bob"; // Modifies the object through `p2`

        System.out.println(p1.name); // Output: Bob (change is reflected in `p1`)
    }
}
class Person {
    String name;
}

