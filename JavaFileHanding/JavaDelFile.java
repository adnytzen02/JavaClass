import java.io.File;


public class JavaDelFile {
    public static void main(STring[] args) {
        File myObj = new File("filename.txt");
        if (myObj.exists()) {
            System.out.println("Deleted the file: " + myObj.getName());
            myObj.delete();
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}