package in.odishaexclusive.odianewspaper;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.facebook.ads.*;

public class odishabhaskar extends AppCompatActivity {
    private WebView webView;
    public ProgressBar progressBar;
    private InterstitialAd mInterstitialAd;
    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Banner AD
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odishabhaskar);

        MobileAds.initialize(this,
                Config.BannerAdID);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        progressBar = (ProgressBar) findViewById(R.id.odishabhaskarprg);


        webView= (WebView)findViewById(R.id.odishabhaskarweb);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setBuiltInZoomControls(true);

        webView.setWebViewClient(new WebViewClient(){
                                     @Override
                                     public void onPageStarted(WebView view, String url, Bitmap favicon) {
                                         super.onPageStarted(view, url, favicon);
                                         progressBar.setVisibility(View.VISIBLE);
                                     }

                                     @Override
                                     public void onPageFinished(WebView view, String url) {
                                         super.onPageFinished(view, url);
                                         progressBar.setVisibility(View.GONE);
                                         setTitle(view.getTitle());
                                     }
                                 }


        );
        webView.loadUrl("https://odishabhaskar.com/epaper/");
    }

    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }

    @Override
    public void onBackPressed() {

        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
            //Load Interstitial ad
            MobileAds.initialize(this,
                    Config.Publisher_id);

            mInterstitialAd = new InterstitialAd(this);
            mInterstitialAd.setAdUnitId(Config.Interstitial_Ad_Id);
            mInterstitialAd.loadAd(new AdRequest.Builder().build());

            AdRequest adRequest = new AdRequest.Builder()
                    .build();


            mInterstitialAd.loadAd(adRequest);

            mInterstitialAd.setAdListener(new AdListener() {
                public void onAdLoaded() {
                    showInterstitial();


                }
            });
        }
    }
}
