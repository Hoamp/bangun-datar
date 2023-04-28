/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

/**
 *
 * @author Asus
 */
public class MyClass implements MyInterface, MyInterface2{
    @Override
    public void myMethod1(){
        System.out.println("Hewwo world");
    }
    
    @Override
    public void myMethod2(){
        System.out.println("Hewwo tok");
    }
    
    // dari myinterface2
    public void myMethod3(){
        System.out.println("Hewwo java");
    }
}
