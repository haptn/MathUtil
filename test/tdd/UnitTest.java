/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static util.MathUtil.computeFactorial;

/**
 *
 * @author PC
 */
public class UnitTest 
{
    // Đây là class truyền thống, dùng để test code chính của mình ở bên MathUtil.
    // Nhưng ở đây ta ko xài sout() nữa mà dùng màu sắc xanh-đỏ.
    // Class này chứa rất nhiều hàm main(). Muốn có hàm bk trong này thành main(),
    // bạn chỉ việc xài annotation @Test. JVM sẽ tự động hiểu hàm này là main() và
    // Shift F6 chạy từ đó nếu có nhiều @Test tức là nhiều main() trong này.
    // Các main() sẽ chạy tuần tự theo mặc định từ trên xuống.
    
    @Test   
    // Hàm main() này dùng để test các tình huống hàm cF() nhận đúng tham số
    // và máy phải chạy đúng kì vọng
    public void testSuccessfulCases() {
//        assertEquals(120, 720);

        // Câu dưới có nghĩa: Hy vọng trả về 5! = 120. Nếu ko như thế thì màu đỏ nha bạn.
        assertEquals(120, util.MathUtil.computeFactorial(5));
        // Câu dưới có nghĩa: Hy vọng trả về 6! = 720. Nếu ko như thế thì màu đỏ nha bạn.
        assertEquals(720, util.MathUtil.computeFactorial(6));
        
        // Hy vọng 0! = 1
        assertEquals(1, util.MathUtil.computeFactorial(0));
        // Hy vọng 1! = 1
        assertEquals(1, util.MathUtil.computeFactorial(1));
        
        // Xanh chỉ xảy ra khi tất cả đều xanh, hàm ý hàm chạy đúng kì vọng mọi tr.hợp.
        // Đỏ xảy ra chỉ cần 1 thằng đỏ trong cả đám xanh.
        // Hàm ý: Máy xanh gần hết, còn vài cases màu đỏ.
        // Chứng tỏ xử lý hàm ko tốt, ko chạy tốt cho mọi tr.hợp.
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testFailedCases() {
        computeFactorial(-5);
        computeFactorial(16);
        // Hàm này dùng để test các tình huống cà chớn đến từ người dùng.
        // VD users muốn tính -5! thì ko cho phép.
        // Khi đó, trong thiết kế của hàm cF(), ta phải dự liệu tình huống cà 
        // chớn này, tức là users đưa data cà chớn vào thì mình ném ra ngoại lệ
        // chứ ko xử lý.
        // => cF(-5) phải trả về ngoại lệ
        // Và ngoài lệ là 1 thứ bất thường, ko như dự tính, ko phải là 1 loại
        // value có thể so sánh, tức là ko thể assertEquals(một-cái-ngoại-lệ).
        // Vì trong tiếng Anh, "assert()" có nghĩa là so sánh 2 thứ gì đó, tức là
        // phải có value để so. Mà ngoại lệ Exception thì ko phải là value.
        // => Ta phải dùng chiêu!
    }
    
    // Dù code bạn viết có đỏ hay xanh thì miễn cứ ko bị lỗi cú pháp khi gõ hoặc
    // lỗi import thì Clean & Build LUÔN RA ĐC FILE .JAR / .WAR.
    // Lý do là thằng Clean & Build nó chỉ kiểm tra code ko sai cú pháp thôi chứ
    // nó ko care code có sai logic xử lý hay ko.
    
    // MÌNH CHƠI LỚN:
    // Nếu code đang ĐỎ, ko phải xanh --> CẤM Clean & Build để đảm bảo là code phải
    // chạy đúng (màu xanh) cho các tình huống xải thử qua assert() tức là đúng 
    // về xử lý thì mới cho ra file .JAR / .WAR.
    // Tức là đèn xanh thì thông đường.
    // Đỏ -> Vịn lại, ko cho xuất ra .JAR / .WAR.
    // Please, nhớ 2 con số:
    // NetBeans 8.x: 1005 (số dòng để thêm cái "test")
    // NetBeans 10 trở lên: 1204 (số dòng để thêm cái "test")
    // <target depends="init,compile,test,-pre-pre-jar,-pre-jar,-do-jar-create-manifest,-do-jar-copy-manifest,-do-jar-set-mainclass,-do-jar-set-profile,-do-jar-set-splashscreen" if="do.archive" name="-do-jar-jar" unless="do.mkdist">
}