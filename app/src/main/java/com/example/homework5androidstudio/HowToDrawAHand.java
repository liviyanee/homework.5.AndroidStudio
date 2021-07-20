package com.example.homework5androidstudio;

public class HowToDrawAHand {
    String item, description;
    int image;

    public HowToDrawAHand(String item, String description, int image) {
        this.item = item;
        this.description = description;
        this.image = image;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
