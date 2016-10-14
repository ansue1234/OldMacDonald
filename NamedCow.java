class NamedCow extends Cow 
{
	private String cowName;
	private String cowType;
	private String cowSound;


	public NamedCow(String type, String name, String sound ){
		cowName=name;
		cowType=type;
		cowSound=sound;
	}
	public String getName(){
		return cowName;
	}
	public String getType(){
		return cowType;
	}
	public String getSound(){
		return cowSound;
	}
}