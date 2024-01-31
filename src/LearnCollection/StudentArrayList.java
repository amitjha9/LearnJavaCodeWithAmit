package LearnCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayList {

    int roll;
    String name;
    String address;
    StudentArrayList(int rollNo, String stdName, String stdAddress)
    {
        roll = rollNo;
        name = stdName;
        address = stdAddress;
    }

    public static void main(String[] args) {

        StudentArrayList std1 = new StudentArrayList(10,"Amit","Bangalore");
        StudentArrayList std2 = new StudentArrayList(20,"Gudiya","Bangalore");
        StudentArrayList std3 = new StudentArrayList(30,"Aadvik","Bangalore");

        ArrayList<StudentArrayList> list = new ArrayList<>();
        list.add(std1);
        ArrayList<StudentArrayList> list2 = new ArrayList<>();
        list2.add(std2);
        ArrayList<StudentArrayList> list3 = new ArrayList<>();
        list3.add(std3);

        //Traverse
        Iterator<StudentArrayList> itr = list.iterator();
        while (itr.hasNext())
        {
            StudentArrayList st = itr.next();
            System.out.println("RollNo:" +st.roll + " Name:" +st.name + " Address:" + st.address);
        }

    }
}
