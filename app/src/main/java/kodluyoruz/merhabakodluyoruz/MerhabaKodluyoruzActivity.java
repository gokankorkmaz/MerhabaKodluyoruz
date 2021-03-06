package kodluyoruz.merhabakodluyoruz;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MerhabaKodluyoruzActivity extends AppCompatActivity {
    private final String MAIN_TAG = "MerhabaKodluyoruz";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //TODO BEN BU KODU DAHA İYİ YAZARIM
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merhaba_kodluyoruz);

        Log.e(MAIN_TAG,"onCreate");
    }


    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);

        Log.e("MAIN_TAG","onAttachFragment");
    }



    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Log.e("MAIN_TAG","onContentChanged");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e("MAIN_TAG","onStart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e("MAIN_TAG","onRestoreInstanceState");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.e("MAIN_TAG","onPostCreate");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e("MAIN_TAG","onResume");

    }


    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.e("MAIN_TAG","onPostResume");

    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.e("MAIN_TAG","onAttachedToWindow");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.e("MAIN_TAG","onCreateOptionsMenu");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Log.e("MAIN_TAG","onPrepareOptionsMenu");
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MAIN_TAG","onPause");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("MAIN_TAG","onSaveInstanceState");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("MAIN_TAG","onStop");

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("MAIN_TAG","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("MAIN_TAG","onRestart");

    }

}


