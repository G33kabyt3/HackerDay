package GameLogic;

import java.util.LinkedList;

public class EventData {
	
	static public LinkedList<Event> setList;
	public EventData() {
		setList = new LinkedList<Event>(); 
		setList.add(0, new Event("Laser Sharks"));
		setList.get(0).rule = "Pew Pew";
		setList.get(0).graphic.add(0, "/*******************************************************************/");
		setList.get(0).graphic.add(0, "/      ,|                                                           /");
		setList.get(0).graphic.add(1, "/     / ;                                                           /");
		setList.get(0).graphic.add(2, "/    /  \\                                                          /");
		setList.get(0).graphic.add(3, "/   : ,'(                                                           /");
		setList.get(0).graphic.add(4, "/   |( `.\\                                                         /");
		setList.get(0).graphic.add(5, "/   : \\  `\\       \\.                                             /");
		setList.get(0).graphic.add(6, "/    \\ `.         | `.                                             /");
		setList.get(0).graphic.add(7, "/     \\  `-._     ;   \\                                           /");
		setList.get(0).graphic.add(8, "/      \\     ``-.'.. _ `._                                         /");
		setList.get(0).graphic.add(9, "/       `. `-.            ```-...__                                 /");
		setList.get(0).graphic.add(10, "/        .'`.        --..          ``-..____                        /");
		setList.get(0).graphic.add(11, "/      ,'.-'`,_-._            ((((   <o. </,'/\\/\\/\\/\\/\\/       /");
		setList.get(0).graphic.add(12, "/           `' `-.)``-._-...__````  ____.-'                         /");
		setList.get(0).graphic.add(13, "/               ,'    _,'.--,---------'                             /");
		setList.get(0).graphic.add(14, "/           _.-' _..-'   ),'                                        /");
		setList.get(0).graphic.add(15, "/          ``--''        `                                          /");
		setList.get(0).graphic.add(15, "/*******************************************************************/");
	}
}
