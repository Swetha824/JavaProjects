import java.util.ArrayList;
import java.util.List;

public class streamsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<String>();
		names.add("Swetha");
		names.add("s");
		names.add("a");
		names.add("bcdef");
		
		long c =names.stream().filter(s->s.startsWith("s")).count();
		System.out.println(c);
		System.out.println(names.stream().filter(s->s.toUpperCase().startsWith("S")).count());
		long c1 =names.stream().filter(s->s.startsWith("c")).count();
		System.out.println("C1 "+ c1);
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		//limit result to 1
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}

}
