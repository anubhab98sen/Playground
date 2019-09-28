#include<stdio.h>
int square_of_no(int n);
int main()
{
  int n;
  scanf("%d",&n);
  printf("%d",square_of_no(n));
  return 0;
}
int square_of_no(int n)
{
  int sq;
  sq=n*n;
  return sq;
}