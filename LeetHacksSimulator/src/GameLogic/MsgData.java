package GameLogic;

import java.util.LinkedList;

public class MsgData {
	static public LinkedList<String> msgList;
	public MsgData() {
		msgList = new LinkedList<String>();
		msgList.add(0, "WARNING: THE CIA IS WATCHING");
	}
}
