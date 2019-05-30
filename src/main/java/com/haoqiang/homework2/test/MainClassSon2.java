package com.haoqiang.homework2.test;

import com.haoqiang.homework2.parse.MainClass;
import com.haoqiang.homework2.parse.MainClassSon;

/**
 * @author Haoqiang Lyu
 * @date 2019-05-29 21:41
 */
public class MainClassSon2 extends MainClass {

    public static void main(String[] args) {
        //System.out.println("privateName:" + MainClassSon.privateName);//error
        System.out.println("publicName:" + MainClassSon.publicName);
        System.out.println("protectedName:" + MainClassSon.protectedName);
        //System.out.println("defaultName:" + MainClassSon.defaultName);//error
    }
}