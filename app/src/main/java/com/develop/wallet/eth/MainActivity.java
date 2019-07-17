package com.develop.wallet.eth;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.develop.wallet.eth.app.R;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button makeBtn = (Button) findViewById(R.id.make_btn);
        final TextView mnemonic = (TextView) findViewById(R.id.mnemonic);
        makeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Wallet wallet = WalletManager.generateWalletAddress();
                mnemonic.setText(wallet.getMnemonic() + " /n" + WalletManager.getEthBalance(wallet.getAddress()));
            }
        });
    }
}
