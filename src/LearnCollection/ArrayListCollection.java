package LearnCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListCollection {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Amit");
        names.add("Raja");
        names.add("Rani");
        names.add("Gudiya");
        names.add("Aadvik");

        System.out.println("Names:" +names);


        //Add the element at specific index
        names.add(1,"Mohan");
        System.out.println(names);


        List<String> names1 = new ArrayList<>();
        names1.addAll(names);

        System.out.println("Names1:" +names1);

        //Set the element at specific index
        names.set(0,"Raman");
        System.out.println(names);

        //Traverse using for each
        for (String str:
             names1) {
            System.out.println(str + "\t" +str.length());

            System.out.println(str.toLowerCase());
        }

        //Traverse using iterator
        Iterator<String> itr = names1.iterator();
        while (itr.hasNext())
        {
            String next = itr.next();
            System.out.println("Next:" +next);
        }

        //Remove
        names1.remove(0);
        System.out.println(names1);

        // Size
        System.out.println("Size is:" +names1.size());

        //Traverse backward
        ListIterator<String> listIterator = names1.listIterator(names1.size());
        while (listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }


        ArrayList list = new ArrayList();
        list.add("Amit");
        list.add(101);
        list.add(101.234);
        list.add('A');

        System.out.println("Non Type safe list:" +list);


        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(12);
        num.add(6);
        num.add(9);
        num.add(7);

        System.out.println(num);
    }
}
