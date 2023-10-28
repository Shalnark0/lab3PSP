public abstract class Chair implements Furniture, Object {
    public abstract void chairBroke();
    String type;
    String color;
    int height;
    public Chair(String color, int height, String type){
        this.color = color;
        this.height = height;
        this.type = type;
    }
    @Override
    public void stand() {
        System.out.println("Стул стоит");
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}
