package oop;

public class basic {
    class BankAccount {
        private double pincode = 44404;

        // Only a method to verify — no getter, no setter!
        public void access_money(double user_pincode) {
            if (user_pincode == pincode) {
                System.out.println("access provided");
            } else {
                System.out.println("access denied");
            }
        }

        // If you need to change pin, require the OLD pin first
        public void changePincode(double oldPin, double newPin) {
            if (oldPin == pincode) {
                pincode = newPin;
                System.out.println("Pin changed successfully");
            } else {
                System.out.println("Wrong pin, cannot change");
            }
        }
    }

    public static void main(String[] args) {
        basic b = new basic();
        BankAccount ba = b.new BankAccount();
        ba.access_money(44404);
        ba.pincode = ba.pincode + 20;
        System.out.println(ba.pincode);
    }
}
