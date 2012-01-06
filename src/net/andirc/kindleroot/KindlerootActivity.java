package net.andirc.kindleroot;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

public class KindlerootActivity extends Activity {
	
    /**
     * @author jcase - Justin Case - jcase@cunninglogic.com
     * @author TeamAndIRC - http://twitter.com/TeamAndIRC
     * 
     * Testers:
     * VashyPooh
     * Trevor Eckhart
     * 
     * Graphics:
     * b16 of RootzWiki
     * 
     * Great Being of Knowledge:
     * IOMonster
     * 
     * Supporters:
     * http://AndroidPolice.com
     * http://RootzWiki.com
     * 
     * Copyright 2011 CunningLogic
     * This file is part of BurritoRoot.
     * 
     * BurritoRoot is free software: you can redistribute it and/or modify it under the terms of the 
     * GNU eneral Public License as published by the Free Software Foundation, either version 3 of 
     * the License, or (at your option) any later version.
     * 
     * BurritoRoot is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
     * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
     * General Public License for more details.
     * 
     * You should have received a copy of the GNU General Public License along with Foobar. If not, see
     * http://www.gnu.org/licenses/gpl-3.0.txt
     * 
     */

	/**
	 * The Wall Of Shame
	 * 
	 * Organizations and persons listed below have violated the copyright and/or licensing of BurritoRoot
	 * and have had their rights to use any part or derivative of BurritoRoot revoked.
	 * 
	 * You are scum, you steal the hard work of our developers. You even stole my non working unroot code
	 * you f*cking bum.
	 * 
	 * Author of unlockroot
	 * http://www(dot)unlockroot(dot)com
	 * Liang Bing
	 * cx66@msn.com
	 * support@unlockroot.com
	 * HongKong
	 * 
	 */
	
	
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        AlertDialog alertDialog1 = new AlertDialog.Builder(this).create();
    	alertDialog1.setTitle("Disclaimer");
    	alertDialog1.setCancelable(false);
    	alertDialog1.setMessage("Copyright 2011 TeamAndIRC. Using this application may void your warranty. General advice is not to root you device, however if you want to, if you understand" +
    			" what you are doing, and acknowledge you will hold no one responsible for any loss or damages caused by this app, or the rooting of your device click Agree. This application is" +
    			"opensource, and licensed under the GPLv3. Source is available at https://github.com/CunningLogic/BurritoRoot");
    	 alertDialog1.setButton("Agree", new DialogInterface.OnClickListener() {
    	      public void onClick(DialogInterface dialog, int which) {
    	    	  credit();
    	    } });
    	
    	 alertDialog1.setButton2("Disagree!", new DialogInterface.OnClickListener() {
   	      public void onClick(DialogInterface dialog, int which) {
   	    	  System.exit(0);
   	    } });
    	 

    	 alertDialog1.show();

        
    }
    
    public void root(){
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
    	alertDialog.setTitle("Now What?");
    	alertDialog.setCancelable(false);
    	alertDialog.setMessage("What do you want to do?");
    	 alertDialog.setButton("Root", new DialogInterface.OnClickListener() {
    	      public void onClick(DialogInterface dialog, int which) {
					try {
						sendBroadcast(new Intent("com.amazon.internal.E_COMMAND").putExtra("cmd", "adbd_start"));
	    				post();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
    	    } });
    	 
    	 alertDialog.setButton3("Exit", new DialogInterface.OnClickListener() {
      	      public void onClick(DialogInterface dialog, int which) {
      	    	  System.exit(0);
      	    } });
    	 alertDialog.show();
    }
    
    public void post(){
        AlertDialog alertDialog4 = new AlertDialog.Builder(this).create();
    	alertDialog4.setTitle("Final Steps");
    	alertDialog4.setCancelable(false);
    	alertDialog4.setMessage("On your computer run the following commands:\n" +
    			"adb kill-server\n" +
    			"adb root\n" +
    			"adb shell\n\n" +
    			"Enjoy.");
    	 alertDialog4.setButton("Exit", new DialogInterface.OnClickListener() {
    	      public void onClick(DialogInterface dialog, int which) {
    	    	  System.exit(0);
    	    } });

    	 alertDialog4.show();
    }

    public void credit (){
        AlertDialog alertDialog2 = new AlertDialog.Builder(this).create();
    	alertDialog2.setTitle("Credit");
    	alertDialog2.setCancelable(false);
    	alertDialog2.setMessage("Justin Case (jcase) :Theory, Exploit and Code.\n\n" +
    			"Vashypooh :Bugging the shit out of jcase and testing\n\n" +
    			"Trevor Eckhart :Testing\n\n" +
    			"IOMoster :Pointing out my stupid mistake that kept this from working.\n\n" +
    			"AndroidPolice.com for support all my efforts, no matter how drunk I am.\n\n" +
    			"RootzWiki.com for giving me support and a home on the net.");
    	 alertDialog2.setButton("You Rock", new DialogInterface.OnClickListener() {
    	      public void onClick(DialogInterface dialog, int which) {
    	    	  root();
    	    } });
    	
    	 alertDialog2.setButton2("You Suck!", new DialogInterface.OnClickListener() {
   	      public void onClick(DialogInterface dialog, int which) {
   	    	  System.exit(0);
   	    } });
    	 

    	 alertDialog2.show();
    }
}
