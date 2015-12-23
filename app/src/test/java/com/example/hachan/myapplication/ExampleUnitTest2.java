//package com.example.hachan.myapplication;
//
//import android.test.ActivityInstrumentationTestCase2;
//import android.widget.TextView;
//
///**
// * To work on unit tests, switch the Test Artifact in the Build Variants view.
// */
//public class ExampleUnitTest2 extends ActivityInstrumentationTestCase2<MainActivity> {
//
//    MainActivity mMainActivity;
//    TextView mTextView;
//    String resourceString;
//
//    public ExampleUnitTest2() {
//        super("com.bogotobogo.android.first", MainActivity.class);
//    }
//
//    protected void setUp() throws Exception {
//        super.setUp();
//        mMainActivity = this.getActivity();
//        mTextView = (TextView) mMainActivity.findViewById
//                (com.example.hachan.myapplication.R.id.textview);
//        resourceString = mMainActivity.getString
//                (com.example.hachan.myapplication.R.string.app_name);
//    }
//
//    public void testPreconditions() {
//        assertNotNull(mTextView);
//    }
//    public void testText() {
//        assertEquals(resourceString,(String)mTextView.getText());
//    }
//
////    @Test
////    public void Char1() throws Exception {
////        assertEquals(4, 2 + 2);
////    }
//
//
//}