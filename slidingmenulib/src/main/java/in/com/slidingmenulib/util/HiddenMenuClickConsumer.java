package in.com.slidingmenulib.util;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

import in.com.slidingmenulib.SlidingRootNavLayout;

public class HiddenMenuClickConsumer extends View {

    private SlidingRootNavLayout menuHost;

    public HiddenMenuClickConsumer(Context context) {
        super(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return menuHost.isMenuHidden();
    }

    public void setMenuHost(SlidingRootNavLayout layout) {
        this.menuHost = layout;
    }
}
