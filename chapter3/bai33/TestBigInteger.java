import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        // Đưa các chữ số vào BigInteger bằng chuỗi
        BigInteger so1 = new BigInteger(
                "1111111111111111111111111111111111111111");
        BigInteger so2 = new BigInteger(
                "2222222222222222222222222222222222222222");

        // Cộng hai số rồi in kết quả
        System.out.println("Tong: " + so1.add(so2));

        // Nhân hai số rồi in kết quả
        System.out.println("Tich: " + so1.multiply(so2));
    }
}