package in.odishaexclusive.odianewspaper;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.ads.*;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AudienceNetworkAds.initialize(this);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);




        final ImageView sambad = (ImageView) findViewById(R.id.sambad);
        // Set a click listener on that View

        sambad.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent sambadIntent = new Intent(MainActivity.this, sambad.class);
                startActivity(sambadIntent);
            }
        });

//     s

//        final ImageView prameya = (ImageView) findViewById(R.id.prameya);
//
//        prameya.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the colors View is clicked on.
//            @Override
//            public void onClick(View view) {
//                Intent prameyaIntent = new Intent(MainActivity.this, prameya.class);
//                startActivity(prameyaIntent);
//            }
//        });


        final ImageView samaja = (ImageView) findViewById(R.id.samaja);
        // Set a click listener on that View

        samaja.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent samajaIntent = new Intent(MainActivity.this, samaja.class);
                startActivity(samajaIntent);
            }
        });

        final ImageView pragatibadi = (ImageView) findViewById(R.id.pragatibadi);
        // Set a click listener on that View

        pragatibadi.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent pragatibadiIntent = new Intent(MainActivity.this, pragatibadi.class);
                startActivity(pragatibadiIntent);
            }
        });

        final ImageView dharitri = (ImageView) findViewById(R.id.dharitri);
        // Set a click listener on that View

        dharitri.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent dharitriIntent = new Intent(MainActivity.this, dharitri.class);
                startActivity(dharitriIntent);
            }
        });

        final ImageView odishaexclusive = (ImageView) findViewById(R.id.odishaexclusive);
        // Set a click listener on that View

        odishaexclusive.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent odishaexclusiveIntent = new Intent(MainActivity.this, odishaexclusive.class);
                startActivity(odishaexclusiveIntent);
            }
        });

        final ImageView otv = (ImageView) findViewById(R.id.otv);
        // Set a click listener on that View

        otv.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent otvIntent = new Intent(MainActivity.this, otv.class);
                startActivity(otvIntent);
            }
        });



        final ImageView dinalipi = (ImageView) findViewById(R.id.dinalipi);
        // Set a click listener on that View

        dinalipi.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent dinalipiIntent = new Intent(MainActivity.this, dinalipi.class);
                startActivity(dinalipiIntent);
            }
        });



        final ImageView odishabhaskar = (ImageView) findViewById(R.id.bhaskar);
        // Set a click listener on that View

        odishabhaskar.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent odishabhaskarIntent = new Intent(MainActivity.this, odishabhaskar.class);
                startActivity(odishabhaskarIntent);
            }
        });


//        final ImageView anupambharat = (ImageView) findViewById(R.id.anupambharat);
//        // Set a click listener on that View
//
//        anupambharat.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the colors View is clicked on.
//            @Override
//            public void onClick(View view) {
//                Intent anupambharatIntent = new Intent(MainActivity.this, anupambharat.class);
//                startActivity(anupambharatIntent);
//            }
//        });

        final ImageView odishareporter = (ImageView) findViewById(R.id.odishareporter);
        // Set a click listener on that View

        odishareporter.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent odishareporterIntent = new Intent(MainActivity.this, odishreporter.class);
                startActivity(odishareporterIntent);
            }
        });



    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {



            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Are you sure you want to exit?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            MainActivity.super.onBackPressed();
                        }
                    })

                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });

            AlertDialog alertDialog= builder.create();
            alertDialog.show();

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {


            try{
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id=in.odishaexclusive.odianewspaper")));
            } catch (ActivityNotFoundException e){
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://play.google.com/store/apps/details?id=in.odishaexclusive.odianewspaper")));
            }
            //return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        // do things when nav bar item selected

        if (id == R.id.nav_camera) {

            Intent homeIntent = new Intent(this, MainActivity.class);
            startActivity(homeIntent);



        } else if (id == R.id.nav_gallery) {
            Intent savepageIntent = new Intent(this, SavedPage.class);
            startActivity(savepageIntent);


        } else if (id == R.id.nav_slideshow) {
            Intent aboutIntent = new Intent(this, AboutUs.class);
            startActivity(aboutIntent);

        } else if (id == R.id.nav_exit) {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Are you sure you want to exit?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            MainActivity.super.onBackPressed();
                        }
                    })

                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });

            AlertDialog alertDialog= builder.create();
            alertDialog.show();


            /*

            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1); */

        } else if (id == R.id.nav_share) {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            String shareBody="Download this Amazing App";
            String sharesub="You can read all odia news paper in this one app.. must give it a try     Download Now:- https://play.google.com/store/apps/details?id=in.odishaexclusive.odianewspaper";
            shareIntent.putExtra(Intent.EXTRA_SUBJECT,shareBody);
            shareIntent.putExtra(Intent.EXTRA_TEXT,sharesub);
            startActivity(Intent.createChooser(shareIntent,"Share using"));

        } else if (id == R.id.nav_odiawordbook) {
            try{
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id=com.thefactbuzz.spokenenglishinodia")));
            } catch (ActivityNotFoundException e){
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://play.google.com/store/apps/details?id=com.thefactbuzz.spokenenglishinodia")));
            }

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;





}
}