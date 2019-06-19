package com.jimmyyouhei.set;

import java.util.LinkedList;

public class SetLinkedList {

    // Linked List a base for the set
    LinkedList<Integer> mLinkedList = new LinkedList<>();

    // method to check if the set contain the element
    public boolean contains(int n){
        return mLinkedList.contains(n);
    }

    // add method if already present will throw Duplication Exception
    public void add(int n) throws DuplicationException{
        if (!mLinkedList.contains(n)){
            mLinkedList.add(n);
        } else {
            throw new DuplicationException(" this Item already have ");
        }
    }

    // method to remove the int
    public void remove (int n){
        mLinkedList.remove((Object)n);
    }

    // return the size of the set
    public int count (){
        return mLinkedList.size();
    }

    // print out all element
    public void print(){
        for (int n : mLinkedList){
            System.out.println(n);
        }
    }

    // union method of set and return a new set
    public static SetLinkedList union (SetLinkedList a , SetLinkedList b){
        SetLinkedList result = new SetLinkedList();


            for (int n : a.mLinkedList){
                try {
                    result.add(n);
                } catch (DuplicationException e){

                }

            }

            for (int m : b.mLinkedList){
                try {
                    result.add(m);
                } catch (DuplicationException e){

                }
            }

        return result;

    }

    // intersection method and return a new set
    public static SetLinkedList intersection(SetLinkedList a , SetLinkedList b){
        SetLinkedList result = new SetLinkedList();

        for (int n : a.mLinkedList){
            if (b.contains(n)){
                try {
                    result.add(n);
                } catch (DuplicationException e) {

                }
            }
        }

        return result;
    }

    // difference method and return an new set
    public static SetLinkedList difference(SetLinkedList a , SetLinkedList b){
        SetLinkedList result = new SetLinkedList();

        for (int m : a.mLinkedList){
            if (!b.contains(m)){
                try {
                    result.add(m);
                } catch (DuplicationException e) {

                }
            }
        }

        return result;
    }

    // Symmetric Difference method and return a new set
    public static SetLinkedList symmetricDifference (SetLinkedList a , SetLinkedList b){
        SetLinkedList result = new SetLinkedList();

        for (int n : a.mLinkedList){
            if (! b.contains(n)){
                try {
                    result.add(n);
                } catch (DuplicationException e) {
                    e.printStackTrace();
                }
            }
        }

        for (int m : b.mLinkedList){
            if (! a.contains(m)){
                try {
                    result.add(m);
                } catch (DuplicationException e) {
                    e.printStackTrace();
                }
            }
        }

        return result;

    }

}
