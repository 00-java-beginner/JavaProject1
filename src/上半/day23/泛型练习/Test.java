package 上半.day23.泛型练习;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<bosiCat> list1 = new ArrayList<>();
        ArrayList<lihuaCat> list2 = new ArrayList<>();
        ArrayList<hashiqiDog> list3 = new ArrayList<>();
        ArrayList<taidiDog> list4 = new ArrayList<>();

        bosiCat bsc = new bosiCat("xiaobai",1);
        lihuaCat lihua = new lihuaCat("xiaohong",2);
        hashiqiDog hsq = new hashiqiDog("xiaoyang",3);
        taidiDog td = new taidiDog("xiaohuang",4);

        list1.add(bsc);
        list2.add(lihua);
        list3.add(hsq);
        list4.add(td);

        keepPet(list1);
        keepPet(list2);
        keepPet(list3);
        keepPet(list4);


    }
    //public static void keepPet(ArrayList<? extends Cat> list){}
    //public static void keepPet(ArrayList<? extends Dog> list){}
    public static void keepPet(ArrayList<? extends Animal> list){
        for (Animal animal : list) {
            System.out.println(list);
        }
    }
}
