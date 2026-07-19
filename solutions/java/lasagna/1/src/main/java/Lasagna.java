public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;}
    
    public int remainingMinutesInOven(int actualMinutes){
        return expectedMinutesInOven()- actualMinutes ;
    }

    public int preparationTimeInMinutes(int layers){
        return 2 * layers;
    }

    public int totalTimeInMinutes(int layers,int actualMinutes){
        return   2*(layers)+ actualMinutes;
    }
    public static void main(String[]args){
       
        Lasagna lasagna = new Lasagna();
        int minutesInOven =lasagna.expectedMinutesInOven();
        System.out.println(minutesInOven);
    
    // TODO: define the 'remainingMinutesInOven()' method
    
        int remainingMinutes =lasagna.remainingMinutesInOven(30);
        System.out.println(remainingMinutes);
    
    // TODO: define the 'preparationTimeInMinutes()' method

        int prepTime = lasagna.preparationTimeInMinutes(3);
        System.out.println(prepTime);
    
    // TODO: define the 'totalTimeInMinutes()' method
        int totalTime = lasagna.totalTimeInMinutes(3,5);
        System.out.println(totalTime);
        
}}
