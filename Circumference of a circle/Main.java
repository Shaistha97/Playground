#include<stdio.h>
int main()
{
  float r;
  float area;
  scanf("%f %f",&r,&area);
  area = 3.14 * r * r;
  printf("%.2f",area);
  return 0;
}
