import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> listAnimals=new ArrayList <Animal>();
        Dog[] arrDogs =new Dog[(int)(Math.random()*(2+1))+1];
        for(var i=0; i<arrDogs.length;i++){
            arrDogs[i]=new Dog(i+1);
            listAnimals.add(arrDogs[i]);
        }
        Cat [] arrCats=new Cat[(int)(Math.random()*(2+1))+1];
        for(var i=0; i<arrCats.length;i++){
            arrCats[i]=new Cat(i+1);
            listAnimals.add(arrCats[i]);
        }
        Tiger[] arrTigers=new Tiger[(int)(Math.random()*(2+1))+1];
        for(var i=0; i<arrTigers.length;i++){
            arrTigers[i]=new Tiger(i+1);
            listAnimals.add(arrTigers[i]);
        }

        for (var a:listAnimals){

            a.run(a.id,(int)(Math.random()*(999+1))+1);
            a.swim(a.id,(int)(Math.random()*(999+1))+1);

        }
        System.out.println("Количество котов в соревновании: "+arrDogs.length);
        System.out.println("Количество псов в соревновании:  "+arrCats.length);
        System.out.println("Количество тигров в соревновании: "+arrTigers.length);

    }
}