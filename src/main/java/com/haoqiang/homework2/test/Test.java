package com.haoqiang.homework2.test;

import com.haoqiang.homework2.parse.MainClassSon;

/**
 * @author Haoqiang Lyu
 * @date 2019-05-29 21:42
 */
public class Test {

    //not in the same package and not subclass
    public static void main(String[] args) {
        //System.out.println("privateName:" + MainClassSon.privateName);//error
        System.out.println("publicName:" + MainClassSon.publicName);
        //System.out.println("protectedName:" + MainClassSon.protectedName);//error
        //System.out.println("defaultName:" + MainClassSon.defaultName);//error
    }
}

