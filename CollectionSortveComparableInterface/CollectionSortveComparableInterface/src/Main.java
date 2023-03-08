import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
class Player implements Comparable<Player>{
    private String isim;
    
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
       return "|||| ID: " + id + " İsim :" + isim + " |||";
       
    }

    @Override
    public int compareTo(Player o) {
        if (this.id < o.id) {
            return -1;
        }
        else if (this.id > o.id) {
            return 1;
        }
        else{
            return 0;
        }
    }

    

    
}
public class Main {
    public static void main(String[] args) {
        
        /*List<String> list_string = new ArrayList<String>();
        
        
        list_string.add("Java");
        list_string.add("C++");
        list_string.add("Python");
        list_string.add("Php");
        list_string.add("Go");
        
        Collections.sort(list_string);
        
        for (String s : list_string) {
            System.out.println(s);
        }*/
        
        List<Player> list_player = new ArrayList<Player>();
        
        list_player.add(new Player("Furkan", 1));
        list_player.add(new Player("Kasım", 2));
        list_player.add(new Player("Hatice", 3));
        list_player.add(new Player("Emre", 10));
        
        /*Collections.sort(list_player);
        
        for (Player player : list_player) {
            System.out.println(player);
        }*/
        
        Set<Player> treeset = new TreeSet<Player>();
        
        treeset.add(new Player("Furkan", 1));
        treeset.add(new Player("Kasım", 2));
        treeset.add(new Player("Hatice", 3));
        treeset.add(new Player("Emre", 10));
        
        for (Player player : treeset) {
            System.out.println(player);
        }
        
    }

}



