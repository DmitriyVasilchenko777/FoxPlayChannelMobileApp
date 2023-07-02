package dmitriy.fox.play.fox_play_channel;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button buttonSubscribe = null;
 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		buttonSubscribe = findViewById(R.id.button_subscribe);
		
		buttonSubscribe.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Uri channelUrl = Uri.parse("https://www.youtube.com/channel/UCg_UFv1vxvwUeEYrU7UUREA");
				Intent intent = new Intent(Intent.ACTION_VIEW, channelUrl);
				startActivity(intent);
			}
		});
	}
}
