class chapter4exercise3 {
    private static void printBeers(final int numBeers) {
        String currentBottles = getBottle(numBeers);
	String nextBottles = getBottle(numBeers - 1);
        System.out.println(currentBottles + "of beer on the wall, "
                           + currentBottles + "of beer. You take one down, pass it round, "
                           + nextBottles + "of beer on the wall.");
        if (numBeers == 1) {return;}
        printBeers(numBeers-1);
    }

    private static String getBottle(final int count) {
        return count + (count == 1 ? " bottle " : " bottles ");
    }

    public static void main(String[] args) {
        printBeers(10);
    }
}
