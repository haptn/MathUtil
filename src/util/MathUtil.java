/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Vu Quoc Hung
 */
//Đây là class chứa các hàm để tính toán toán học dùng chung làm tiện ích
//cho các nơi khác sử dụng. Phàm cái gì mà mang tính chất xài chung
//int tối đa 2 ty 1, => xài long nhưng tối đa 15!
public class MathUtil {
    
    public static long computeFactorial(int n) {
        if (n < 0 || n > 15)
            throw new IllegalArgumentException("Invalid argument. n must be >= 0 and <= 15.");
        long rs = 1;
        for (int i = 1; i <= n; i++) {
            rs *= i;
        }
        return rs;
    }
}