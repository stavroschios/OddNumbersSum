public class odds {

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;

        }
        if ((number % 2 == 0) ) {
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ( (start > 0) && (end > 0)) {

            if ((end >= start)) {


                for (int i = start; i <= end; i++) {

                    if (isOdd(i) == true) {
                        sum += i;
                    }

                }

                return sum;
            }
        }
        return -1;

    }

}
