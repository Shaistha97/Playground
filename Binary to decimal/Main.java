#include<stdio.h>
int main()
{
  int num,bin,dec=0,base=1,rem;
  scanf("%d",&num);
  bin=num;
  while(num>0)
  {
    rem = num %10;
    dec = dec + rem * base;
    num = num/10;
    base = base * 2;
  }
  printf("%d",dec);
  return 0;
}