package in.odishaexclusive.odianewspaper;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class dharitri extends AppCompatActivity {
    private WebView webView;
    public ProgressBar progressBar;
    private InterstitialAd mInterstitialAd;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dharitri);

        MobileAds.initialize(this,
                "ca-app-pub-7962001766479415~3120449561");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        progressBar = (ProgressBar) findViewById(R.id.dharitriprg);


        webView= (WebView)findViewById(R.id.dharitriweb);
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
        webView.loadUrl("http://www.dharitri.com/e-Paper/index.html");
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
                    "ca-app-pub-7962001766479415~3120449561");

            mInterstitialAd = new InterstitialAd(this);
            mInterstitialAd.setAdUnitId("ca-app-pub-7962001766479415/2562030453");
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
