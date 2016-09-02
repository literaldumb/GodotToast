//Copyright: TeamKrishna (www.teamkrishna.in)
//Author: Kaushik Mazumdar(literaldumb@gmail.com)

package org.godotengine.godot;

//imports
import android.app.Activity;
import android.widget.Toast;


public class GodotToast extends Godot.SingletonBase {

	Activity m_pActivity;
	boolean useLibrary;

    	static public Godot.SingletonBase initialize(Activity p_activity) {
        	return new GodotToast(p_activity);
    	}

    	public GodotToast(Activity p_activity) {
		m_pActivity = p_activity;

        	//register class name and functions to bind
        	registerClass("GodotToast", new String[]{"puke","initToast"});
    	}

	public void initToast(boolean useLib)
	{
		useLibrary = useLib;
	}

	public void puke(String pukeMsg,int dur)
	{
		if(useLibrary)
		{
			final CharSequence cs = pukeMsg;
			final int duration = dur;
			m_pActivity.runOnUiThread(new Runnable(){
		
			public void run()
			{
				Toast.makeText(m_pActivity.getApplicationContext(),cs,duration).show();
			}
			});
		}
	}
}
