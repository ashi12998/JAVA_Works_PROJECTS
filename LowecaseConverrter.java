public class LowecaseConverrter {
    public static void main(String[] args){
        String inputString = " My Name Is Ashish";
        String lowercaseString = ConvertToLowerCase(inputString);
        System.out.println("originnal String" + inputString);
System.out.println("lower case String" + lowercaseString);

    }
    private static String ConvertToLowerCase(String input){
        return input.toLowerCase();

    }
}
    
