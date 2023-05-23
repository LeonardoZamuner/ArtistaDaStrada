package Artista.Strada.cli;

public class Data {
	public static final int DIM = 10;
	public static volatile int[] buffer = new int[DIM];
	public static volatile int IN = 0;
	public static volatile int OUT = 0;
	public static int OFFSET = 0;
	public static int MAXIMUM = 0;
	public static int LOOP = 0;
	public static volatile int CurrentLoop = 0;
	public static SemaforoConteggio pieno = new SemaforoConteggio(DIM);
	public static SemaforoConteggio vuoto = new SemaforoConteggio(0);
	public static Mutex mutexP = new Mutex();
	public static Mutex mutexC = new Mutex();
	
	public Data(int o, int m, int l) {
		OFFSET = o;
		MAXIMUM = m;
		LOOP = l;
	}
}
