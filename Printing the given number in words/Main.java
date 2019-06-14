#include<stdio.h>
int main()
{
  //Type your code here
  int num;
  scanf("%d",&num);
  if(num>5)
    printf("Invalid");
  else if(num==1)
    printf("One");
  else if(num==2)
    printf("Two");
  else if(num==3)
    printf("Three");
  else if(num==4)
    printf("Four");
  else
    printf("Five");
  return 0;
}