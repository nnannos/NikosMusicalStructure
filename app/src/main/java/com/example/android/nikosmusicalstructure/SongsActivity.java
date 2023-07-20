package com.example.android.nikosmusicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        //Code for HOME
        //Find the View that shows the HOME screen
        Button home=(Button) findViewById(R.id.homebutton);
        //Set a clicklistener on that view
        home.setOnClickListener(new View.OnClickListener(){
            //The code in this methoid will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view){
                Intent homeIntent=new Intent(SongsActivity.this, MainActivity.class);
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
                Intent artistsIntent=new Intent(SongsActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        //Code for ALBUMS
        //Find the View that shows the ALBUMS screen
        Button albums=(Button) findViewById(R.id.albumsbutton);
        //Set a clicklistener on that view
        albums.setOnClickListener(new View.OnClickListener(){
            //The code in this methoid will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view){
                Intent albumsIntent=new Intent(SongsActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
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
                Intent playlistsIntent=new Intent(SongsActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });



    }
}