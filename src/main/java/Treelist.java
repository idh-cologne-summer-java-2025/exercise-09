import org.apache.commons.collections4.list.TreeList;
import java.util.*; 
public class Treelist {
	
	private static final int INITIAL_SIZE = 100_000;
    private static final int INSERTIONS = 10_000;

    public static void main(String[] args) {
        System.out.println("ArrayList:");
        Treelist(new ArrayList<>());

        System.out.println("\nLinkedList:");
        Treelist(new LinkedList<>());

        System.out.println("\nTreeList (Apache Commons):");
        Treelist(new TreeList<>());
    }

    private static void Treelist(List<Integer> list) {
        Random random = new Random();

        for (int i = 0; i < INITIAL_SIZE; i++) {
            list.add(random.nextInt());
        }

        long startTime = System.nanoTime();

        for (int i = 0; i < INSERTIONS; i++) {
            int value = random.nextInt();
            int index = random.nextInt(list.size());
            list.add(index, value);
        }

        long endTime = System.nanoTime();
        long durationMillis = (endTime - startTime) / 1_000_000;

        System.out.println("Dauer für 10.000 " + durationMillis + " ms");
    }
}