
#include <stdio.h>
int main()
{
  int num;
  int count=0;
  int temp=0;
  scanf("%d",&num);
  if(num>99)
  {
  num=num/100;
  num=num%100;
  num=num/10;
  printf("%d",num);
  return 0;
  }
  
  else
  {
    temp=num;
    while(temp != 0)
    {
        // n = n/10
        temp /= 10;
        ++count;
    }
    num=num%10;
    printf("%d",num);
    
  }
}
