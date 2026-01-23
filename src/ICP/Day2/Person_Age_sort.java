package ICP.Day2;


import java.util.Arrays;
import java.util.Comparator;

class Person implements Comparable<Pers> {
    String name;
    int age;
    int height;

    public Person(int age, int height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    @Override
    public String toString(){
        return "[name = "+name +", height = "+height+", age = "+age+"]";
    }

    @Override
    public int compareTo(Pers Other){
        if(this.height < Other.height) return 1;
        else if (this.height > Other.height) {
            return -1;
        }
        else return 0;
    }
}

class MyComparator implements Comparator<Pers>{
    @Override
    public int compare(Pers o1, Pers o2){
        if(o1.height < o2.height) return -1;
        else if (o1.height > o2.height) {
            return 1;
        }
        else return 0;
    }
}
public class Person_Age_sort {

    public static void main(String[] args) {
        Pers[] arr = new Pers[4];
        arr[0] = new Pers(52, 72, "a");
        arr[1] = new Pers(51, 75, "b");
        arr[2] = new Pers(50, 70, "c");
        arr[3] = new Pers(55, 71, "d");
        Arrays.sort(arr, new MyComparator());
        for (Pers person : arr) {
            System.out.println(person.toString());
        }
    }
}
