package Example;
public class Client {
    public static void main(String[] args) throws Exception {
        Visitor blueMachine = new BlueMachineVisitor();
        Visitor yellowMachine = new YellowMachineVisitor();

        Visible jeans = new Pants("Lee");
        Visible tShirt = new Shirt("NIke");
        Visible heels = new Shoes("Aldo");

        System.out.println(jeans.accept(blueMachine));
        System.out.println(tShirt.accept(blueMachine));
        System.out.println(heels.accept(blueMachine));

        System.out.println(jeans.accept(yellowMachine));
        System.out.println(tShirt.accept(yellowMachine));
        System.out.println(heels.accept(yellowMachine));
    }
}
