package com.haoqiang.homework2.parse;

/**
 * @author Haoqiang Lyu
 * @date 2019-05-29 21:23
 */

public class MainClass {

    private static String privateName = "privateName";

    public static String publicName = "publicName";

    protected static String protectedName = "protectedName";

    static String defaultName = "defaultName";

    //this method is in the MainClass，so it can use all the attribute
    public static void main(String[] args) {
        System.out.println("privateName:" + privateName);
        System.out.println("publicName:" + publicName);
        System.out.println("protectedName:" + protectedName);
        System.out.println("defaultName:" + defaultName);
    }
}
