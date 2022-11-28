class Recuse{
public static void main(String[] args){
 System.out.println(reverse("mabu shamsu afru ashath"));
}
public static String reverse(String input) {
        if (input.equals("")) {  
            return input;
        }
        String[] arr = input.split(" ", 2); 
        String firstWord = arr[0];
        String remainingSentence;
        if (arr.length == 2)
            remainingSentence = arr[1];
        else
            remainingSentence = "";
        return reverse(remainingSentence) + firstWord + " ";  
    }
}