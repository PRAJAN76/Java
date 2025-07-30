import java.util.ArrayList;
class contacts{
	public static void main(String[] args){
		ArrayList<String> cont_array = new ArrayList<String>();
		cont_array.add("abc-942136");
		cont_array.add("def-743569");
		cont_array.add("ghi-642146");
		cont_array.add("jkl-543629");
		System.out.println("contact infos: "+"\n"+cont_array);
		String a = cont_array.get(0);
		String b = cont_array.get(1);
		System.out.println("First contact: " + a);
		System.out.println("Second contact: " + b);
		System.out.println("Before Update: " + cont_array);
		cont_array.set(1, "pqr-934758");
		cont_array.set(3, "xyz-023498");
		System.out.println("After Update: " + cont_array);
		System.out.println("Before removing: " + cont_array);
		cont_array.remove(0);
		cont_array.remove(1);
		System.out.println("After removing: " + cont_array);
	}
}