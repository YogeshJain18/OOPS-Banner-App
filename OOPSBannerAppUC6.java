public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = new String[7];

        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

     
        for (int i = 0; i < banner.length; i++) {
        
            banner[i] = String.join("  ", O[i], O[i], P[i], S[i]);
        }

    
        for (String line : banner) {
            System.out.println(line);
        }
    }

    public static String[] buildO() {
        return new String[]{
            " ***** ",  
            "*     *",  
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }


    public static String[] buildP() {
        return new String[]{
            "*****  ",
            "*    * ",  
            "*    * ", 
            "*****  ",  
            "*      ", 
            "*      ",  
            "*      " 
        };
    }

  
    public static String[] buildS() {
        return new String[]{
            " ***** ", 
            "*     *",  
            "*      ",  
            " ***** ",  
            "      *",
            "*     *", 
            " ***** "  
        };
    }

}
