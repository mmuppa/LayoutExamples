package edu.uw.tacoma.mmuppa.layoutexamples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TableLayoutActivity extends Activity {


    private TextView linearTextView, relativeTextView, webViewTextView, gridTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table);

        linearTextView = (TextView) findViewById(R.id.linear_text_view);
        relativeTextView = (TextView) findViewById(R.id.relative_text_view);
        webViewTextView = (TextView) findViewById(R.id.webview_text_view);
        gridTextView = (TextView) findViewById(R.id.grid_text_view);

        linearTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchActivity(v, LinearLayoutActivity.class);
            }
        });

        relativeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchActivity(v, RelativeLayoutActivity.class);
            }
        });

        webViewTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchActivity(v, WebViewActivity.class);
            }
        });

        gridTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchActivity(v, GridLayoutActivity.class);
            }
        });
    }

    private void launchActivity(View v, Class<? extends Activity> clazz) {
        Intent intent = new Intent(v.getContext(), clazz);
        startActivity(intent);
    }


}