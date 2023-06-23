package com.yzero.java.utils;

/**
 * ClassName: Numbers
 * Package: com.yzero.java.utils
 * Description:
 *
 * @author zjzstart
 * @create 2023-06-07 9:33
 */

/**
 * 数字计算工具类
 */
public class Numbers {

    /**
     * 计算多个整数（integer）之和
     *
     * @param integers
     * @return
     */
    public static Integer sum(Integer... integers) {
        Integer sum = 0;
        for (Integer integer : integers) {
            sum += integer;
        }
        return sum;
    }

    /**
     * 返回多个整数（integer）中的最大值
     *
     * @param integers
     * @return
     */
    public static Integer max(Integer... integers) {
        Integer max = 0;
        for (Integer integer : integers) {
            if (max < integer) {
                max = integer;
            }
        }
        return max;
    }


}
