import java.util.concurrent.Semaphore;
public class Bridge {
private int crossed;    //Geçişlerin sayısını sayar
private Semaphore bridgeSem;    //bir seferde yalnızca 1 geçişe izin veren semafor

//Constructor
public Bridge() {
    crossed=0;
    bridgeSem = new Semaphore(2);   //tek köprü kaynağı, mutual exclusivity
}

//Getters
public int getCrossed() {
    return crossed;
}

//Methods
public void cross() { 
    //Semaphore oluşturma
    try {   
        bridgeSem.acquire();    
        crossed++;              //increment NEON counter
    }
    catch (InterruptedException e) {} 
}

public void exit() {
    //Semaphore çıkış
    bridgeSem.release();

}
}