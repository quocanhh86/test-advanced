package org.example;

import net.bytebuddy.implementation.bytecode.Throw;

public class Bai1 {

    public String divideSix(int a){
        if (a < 0){
            throw new IllegalArgumentException("Số a phải lớn hơn 0");
        }
        if (a % 6 == 0){
            return "Số có chia hết cho 6";
        } else {
            return "Số không chia hết cho 6";
        }
    }
}
