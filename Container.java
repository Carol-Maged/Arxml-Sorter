
//package carol;

public class Container implements Comparable<Container>  {
     private String UUID;
    private String SHORTNAME;
    private String LONGNAME;

   public void setUUID(String UUID){
       this.UUID=UUID;
   }
   public String getUUID(){
       return UUID;
   }
   public void setSHORTNAME(String SHORTNAME ){
       this.SHORTNAME=SHORTNAME;
   }
   public String getSHORTNAME(){
       return SHORTNAME;
   }
   
   public void setLONGNAME(String LONGNAME){
       this.LONGNAME=LONGNAME;
   }
   public String getLONGNAME(){
       return LONGNAME;
   }
   
   @Override
   public String toString(){
     return ("  <CONTAINER UUID=" + this.getUUID() + "\">\n" + "     <SHORT-NAME>"  + this.getSHORTNAME() + "</SHORT-NAME>\n" + 
             "    <LONG-NAME>" + this.getLONGNAME() + "</LONG-NAME>\n" + "</CONTAINER>\n");
   }
   
   @Override
   public int compareTo(Container a){
   if(this.getSHORTNAME().charAt(9) > a.getSHORTNAME().charAt(9)) {
       return 1;
   }
   else if (this.getSHORTNAME().charAt(9) < a.getSHORTNAME().charAt(9)){
       return -1;
   }
   else {
       return 0;
   }    
   }  
}
