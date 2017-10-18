	//StreamTokenizer
	import java.io.*;
	class MyStreamTokenizer
  {
	public static void main(String str[])throws IOException
  {
	FileInputStream fin=new FileInputStream("e://dcc//abc1.txt");
	StreamTokenizer st=new StreamTokenizer(fin);
	st.eolIsSignificant(true);
	//st.eolIsSignificant(false);
	st.wordChars(33,255);
	st.whitespaceChars(0,0);
	int token=0;
	while(true)
  {
	token=st.nextToken();
	if(token==StreamTokenizer.TT_EOF)
	//if(token==StreamTokenizer.TT_EOL)
	break;
	if(token==StreamTokenizer.TT_NUMBER)
	System.out.println(st.nval+"number");
	if(token==StreamTokenizer.TT_WORD)
	System.out.println(st.sval+"word");
  }
  }
  }
