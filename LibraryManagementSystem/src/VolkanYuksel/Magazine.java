package VolkanYuksel;

public class Magazine extends LibraryItem{

    private String issueNumber;
    private Date publication;

    public Magazine(String title, String issueNumber, Date publication){
        super(title);
        this.issueNumber = issueNumber;
        this.publication = publication;
    }

    public String getIssueNumber(){
        return issueNumber;
    }

    public Date getPublication(){
        return publication;
    }

    @Override
    public String toString(){
        return super.toString() + " Issue Number : " + this.getIssueNumber() + " Publication : " + this.getPublication();
    }
}
