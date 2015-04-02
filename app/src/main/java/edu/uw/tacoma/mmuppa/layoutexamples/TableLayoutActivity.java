package edu.uw.tacoma.mmuppa.layoutexamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

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
                Intent intent = new Intent(v.getContext(), LinearLayoutActivity.class);
                startActivity(intent);
            }
        });

        relativeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), RelativeLayoutActivity.class);
                startActivity(intent);
            }
        });

        webViewTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), WebViewActivity.class);
                startActivity(intent);
            }
        });

        gridTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), GridLayoutActivity.class);
                startActivity(intent);
            }
        });
    }


}