package com.layout.a312689543.broadcast;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a312689543 on 2016/4/3.
 */
public class ActivityCollector {
    public static List<Activity> sActivities=new ArrayList<Activity>();
    public static void addActivity(Activity activity){
        sActivities.add(activity);
    }
    public static void removeActivity(Activity activity){
        sActivities.remove(activity);
    }
    public static void finishAll(){
        for (Activity activity:sActivities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
