public class Stool extends Chair{

    public Stool(String color, int height){
        super(color, height, "Табуретка");
    }
    @Override
    public void print() {
        System.out.println(this.getType() +" "+ this.getColor() + " " +this.getHeight());
    }
    @Override
    public void stand() {
         System.out.println("Табуретка стоит");
    }
    @Override
    public void chairBroke() {
        System.out.println("Стул сломан");
    }

}
