package sg.edu.rp.c346.problemstatement;

public class Holiday {

    private String imagename;
    private String name;
    private String date;


    public Holiday(String iamgename,String name ,String date) {
        this.name = name;
        this.imagename = imagename;
        this.date = date;
    }

    public String getImagename() {
        return imagename;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
}
