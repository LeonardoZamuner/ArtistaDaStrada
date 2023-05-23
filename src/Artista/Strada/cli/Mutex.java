package Artista.Strada.cli;

public class Mutex {
	private int s = 1;    
    synchronized public void aquire() { 
        s--;
        if (s<0) {
            try{wait();} 
   catch(InterruptedException e) {};
        }        
    }    
    synchronized public void release(){ 
       s++;
       notify();
    }

}
