package com.bonfireapp.bonfireapp.bonfireapp;

public class Event {

    private int ID;
    private String Name;
    private String Description;
    private String Address;
    private String Event_start;
    private String Event_end;
    private String Category;
    private boolean Selected;

    public Event() {}

    public Event(String name, String description, String address, String event_start, String event_end, String category) {
        Name = name;
        Description = description;
        Address = address;
        Event_start = event_start;
        Event_end = event_end;
        Category = category;
    }

    public Event(int id, String name, String description, String address, String event_start, String event_end, String category) {
        ID = id;
        Name = name;
        Description = description;
        Address = address;
        Event_start = event_start;
        Event_end = event_end;
        Category = category;
    }

    /**
     * @return the iD
     */
    public int getID() {
        return ID;
    }

    /**
     * @param iD the iD to set
     */
    public void setID(int iD) {
        ID = iD;
    }

    /**
     * @return the name
     */
    public String getName() {
        return Name;
    }


    /**
     * @param name the name to set
     */
    public void setName(String name) {
        Name = name;
    }


    /**
     * @return the description
     */
    public String getDescription() {
        return Description;
    }


    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        Description = description;
    }


    /**
     * @return the address
     */
    public String getAddress() {
        return Address;
    }


    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        Address = address;
    }


    /**
     * @return the event_start
     */
    public String getEvent_start() {
        return Event_start;
    }


    /**
     * @param event_start the event_start to set
     */
    public void setEvent_start(String event_start) {
        Event_start = event_start;
    }


    /**
     * @return the event_end
     */
    public String getEvent_end() {
        return Event_end;
    }


    /**
     * @param event_end the event_end to set
     */
    public void setEvent_end(String event_end) {
        Event_end = event_end;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return Category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        Category = category;
    }

    public boolean isSelected(){
        return Selected;
    }

    public void setSelected(boolean selected){
        Selected = selected;
    }
}
