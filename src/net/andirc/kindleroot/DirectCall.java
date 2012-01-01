package net.andirc.kindleroot;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

public class DirectCall extends Activity {
    /**
     * @author jcase - Justin Case - jcase@cunninglogic.com
     * @author TeamAndIRC - http://twitter.com/TeamAndIRC
     * 
     * Testers:
     * VashyPooh
     * Trevor Eckhart
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
	 * tel: 86 01088524866 
	 * fax: 86 01088524866 
	 * 
	 */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		try {
			sendBroadcast(new Intent("com.amazon.internal.E_COMMAND").putExtra("cmd", "adbd_start"));
	        AlertDialog alertDialog1 = new AlertDialog.Builder(this).create();
	    	alertDialog1.setTitle("Root Enabled");
	    	alertDialog1.setCancelable(false);
	    	alertDialog1.setMessage("Credits:\n\nJustin Case (jcase) :Theory, Exploit and Code.\n\n" +
	    			"Vashypooh :Bugging the shit out of jcase and testing\n\n" +
	    			"Trevor Eckhart :Testing\n\n" +
	    			"IOMoster :Pointing out my stupid mistake that kept this from working.\n\n" +
	    			"AndroidPolice.com for support all my efforts, no matter how drunk I am.\n\n" +
	    			"RootzWiki.com for giving me support and a home on the net.");
	    	 alertDialog1.setButton("Exit", new DialogInterface.OnClickListener() {
	    	      public void onClick(DialogInterface dialog, int which) {
	    	    	  System.exit(0);
	    	    } });
	    	


	    	 alertDialog1.show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
}