#include<stdio.h>
int main()
{
  int a,b,c;
  int g2;
  scanf("%d %d %d",&a,&b,&c);
  if(a<b)
  {
    if(b<c)
      g2=b;
    else
      g2=(a<c?c:a);
  }
  else
  {
    if(a<c)
      g2=a;
    else
      g2=(b<c?c:b);
  }
  printf("second greatest = %d",g2);
  return 0;
}
