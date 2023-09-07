


public class Cat extends Animal {

    Cat(int id) {
        super (id);
    }

    public void run(int id, int rndDistance){

        if (rndDistance>200)
            System.out.print("Кот "+id+" смог пробежать " +rndDistance+" м и больше не может.");
        else System.out.print("Кот "+id+"  смог пробежать " +rndDistance+" м.");
    }

    public void swim (int id, int rndDistance){
        System.out.println("Кот "+id+" не смог проплыть " + rndDistance +" м. Он не умеет плавать.");
    }
}
