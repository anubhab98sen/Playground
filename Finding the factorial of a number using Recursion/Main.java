#include <stdio.h>
int fact(int n),f=1;
int main()
{
  int n;
  scanf("%d",&n);
  printf("%d",fact(n));
   return 0;
}
int fact(int n)
{
  int i;
 for(i=n;n>=1;n--)
 {
   f=f*n;
 }
   return f;
}
