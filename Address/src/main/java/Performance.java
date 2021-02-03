import java.util.stream.Stream;

enum Performance{
    ONE (1, "Add an entry"),
    TWO(2,"Remove an entry"),
    THREE(3, "Search for a specified entry"),
    FOUR(4, "Print Address Book"),
    FIVE(5, "Delete Book"),
    SIX(6, "Quit");

    private final Integer i;
    private final String s;

    Performance(Integer i, String s) {
        this.i = i;
        this.s = s;
    }

    public Integer getI() {
        return i;
    }

    public String getS(){
        return s;
    }

    public static Performance enumBySelection(int i) {
        return Stream.of(Performance.values())
                .filter(selections -> selections.getI().equals(i))
                .findFirst()
                .orElseThrow();
    }

    @Override
    public String toString() {
        return """
                 %d) %s...
                """.formatted(i, s);
    }
}

