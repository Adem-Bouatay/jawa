import java.io.File;  
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
class FileHandler {
    public String filePath;
    public int fileSizeInKb;
    public int numberOfLines;
    public String fileContent;
    public FileHandler(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            try{
                this.filePath = filePath;
                this.fileSizeInKb = (int) file.length() / 1024;
                Scanner scanner = new Scanner(file);
                int lines = 0;
                String content = "";
                while (scanner.hasNextLine()) {
                    content += scanner.nextLine() + "\n";
                    lines++;
                }
                this.numberOfLines = lines;
                this.fileContent = content;
                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            } 
        } else {
            System.out.println("File not found");
        }
    }
    public void readFile() {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            StringBuilder contentBuilder = new StringBuilder();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                contentBuilder.append(line).append("\n");
            }
            fileContent = contentBuilder.toString();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public ArrayList<String> findLinesWithPattern(String pattern) {
        ArrayList<String> lines = new ArrayList<String>();
        String[] fileLines = fileContent.split("\n");
        for (String line : fileLines) {
            if (line.contains(pattern)) {
                System.out.println("Pattern found");
                lines.add(line);
            }
        }
        return lines;
    }
    public boolean compareStrings1(String str1, String str2) {
        return str1.equals(str2);
    }
    public boolean compareStrings2(String str1, String str2) {
        return str1 != str2;
    }
    public boolean compareStrings3(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }
    public boolean compareStrings4(String str1, String str2) {
        return str1 == str2;
    }
    public void reverseString(int lineIndex) {
        String[] fileLines = fileContent.split("\n");
        String line = fileLines[lineIndex - 1];
        StringBuilder reversedLine = new StringBuilder();
        reversedLine.append(line);
        reversedLine = reversedLine.reverse();
        fileLines[lineIndex - 1] = reversedLine.toString();
        fileContent = String.join("\n", fileLines);
    }
    public void removeDuplicates(int lineIndex) {
        String[] fileLines = fileContent.split("\n");
        String line = fileLines[lineIndex - 1];
        StringBuilder lineWithoutDuplicates = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            if (lineWithoutDuplicates.indexOf(String.valueOf(line.charAt(i))) == -1) {
                lineWithoutDuplicates.append(line.charAt(i));
            }
        }
        fileLines[lineIndex - 1] = lineWithoutDuplicates.toString();
        fileContent = String.join("\n", fileLines);
    }
}
class EX1 {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler("file.log");
        int lineIndexToReverse = 1;
        fileHandler.reverseString(lineIndexToReverse);
        int lineIndexToRemoveDuplicates = 2;
        fileHandler.removeDuplicates(lineIndexToRemoveDuplicates);
        String pattern = "epoch";
        ArrayList<String> linesWithPattern = fileHandler.findLinesWithPattern(pattern);
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println("Comparaison avec equals : " + fileHandler.compareStrings1(str1, str2));
        String str5 = "hello";
        String str6 = "HELLO";
        System.out.println("Comparaison avec equalsIgnoreCase : " + fileHandler.compareStrings3(str5,
        str6));
        String str7 = "hello";
        String str8 = "hello";
        System.out.println("Comparaison avec == : " + fileHandler.compareStrings4(str7, str8));
        System.out.println("Comparaison avec == : "+ fileHandler.compareStrings4(new
        String("hello"),"hello"));
        System.out.println("Comparaison avec == : "+ fileHandler.compareStrings4(new String("hello"),
        new String("hello")));
        System.out.println("Ligne contenant le motif ’" + pattern + "’ : " + linesWithPattern.get(1));
}
}