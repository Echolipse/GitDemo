package test;

import java.util.HashMap;
import java.util.Objects;

public class Test {

    public static void main(String[] args) {
        String userName="XXX";
        String userProvince="上海";
        int userAge=21;
        String userSex="男";
        String userInfo=String.format("%s , %s ,%s ,%s",userName,userProvince,userAge,userSex);
        System.out.println(userInfo);
    }



}
