package com.example.zein.zeinyt4;

import ir.mirrajabi.searchdialog.core.Searchable;

public class SearchModel implements Searchable {
    private String mTitle;

    public SearchModel(String string){
         this.mTitle=string;
    }
    @Override
    public String getTitle() {
        return mTitle;
    }
}
