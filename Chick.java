class Chick implements Animal 
{     
     private String myType;     
     private String mySound;
     private String mySound2;      
     public Chick(String type, String sound)     {         
         myType = type;         
         mySound = sound;     
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public Chick(String type, String sound1, String sound2)     {         
         myType = type;         
         mySound = sound1;
         mySound2 = sound2;     
     }     
     public String getSound(){return mySound + mySound2;}     
     public String getType(){return myType;} //your code here
}
