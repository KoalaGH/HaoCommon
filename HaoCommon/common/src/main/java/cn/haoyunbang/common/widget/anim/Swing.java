package cn.haoyunbang.common.widget.anim;

import android.view.View;

import com.nineoldandroids.animation.ObjectAnimator;

/**
 * 中心点抖动效果
 */
public class Swing extends BaseAnimatorSet {
	public Swing() {
		duration = 1000;
	}

	@Override
	public void setAnimation(View view) {
		animatorSet.playTogether(//
				ObjectAnimator.ofFloat(view, "alpha", 1, 1, 1, 1, 1, 1, 1, 1),//
				ObjectAnimator.ofFloat(view, "rotation", 0, 10, -10, 6, -6, 3, -3, 0));
	}
}
