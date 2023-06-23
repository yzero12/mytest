package com.yzero.java.test;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: MyMethod
 * Package: com.yzero.java.test
 * Description:
 *
 * @author zjzstart
 * @create 2023-06-23 19:23
 */
public class MyCustomMethod {

    public static void getRepeatCharNum(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            if (map.get(aChar) != null) {
                map.put(aChar, map.get(aChar) + 1);
            } else {
                map.put(aChar, 1);
            }
        }
        map.forEach((c, i) -> {
            System.out.println(c + "的重复个数:" + i);
        });
    }

}
