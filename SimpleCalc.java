import java.util.Scanner;

public class SimpleCalc{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    double a,b,result=0;
    char operator;
    

    while(true)
      {
        System.out.println("Enter the first number:");
        a=sc.nextDouble();

        System.out.println("Enter the Operator:");
        operator=sc.next().charAt(0);

        System.out.println("Enter the second number:");
        b=sc.nextDouble();

        switch(operator)
          {
            case '+':
              result=a+b;
              break;
            case '-':
              result=a-b;
              break;
            case '*':
              result=a*b;
              break;
            case '/':
              if(b==0)
              {
                System.out.println("Division by 0 is not possible");
                break;
              }
              result=a/b;
              break;
            default:
              System.out.println("Operator is Invalid");
              continue;
          }
      System.out.println("The Result is: "+result);
      System.out.print("Do you want to perform another calculation? (yes/no): ");
          String continueResponse = sc.next();

          if (continueResponse.equalsIgnoreCase("no")) {
              break;
          }
      }

      
      sc.close();
      System.out.println("Thank you for using the calculator!");
  }
}

              

    
