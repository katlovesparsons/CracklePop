public class CountPrint {
    public static void main(String args[]) {
      int x=1;
        while (x<100){
            if(x%3==0 && x%5==0){
                System.out.println("CracklePop");
            }
          else if (x%3==0){
              System.out.println("Crackle");
          }
          else if (x%5==0){
              System.out.println("Pop");
          }
          else{
              System.out.println(x);
          }
       x=x+1; 
      }

    }
}