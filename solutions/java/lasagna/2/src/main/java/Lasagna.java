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
        return   preparationTimeInMinutes(layers)+ actualMinutes;
    }
    
        
}
