/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aeropuerto;

/**
 *
 * @author alemontano
 */
public class Arrivals {
    private Flights myFlight;
    private String sta; 
    private int runway;
    private String gate;
    private int delay;
    private boolean landed;
    
    public Arrivals(Flights myFlight, String sta){
        this.myFlight=myFlight;
        this.sta=sta;
        this.runway=0;
        this.gate=null;
        this.delay=0;
        this.landed=false;
    }
    
    public Arrivals(){
       
    }
    
    public Arrivals(Flights myFlight, String sta, int delay){
        this.myFlight=myFlight;
        this.sta=sta;
        this.runway=0;
        this.gate=null;
        this.delay=delay;
        this.landed=false;
    }
    
    //Accessors
    public Flights getFlight(){
        return myFlight;
    }
    
    public String getSTA(){
        return sta;
    }
    
    public int getRunway(){
        return runway;
    }
    
    public String getGate(){
        return gate;
    }
    
    public int getDelay(){
        return delay;
    }
    
    public boolean hasLanded(){
        return landed;
    }
    
    //Mutators
    public void addFlight(Flights newFlight){
        this.myFlight=newFlight;
    }
    
    public void addSTA(String newSTA){
        this.sta=newSTA;
    }
    
    public void addRunway(int newRunway){
        this.runway=newRunway;
    }
    
    public void addGate(String newGate){
        this.gate=newGate;
    }
    
    public void addDelay(int newDelay){
        this.delay=newDelay;
    }
    
    public void changeLandedStatus(boolean landed){
        this.landed=landed;
    }
    
    public String getETA(){ 
        int a,b,c,d; 
        
        a = Character.getNumericValue(sta.charAt(0));
        b = Character.getNumericValue(sta.charAt(1));
        c = Character.getNumericValue(sta.charAt(3));
        d = Character.getNumericValue(sta.charAt(4));
        
        int minutes  = c*10+d;
        
        int mF = minutes + delay;
        int h2=0;
        
        if (mF >= 60)
        {
            h2 = mF/60;
            mF = mF%60;
        }
        
        int hours = a*10+b;

        int hF = hours + h2; 
        
        if(hF > 24)
            hF = hF%24;
        
        String horasFin, minFin;
        
        if (hF < 10)
            horasFin = "0"+hF;
        else 
            horasFin = ""+hF;
        
        if(mF < 10)
            minFin = "0"+mF;
        else 
            minFin = ""+mF;
        
        return horasFin+":"+minFin;

    } 
    
    public int compare(String flightId){
        if(myFlight.getId().equals(flightId))
            return 0;
        else
            return 1; 
    }
    
    public int compareWith(Arrivals anotherArrival){
        return this.getETA().compareTo(anotherArrival.getETA());
    }
    
}

