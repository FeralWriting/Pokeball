class Pokeball {
  public static void main(String[] args) {
    Top();
    Middle();
    Bottom();
  }
//This Pokéball graphic can be used in the opening sequence of my Pokémon game, or any time the player needs to catch a wild Pokémon
  public static void Top() {
    int i;
    int j;
    int k;
    for (i = 1; i <= 4; i++) {
      for (j = 1; j <= -1 * i + 4; j++) {
        System.out.print(" ");
      }
      for (k = 1; k <= 2 * i + 8; k++) {
        System.out.print("@");
      }
      for (j = 1; j <= -1 * i + 4; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  public static void Middle () {
    System.out.println("|||||[\"\"\"\"]|||||");
    System.out.println("|||||[....]|||||");
  }

  public static void Bottom() {
    int i;
    int j;
    int k;
    for (i = 1; i <= 4; i++) {
      for (j = 1; j <= i - 1; j++) {
        System.out.print(" ");
      }
      for (k = 1; k <= -2 * i + 18; k++) {
        System.out.print("@");
      }
      for (j = 1; j <= i - 1; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }

  }
}
