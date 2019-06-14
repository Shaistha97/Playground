#include<stdio.h> 
int main(void) 
{ 
    long num; 
    int dig,sum; 
    
    scanf("%ld",&num); 
    
    do 
    { 
        sum = 0;  
        while(num!=0)  
        { 
            dig=num%10; 
            sum+=dig; 
            num/=10; 
        } 
       num=sum; 
    }while(num/10!=0);    
   printf("%d",sum); 
    return 0; 
}