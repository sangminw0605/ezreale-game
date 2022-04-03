

public class Champion {
    private String name;
    private String region;
    private String role;
    private String lane;
    private int cost;

    // Constructor for champion
    public Champion(String new_name, String new_region, String new_role, String new_lane, int new_cost) {
        // Set all associated values
        this.name = new_name;
        this.region = new_region;
        this.role = new_role;
        this.lane = new_lane;
        this.cost = new_cost;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getRole() {
        return role;
    }

    public String getLane() {
        return lane;
    }
    
    public int getCost() {
        return cost;
    }

}