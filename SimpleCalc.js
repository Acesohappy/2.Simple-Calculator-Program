function Calculator(a,b,c)
{
  let result;
  switch(c)
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
          console.log("Error! Division by Zero is not Possible");
          break;
        }
        result=a/b;
        break;
      default:
        console.log("Operator is Invalid");
        return;
    }
  console.log("The result is: "+result);
}

function StartCalculator(){
  const prompt=require("prompt-sync")();

  console.log("Welcome to Simple Calculator");

  while(true)
    {
      const a=parseFloat(prompt("Enter the first number:"));
      const operator=prompt("Enter an operator:");
      const b=parseFloat(prompt("Enter the Second number:"));

      Calculator(a,b,operator);

      const continueResponse=prompt("Do you want to perform another Calculation(yes/no):");
      if(continueResponse.toLowerCase()=="no")
      {
        break;
      }

    }
  console.log("Thankyou for using the Calculator!!!");

}
StartCalculator();




    
