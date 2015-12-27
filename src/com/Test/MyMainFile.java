package com.Test;

public class MyMainFile {
    //Key word driven as its KEY words as methods .

    public static void main(String[] args) {

        MyMainFile myMainFile = new MyMainFile();
        myMainFile.myTestCase1();
        myMainFile.myTestCase2();
    }

    public void myTestCase1() {
        referencePage1 ReferencePage1 = new referencePage1();

        System.out.println("==myTestCase1==");
        ReferencePage1
                .myRefMethod1()//From ReferencePage1
                .myRefMethod2()//From ReferencePage1
                .myRefMethod3().myRef2Method1().myRef2Method2();//From ReferencePage2


    }

    public void myTestCase2() {
        referencePage1 ReferencePage1 = new referencePage1();
        System.out.println("\n==myTestCase2==");
        ReferencePage1
                .myRefMethod1()
                .myRefMethod2()
                .myRefMethod4()
                .myRefMethod3()//As the return type for method3 from Refpage1 is of type ref2 those methods will be displayed when you DOT for mymethod3
                .myRef2Method1().myRef2Method2();


    }

    public void myTestCase3() {

    }

    public void myTestCase4() {

    }

}
