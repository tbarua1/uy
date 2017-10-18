package io;
class Strr
{
static  int reverce(String s)
{
char ch[]=s.toCharArray();
int l=s.length();
for(int i=l-1;i>=0;i--)
{
System.out.println(ch[i]);
}
return 0;
}
public static void main(String []args)
{
reverce("hello it's reverce");
//System.out.println();
}
}

