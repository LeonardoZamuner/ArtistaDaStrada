package Artista.Strada.cli;

public class SemaforoConteggio {
	private int s;  
	public SemaforoConteggio(int n){
		s = n;
	}
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
