/* The difference is that after overriding, when speak is called,
it prints out "My name is The Mighty Parrot" instead of just "My name is Parrot"
as speak is calling and using what the overriden getName() returned*/
/*Bird b2 = new Animal(...); didn't work because Bird is not the superclass of Animal
(the Animal is-a Bird relationship is not true). Animal a2 = new Bird(...); worked because Animal is
the superclass of Bird, thus Bird is-a Animal and you can store bird in an animal*/
public class Driver{
    public static void main(String[] args){
      Animal water = new Animal("splash", 12, "Water");
      water.speak();
  
      Bird parrot = new Bird("squawk", 12, "Parrot", 1.5, "red");
      parrot.speak();
  
      Animal a1 = new Animal("swish", 190, "jellyfish");
      Bird b1 = new Bird("quack", 10, "duck", 2, "white");
    //  Bird b2 = new Animal("swish", 190, "jellyfish");
      Animal a2 = new Bird("quack", 10, "duck", 2, "white");
      a1.speak();
      a2.speak();
      b1.speak();
    }
  }