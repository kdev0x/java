import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;

public class PythonCodeGenerator{
    public static void main(String[] args){

        try{
            FileOutputStream pyFile = new FileOutputStream("main.py",false);
            String pythonCode = "colors = [\"red\", \"blue\", \"green\", \"yellow\", \"black\"]\n";
            pythonCode +="color = input(\"pick a color: \")\n";
            pythonCode += "if color not in colors:\n";
            pythonCode += "\tprint(color + \" is not exist in colors list\")\n";
            pythonCode += "else:\n";
            pythonCode += "\tprint(color + \" does exist in colors list\")\n";
            pythonCode += "print(colors)";

            byte[] pythonBytes = pythonCode.getBytes();

            pyFile.write(pythonBytes);
            pyFile.close();
        }catch(FileNotFoundException e) {
            System.err.println(e.getMessage());
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
        // File ksqFile = new File("main.ksq");
        // try{
        //     if(ksqFile.createNewFile()){
        //         System.out.println("new file created" + ksqFile.getCanonicalPath());
        //     }else{
        //         System.err.println("file not created");
        //     }

        // }catch(IOException e){
        //     System.err.println(e.getMessage());
        // }
    }

}
