package main.java.com.example.docflower.docflower.model;

public class UserImg {
    private String fileName;
    private String newFileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getNewFileName() {
        return newFileName;
    }

    public void setNewFileName(String newFileName) {
        this.newFileName = newFileName;
    }

    @Override
    public String toString() {
        return "Img{" +
                "fileName='" + fileName + '\'' +
                ", newFileName='" + newFileName + '\'' +
                '}';
    }
}

