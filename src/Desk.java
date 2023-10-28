public class Desk implements Furniture, Object{
    String material;

    public Desk(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public void showMaterial(){
        System.out.println(this.material);
    }
    @Override
    public void print() {
        System.out.println("Абстрактный метод print в Desk");
    }
    @Override
    public void stand() {
        System.out.println("Стол стоит");
    }
}
