#include<stdio.h>
int main()
{
  int area,peri,l=6,b=9;
  peri=2*(l+b);
  area=l*b;
  printf("The perimeter of the rectangle is: %d cm\n",peri);
  printf("The area of the rectangle is: %d sq cm",area);
  return 0;
}