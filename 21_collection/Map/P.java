import java.util.TreeMap;
class P
{
	public static void main(String[] args){
		TreeMap map = new TreeMap();
		map.put("mohan",12);
		map.put("sohan",14);
		map.put("rohan",16);
		map.put("johan",19);
		map.put("yohan",21);
		map.put("vohan",13);
		map.put("zohan",24);
		map.put("gohan",34);
		System.out.println(map);
		//System.out.println(map.ceilingEntry("johan"));//retrun least key value set greater than or equal to given key
		//System.out.println(map.ceilingKey("fohan"));//return leat key  greater than or equal to given key
		System.out.println(map.floorKey("zoahn"));//return greatest key  less than or equal to given key
		System.out.println(map.headMap("yohan"));//return whose keys are less thanto given
		System.out.println(map.headMap("yohan",true));//return whose keys are less thanto given
		System.out.println(map.headMap("yohan",false));//return whose keys are less thanto given
	}
}