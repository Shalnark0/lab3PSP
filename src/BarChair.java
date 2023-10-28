public class BarChair extends Chair{
    public BarChair(String color, int height){
        super(color, height, "Барный стул");
    }
    @Override
    public void print() {
        System.out.println(this.getType() +" "+ this.getColor() + " " +this.getHeight());
    }
    @Override
    public void stand() {
        System.out.println("Барный стул стоит");
    }
    @Override
    public void chairBroke() {
        System.out.println("Стул сломан");
    }
}
