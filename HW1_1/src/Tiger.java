


public class Tiger extends Animal {

    Tiger(int id) {
        super (id);
    }

    public void run(int id, int rndDistance){
        if (rndDistance>800)
            System.out.print("Тигр " + id+" смог пробежать " +rndDistance+" м и больше не может.");
        else System.out.print("Тигр "+id+" смог пробежать " +rndDistance+" м.");
    }

    public void swim(int id,int rndDistance ){
        if (rndDistance>600)
            System.out.println("Тигр " + id+" смог проплыть " +rndDistance+" м и больше не может.");
        else System.out.println("Тигр "+id+" смог проплыть " +rndDistance+" м.");
    }
}
