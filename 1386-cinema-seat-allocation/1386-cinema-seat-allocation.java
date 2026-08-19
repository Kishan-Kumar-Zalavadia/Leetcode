class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int ans = 0;
        int row = 1;
        int[] seats = new int[10];
        Arrays.sort(reservedSeats, (a, b) -> Integer.compare(a[0], b[0]));
        seats[reservedSeats[0][1]-1] = 1;


        for (int i=2; i<=reservedSeats.length; i++) {
            int r = reservedSeats[i-1][0]-1;
            int c = reservedSeats[i-1][1]-1;

            if (r != reservedSeats[i-2][0]-1) {
                System.out.println("if-2");
                boolean check = true;
                if (seats[1] != 1 && seats[2] != 1 && seats[3] != 1 && seats[4] != 1) {
                    System.out.println("if-3");
                    ans++;
                    check = false;
                } 
                if (seats[5] != 1 && seats[6] != 1 && seats[7] != 1 && seats[8] != 1) {
                    System.out.println("if-4");
                    ans++;
                    check = false;
                }

                if (check && seats[3] != 1 && seats[4] != 1 && seats[5] != 1 && seats[6] != 1) {
                    System.out.println("if-5");
                    ans++;
                }
                Arrays.fill(seats, 0);
                seats[c] = 1;
                row++;
            } else {
                System.out.println("else");
                seats[c] = 1;
            }
        }
        boolean check = true;
        if (seats[1] != 1 && seats[2] != 1 && seats[3] != 1 && seats[4] != 1) {
            ans++;
            check = false;
        } 
        if (seats[5] != 1 && seats[6] != 1 && seats[7] != 1 && seats[8] != 1) {
            ans++;
            check = false;
        }
        if (check && seats[3] != 1 && seats[4] != 1 && seats[5] != 1 && seats[6] != 1) {
            ans++;
        }
        System.out.println("row: "+row);
        ans += (n-row)*2;
        return ans;
    }
}