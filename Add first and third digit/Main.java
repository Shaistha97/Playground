#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  int num,first,last,count;
  scanf("%d %d %d %d",&num,&first,&last,&count);
  count = log10(num);
  first=num/pow(10,count);
  last=num%10;
  printf("%d",first+last);
  return 0;
}