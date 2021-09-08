 import java.util.Scanner; 
class Game {
    public static void main( String args[] ) {
      int minVal = 1;
      int maxVal = 99;
        
      Scanner myObj = new Scanner(System.in); 
      int random_int = (int)Math.floor(Math.random()*(maxVal-minVal+1)+minVal);
    // For Testing
      // System.out.println(random_int);
      

       System.out.println("I am thinking of a number between 1 and 99");
      while(1==1){
       System.out.print("Enter a guess: \n =>");
        Integer guess = myObj.nextInt(); 
    
      
          if (guess > random_int) {

  System.out.println(" Your guess is too high");
   System.out.println("Try Again");
          }
          else if(guess<random_int){
          System.out.println("Your guess is too low ");
           System.out.println("Try Again");
            
}
else if(guess<random_int){
          System.out.println("Your guess is too low ");
           System.out.println("Try Again");
            
}

       if (guess == random_int) {
        System.out.println(" Congrats! The number was  " + guess); 
    break;
}

}

}
}
