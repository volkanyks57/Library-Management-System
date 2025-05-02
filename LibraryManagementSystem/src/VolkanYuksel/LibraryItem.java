package VolkanYuksel;

public class LibraryItem{

    private String title;
    private int itemID;
    private Boolean isAvailable;
    private static int lastItemID = -1;

    public LibraryItem(String title){
        super();
        this.title = title;
        this.isAvailable = true;
        this.itemID = ++lastItemID;
    }

    public String getTitle(){
        return title;
    }

    public int getItemID(){
        return itemID;
    }

    public Boolean getAvailable(){
        return isAvailable;
    }

    public static int getLastItemID(){
        return lastItemID;
    }

    public void borrowItem(){
        if(isAvailable)
            isAvailable = false;
    }
    public void returnItem(){
        if(!isAvailable)
            isAvailable = true;
    }

    @Override
    public String toString(){
        return "id : " + this.getItemID() + " title : " + this.getTitle() + " availability : " + this.getAvailable();
    }
}
