public class EvenNumber {
    public static void main(String[] args) {
        int sum=0;
        int number=1;
        while(number<=100){
            if(number%2==0){
                sum+=number;
            }
            number++;
        }
        System.out.println("the sum of all even numbers between 1 and 100 is:"+sum);
    }
    
}
