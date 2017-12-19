package com.example.tarkeshwar.sqlitetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText name, phone;
    private Button btn_add,btn_view;
    private String contact_name, contact_number;
    private Contact contact;
    private SQLiteHelper helper;
    private List<Contact> allContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name);
        phone = (EditText) findViewById(R.id.phone);
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_view = (Button) findViewById(R.id.btn_view);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contact_name = name.getText().toString();
                contact_number = phone.getText().toString();
                contact = new Contact(contact_name, contact_number);
               helper = new SQLiteHelper(MainActivity.this);
                helper.addContact(contact);
                System.out.println("Contact Added");
                Toast.makeText(MainActivity.this,"Contact Number Added",Toast.LENGTH_LONG).show();
            }
        });
        btn_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contact = new Contact();
                helper = new SQLiteHelper(MainActivity.this);
                List<Contact> allContacts = helper.getAllContacts();
                if (allContacts.size()<1) {
                    System.out.println("Sorry I Dont Have any Contact Number "+allContacts.size());
                    Toast.makeText(MainActivity.this, "Sorry I Dont Have any Contact Number "+allContacts.size(), Toast.LENGTH_LONG).show();
                }
                else {
                    System.out.println("Contact Retrived"+ allContacts.size());
                    Toast.makeText(MainActivity.this, "Yes i have Contacts Now "+allContacts.size(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

