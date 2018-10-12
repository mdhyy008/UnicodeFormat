package com.dabai.unicode;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;

public class MainActivity extends Activity 
{
	EditText ed1;
	EditText ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		ed1 = (EditText)findViewById(R.id.mainEditText1);
		ed2 = (EditText)findViewById(R.id.mainEditText2);


		/*
		 // TODO Auto-generated method stub
		 String s = stringtoUnicode("中文");
		 System.out.println("编码："+s);
		 String s1 = unicodetoString(s);
		 System.out.println("解码："+s1);
		 */


	}
	//来回反复转码
	public void toU(View v)
	{
		try
		{
			ed2.setText(new UnicodeUtil().stringtoUnicode(ed1.getText().toString()));
		}
		catch (Exception e)
		{
			new AlertDialog.Builder(this).setMessage("错误代码:" + e).show();
		}
	}
	public void toS(View v)
	{

		try
		{
			ed1.setText(new UnicodeUtil().unicodetoString(ed2.getText().toString()));
		}
		catch (Exception e)
		{
			new AlertDialog.Builder(this).setMessage("错误代码:" + e).show();
		}
	}


}
