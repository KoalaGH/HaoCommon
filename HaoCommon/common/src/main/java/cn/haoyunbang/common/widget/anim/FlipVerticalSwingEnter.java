package cn.haoyunbang.common.widget.anim;

import android.view.View;

import com.nineoldandroids.animation.ObjectAnimator;

/**
 * 翻转淡入动画
 */
public class FlipVerticalSwingEnter extends BaseAnimatorSet {
	public FlipVerticalSwingEnter() {
		duration = 500;
	}

	@Override
	public void setAnimation(View view) {
		animatorSet.playTogether(//
				ObjectAnimator.ofFloat(view, "rotationX", 90, -10, 10, 0),//
				ObjectAnimator.ofFloat(view, "alpha", 0.25f, 0.5f, 0.75f, 1));
	}
}
