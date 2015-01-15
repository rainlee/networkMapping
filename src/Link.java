public Link {
    public static enum LinkType {
        physical,
        virtual;
    }

    private int id;
    private LinkType type;
    private int bandwidth;

    private int nodeId1;
    private int nodeId2;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getNodeId1() {
        return this.nodeId1;
    }

    public void setNodeId1(int id) {
        this.nodeId1 = id;
    }
    
    public int getNodeId2() {
        return this.nodeId2;
    }

    public void setNodeId2(int id) {
        this.nodeId2 = id;
    }
    
    public LinkType getType() {
        return this.type;
    }

    public void setType(LinkType type) {
        this.type = type;
    }

    public int getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }
}
