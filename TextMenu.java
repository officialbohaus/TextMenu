package TextMenu;

public class TextMenu {
    
    private MenuItem[] options;
    private int userChoice;
    private String menuTitle, menuDescription;
    private String titleDefault = "No title";
    private String descriptionDefault = "No description";
    private String divider = "-----------------------------";

    public TextMenu(MenuItem ... options) {
        // Creates an array of menu options
        int size = options.length;
        this.options = new MenuItem[size];
        for (int i = 0; i < size; i++) {
            this.options[i] = options[i];
        }
        this.userChoice = -1; // User has not made a choice
        this.menuTitle = titleDefault;
        this.menuDescription = descriptionDefault;
    }

    // public TextMenu() {
    //     super();
    // }

    public void addMenuItem(MenuItem item) {
        // increase array by one, then adds item to end
        increaseOptionsArray();
        options[options.length - 1] = item;
    }

    private void increaseOptionsArray() {
        MenuItem[] temp = new MenuItem[this.options.length + 1];
        for (int i = 0; i < this.options.length; i++) {
            temp[i] = this.options[i];
        }
        this.options = temp;
    }

    public void setTitle(String title) {
        this.menuTitle = title;
    }

    public void setDescription(String description) {
        this.menuDescription = description;
    }

    public String getMenu() {
        String menuText = "";
        if (!menuTitle.equals(titleDefault)) {
            menuText += "--| " + menuTitle + " |-----\n";
        }
        if (!menuDescription.equals(descriptionDefault)) {
            menuText += "| " + menuDescription + " |\n";
        }
        for (int i = 0; i < options.length; i++) {
            menuText += "\t  " + i + ") " + options[i].getTitle() + "\n";
        }
        return menuText;
    }

    public void displayMenu() {
        System.out.println(getMenu());
    }

    public void queryUser() {
        // logic for having user select a menu item via number
        // logic for ensuring menu has displayed first (Needed?)
        // logic for ensuring player chooses menu item
    }
}
