class chapter4exercise3 {
    private static void printBeers(final int numBeers) {
        System.out.println(numBeers + getBottle(numBeers) + "of beer on the wall, "
                           + numBeers + getBottle(numBeers) + "of beer. You take one down, pass it round, "
                           + (numBeers-1) + getBottle(numBeers-1) + "of beer on the wall.");
        if (numBeers == 1) {return;}
        printBeers(numBeers-1);
    }

    private static String getBottle(final int count) {
        return (count == 1 ? " bottle " : " bottles ");
    }

    public static void main(String[] args) {
        printBeers(10);
    }
}
