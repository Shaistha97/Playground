#include <stdio.h>
int main()
{
  // Enter your code here 
  int i,num,prime=0;
  scanf("%d",&num);
 
   
  for(i=1;i<=num;i++)
  {
    if(num%i==0)
      prime++;
  }
  
  if(prime==2)
    printf("prime");
  else if(num==0)
     printf("neither");
  else
    printf("composite");
   return 0;
}
