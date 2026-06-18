class Solution {
    public double angleClock(int hour, int minutes) {
        // Calculate the positions of both hands in degrees
        double minutesAngle = minutes * 6.0;
        double hourAngle = (hour % 12 * 30.0) + (minutes * 0.5);
        
        // Find the absolute difference between the two angles
        double diff = Math.abs(hourAngle - minutesAngle);
        
        // Return the smaller angle
        return Math.min(diff, 360.0 - diff);
    }
}
