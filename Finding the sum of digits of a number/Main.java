#include <stdio.h>
int main() {
	//Type your code
  	int num;
  int sum=0;
  int i=1;
   scanf("%d",&num);
  while(num!=0)
  {
    sum+=num%10;
    num=num/10;
  }
  printf("%d",sum);
	return 0;
}

