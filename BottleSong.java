public class BottleSong {
    public static void main(String[] args) {
        int bottleNum = 8;
        String word = "bottles";
        while (bottleNum > 0) {
            if (bottleNum == 1) {
                word = "bottle";
            }
            System.out.println(bottleNum + " black " + word + " is on shooting place");
            System.out.println("And if Raka Don shoot one black bottle then,");
            bottleNum -= 1;
        }
        if (bottleNum == 1) {
            System.out.println("There'll be " + bottleNum + " blcak " + word + " is on shooting place");
        } else
            System.out.println("There'll be no black bottles,on the shooting place");
    }

}
