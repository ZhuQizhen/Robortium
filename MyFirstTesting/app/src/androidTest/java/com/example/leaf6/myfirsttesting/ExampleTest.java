package com.example.leaf6.myfirsttesting;

/**
 * Created by leaf6 on 2017/9/2.
 */
import com.robotium.solo.Solo;
import android.widget.TextView;
import android.widget.Button;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

public class ExampleTest extends ActivityInstrumentationTestCase2<MainActivity>
{
    private Solo solo;
    public ExampleTest()
    {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception
    {
        super.setUp();
        solo = new Solo(getInstrumentation(),getActivity());
    }

    @Override
    public void tearDown() throws Exception
    {
        solo.finishOpenedActivities();
        super.tearDown();
    }

    public void test_MainActivityChangeTextView() throws Exception
    {
        solo.unlockScreen();
        Button btn_test = (Button)solo.getView(R.id.button);
        solo.clickOnView(btn_test);

        solo.waitForText("testing",1,2000);

        TextView tv = (TextView)solo.getView(R.id.textView);
        String result = tv.getText().toString();

        assertEquals(result,"testing");
    }

    public void testEquals() throws Exception
    {
        assertEquals(1,1);
    }
    public void testBoolean() throws Exception
    {
        assertTrue(true);
    }
}
