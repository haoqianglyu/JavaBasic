package com.haoqiang.homework2.parse;

/**
 * @author Haoqiang Lyu
 * @date 2019-05-29 21:39
 */
public class MainClassSon extends MainClass{

    public static void main(String[] args) {
        //System.out.println("privateName:" + MainClassSon.privateName);//error
        System.out.println("publicName:" + MainClassSon.publicName);
        System.out.println("protectedName:" + MainClassSon.protectedName);
        System.out.println("defaultName:" + MainClassSon.defaultName);
    }
}
