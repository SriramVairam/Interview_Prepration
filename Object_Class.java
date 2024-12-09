                                    //Object class is the base class of all java class

/*this are all the object class methods :
      toString()
      equals(Object obj)
      hashCode()
      getClass()
      clone()
      finalize()
      notify(), notifyAll(), wait()*/

class Solution{
    public static void main(String[] arg){
        Amma o1 = new Amma("sri",21);
    
        Ama o2 = new Ama("sri",21);   // to change Ama to Amma output is true
        
        System.out.println(o1.equals(o2));
    }
}
class Ama{
    String name;
    int Age;
    Ama(String name, int Age){
        this.name = name;
        this.Age = Age;
    }
}
class Amma{                         // every class is extend the Object class so is called as the base class Eg: class Amma extend Object{......}
    String name;
    int Age;
    Amma(String name, int Age){
        this.name = name;
        this.Age = Age;
    }
    public boolean equals(Object o2){
        if(this == o2) return true;
        if(o2 == null) return false;
        if(this.getClass() != o2.getClass()) return false;
        Amma e = (Amma)o2;
        if((this.name.equals(e.name))&&(this.Age == e.Age)) return true;
        return false;
    }
}
