#include<stdio.h>
int prime_number(int n);
int main()
{
    int n,i,flag;
  scanf("%d",&n);
  for(i=2;i<=n;i++)
  {
    flag=prime_number(i);
      if(flag==1)
        printf("%d \n",i);
    }
    return 0;
}
int prime_number(int n)
{
  int j,flag=1;
  for(j=2;j<=n/2;j++)
  {
    if(n%j == 0)
    {
      flag=0;
      break;
    }
  }
return flag;
}
  
  
  
