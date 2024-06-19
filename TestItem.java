package TextMenu;

public class TestItem implements MenuItem {
    
    //private int menuSlot;
    private String title;
    
    public TestItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void select() {
        //System.out.println("Option " + menuSlot + " was selected!");
        System.out.println("Chose \"" + title + "\"");
    }


}
