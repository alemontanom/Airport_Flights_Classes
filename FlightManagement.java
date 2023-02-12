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
public class FlightManagement {
    private Arrivals[] inbound;  
    private int last=-1;
    private Arrivals nuevaLlegada; 
    
    //Constructor
    public FlightManagement(){
        inbound=new Arrivals[200];
    }
    
    //Custom
    public void addArrival(Arrivals newArrival){
       for(int i=0;i<=last;i++){
           if(inbound[i].compareWith(newArrival)<=0){
               for(int j=last+1;j>i;j--){
                   inbound[j]=inbound[j-1];
               }
               inbound[i]=newArrival;
               break;
           }
       }
       last+=1; 
        
    } //Incomplete (Must sort by ETA)
    
    private int search(String flightId){
        int index=-1, compare;
        
        for(int i=0; i<=last;i++){
            compare=(inbound[i].getFlight().getId()).compareTo(flightId);
            if(compare==0) return i;
        }
        return index;
    }
    
    public Arrivals remove(String flightId){
        Arrivals result;
        int index=search(flightId);
        result=inbound[index];
        
        while(index<last){
            inbound[index]=inbound[index+1];
            index++;
        }
        last--;
        return result;
    }
    
    public void showDelayed(String t){
        for(int i=0;i<=last;i++){
            if((inbound[i].getDelay()!=0) && (inbound[i].getETA().compareTo(t)>0)){
                System.out.println(inbound[i].getFlight().getId());
            }
        }
    }
    
}
    
