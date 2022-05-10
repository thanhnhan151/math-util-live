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
// TA VIẾT CÁI CLASS ĐỂ CUNG CẤP CHO NƠI KHÁC XÀI
// KHI TA CUNG CẤP  TIỆN ÍCH CHO NƠI KHÁC XÀI, ĐÓ LÀ LÚC TA KO CẦN NHỚ CÁI GÌ
// CHO RIÊNG TA, HÀM STATIC GIÚP LÀM ĐIỂU NÀY
public class MathUtil {
    
    // n! = 1.2.3.4.5.6....n 
    // Quy ước: 0! = 1! = 1
    // Ko tính giai thừa cho số âm
    // 20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
    // 21! lố kiểu long
    // nếu đưa vào âm, 21 giai thừa, ta éo tính, ta đập vào mặt ai xài hàm
    // một cái ngoại lê, chửi éo tính đc
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20");
            // hàm dừng liền, éo cần return
        }
        
        // xuống đây là n = 0..20 rồi
        if  (n == 0 || n == 1) {
            return 1;
        }
        
        // xuống đến đây, n = 2..20 rồi
        // chơi for hoặc đệ quy - recursion
        // kĩ thuật nhồi con heo đất, ốc bu nhồi thịt
        // i = 2, i = 3, i = 4, i = 5, i = n nhồi i liên tục vào cái tích 
        long product = 1; // tích khởi đầu bằng 1, nhồi 2 3 4 5 6 7 8 .. n
        for (int i = 2; i <= n; i++) {
            product *= i; // nhồi liên tục product
        } // nhân từ 2 đến n 
        return product;
    }
    
}
