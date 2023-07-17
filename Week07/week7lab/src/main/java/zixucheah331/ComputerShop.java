package zixucheah331;

public class ComputerShop {
    Notebook nb1, nb2;

    public void runProgram() {
        nb1 = new Notebook("Dell 3300", 2.2);
        nb2 = new Notebook("Acer 1810", 1.5);
        nb1.showDetail();
        nb2.showDetail();
        System.out.println("QTY1 : " + nb1.getQty());
        System.out.println("QTY2 : " + nb2.getQty());
        nb1.showComputerType();
    }

    public static void main (String args[]){
        ComputerShop css = new ComputerShop();
        css.runProgram();
    }

}