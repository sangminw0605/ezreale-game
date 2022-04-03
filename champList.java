import java.util.*;

public class champList {
    
    private HashMap<String, Champion> list;    

    public champList() {
        this.list = new HashMap<String, Champion>();
    }

    public Champion getChamp(String name) {
        return list.get(name);
    }

    public void addChamp(String name, Champion champ) {
        list.put(name, champ);
    }

    public void addChamp(String name, String region, String role, String lane, int cost) {
        Champion newChamp = new Champion(name, region, role, lane, cost);
        addChamp(name, newChamp);
    }
}
