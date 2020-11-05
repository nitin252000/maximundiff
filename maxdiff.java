public class maxdiff {
    public static int diff(int[] a) {
        int diff = Integer.MIN_VALUE;
        int n = a.length;
        int max = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > max) {
                max = a[i];
            } else {
                diff = Integer.max(diff, max - a[i]);
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        int[] a = {2, 7, 9, 5, 1, 3, 5};
        System.out.println("the maximumdifference is" +" "+ diff(a));
    }
}