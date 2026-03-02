public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = new String[7];

        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        // Combine letters to form "OOPS"
        for (int i = 0; i < banner.length; i++) {
            // Use "  " (two spaces) as separator between letters
            banner[i] = String.join("  ", O[i], O[i], P[i], S[i]);
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static method to build letter O - FIXED spacing
    public static String[] buildO() {
        return new String[]{
            " ***** ",  // Add trailing space for consistent width
            "*     *",  // Each line should be exactly 7 characters
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Static method to build letter P - FIXED to match width
    public static String[] buildP() {
        return new String[]{
            "*****  ",  // 7 chars: 5 stars + 2 spaces
            "*    * ",  // 7 chars: star, 4 spaces, star, space
            "*    * ",  // 7 chars: star, 4 spaces, star, space
            "*****  ",  // 7 chars: 5 stars + 2 spaces
            "*      ",  // 7 chars: star + 6 spaces
            "*      ",  // 7 chars: star + 6 spaces
            "*      "   // 7 chars: star + 6 spaces
        };
    }

    // Static method to build letter S - FIXED to match width
    public static String[] buildS() {
        return new String[]{
            " ***** ",  // 7 chars: space, 5 stars, space
            "*     *",  // 7 chars: star, 5 spaces, star
            "*      ",  // 7 chars: star + 6 spaces
            " ***** ",  // 7 chars: space, 5 stars, space
            "      *",  // 7 chars: 6 spaces, star
            "*     *",  // 7 chars: star, 5 spaces, star
            " ***** "   // 7 chars: space, 5 stars, space
        };
    }
}