public class Sample {
    public static long divide(long a, long b) {
        // code here
        long sign = ((a < 0) ^ (b < 0)) ? -1 : 1;
        int res = 0;
        a = Math.abs(a);
        b = Math.abs(b);
        while (a - b >= 0) {
            int c = 0;
            while (a - (b << 1 << c) >= 0)
                c++;
            res = res + (1 << c);
            a = a - (b << c);
        }
        if (sign == -1)
            res = -res;
        return res;
    }
}