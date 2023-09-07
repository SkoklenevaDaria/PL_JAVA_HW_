


abstract class Animal {

    public int id;

    Animal(int id) {
        this.id=id;
    }
    abstract void run(int id, int rndDistance);

    abstract void swim(int id,int rndDistance);
}
