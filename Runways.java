/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aeropuerto;
import java.util.LinkedList;

public class Runways {
    
    LinkedList<Arrivals> runwayUno=new LinkedList();
    LinkedList<Arrivals> runwayDos=new LinkedList();
    
    public LinkedList<Arrivals> mergeLists(LinkedList<Arrivals> list1, LinkedList<Arrivals> list2)
    {
        LinkedList<Arrivals> newList=new LinkedList();
        
        while(list1.isEmpty()==false && list2.isEmpty()==false)
        {
            int n=list1.getFirst().compareWith(list2.getFirst());
                if(n>0){
                    newList.add(list1.removeFirst());
                }
                else if(n==0){
                    newList.add(list1.removeFirst());
                    newList.add(list2.removeFirst());
                }
                else {
                    newList.add(list2.removeFirst());
                }
        }
        
        return newList;
    }
    
    public LinkedList<Arrivals> addFlightToRunway(LinkedList<Arrivals> lista, Arrivals nuevaLlegada){
        
        lista.add(nuevaLlegada); 
        return lista; 
    }
    
}
