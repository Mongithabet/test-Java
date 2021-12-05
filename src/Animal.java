  class Animal {


    static class Dog extends Animal{
    String name;
      Dog(String name){
    this.name=name;
      }
    String getName(){
          return name;
    }
}
static class Cat extends Animal {
    protected Dog dog;
    String name;
    Cat(String name){
        this.name=name;
        dog=new Dog(name);
    }
}
static class Application{
     static String getAnimalName(Animal a){
        String name = null;
        if(a instanceof Dog){
            name = ((Dog) a).getName();
        }else if (a instanceof Cat){
            name=((Cat)a).dog.getName();
        }
        return name;
    }
}


    public static void main(String[] args)
    {
 Dog sammy =new Dog("Sammy");
        Cat smoky =new Cat("Smoky");
        System.out.println(Application.getAnimalName(sammy));
        System.out.println(Application.getAnimalName(smoky));
        System.out.println("");

    }
}
