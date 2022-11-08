package FinalExam;

public class Document {
    String[] authors = new String[3];
    private int date=615;

    public String[] getAuthors(){ return authors; }
    public void addAuthor(String aName)
    {
        int i =0;
        authors[i] = aName;
        i++;
    }
    public int getDate()
    {
        return date;
    }

}