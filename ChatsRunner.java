package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class ChatsRunner {
	public static void main(String args[])
	{
		String chat1="pani puri";
		String chat2="masala puri";
		String chat3="sev puri";
		String chat4="congress masala";
		String chat5="golgappa";

		
		Collection<String> chats=new ArrayList<String>();
		chats.add(chat1);
		chats.add(chat2);
		chats.add(chat3);
		chats.add(chat4);
		chats.add(chat5);
		chats.add(null);
		chats.add("gobi");
		
		System.out.println("Before clear");
		System.out.println(chats);
		System.out.println(chats.size());
		
		System.out.println("After clear\n");
		
		for(String element:chats) {
			System.out.println(element);
		}
		chats.clear();
		}
}
	
