package doc.saulmm.notification;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {
	NotificationHandler nHandler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		nHandler = NotificationHandler.getInstance(this);
		initUI();
	}


	private void initUI () {
		setContentView(R.layout.activity_main);
		findViewById(R.id.simple_notification).setOnClickListener(this);
		findViewById(R.id.big_notification).setOnClickListener(this);
		findViewById(R.id.progress_notification).setOnClickListener(this);
		findViewById(R.id.button_notifcation).setOnClickListener(this);
	}


	@Override
	public void onClick (View v) {
		switch (v.getId()) {

			case R.id.simple_notification:
				nHandler.createSimpleNotification(this);
				break;

			case R.id.big_notification:
				nHandler.createExpandableNotification(this);
				break;

			case R.id.progress_notification:
				nHandler.createProgressNotification(this);
				break;

			case R.id.button_notifcation:
				nHandler.createButtonNotification(this);
		}

	}
}
