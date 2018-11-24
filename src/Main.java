public class Main {

    boolean[] booleanArray;

    public Main() {

        booleanArray = new boolean[127];
        char[] chars = returnCharacters();
        ifDuplicateExists(chars);

    }

    public void ifDuplicateExists(char[] showMe) {

        for(char selected : showMe) {
            int selectedValue = (int) selected;
            if (booleanArray[selectedValue])
                System.out.println(selected + " is dublicated");
            else (booleanArray[selectedValue]) = true;
        }

    }

    public char[] returnCharacters() {
        char[] chars = {'a', '3', '2', '1', 'd', 'a', 'g', '3', '1', '^'};
        return chars;
    }



    public static void main(String[] args) {
        new Main();
    }

}

    /*
 Primitive Data Types
    boolean = true/false;

    int = -2,147,483,648 to 2,147,483,647
    short = -32,768 to 32,767
    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    String = "123qwe@.,!'"
    char = 'x'
    float, double, decimal
    */
