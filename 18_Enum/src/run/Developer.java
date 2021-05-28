package run;
 
public class Developer {
     
    public String name;
    public int career;
    public DevType type;
     
    public static void main(String[] args){
        Developer developer = new Developer();
         
        developer.name = "ȫ�浿";
        developer.career = 3;
        developer.type = DevType.WEB;
         
        System.out.println("������ �̸� : "+ developer.name);
        System.out.println("������ ��� : "+ developer.career);
        System.out.println("������Ʈ     : "+ developer.type);
        
        // values() : Enum�� �迭�� �����´�
        
        for(DevType type : DevType.values()) {
        	System.out.println(type);
        }
        
        
        // ordinal() : �ش� ��Ұ� Enum�� ���° ����ΰ��� �����Ѵ�.
        
        System.out.println(developer.type.ordinal());
        
        DevType tp = developer.type.SERVER;
         
        System.out.println(tp.ordinal()); 
        
        
        // valueOf() : �Ű������� �־��� String�� ���������� ��ġ�ϴ� �̸��� ���� ���Ҹ� �����Ѵ�
        
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
 
    MOBILE("�ȵ���̵�"), WEB("������"), SERVER("������");
	
	final private String name;
	
	public String getName() {
		return name;
	}
	
	private DevType(String name) {
		this.name = name;
	}
}