package main.com.hackerrank.sorting;

public class FraudulentActivityNotifications {


    static int activityNotifications(int[] expenditure, int d) {
        int NOTIFY = 0;

        for (int i = 0; i < expenditure.length; i++) {
            if (i < d)
                continue;
            int median = 0;
            if (expenditure[i] >= (2 * median))
                NOTIFY++;
        }
        return NOTIFY;
    }

    public static void main(String[] args) {

        /** TEST CASE 0 **/
        int d = 4;
        int[] expenditure = new int[]{2, 3, 4, 2, 3, 6, 8, 4, 5};

        /** TEST CASE 1 **/
        d = 3;
        expenditure = new int[]{10, 20, 30, 40, 50};

        /** TEST CASE 2 **/
        d = 4;
        expenditure = new int[]{1, 2, 3, 4, 4};

        System.out.println(activityNotifications(expenditure, d));
    }

}
