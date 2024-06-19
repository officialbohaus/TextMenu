package TextMenu;

public class TestDriver {
    public static void main(String[] args) {

        TestItem item1 = new TestItem("My first option");
        TestItem item2 = new TestItem("My second option");
        TestItem item3 = new TestItem("Nuclear Warfare");

        TextMenu myMenu = new TextMenu(item1, item2);
        myMenu.setTitle("My Menu");
        myMenu.setDescription("My Description");
        myMenu.addMenuItem(item3);
        myMenu.displayMenu();
        myMenu.queryUser();
    }
}
