import java.util.ArrayList;

class State 
{
   boolean F,W,D,C;  // n (north) and s (south) are represented by true and false
   
   public State (boolean F1,boolean W1,boolean D1,boolean C1)
   {
       F = F1;
       W = W1;
       D = D1;
       C = C1;
   }
   
   public boolean eq (boolean F1,boolean W1,boolean D1,boolean C1)
   {
       if (F==F1 & W==W1 & D==D1 & C==C1) return true;
       else return false;
   }

   public void printSt ()
   {
       System.out.println(F+"\t"+W+"\t"+D+"\t"+C);
   }
}

public class Farmer
{
    static ArrayList<State>path = new ArrayList<State>();
    public static void main (String[] args)
    {
        solve(false,false,false,false);
        System.out.println("FARMER\tWOLF\tDUCK\tCORN");
        for (int i = 0; i < path.size(); i++) path.get(i).printSt();
    }

    public static boolean solve(boolean F,boolean W,boolean D,boolean C)
    {
        boolean done = false;
        if (F & W & D & C) {path.add(new State(F,W,D,C)); return true;}
        else if (illegal(F,W,D,C)) return false;
        else if (visited(F,W,D,C)) return false;
        else 
        { 
            path.add(new State(F,W,D,C));
            if (!done & F) done = solve(false,W,D,C);
            if (!done & !F) done = solve(true, W,D,C);
            if (!done & F & W) done = solve(false,false,D,C);
            if (!done & !F & !W) done = solve(true,true,D,C);
            if (!done & F & D) done = solve(false,W,false,C);
            if (!done & !F & !D) done = solve(true,W,true,C);
            if (!done & F & C) done = solve(false,W,D,false);
            if (!done & !F & !C) done = solve(true,W,D,true);
            return done;
        }
    }
    
    public static boolean illegal(boolean F,boolean W,boolean D,boolean C)
    {
        if (F & !W & !D ) return true;
        if (!F & W & D ) return true;
        if (F & !D & !C ) return true;
        if (!F & D & C ) return true;
        return false;
    }

    public static boolean visited(boolean F,boolean W,boolean D,boolean C)
    {
        boolean ok = false;
        for (int i = 0; i < path.size(); i++)
            if (path.get(i).eq(F,W,D,C)) ok=true;
        return ok;
    }

}