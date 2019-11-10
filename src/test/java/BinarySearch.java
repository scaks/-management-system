
public class BinarySearch {
    private int x = 111;
    public static void main(String[] args) {
        BinarySearch lee = new BinarySearch();
        int i = lee.guessNumber(10000);
        System.out.println(i);
    }

    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + ((high - low)>>2);
            int res = guess(mid);
            if (res == 0)
                return mid;
            else if (res < 0)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public int guess(int n) {
        if (n < x) {
            return 1;
        } else if (n > x) {
            return -1;
        } else {
            return 0;
        }
    }

}
