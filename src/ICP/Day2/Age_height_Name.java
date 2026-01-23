package ICP.Day2;

import java.util.Arrays;
import java.util.Comparator;

class Pers implements Comparable<Pers> {
    String name;
    int age;
    int height;

    public Pers(int age, int height, String name) {
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
        if(this.age < Other.age) return 1;
        else if (this.age > Other.age) {
            return -1;
        }
        else {
            if(this.height < Other.height) return 1;
            else if (this.height > Other.height) {
                return -1;
            }
            else {
                return Other.name.compareTo(this.name);
            }
        }
    }
}

class My_Comparator implements Comparator<Pers> {
    @Override
    public int compare(Pers o1, Pers o2){
        if(o1.height < o2.height) return -1;
        else if (o1.height > o2.height) {
            return 1;
        }
        else return 0;
    }
}
public class Age_height_Name {
    public static void main(String[] args) {
        Pers[] arr = new Pers[8];
        arr[0] = new Pers(50, 72, "a");
        arr[1] = new Pers(50, 72, "b");
        arr[2] = new Pers(50, 72, "c");
        arr[3] = new Pers(50, 71, "d");
        arr[4] = new Pers(52, 71, "d");
        arr[5] = new Pers(52, 74, "d");
        arr[6] = new Pers(53, 75, "d");
        arr[7] = new Pers(55, 72, "d");
        Arrays.sort(arr);
        for (Pers person : arr) {
            System.out.println(person.toString());
        }
    }
}
