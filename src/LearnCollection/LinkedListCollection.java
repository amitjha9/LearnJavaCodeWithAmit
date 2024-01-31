package LearnCollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection {

    public static void main(String[] args) {


        List<Integer> num = new LinkedList<>();
        num.add(10);
        num.add(12);
        num.add(5);
        num.add(34);
        num.add(25);

        System.out.println(num);

        //Add at specific index
        num.add(1,90);
        System.out.println(num);

        num.remove(2);
        System.out.println(num);


        //Traverse
        Iterator<Integer> itr = num.iterator();
        while (itr.hasNext())
        {
            int n = itr.next();
            System.out.println("Num:" +n);
        }
    }
}
