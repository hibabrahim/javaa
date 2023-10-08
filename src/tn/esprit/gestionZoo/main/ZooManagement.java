public class ZooManagement {
    public static void main(String[] args) {

        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setIsMammal(true);

        Zoo myZoo = new Zoo();
        myZoo.setName( "Wildlife Park");
        myZoo.setCity("Ariana");
        myZoo.setAnimals(new Animal[25]);


        Animal dog = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();
        System.out.println(myZoo.isZooFull());

        Zoo zoo1 = new Zoo();
        zoo1.setName("Wildlife Park");
        zoo1.setCity( "tunis");
        zoo1.setAnimals(new Animal[25]);
        System.out.println(zoo1.addAnimal(lion));
        System.out.println(zoo1.addAnimal(lion));

        System.out.println(Zoo.comparerZoo(zoo1,myZoo));






    }
}
