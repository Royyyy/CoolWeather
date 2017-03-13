package util;

/**
 * Created by Roy on 2017/3/7.
 */
public interface HttpCallbackListener {


    void onFinish(String s);


    void onError(Exception e);
}