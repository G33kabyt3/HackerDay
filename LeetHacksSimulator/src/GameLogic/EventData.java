package GameLogic;

import java.util.LinkedList;

public class EventData {
	
	public LinkedList<Event> setList;
	public EventData() {
		setList = new LinkedList<Event>(); 
		setList.add(0, new Event("Laser Sharks"));
		setList.get(0).rule = "Pew Pew";
		setList.get(0).graphic.add(0, "/*******************************************************************/");
		setList.get(0).graphic.add(1, "/      ,|                                                           /");
		setList.get(0).graphic.add(2, "/     / ;                                                           /");
		setList.get(0).graphic.add(3, "/    /  \\                                                           /");
		setList.get(0).graphic.add(4, "/   : ,'(                                                           /");
		setList.get(0).graphic.add(5, "/   |( `.\\                                                          /");
		setList.get(0).graphic.add(6, "/   : \\  `\\       \\.                                                /");
		setList.get(0).graphic.add(7, "/    \\ `.         | `.                                              /");
		setList.get(0).graphic.add(8, "/     \\  `-._     ;   \\                                             /");
		setList.get(0).graphic.add(9, "/      \\     ``-.'.. _ `._                                          /");
		setList.get(0).graphic.add(10, "/       `. `-.            ```-...__                                 /");
		setList.get(0).graphic.add(11, "/        .'`.        --..          ``-..____                        /");
		setList.get(0).graphic.add(12, "/      ,'.-'`,_-._            ((((   <o. <^~^~^~^~^~^~^~^~^~^~^~^~  /");
		setList.get(0).graphic.add(13, "/           `' `-.)``-._-...__````  ____.-'                         /");
		setList.get(0).graphic.add(14, "/               ,'    _,'.--,---------'                             /");
		setList.get(0).graphic.add(15, "/           _.-' _..-'   ),'                                        /");
		setList.get(0).graphic.add(16, "/          ``--''        `                                          /");
		setList.get(0).graphic.add(17, "/*******************************************************************/");
		
		
		setList.add(1, new Event("Illuminati"));
		setList.get(1).rule = "666";
		setList.get(1).graphic.add(0, "/******************************/");
		setList.get(1).graphic.add(1, "/              /\\              /");
		setList.get(1).graphic.add(2, "/             /  \\             /");
		setList.get(1).graphic.add(3, "/            /,--.\\            /");
		setList.get(1).graphic.add(4, "/           /< () >\\           /");
		setList.get(1).graphic.add(5, "/          /  `--'  \\          /");
		setList.get(1).graphic.add(6, "/         /          \\         /");
		setList.get(1).graphic.add(7, "/        /            \\        /");
		setList.get(1).graphic.add(8, "/       /______________\\       /");
		setList.get(1).graphic.add(9, "/******************************/");
	}
}
