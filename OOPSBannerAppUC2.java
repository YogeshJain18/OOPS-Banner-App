public class OOPSBannerApp {
 
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
    
        OOPSBannerApp app = new OOPSBannerApp();
        app.displayBanner();
    }

    public void displayBanner() {
        for (String line : BANNER_LINES) {
            System.out.println(line);
        }
    }

}
