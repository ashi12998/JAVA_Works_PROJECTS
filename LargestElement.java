public class LargestElement{
public static void main(String[] args){
    double[] numArray = { 23 , 45, 65 ,76, 33.9, -33, -44.8};
    double  largest = numArray[0];
    for ( double num  : numArray){
        if (largest < num)
        largest = num;


    }
    System.out.println(" Largest element = " + largest);
}
}