class calculator
{
    float addition( float operand_1,float operand_2){
        return(operand_1+operand_2);
    }
    float subtraction( float operand_1,float operand_2){
        return(operand_1-operand_2);
    }
    float multiplication( float operand_1,float operand_2){
        return(operand_1*operand_2);
    }
    float division( float operand_1,float operand_2){
        return(operand_1/operand_2);
    }
   
    public static void main(String[] args) {
        calculator calc= new calculator();

float operand_1=10;
     float operand_2=5;

 



 
 float add_result=calc.addition(operand_1,operand_2);
 System.out.println("result of subtraction is:"+add_result);

    float sub_result=calc.subtraction(operand_1,operand_2);
    System.out.println("result of subtraction is:"+sub_result);

    float mul_result=calc.multiplication(operand_1,operand_2);
    System.out.println("result of multiplication is:"+mul_result);

    float div_result=calc.division(operand_1,operand_2);
    System.out.println("result of division:"+div_result);

 
   
    }
       
    }