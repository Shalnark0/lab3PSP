public class Closet implements Furniture, Object{
    int amountOfCells;

    public Closet(int amountOfCells) {
        this.amountOfCells = amountOfCells;
    }

    public int getAmountOfCells() {
        return amountOfCells;
    }

    public void setAmountOfCells(int amountOfCells) {
        this.amountOfCells = amountOfCells;
    }
    public void showAmountOfCells(){
        System.out.println("Количество ячеек: "+this.amountOfCells);
    }

    @Override
    public void print() {
        System.out.println("Абстрактный метод print в Closet");
    }
    @Override
    public void stand() {
        System.out.println("Шкаф стоит");
    }
}
