package com.jimmyyouhei.set;

import java.util.DuplicateFormatFlagsException;
import java.util.LinkedList;
import java.util.Set;

public class SetLinkedList {

    LinkedList<Integer> mLinkedList = new LinkedList<>();

    public boolean contains(int n){
        return mLinkedList.contains(n);
    }

    public void add(int n) throws DuplicationException{
        if (!mLinkedList.contains(n)){
            mLinkedList.add(n);
        } else {
            throw new DuplicationException(" this Item already have ");
        }
    }

    public void remove (int n){
        mLinkedList.remove((Object)n);
    }

    public int count (){
        return mLinkedList.size();
    }

    public void print(){
        for (int n : mLinkedList){
            System.out.println(n);
        }
    }

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
