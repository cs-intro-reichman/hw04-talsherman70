public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        //System.out.println(camelCase("hello woRld aNd Hello"));
        int[] arr = allIndexOf("superduper ter",'r');
        System.out.println(camelCase("   Intro to coMPUter sCIEncE"));
    
    }

    //Gets a string and turns all the vowels into capital letters, and all the rest to lowcase.
    public static String capVowelsLowRest (String string) {
        String change =""; 
        for (int i = 0; i < string.length(); i++){
            char c = string.charAt(i);
            if(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u'){
                c = (char) (c - 'a' + 'A');
            }
            else if (('A' < c && c <'E')||('E' < c && c <'I')||('I' < c && c <'O')||('O' < c && c <='Z' && c != 'U')) {
                    c = (char) (c - 'A' + 'a');
            }

            change += c;
        }
        return change;
    }

    //Gets a string, turns all the first letters of each word except the first one to capital, lowcases the rest and removes all spaces between words
    public static String camelCase (String string) {
        String change= "";
        string = lowerCase(string);
        for (int i = 0; i < string.length(); i++){
            char c = string.charAt(i);
            if(i >1){
            if(string.charAt(i-1) == ' ' && 'a' <= c && c <='z' ){
                c = (char) (c - 'a' + 'A');

            }
        }
        change += c;
        change = removeSpaces(change);  
        //change = lowerFirstChar(change);

        }
        return change;
    }
    //Gets a string and a char and returns an array of integers, that contains all the indexes of the string where the char appears in
    public static int[] allIndexOf (String string, char chr) {
        int count = 0;
         for (int i = 0; i < string.length(); i++){
            if(chr == string.charAt(i)){
                count++;
            }
        }
        int[] array = new int[count];
        int j = 0;
        for (int i = 0; i < string.length(); i++){
            if(chr == string.charAt(i)){
                array[j] = i;
                j++;
                
            }
        }
        return array;
    }

    //Helper function- turns all the letters in a string to lowcase
   public static String lowerCase(String str) {
        String change = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('A' <= c && c <='Z') {
                c = (char) (c - 'A' + 'a');
            }
            change += c;
        }
        return change;
    }

    //Helper function- removes all the space characters in a string
    public static String removeSpaces (String string){
        String change = "";
        for (int i = 0; i < string.length(); i++){
            char c = string.charAt(i);
            if(c != ' '){
                change += c;
            }
        }
        return change;
    }

    //Helper function- turns the first letter in a string to Lowcase
    public static String lowerFirstChar(String string){
        String change = "";
        char c =string.charAt(0);

        if ('A' <= c && c <='Z'){
            c = (char) (c - 'A' + 'a');
        }
        change +=c;
        change += string.substring(1, string.length());
        return change;
    }
}