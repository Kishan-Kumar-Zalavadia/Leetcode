class Solution {
    public double angleClock(int hour, int minutes) {
        double md = 6*minutes;
        double hd = 0.5 * minutes;
        if (hour != 12) {
            hd += (hour * 30);
        }
        double angle = Math.abs(hd-md);
        return Math.min(angle, 360-angle);
    }
}