//handling a file from secondary storange
//if your process set from RAM, we are forced to delete that file from RAM to gain system speed
/*
file operations
1. create
2. read
3. write
4. delete
5. append
6. close 
file reader => reading from the file
file writer => writing to the file
buffered reader => it is as same as file reader but its more efficienct
buffered write => more efficient than file writer
*/
import java.util.*;
class FileHandling{
    public static void main(String[] args) {
        try {
            File file = new File("hope.txt");
            if(file.createNewFile()){
                System.out.println("File created", file.getName());
            }
            else{
                System.out.println("File already exists");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}