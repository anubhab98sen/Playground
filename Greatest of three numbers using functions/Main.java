#include <stdio.h>
int main(){
	int n1,n2,n3,x;
  scanf("%d %d %d",&n1,&n2,&n3);
  x=gr_no(n1,n2);
  printf("%d",gr_no1(x,n3));
  	return 0;
}
int gr_no(int n1,int n2)
{
  int gr;
  if(n1>n2)
  {
    gr=n1;
  }
  else
  {
    gr=n2;
  }
  return gr;
}
int gr_no1(int x,int n3)
{
  int gr1;
  if(x>n3)
  {
    gr1=x;
  }
  else
  {
    gr1=n3;
  }
  return gr1;
}