import java.io.*;

import java.util.*;

// Read only region start
class Odd_Digits_Sum
{

public int OddDigitsSum(int input1){

// Read only region end
int r,sum=0;

while(input1>0){

r=input1%10;

if(r%2==1){

sum=sum+r;

}

input1=input1/10;

}

return sum;

}

}
