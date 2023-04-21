
//package carol;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Carol {

    public static void main(String[] args) {
       
    try{ 
         /* System.out.println("Enter name of file");
          Scanner input = new Scanner(System.in);
          File file = new File(input.nextLine());*/
         
          String filename = args[0];
          File file = new File(filename);
          if(!(file.getPath().endsWith(".arxml"))){
              throw new NotVaildAutosarFileException ("Invalid File Extension");
             // System.out.println("INVALID EXTENSION");
          }
          
           if (file.length() == 0){
              throw new EmptyAutosarFileException ("Empty Autosar File Exception");
          }
     
                
       
           
          //arraylist for container
          FileInputStream inputstream = new FileInputStream(file);
          int x;
          StringBuilder stringbuilder = new StringBuilder();
          
          while ((x=inputstream.read())!= -1){
              stringbuilder.append((char)x);
          }
          String data = stringbuilder.toString();
          Scanner scanner = new Scanner (data);
          //scanner.toString();
          ArrayList<Container> containers = new ArrayList<>();
          //read file
          while (scanner.hasNextLine()){
               String Line= scanner.nextLine();
             if (Line.contains("<CONTAINER")) {
               String UUID = Line.substring(Line.indexOf("UUID="), Line.indexOf(">"));
               String SHORTNAME = scanner.nextLine();
               String shortname = SHORTNAME.substring(SHORTNAME.indexOf(">")+1, SHORTNAME.indexOf("</"));
               String LONGNAME = scanner.nextLine();
               String longname = LONGNAME.substring(LONGNAME.indexOf(">")+1, LONGNAME.indexOf("</"));
 
      
               Container container = new Container();
               container.setUUID(UUID);
               container.setSHORTNAME(shortname);
               container.setLONGNAME(longname);
               containers.add(container);
         
           }
          }
    
          //sorting arraylist
          Collections.sort(containers);
          // put content in output file after sorting it
          String outputfile = file.getName().substring(0, file.getName().indexOf("."))+ "_mod.arxml";
          FileOutputStream outputstream = new FileOutputStream(outputfile);
          outputstream.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n".getBytes());
          outputstream.write("<AUTOSAR>\n".getBytes());
          
          
          for(int i=0;i<containers.size();i++){
            outputstream.write(containers.get(i).toString().getBytes());
          }
           outputstream.write("<AUTOSAR>\n".getBytes());
          
             
   }
   
      catch (EmptyAutosarFileException e){
           e= new EmptyAutosarFileException("Invalid File Extension");
      } 
      
      catch (NotVaildAutosarFileException e) {
           e= new NotVaildAutosarFileException("Invalid File Extension");
            
      }
      catch (IOException e){
          e = new IOException("IOException!") ;
      }
     
      
    }

    }

