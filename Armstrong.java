public class Armstrong {
    public static void main(String args[]) {
      int n=4;
      int sum=0,count=0;
      int temp=n;
      while(temp>0){
          count++;
          temp=temp/10;
          }
      temp=n;
      while(temp>0){
         int rem=temp%10;
          int mul=1;
          for(int i=1; i<=count;i++)
          mul=mul*rem;
          sum=sum+mul;
          temp=temp/10;
      }
     
     if(sum==n)
      System.out.println(n+": is armstrong number:");
      else
      System.out.println(n+": is not armstrong number:");
    }
}