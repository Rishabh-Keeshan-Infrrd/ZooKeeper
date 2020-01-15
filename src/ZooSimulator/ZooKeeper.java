package ZooSimulator;

public class ZooKeeper {
    public void feed(Animal[] animals){
        for (Animal animal:animals) {
            animal.eat();
        }
    }
}
