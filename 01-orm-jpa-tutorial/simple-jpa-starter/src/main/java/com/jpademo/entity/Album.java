package com.jpademo.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Album {

    @Id
    @Column(name = "album_id")
    private int id;

    private String description;
    private int views;

    public Album() {
    }

    public Album(int id, String description, int views) {
        this.id = id;
        this.description = description;
        this.views = views;
    }

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Photo> photos;

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getViews() {
        return views;
    }

    public void setView(int views) {
        this.views = views;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", views=" + views +
                ", photos=" + photos +
                '}';
    }
}
