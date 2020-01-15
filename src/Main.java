import ZooSimulator.*;

public class Main {

    public static void main(String[] args) {
      /*  Animal tiger = new Tiger();
        Animal koala = new Koala();
        Animal lion = new Lion();
        Animal rabbit = new Rabbit();
        Animal horse = new Horse();
        Animal zebra = new Zebra();
        ZooKeeper zooKeeper = new ZooKeeper();
        Show show = new Show();

       zooKeeper.feed(tiger);
       zooKeeper.feed(koala);
       zooKeeper.feed(lion);
       zooKeeper.feed(rabbit);
       zooKeeper.feed(horse);
       zooKeeper.feed(zebra);

       show.showTime(tiger);
       show.showTime(koala);
       show.showTime(lion);
       show.showTime(rabbit);
       show.showTime(horse);
       show.showTime(zebra);

       Commented as changes were made to the below code.*/

      Animal[] animals = new Animal[6];
      animals[0]=new Horse();
      animals[1]=new Koala();
      animals[2]=new Lion();
      animals[3]=new Rabbit();
      animals[4]=new Tiger();
      animals[5]=new Zebra();

        ZooKeeper zooKeeper = new ZooKeeper();
        Show show = new Show();

        zooKeeper.feed(animals);
        System.out.println("\n\n\n\n");
        show.showTime(animals);
    }
}
