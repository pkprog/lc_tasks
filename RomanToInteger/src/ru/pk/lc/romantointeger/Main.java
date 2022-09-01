package ru.pk.lc.romantointeger;

//13. Roman to Integer
public class Main {
    enum Num {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);

        public final int value;

        Num(int value) {
            this.value = value;
        }

        public static Num parse(char c) {
            for (Num n: Num.values()) {
                if (n.name().charAt(0) == c) {
                    return n;
                }
            }
            throw new RuntimeException("Parse error:"+ c);
        }

        public static Num[] split(String text) {
            if (text == null || text.length() == 0) return new Num[0];

            final Num[] arr = new Num[text.length()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Num.parse(text.charAt(i));
            }
            return arr;
        }
    }

    private static int convert(String roman) {
        final Num[] nums = Num.split(roman == null ? null : roman.trim().toUpperCase());

        int result = nums.length == 0 ? 0 : nums[0].value;
        for (int i = 1; i < nums.length; i++) {
            Num prev = nums[i-1];
            Num curr = nums[i];
            if (prev.value >= curr.value) {
                result += curr.value;
            } else {
                result -= prev.value;
                result += curr.value - prev.value;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.printf("%s -> %d%n", "III", convert("III"));
        System.out.printf("%s -> %d%n", "XI", convert("XI"));
        System.out.printf("%s -> %d%n", "IX", convert("IX"));
        System.out.printf("%s -> %d%n", "CMXIII", convert("CMXIII"));
    }

}
