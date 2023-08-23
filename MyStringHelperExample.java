class MyStringHelper{
    // public static int getCharaacterCount(String value, char target){
    //     int counter = 0;
    //     for(int i = 0; i < value.length(); i++){
    //         if(value.charAt(i) == target){
    //             counter++;
    //         }
    //     }
    //     return counter;
    // }
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

    // public static char getLastCharceter(String value){
    //     return value.charAt(value.length() - 1);
    // }

    // public static char getLastCharceter(String value){
    //     for(int ndx = 0 ; ndx < value.length(); ndx++){
    //         if(ndx == (value.length() - 1)){
    //             return value.charAt(ndx);
    //         }
    //     }
    //     return '\0';
    // } 
    public static char getLastCharceter(String value){
        for(int ndx = value.length() - 1 ; ndx >= 0;/* ndx-- */){
            return value.charAt(ndx);
        }
        return '\0';
    } 
}

public class MyStringHelperExample{
    public static void main(String[] args) {
        int result = MyStringHelper.getCharacterCount("Welcome to Java", 'e'); /* method interface */
        System.out.println(result);

        char theChar = MyStringHelper.getLastCharceter("hello world");
        System.out.println(theChar);
    }
}
