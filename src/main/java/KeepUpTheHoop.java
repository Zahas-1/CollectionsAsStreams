public class KeepUpTheHoop {
    public static String hoopCount(int n) {
        if (n >= 10) {
            return "Great, now move on to tricks";
        } else {
            return "Keep at it until you get it";
        }
    }

    public static void main(String[] args) {
        System.out.println(KeepUpTheHoop.hoopCount(12)); // "Great, now move on to tricks"
        System.out.println(KeepUpTheHoop.hoopCount(7));  // "Keep at it until you get it"
    }
}