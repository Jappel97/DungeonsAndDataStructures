package com.example.awesomefat.dungeonsanddatastructures;

import android.content.Context;

import com.google.firebase.database.Exclude;

/**
 * Created by awesomefat on 3/29/18.
 */

public class Player
{
    public String name;
    public int currentRoom_index;

    private MainActivity context;

    public Player(){}

    public Player(String name, MainActivity context)
    {
        this.name = name;
        this.currentRoom_index = -1;
        this.context = context;
    }

    public void display()
    {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }


    @Exclude
    public Room getCurrentRoom()
    {
        return Core.theDungeon.rooms.get(this.currentRoom_index);
    }

    public void setCurrentRoomIndex(int currentRoom_index)
    {
        this.currentRoom_index = currentRoom_index;
    }

    public MainActivity getContext() {
        return context;
    }
}
