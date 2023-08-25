class MyStringHelper{
    /* String <- replaceSpaceWith -> value, character */
    /* r = replaceSpaceWith("Welcome to Java", '.')
     * r = "Welcome.to.Java"
     */

    /* imp-01 */
    // public static String replaceSpaceWith(String value, char character){
    //     return value.replace(' ', character);
    // }

    /* imp-02 */
    // public static String replaceSpaceWith(String value, char charcter){
    //     String retValue = "";
    //     char targetCharacter = '0';

    //     for(int count = 0; count < value.length(); count++){
    //         targetCharacter = value.charAt(count);
    //         if(targetCharacter == ' '){
    //             retValue = retValue + charcter; 
    //         }else{
    //             retValue = retValue + targetCharacter;
    //         }
    //     }
    //     return retValue;
    // }

    /* imp-03 */
    public static String replaceSpaceWith(String value, char charcter){
        String retValue = "";
        char targetCharacter = '0';
        int count = 0;
        while(count < value.length()){
            targetCharacter = value.charAt(count++);
            if(targetCharacter == ' '){
                retValue = retValue + charcter;
            }else{
                retValue = retValue + targetCharacter;
            }
            // count++;
        }
        return retValue;
    }

    /*
     * String <- reverseLastWord -> String message
     * Welcome to Java -> Welcome to avaJ
     */

     
    public static String reverseLastWord(String messeage){
        String[] result = messeage.split(" ");
        String newValue = "";
        for(int i = 0; i < result.length - 1; i++){
            newValue = newValue + result[i];
            if (i < (result.length - 1)){
                newValue = newValue + " ";
            }
        }

        /* String lastWord = result[result.length - 1] */
        String lastWord = result[result.length - 1];
        String reversedWord = "";
        for(int x = lastWord.length() - 1; x >= 0; x--){
            reversedWord = reversedWord + lastWord.charAt(x);
        }
        return newValue + " " + reversedWord;
    }

    public static int getCharacterCount(String value, char target){
        int counter = 0;
        int i = 0;
        while(i < value.length()){
            if(value.charAt(i) == target){
                counter++;
            }
            i++;
        }
        return counter;
    }

    public static char getLastCharceter(String value){
        for(int ndx = value.length() - 1 ; ndx >= 0;/* ndx-- */){
            return value.charAt(ndx);
        }
        return '\0';
    } 
}

public class MyStringHelperExample02{
    public static void main(String[] args) {
        String result = MyStringHelper.reverseLastWord("Hello world"); 
        System.out.println(result);
        // String result = MyStringHelper.replaceSpaceWith("Welcome To java", '-');
        // System.out.println(result);
    }
}
