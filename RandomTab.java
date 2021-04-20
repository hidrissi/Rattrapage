import java.util.Random;
/**
 * Test de performances.
 *
 * @author Idrissi
 */
public final class RandomTab {
    /** Constructeur privee pour empecher l'instantition de classe. **/
    private RandomTab() { }

    /**
     * Generation d'un tableau d'entiers aleatoires.
     *
     * @param size taille du tableau
     * @return un tableau d'entiers aleatoires
     */
    public static int[] randomTab(final int size) {
	    Random rand = new Random();
        int[] tab = new int[size];
        for (int i = 0; i < tab.length; i++) {
	    tab[i] = rand.nextInt();
        }
        return tab;
    }
	
	public static void readTab(int[] tab) {
		System.out.println("***** Table Content *****");
		for (int i = 0; i < tab.length; i++) {
	    System.out.println(tab[i]);
        }
	}	

    /**
     * Programme principal.
     * @param args Arguments du programme
     */
    public static void  main(final String[] args) {
        System.out.println("Generation of table");
        long start = System.currentTimeMillis();
        int[] tab = randomTab(Integer.valueOf(args[0]).intValue());
        long end = System.currentTimeMillis();
        System.out.println("Time to Generate table : " + (end - start) + "ms");
    }
}
