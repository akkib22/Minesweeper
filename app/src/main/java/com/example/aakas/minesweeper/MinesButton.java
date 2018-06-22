package com.example.aakas.minesweeper;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MinesButton extends AppCompatButton{
    int n;
    public int i,j;
    boolean isFlagged,isRevealed;

    public void setFlagged(boolean flagged) {
        isFlagged = flagged;
    }

    public boolean isFlagged() {
        return isFlagged;
    }

    public boolean isRevealed() {
        return isRevealed;
    }

    public void setRevealed(boolean revealed) {
        isRevealed = revealed;
    }

    public MinesButton(Context context) {
        super(context);
        isFlagged=false;
        isRevealed = false;

    }

    public void setValue(int value){
        n= value;
    }

    public int  getValue(){
        return n;
    }

    public void coordinates(int i, int j){
        this.i=i;
        this.j=j;
    }



}
