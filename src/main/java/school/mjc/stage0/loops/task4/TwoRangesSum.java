package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow){
            System.out.println("number to skip is bigger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        }else {
            int skipSum = 0;
            int encounterSum = 0;
            for (int i = 0; i <= lastInRow; i++) {
                if (i > numberToSkip){
                    encounterSum += i;
                }else {
                    skipSum += i;
                }
            }
            System.out.println("skipped sum is " + skipSum +
                    "\ncounted sum is " + encounterSum);
        }
    }
}
