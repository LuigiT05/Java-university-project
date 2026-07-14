package Luglio1_2025;
import java.util.Comparator;

public class Comparatore implements Comparator<Box<?>>{
	@Override
	public int compare(Box<?> b1, Box<?> b2){
		if(b1.getVolume() > b2.getVolume())
			return 1;
		if(b1.getVolume() == b2.getVolume())
			return 0;
		return -1;
	}
}