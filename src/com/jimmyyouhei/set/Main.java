package com.jimmyyouhei.set;


public class Main {

    public static void main(String[] args) {

        SetArrayList test = new SetArrayList();
        SetArrayList test1 = new SetArrayList();

        try {
            test.add(1);
            test.add(2);
            test.add(3);

            test1.add(2);
            test1.add(3);
            test1.add(4);
        } catch (DuplicationException e){
           e.printStackTrace();
        }


        SetArrayList test2 = SetArrayList.union(test,test1);

        test2.print();

    }
}
