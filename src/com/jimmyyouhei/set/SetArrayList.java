package com.jimmyyouhei.set;

import java.util.ArrayList;
import java.util.Iterator;

public class SetArrayList {

    ArrayList<Integer> mArrayList = new ArrayList<>();

    // method to check if the set contain the int
    public  boolean contain (int n){
        return mArrayList.contains(n);
    }

    // add method if already present will throw Duplication Exception
    public void add(int n) throws DuplicationException{

        if (!mArrayList.contains(n)){
            mArrayList.add(n);
        } else{
            throw new DuplicationException("already have");
        }
    }

    // method to remove the int . Because the arraylist remove method is unreliable iterator is used
    public void remove (int n){

        Iterator<Integer> iterator = mArrayList.iterator();

        while (iterator.hasNext()){
            int temp = iterator.next();
            if (temp == n){
                iterator.remove();
            }
        }
    }

    // return the size of the set
    public int count () {
        return mArrayList.size();
    }


    // print out all element
    public void print(){
        for (int n: mArrayList){
            System.out.println(n);
        }
    }

    // union method of set and return a new set
    public static SetArrayList union (SetArrayList a , SetArrayList b){
        SetArrayList result = new SetArrayList();

        for (int n : a.mArrayList){
            try {
                result.add(n);
            } catch (DuplicationException e) {

            }
        }

        for (int m : b.mArrayList){
            try {
                result.add(m);
            } catch (DuplicationException e) {

            }
        }

        return result;
    }

    // intersection method and return a new set
    public static SetArrayList intersection (SetArrayList a , SetArrayList b){
        SetArrayList result = new SetArrayList();

        for (int n : a.mArrayList){
            if (b.contain(n)){
                try {
                    result.add(n);
                } catch (DuplicationException e) {

                }
            }
        }

        return result;

    }

    // difference method and return an new set
    public static SetArrayList difference(SetArrayList a , SetArrayList b){
        SetArrayList result = new SetArrayList();

        for (int n : a.mArrayList){
            if (!b.contain(n)){
                try {
                    result.add(n);
                } catch (DuplicationException e) {

                }
            }
        }

        return result;
    }

    // Symmetric Difference method and return a new set
    public static SetArrayList symmetricDifference (SetArrayList a , SetArrayList b){
        SetArrayList result = new SetArrayList();

        for (int n : a.mArrayList){
            if (!b.contain(n)){
                try {
                    result.add(n);
                } catch (DuplicationException e) {

                }
            }
        }

        for (int m : b.mArrayList){
            if (!a.contain(m)){
                try {
                    result.add(m);
                } catch (DuplicationException e) {

                }
            }
        }

        return result;

    }

}
