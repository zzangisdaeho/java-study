package run;
 
public class Developer {
     
    public String name;
    public int career;
    public DevType type;
     
    public static void main(String[] args){
        Developer developer = new Developer();
         
        developer.name = "홍길동";
        developer.career = 3;
        developer.type = DevType.WEB;
         
        System.out.println("개발자 이름 : "+ developer.name);
        System.out.println("개발자 경력 : "+ developer.career);
        System.out.println("직무파트     : "+ developer.type);
        
        // values() : Enum의 배열을 가져온다
        
        for(DevType type : DevType.values()) {
        	System.out.println(type);
        }
        
        
        // ordinal() : 해당 요소가 Enum의 몇번째 요소인가를 리턴한다.
        
        System.out.println(developer.type.ordinal());
        
        DevType tp = developer.type.SERVER;
         
        System.out.println(tp.ordinal()); 
        
        
        // valueOf() : 매개변수로 주어진 String과 열거형에서 일치하는 이름을 갖는 원소를 리턴한다
        
        DevType tp1 = DevType.MOBILE;
        DevType tp2 = DevType.valueOf("WEB");
         
        System.out.println(tp1);
        System.out.println(tp2);
        
        // 
        
        for(DevType type : DevType.values()){
            System.out.println(type.getName());
        }
        
        
    }
 
}
 
enum DevType {
 
    MOBILE("안드로이드"), WEB("스프링"), SERVER("리눅스");
	
	final private String name;
	
	public String getName() {
		return name;
	}
	
	private DevType(String name) {
		this.name = name;
	}
}