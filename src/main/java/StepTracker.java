import java.util.ArrayList;
public class StepTracker
{
private int active,steps,numDays,minimum;

 public StepTracker(int d) {
 active = 0;
  minimum = d;
  numDays = 0;
  steps = 0;
 }

 public void addDailySteps(int b) {
steps += b;
numDays +=1;
if(b >= minimum)
 active++;

 }

 public int activeDays() {
return active;
 }

 public double averageSteps() {
 if(numDays==0)
  return 0;
else
  return (double)steps/numDays;
 }
 
} 
