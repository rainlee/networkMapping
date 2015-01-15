public class Node {
    private int id;
    private int memory;
    private int capacity;
    private double bandwidth;
    
    public Node() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMemory() {
        return this.memory;
    }

    public int setMemory(int memory) {
        this.memory = memory;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getBandwidth() {
        return this.bandwidth;
    }

    public int setBandwidth(double bandwidth) {
        this.bandwidth = bandwidth;
    }
}
