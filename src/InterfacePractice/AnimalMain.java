package InterfacePractice;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();

        animals.add(new Sheep());
        animals.add(new Lion("yellow"));
        animals.add(new Sheep());
        animals.add(new Sheep());
        animals.add(new Sheep());
        animals.add(new Sheep());

        for(Animal a: animals){
            System.out.println(a.makeNoise());
            if(a instanceof Lion){
                Lion l = (Lion) a ;
                System.out.println("Says the" + l.getColor() + "lion");

            }
        }
    }
}
