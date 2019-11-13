public class Room {

    private String name;
    private String description;
    private String options;
    private String altOptions;

    public Room(String name, String description, String options, String altOptions) {
        this.name = name;
        this.description = description;
        this.options = options;
        this.altOptions = altOptions;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getOptions(int option) {
        if (option == 1) {
            return options;
        } else {
            return altOptions;
        }
    }
}
