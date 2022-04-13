package com.java.assignments.assignment6;

import java.util.ArrayList;

public class TuneConstructor {
    private int val;
    private String str;
    public TuneConstructor(int val){
        this.val=val;
    }
    public TuneConstructor(String str){
        TuneConstructor ob= new TuneConstructor(4);
        this.str=str;
        System.out.println(this.str);
    }

    public static void main(String args[]){
        ArrayList<TuneConstructor> obList=new ArrayList<>();
        obList.add(new TuneConstructor("Hello"));
        obList.add(new TuneConstructor("World"));
    }
}
