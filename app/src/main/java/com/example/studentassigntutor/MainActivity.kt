package com.example.studentassigntutor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        student_button.setOnClickListener { navigateToStudentPage() }
        tutor_button.setOnClickListener { navigateToTutorPage() }
    }

    private fun navigateToStudentPage() {
        val intent = Intent(this, StudentLogin::class.java)
        startActivity(intent)
    }

    private fun navigateToTutorPage() {
        val intent = Intent(this, TutorLogin::class.java)
        startActivity(intent)
    }
}

    /*private lateinit var databaseReference: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the database reference
        databaseReference = FirebaseDatabase.getInstance().reference

        // Write data to the database
        writeDataToDatabase("Hello, Firebase!")

        // Read data from the database
        readDataFromDatabase()
    }

    private fun writeDataToDatabase(data: String) {
        val dataRef = databaseReference.child("exampleData")
        dataRef.setValue(data)
    }

    private fun readDataFromDatabase() {
        val dataRef = databaseReference.child("exampleData")
        dataRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val value = dataSnapshot.getValue(String::class.java)
                if (value != null) {
                    // Data has been read from the database, do something with it
                    // For example, you can display it in a TextView
                    // textView.text = value
                }
            }

            override fun onCancelled(databaseError: DatabaseError) {
                // Handle any errors
            }
        })
    }*/
