import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddressBook {
    private static List<Entry> entryList = new ArrayList<>();
    //add entry

    public static void addEntry(Entry entry ){
      entryList.add(entry);
        System.out.println(entry);
    }
    public static void addAll(Entry... args) {
        entryList.addAll(Arrays.asList(args));
    }
    //delete
    public static String deleteEntry(Entry entry){
      var itGone = entryList.remove(entry);
       if(itGone){
           return "\nThe entry was removed.\n";
       }return "Execution failed, entry remains...";
    }


    public static void removeEntries(){
        entryList.clear();
        System.out.println("Address Book is all clear now!\n");
    }
    //finding

    public static Entry findEntry(Object findName){
        return entryList.stream()
                .filter(entry->entry.getFirstName().equals(findName))
                .findFirst()
                .orElseThrow();

    }

    //printing

    public static void printAll(){
        entryList.forEach(System.out::println);
    }
}
