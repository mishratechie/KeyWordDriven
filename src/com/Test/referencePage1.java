package com.Test;

public class referencePage1 {

    referencePage2 ReferencePage2 = new referencePage2();

    public referencePage1 myRefMethod1() {
        System.out.println("\nreferencePage1 : myRefMethod1");
        return this;
    }

    public referencePage1 myRefMethod2() {
        System.out.println("referencePage1 : myRefMethod2");
        return this;
    }

    public referencePage2 myRefMethod3() {
        System.out.println("referencePage1 : myRefMethod3");

        //return ReferencePage2;
        //OR
        return new referencePage2();
    }

    public referencePage1 myRefMethod4() {
        System.out.println("referencePage1: myRefMethod4");
        return this;
    }


}
