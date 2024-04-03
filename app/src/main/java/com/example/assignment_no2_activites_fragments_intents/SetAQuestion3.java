/*
 SET A
      3.Create simple application to display details of selected list item on second activity
        (use Fragmentation).
*/

package com.example.assignment_no2_activites_fragments_intents;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
public class SetAQuestion3 extends AppCompatActivity {

    private ListView listView;
    private String[] items = {"item 1","item 2", "item 3", "item 4"};
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_a_question_3);
        listView = findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selcetedItem = items[position];
                openDetailsActivity(selcetedItem);
            }
        });

    }
    private void openDetailsActivity(String selectedItem){
        Intent intent = new Intent(this, SetAQuestion3B.class);
        intent.putExtra("selectedItem", selectedItem);
        startActivity(intent);
    }
}
