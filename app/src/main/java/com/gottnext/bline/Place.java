package com.gottnext.bline;


import java.util.ArrayList;

public class Place {
    private String title;
    private String description;
    private String image;


    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public Place(){
        this.title = "";
        this.description = "";
        this.image = "";
    }

    public Place(String title, String description, String image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public static ArrayList<Place> getAll() {
        ArrayList<Place> list = new ArrayList<>();
        list.add(new Place("El Trompo","Museo interactivo","ic_map"));
        list.add(new Place("Parque Morelos","Parque interactivo","ic_map"));
        list.add(new Place("Parisina","Lugar de telas","ic_map"));
        list.add(new Place("Cecut","Centro cultural","ic_map"));
        list.add(new Place("Audiorama El Trompo","Museo interactivo","ic_map"));
        return list;
    }
}
