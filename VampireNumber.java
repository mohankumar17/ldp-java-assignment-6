package com.java.assignments.assignment6;

public class VampireNumber {
    public boolean isVampire(String strVal){
        int n=strVal.length();
        if(strVal.charAt((n/2)-1) =='0' || strVal.charAt(n-1) == '0'){
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        VampireNumber ob=new VampireNumber();
        int count=1,val=10;
        while(count<100){
            String strVal=Integer.toString(val);
            if(strVal.length()%2==0 && ob.isVampire(strVal)){
                System.out.println(val);
                count++;
            }
            val++;
        }
    }
}
