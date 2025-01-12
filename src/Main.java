//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        if (!logical_xor(false, false)) {
            System.out.println("Logical XOR Test 1 Passed");
        }  else {
            System.out.println("Logical XOR Test 1 Failed");
        }

        if (logical_xor(true, false)) {
            System.out.println("Logical XOR Test 2 Passed");
        }  else {
            System.out.println("Logical XOR Test 2 Failed");
        }

        if (logical_xor(false, true)) {
            System.out.println("Logical XOR Test 3 Passed");
        }  else {
            System.out.println("Logical XOR Test 3 Failed");
        }

        if (!logical_xor(true, true)) {
            System.out.println("Logical XOR Test 4 Passed");
        }  else {
            System.out.println("Logical XOR Test 4 Failed");
        }

        byte binaryFive = 0b0101;
        byte binarySeven = 0b0111;
        byte binaryTwo = 0b0010;
        byte binaryThree  = 0b0011;

        if (bitwise_xor(binaryFive, binarySeven) == binaryTwo) {
            System.out.println("Bitwise XOR Test 1 Passed");
        } else {
            System.out.println("Bitwise XOR Test 1 Failed");
        }

        if (bitwise_xor(binaryFive, binaryFive) != binaryThree) {
            System.out.println("Bitwise XOR Test 2 Passed");
        } else {
            System.out.println("Bitwise XOR Test 2 Failed");
        }

        byte binaryThirtyEight = 0b10110;
        byte binaryFortyTwo = 0b11010;
        byte binaryTwelve = 0b1100;

        if (bitwise_xor(binaryThirtyEight, binaryFortyTwo) == binaryTwelve) {
            System.out.println("Bitwise XOR Test 3 Passed");
        } else {
            System.out.println("Bitwise XOR Test 3 Failed");
        }

        if (bitwise_xor(binaryThirtyEight, binaryFortyTwo) != binaryFive) {
            System.out.println("Bitwise XOR Test 4 Passed");
        } else {
            System.out.println("Bitwise XOR Test 4 Failed");
        }

    }

    static boolean logical_xor (boolean a, boolean b) {
        return !(a && b) && (a || b);
    }

    static int bitwise_xor (int a, int b) {
        return ~(a & b) & (a | b);
    }
}