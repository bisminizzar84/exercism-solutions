
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
       // throw new UnsupportedOperationException("Please implement the BirdWatcher.getLastWeek() method");
        
   int[] lastWeek =  {0,2,5,3,7,8,4};
    return lastWeek;

        
    }

    public int getToday() {
      //  throw new UnsupportedOperationException("Please implement the BirdWatcher.getToday() method");

    return birdsPerDay[birdsPerDay.length-1];
    

     
    }

    public void incrementTodaysCount() {
       // throw new UnsupportedOperationException("Please implement the BirdWatcher.incrementTodaysCount() method");

   birdsPerDay[birdsPerDay.length-1]++;
   
    }

    public boolean hasDayWithoutBirds() {
       // throw new UnsupportedOperationException("Please implement the BirdWatcher.hasDayWithoutBirds() method");

        for(int birds :birdsPerDay) {
        if(birds==0) {
            return true;
        }
        }
        return false;
            
    }

    public int getCountForFirstDays(int numberOfDays) {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");

        int total =0;
        for (int i=0;i<numberOfDays && i< birdsPerDay.length;i++){
         total +=birdsPerDay[i];
        }
        return total;
   }

    public int getBusyDays() {
       // throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");

        int total2=0;
        for(int birds:birdsPerDay){
            if (birds>=5){
             total2 ++;   
            }
        }
        return total2;
    }
}
