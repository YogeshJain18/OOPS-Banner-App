public class OOPSBannerApp {
    
    // Banner data as a class constant
    private static final String[] BANNER_LINES = {
        "  *****    *****   *****    *****  ",
        " *     *  *     *  *    *  *     * ",
        " *     *  *     *  *    *  *       ",
        " *     *  *     *  *****    *****  ",
        " *     *  *     *  *             *  ",
        " *     *  *     *  *       *     * ",
        "  *****    *****   *        *****  "
    };
    
    public static void main(String[] args) {
        // Create an instance and display banner
        OOPSBannerApp app = new OOPSBannerApp();
        app.displayBanner();
    }
    
    // Method to display the banner
    public void displayBanner() {
        for (String line : BANNER_LINES) {
            System.out.println(line);
        }
    }
}