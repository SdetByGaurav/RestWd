package JSONParser;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

public class JSONParser1 {

	private static ObjectMapper mapper;
	static{
		mapper = new ObjectMapper();
	}
	
	public static void marshalling(EmpDetails obj)
	{
		try {
			mapper.writeValue(new File("./EmpDetails.json"), obj);
			String s = mapper.writeValueAsString(obj);
			System.out.println(s);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static <T>T unmarshalling(File jsonFileObj, 
										Class<T> cls) {
		T result = null;
		try {
			result = mapper.readValue(jsonFileObj, cls);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
