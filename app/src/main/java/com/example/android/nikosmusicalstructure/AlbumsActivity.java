package com.example.android.nikosmusicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        //Code for HOME
        //Find the View that shows the HOME screen
        Button home=(Button) findViewById(R.id.homebutton);
        //Set a clicklistener on that view
        home.setOnClickListener(new View.OnClickListener(){
            //The code in this methoid will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view){
                Intent homeIntent=new Intent(AlbumsActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });




        //Code for ARTISTS
        //Find the View that shows the ARTISTS screen
        Button artists=(Button) findViewById(R.id.artistsbutton);
        //Set a clicklistener on that view
        artists.setOnClickListener(new View.OnClickListener(){
            //The code in this methoid will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view){
                Intent artistsIntent=new Intent(AlbumsActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });



        //Code for PLAYLISTS
        //Find the View that shows the PLAYLISTS screen
        Button playlists=(Button) findViewById(R.id.playlistsbutton);
        //Set a clicklistener on that view
        playlists.setOnClickListener(new View.OnClickListener(){
            //The code in this methoid will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view){
                Intent playlistsIntent=new Intent(AlbumsActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });


        //Code for SONGS
        //Find the View that shows the SONGS screen
        Button songs=(Button) findViewById(R.id.songsbutton);
        //Set a clicklistener on that view
        songs.setOnClickListener(new View.OnClickListener(){
            //The code in this methoid will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view){
                Intent songsIntent=new Intent(AlbumsActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });


    }
}
