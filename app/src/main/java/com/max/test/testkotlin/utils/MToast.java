package com.max.test.testkotlin.utils;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**解决多次点击，会顺序显示Toast的问题。*/
public class MToast {
	
	private static Toast mToast;
	public static int LENGTH_LONG = Toast.LENGTH_LONG;
	public static int LENGTH_SHORT = Toast.LENGTH_SHORT;

	/**
	 * 显示Toast
	 * @param context
	 * @param text 显示文字
	 */
	public static void show(Context context, String text) {
		makeText(context, text);
	}

	/**
	 * 显示Toast
	 * @param context
	 * @param text
	 */
	public static void showWithNewLocation(Context context, String text) {
		Toast mToast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
		//起点位置,水平向右位移,垂直向下位移
		mToast.setGravity(Gravity.CENTER, 0, 0);
		mToast.show();
	}

	/**
	 * 显示Toast
	 * @param context
	 * @param text 显示文字
	 */
	public static void makeText(Context context, String text) {
		if (mToast == null) {
			mToast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
		} else {
			mToast.setText(text);
			mToast.setDuration(Toast.LENGTH_SHORT);
		}
		mToast.show();
	}
	
	/**
	 * 显示Toast
	 * @param context
	 * @param resID 显示文字引用
	 */
	public static void makeText(Context context, int resID) {
		if (mToast == null) {
			mToast = Toast.makeText(context, resID, Toast.LENGTH_SHORT);
		} else {
			mToast.setText(resID);
			mToast.setDuration(Toast.LENGTH_SHORT);
		}
		mToast.show();
	}
	/**
	 * 显示Toast
	 * @param context
	 * @param text 显示文字
	 * @param duration 显示时间
	 */
	public static void makeText(Context context, String text, int duration) {
		if (mToast == null) {
			mToast = Toast.makeText(context, text, duration);
		} else {
			mToast.setText(text);
			mToast.setDuration(duration);
		}
		mToast.show();
	}
	/**
	 * 显示Toast
	 * @param context
	 * @param resID 显示文字引用
	 * @param duration 显示时间
	 */
	public static void makeText(Context context, int resID, int duration) {
		if (mToast == null) {
			mToast = Toast.makeText(context, resID, duration);
		} else {
			mToast.setText(resID);
			mToast.setDuration(duration);
		}
		mToast.show();
	}
}
