// ENCASPULATION

class Area {
int length;
int breadth;
Area(int length, int breadth) {
this.length = length;
this.breadth = breadth;
}
public void getArea() {
int area = length * breadth;
System.out.println("Area: "+ area);
}
}
class Main {
    
     public static void main(String[] args) {
       
        Area rectangle = new Area (length:5, breadth:6);
        rectangle.getArea();
        }
}





//inheritanceee
// Superclass
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}





// abstractionnnnn

abstract class shape{
   public abstract void draw();
}
class circle extends shape{
    @override
   public void draw(){
        System.out.println("Draw circle");
    }
}




// POLYMORPHISM




