/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.example.andronote;

public final class R {
    public static final class attr {
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int metaButtonBarButtonStyle=0x7f010001;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int metaButtonBarStyle=0x7f010000;
    }
    public static final class color {
        public static final int black_overlay=0x7f040000;
    }
    public static final class dimen {
        /**  Default screen margins, per the Android Design guidelines. 

         Example customization of dimensions originally defined in res/values/dimens.xml
         (such as screen margins) for screens with more than 820dp of available width. This
         would include 7" and 10" devices in landscape (~960dp and ~1280dp respectively).
    
         */
        public static final int activity_horizontal_margin=0x7f050000;
        public static final int activity_vertical_margin=0x7f050001;
    }
    public static final class drawable {
        public static final int ic_launcher=0x7f020000;
    }
    public static final class id {
        public static final int LinearLayout1=0x7f090000;
        public static final int action_settings=0x7f090010;
        public static final int addNoteButton=0x7f09000c;
        public static final int addRightsButton=0x7f09000e;
        public static final int button1=0x7f090006;
        public static final int checkBox1=0x7f090007;
        public static final int editText1=0x7f090003;
        public static final int editText2=0x7f090009;
        public static final int imageView1=0x7f090008;
        public static final int logInButton=0x7f09000a;
        public static final int pager=0x7f09000b;
        public static final int radioButton1=0x7f090004;
        public static final int radioButton2=0x7f090005;
        public static final int rightsView=0x7f09000d;
        public static final int rowTextView=0x7f09000f;
        public static final int textView1=0x7f090001;
        public static final int textView2=0x7f090002;
    }
    public static final class layout {
        public static final int activity_add_new_right=0x7f030000;
        public static final int activity_add_note=0x7f030001;
        public static final int activity_main=0x7f030002;
        public static final int fragment_in_app=0x7f030003;
        public static final int fragment_note_list_view=0x7f030004;
        public static final int fragment_note_view=0x7f030005;
        public static final int fragment_rights_view=0x7f030006;
        public static final int simplerow=0x7f030007;
    }
    public static final class menu {
        public static final int add_new_right=0x7f080000;
        public static final int add_note=0x7f080001;
        public static final int in_app=0x7f080002;
        public static final int list_of_notes=0x7f080003;
    }
    public static final class string {
        public static final int action_settings=0x7f060008;
        public static final int app_name=0x7f060000;
        public static final int dummy_button=0x7f060001;
        public static final int dummy_content=0x7f060002;
        public static final int hello_world=0x7f060007;
        public static final int title_activity_add_new_right=0x7f06000b;
        public static final int title_activity_add_note=0x7f06000a;
        public static final int title_activity_in_app=0x7f060003;
        public static final int title_activity_list_of_notes=0x7f060009;
        public static final int title_section1=0x7f060004;
        public static final int title_section2=0x7f060005;
        public static final int title_section3=0x7f060006;
    }
    public static final class style {
        /** 
        Base application theme, dependent on API level. This theme is replaced
        by AppBaseTheme from res/values-vXX/styles.xml on newer devices.

    

            Theme customizations available in newer API levels can go in
            res/values-vXX/styles.xml, while customizations related to
            backward-compatibility can go here.

        

        Base application theme for API 11+. This theme completely replaces
        AppBaseTheme from res/values/styles.xml on API 11+ devices.

    
 API 11 theme customizations can go here. 

        Base application theme for API 14+. This theme completely replaces
        AppBaseTheme from BOTH res/values/styles.xml and
        res/values-v11/styles.xml on API 14+ devices.
    
 API 14 theme customizations can go here. 
         */
        public static final int AppBaseTheme=0x7f070000;
        /**  Application theme. 
 All customizations that are NOT specific to a particular API-level can go here. 
         */
        public static final int AppTheme=0x7f070001;
        public static final int ButtonBar=0x7f070003;
        public static final int ButtonBarButton=0x7f070004;
        public static final int FullscreenActionBarStyle=0x7f070005;
        public static final int FullscreenTheme=0x7f070002;
    }
    public static final class styleable {
        /** 
         Declare custom theme attributes that allow changing which styles are
         used for button bars depending on the API level.
         ?android:attr/buttonBarStyle is new as of API 11 so this is
         necessary to support previous API levels.
    
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #ButtonBarContainerTheme_metaButtonBarButtonStyle com.example.andronote:metaButtonBarButtonStyle}</code></td><td></td></tr>
           <tr><td><code>{@link #ButtonBarContainerTheme_metaButtonBarStyle com.example.andronote:metaButtonBarStyle}</code></td><td></td></tr>
           </table>
           @see #ButtonBarContainerTheme_metaButtonBarButtonStyle
           @see #ButtonBarContainerTheme_metaButtonBarStyle
         */
        public static final int[] ButtonBarContainerTheme = {
            0x7f010000, 0x7f010001
        };
        /**
          <p>This symbol is the offset where the {@link com.example.andronote.R.attr#metaButtonBarButtonStyle}
          attribute's value can be found in the {@link #ButtonBarContainerTheme} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name com.example.andronote:metaButtonBarButtonStyle
        */
        public static final int ButtonBarContainerTheme_metaButtonBarButtonStyle = 1;
        /**
          <p>This symbol is the offset where the {@link com.example.andronote.R.attr#metaButtonBarStyle}
          attribute's value can be found in the {@link #ButtonBarContainerTheme} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name com.example.andronote:metaButtonBarStyle
        */
        public static final int ButtonBarContainerTheme_metaButtonBarStyle = 0;
    };
}
