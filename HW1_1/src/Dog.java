

public class Dog extends Animal{

    Dog(int id) {
        super(id);
    }

    public void run(int id, int rndDistance){
        if (rndDistance>500)
            System.out.print("Пес "+id+" смог пробежать " +rndDistance+" м и больше не может.");
        else System.out.print("пес"+id+" смог пробежать " +rndDistance+" м.");
    }

    public void swim(int id, int rndDistance){

        if (rndDistance>10)
            System.out.println("Пес "+id+" смог проплыть " +rndDistance+" м и больше не может.");
        else System.out.println("Пес "+id+" смог проплыть " +rndDistance+" м.");
    }
}
