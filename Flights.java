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
public class Flights {
    private String id;
    private String plane;
    private int numPassengers;
    private String pilot;
    private String origin;
    
    //Constructors
    public Flights(){
        numPassengers=0;
    }
    
    public Flights(String id,String plane, int passengers, String pilot, String origin){
        this.id=id;
        this.plane=plane;
        numPassengers=passengers;
        this.pilot=pilot;
        this.origin=origin;
    }
    
    public Flights(String id){
        this.id=id;
        numPassengers=0;
    }
    
    //Accessors
    public String getId(){
        return this.id;
    }
    
    public String getPlane(){
        return this.plane;
    }
    
    public int getPassengers(){
        return this.numPassengers;
    }
    
    public String getPilot(){
        return this.pilot;
    }
    
    public String getOrigin(){
        return this.origin;
    }
    
    //Mutators
    public void setId(String newId){
        id=newId;
    }
    
    public void setPlane(String newPlane){
        plane=newPlane;
    }
    
    public void setPassengers(int passengers){
        numPassengers=passengers;
    }
    
    public void setPilot(String newPilot){
        pilot=newPilot;
    }
    
    public void setOrigin(String origin){
        this.origin=origin;
    }
    
    @Override
    public String toString(){
        return "Id:"+id+" |plane:"+plane+" |num. of passengers:"+numPassengers+" |pilot:"+pilot+" |origin:"+origin;
    }
}
