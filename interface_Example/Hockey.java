package interface_Example;

public interface Hockey extends Sports{
    void homeGoalScored();
    void visitingGoalScored();
    void endOfPeriod(int period);
    void overtimePeriod(int ot);
}
