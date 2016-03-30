package com.maratxxxxxx.mytodolist;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MyToDoListActivity extends Activity implements NewItemFragment.OnNewItemAddedListener {
    private ArrayAdapter<String>aa;
    private ArrayList<String> myToDoItems;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getFragmentManager();
        MyToDoListFragment myToDoListFragment = (MyToDoListFragment) fm.findFragmentById(R.id.MyToDoListFragment);

        myToDoItems = new ArrayList<String>();
        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myToDoItems);
        myToDoListFragment.setListAdapter(aa);

    }
    public void onNewItemAdded(String newItem){
        myToDoItems.add(newItem);
        aa.notifyDataSetChanged();
    }


}
