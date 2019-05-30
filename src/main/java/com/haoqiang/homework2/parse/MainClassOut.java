package com.haoqiang.homework2.parse;

/**
 * @author Haoqiang Lyu
 * @date 2019-05-29 21:37
 */
public class MainClassOut {
    //this is out of the main class but in the same package,
    //so we cant use the private but can use the protected and public attributes.
    public static void main(String[] args) {
        //System.out.println("privateName:" + MainClass.privateName);//error
        System.out.println("publicName:" + MainClass.publicName);
        System.out.println("protectedName:" + MainClass.protectedName);
        System.out.println("defaultName:" + MainClass.defaultName);
    }
}
