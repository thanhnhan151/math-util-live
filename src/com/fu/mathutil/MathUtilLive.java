/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author Admin
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        long result = MathUtil.getFactorial(5);

        System.out.println("expected: 5! = 120; actual: " + result);

//        MathUtil.getFactorial(-5); // ném ngoại lệ thật rồi, ai biểu cà chớn chi
        System.out.println("expected: 6! = 720; actual: " + MathUtil.getFactorial(6));

        System.out.println("expected: 0! = 1;   actual: " + MathUtil.getFactorial(0));
        // THÊM CODE SAU LẦN ĐẦU LÀM CHUYỆN ẤY - CODE LÊN SERVER 1:13AM 11/05/2021
        
        System.out.println("expected: 1! = 1;   actual: " + MathUtil.getFactorial(1));
        System.out.println("expected: 3! = 6;   actual: " + MathUtil.getFactorial(3));
        // kĩ thuật kiểm thử phần mềm: ước lượng xem giá trị trả về của hàm là gì 
        // expected value: 5! = 120
        // mày/hàm ai đó viết khi chạy thực tế là mấy - actual, giả sử là 120
        // if expected = actual, hàm ngon trong tình huống này
    }
}
