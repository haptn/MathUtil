/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package mathutil;

import static util.MathUtil.computeFactorial; //import hàm static 

/**
 *
 * @author Vu Quoc Hung
 */
public class MathUtilMain {
   
    public static void main(String[] args) 
    {
        // 5! hy vọng máy sẽ in ra 120
        System.out.println("5! = " + computeFactorial(5));
        
        // 6! hy vọng (expected) máy sẽ in ra 720
        // thực tế nó ra bao nhiêu thì phải chạy mới biết.
        // Kết quả thực tế trả về lúc chạy App đc gọi là ACTUAL
        System.out.println("6! = " + computeFactorial(6));
        // actual: 720, expected: 720 => Đúng rồi
        // actual: 1000, expected: 720 => Toang hàm, chạy sai, viết sai
        
        // expected: 1 if cF(0), chạy hàm cF(0) hy vọng nhận về 1.
        // Nếu ko về 1, tức là actual khác expected => hàm viết code sai.
        System.out.println("0! = " + computeFactorial(0));
        
        System.out.println("1! = " + computeFactorial(1));
        
        // Chạy F6, nhìn kết quả, luận tính đúng-sai bằng mắt trên từng hàm sout().
        System.out.println("-5! = " + computeFactorial(-5));
        // Mình kì vọng máy/hàm cF() phải ném về ngoại lệ do đưa vào dữ liệu cà chớn.
        // -5! ko tính đc. Giai thừa chỉ chơi vs số nguyên dương.
        
        // Do mình đang chơi trò sout() nên sai đúng cứ in ra kết quả, mình phải luận
        // đúng-sai = mắt.
        // VD: "-5! = 1", phải nhìn kết quả in ra khi chạy -> luận đúng sai
        // HỢP LÝ NHƯNG VÌ NHÌN BẰNG MẮT, SO SÁNH TRONG ĐẦU, DỄ BỊ SAI SÓT
        
        // Giang hồ độ ta 1 bộ thư viện, giúp ta test các hàm dùng màu sắc:
        // Xanh -> Code chạu đúng kỳ vọng
        // Đỏ -> Code chạy sai kì vọng
        // Viết thêm đoạn code tự so sánh giùm giữa expected và actual để ném ra
        // màu, mình chỉ cần nhìn màu, ko cần tự so sánh và kết luận.
        // Kỹ thuật này gọi là TDD kết hợp vs UnitTesting xài các thư viện phụ trợ
        // JUnit, NUnit, TestNG, xUnit, MSTest, PHPUnit, CPPUnit,...
    }
    
}
