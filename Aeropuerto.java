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
public class Aeropuerto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Flights VueloUno= new Flights("KL1120");
            Flights VueloDos= new Flights("MH9077");
            Flights VueloTres= new Flights("LH8803");
            Flights VueloCuatro= new Flights("RO225");
    
            Arrivals uno=new Arrivals(VueloUno,"11:05",0);
            Arrivals dos=new Arrivals(VueloDos,"11:45",45);
            Arrivals tres=new Arrivals(VueloTres,"12:55",0);
            Arrivals cuatro=new Arrivals(VueloCuatro,"12:05",0);
            
            FlightManagement comparacion = new FlightManagement(); 
            
            comparacion.addArrival(uno); 
            
            VueloTres.setPilot("Juan"); 
            VueloTres.setPlane("Boeing735 AZ3");
            VueloTres.setOrigin("New Zealand");
            VueloTres.setPassengers(108);
            
            imprimirVuelos(VueloTres); 
            System.out.println(dos.getETA()); 
            
            
    }
    
    public static void imprimirVuelos(Flights vuelo){
        System.out.println(vuelo.toString());
    }
    
   
    
}
